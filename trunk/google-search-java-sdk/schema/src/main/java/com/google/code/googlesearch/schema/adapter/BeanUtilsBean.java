package com.google.code.googlesearch.schema.adapter;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.MappedPropertyDescriptor;
import org.apache.commons.beanutils.expression.Resolver;

public class BeanUtilsBean extends org.apache.commons.beanutils.BeanUtilsBean {

	@SuppressWarnings("unchecked")
	public void copyProperties(Object dest, Object orig)
			throws IllegalAccessException, InvocationTargetException {

		// Validate existence of the specified beans
		if (dest == null) {
			throw new IllegalArgumentException("No destination bean specified");
		}
		if (orig == null) {
			throw new IllegalArgumentException("No origin bean specified");
		}

		// Copy the properties, converting as necessary
		if (orig instanceof DynaBean) {
			super.copyProperties(dest, orig);
		} else if (orig instanceof Map) {
			Iterator entries = ((Map) orig).entrySet().iterator();
			while (entries.hasNext()) {
				Map.Entry entry = (Map.Entry) entries.next();
				String name = (String) entry.getKey();
				if (getPropertyUtils().isWriteable(dest, name)) {
					copyProperty(dest, name, entry.getValue());
				}
			}
		} else /* if (orig is a standard JavaBean) */{
			PropertyDescriptor[] origDescriptors = getPropertyUtils()
					.getPropertyDescriptors(orig);
			for (int i = 0; i < origDescriptors.length; i++) {
				String name = origDescriptors[i].getName();
				if ("class".equals(name)) {
					continue; // No point in trying to set an object's class
				}
				if (getPropertyUtils().isReadable(orig, name)
						&& getPropertyUtils().isWriteable(dest, name)) {
					try {
						Object value = getPropertyUtils().getSimpleProperty(
								orig, name);
						if (includeProperty(name, value)) {
							copyProperty(dest, name, value);
						}
					} catch (NoSuchMethodException e) {
						// Should not happen
					}
				}
			}
		}

	}

	public void setProperty(Object bean, String name, Object value)
			throws IllegalAccessException, InvocationTargetException {

		// Resolve any nested expression to get the actual target bean
		Object target = bean;
		Resolver resolver = getPropertyUtils().getResolver();
		while (resolver.hasNested(name)) {
			try {
				target = getPropertyUtils().getProperty(target,
						resolver.next(name));
				name = resolver.remove(name);
			} catch (NoSuchMethodException e) {
				return; // Skip this property setter
			}
		}

		// Declare local variables we will require
		String propName = resolver.getProperty(name); // Simple name of target
														// property
		Class<?> type = null; // Java type of target property
		int index = resolver.getIndex(name); // Indexed subscript value (if
												// any)
		String key = resolver.getKey(name); // Mapped key value (if any)

		// Calculate the property type
		if (target instanceof DynaBean) {
			super.setProperty(bean, name, value);
			return;
		} else if (target instanceof Map) {
			super.setProperty(bean, name, value);
			return;
		} else if (target != null && target.getClass().isArray() && index >= 0) {
			super.setProperty(bean, name, value);
			return;
		} else {
			PropertyDescriptor descriptor = null;
			try {
				descriptor = getPropertyUtils().getPropertyDescriptor(target,
						name);
				if (descriptor == null) {
					return; // Skip this property setter
				}
			} catch (NoSuchMethodException e) {
				return; // Skip this property setter
			}
			if (descriptor instanceof MappedPropertyDescriptor) {
				if (((MappedPropertyDescriptor) descriptor)
						.getMappedWriteMethod() == null) {
					return; // Read-only, skip this property setter
				}
				type = ((MappedPropertyDescriptor) descriptor)
						.getMappedPropertyType();
			} else if (index >= 0
					&& descriptor instanceof IndexedPropertyDescriptor) {
				if (((IndexedPropertyDescriptor) descriptor)
						.getIndexedWriteMethod() == null) {
					return; // Read-only, skip this property setter
				}
				type = ((IndexedPropertyDescriptor) descriptor)
						.getIndexedPropertyType();
			} else if (key != null) {
				if (descriptor.getReadMethod() == null) {
					return; // Read-only, skip this property setter
				}
				type = (value == null) ? Object.class : value.getClass();
			} else {
				if (descriptor.getWriteMethod() == null) {
					return; // Read-only, skip this property setter
				}
				type = descriptor.getPropertyType();
			}
		}

		// Convert the specified value to the required type
		Object newValue = null;
		if (type.isArray() && (index < 0)) { // Scalar value into array
			if (value == null) {
				String[] values = new String[1];
				values[0] = null;
				newValue = getConvertUtils().convert(values, type);
			} else if (value instanceof String) {
				newValue = getConvertUtils().convert(value, type);
			} else if (value instanceof String[]) {
				newValue = getConvertUtils().convert((String[]) value, type);
			} else {
				newValue = convert(value, type);
			}
		} else if (type.isArray()) { // Indexed value into array
			if (value instanceof String || value == null) {
				newValue = getConvertUtils().convert((String) value,
						type.getComponentType());
			} else if (value instanceof String[]) {
				newValue = getConvertUtils().convert(((String[]) value)[0],
						type.getComponentType());
			} else {
				newValue = convert(value, type.getComponentType());
			}
		} else { // Value into scalar
			if (value instanceof String) {
				newValue = getConvertUtils().convert((String) value, type);
			} else if (value instanceof String[]) {
				newValue = getConvertUtils().convert(((String[]) value)[0],
						type);
			} else {
				newValue = convert(value, type);
			}
		}

		// Invoke the setter method
		try {
			if (includeProperty(name, newValue)) {
				getPropertyUtils().setProperty(target, name, newValue);
			}
		} catch (NoSuchMethodException e) {
			throw new InvocationTargetException(e, "Cannot set " + propName);
		}

	}

	private boolean includeProperty(String name, Object value) {
		if (value != null) {
			return value.getClass().equals(String.class)
					|| value.getClass().isPrimitive()
					|| value.getClass().isEnum()
					|| value.getClass().equals(String.class)
					|| Number.class.isAssignableFrom(value.getClass());
		}
		return true;
	}
}
