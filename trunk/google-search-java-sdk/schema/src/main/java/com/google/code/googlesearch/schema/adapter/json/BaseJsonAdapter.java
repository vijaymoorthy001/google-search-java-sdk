/**
 * 
 */
package com.google.code.googlesearch.schema.adapter.json;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;

import com.google.code.googlesearch.schema.GsearchResultClass;
import com.google.code.googlesearch.schema.ListingType;
import com.google.code.googlesearch.schema.PatentStatus;
import com.google.code.googlesearch.schema.VideoType;
import com.google.code.googlesearch.schema.ViewPortMode;
import com.google.code.googlesearch.schema.adapter.Converter;

/**
 * The Class BaseJsonAdapter.
 */
public abstract class BaseJsonAdapter implements Serializable {

	/** The descriptors cache. */
	private static Map<Class<?>, PropertyDescriptor[]> descriptorsCache = new HashMap<Class<?>, PropertyDescriptor[]>();
	
	/** The logger. */
    protected final Logger logger = Logger.getLogger(getClass().getCanonicalName());
	
	/** The converters. */
	protected Map<Class<?>, Converter<?, ?>> converters = new HashMap<Class<?>, Converter<? , ?>>();
	
	/** The Constant RFC822DATEFORMAT. */
	private static final SimpleDateFormat RFC822DATEFORMAT
    		= new SimpleDateFormat("EEE', 'dd' 'MMM' 'yyyy' 'HH:mm:ss' 'Z");
	
	/** The gsearch result class. */
	private GsearchResultClass gsearchResultClass;

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 250056223059654638L;
	
	{
		converters.put(Date.class, new Converter<String, Date>() {
			@Override
			public Date convert(String source) {
				if (source != null) {
					try {
						return RFC822DATEFORMAT.parse(source);
					} catch (Exception e) {}
				}
				return null;
			}
		});
		converters.put(ListingType.class, new Converter<String, ListingType>() {
			@Override
			public ListingType convert(String source) {
				return ListingType.fromValue(source);
			}
		});
		converters.put(PatentStatus.class, new Converter<String, PatentStatus>() {
			@Override
			public PatentStatus convert(String source) {
				return PatentStatus.fromValue(source);
			}
		});
		converters.put(VideoType.class, new Converter<String, VideoType>() {
			@Override
			public VideoType convert(String source) {
				return VideoType.fromValue(source);
			}
		});
		converters.put(ViewPortMode.class, new Converter<String, ViewPortMode>() {
			@Override
			public ViewPortMode convert(String source) {
				return ViewPortMode.fromValue(source);
			}
		});
		converters.put(GsearchResultClass.class, new Converter<String, GsearchResultClass>() {
			@Override
			public GsearchResultClass convert(String source) {
				return GsearchResultClass.fromValue(source);
			}
		});
		converters.put(int.class, new Converter<String, Integer>() {
			@Override
			public Integer convert(String source) {
				if (source != null) {
					try {
						return Integer.parseInt(source);
					} catch (Exception e) {}
				}
				return null;
			}
		});
		converters.put(double.class, new Converter<String, Double>() {
			@Override
			public Double convert(String source) {
				if (source != null) {
					try {
						return Double.parseDouble(source);
					} catch (Exception e) {}
				}
				return null;
			}
		});
	}

	/**
	 * Copy properties.
	 * 
	 * @param dest the dest
	 * @param src the src
	 */
	@SuppressWarnings("unchecked")
	protected void copyProperties(Object dest, JSONObject src) {
		try {
			for (Map.Entry<String, Object> entry : (Iterable<Map.Entry<String, Object>>) src.entrySet()) {
				PropertyDescriptor descriptor = getPropertyDescriptor(dest, convertToCamelCase(entry.getKey()));
				Object value = entry.getValue();
				if (descriptor != null && descriptor.getWriteMethod() != null) {
					if (includeProperty(descriptor.getName(), value)) {
						if (value != null && converters.containsKey(descriptor.getPropertyType())) {
							value = ((Converter<Object, Object>) converters.get(descriptor.getPropertyType())).convert(value);
							if (value == null) {
								logger.warning("Could not convert property '" + entry.getKey() + "' with value:" + entry.getValue());
							}
						}
						if (value != null) {
							descriptor.getWriteMethod().invoke(dest, value);
						}
					}
				} else {
					logger.warning("Additional property '" + entry.getKey() + "':" + entry.getValue() +  ":" + entry.getValue().getClass() + ": found in response for object." + dest.getClass());
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while setting properties.", e);
		}
	}

	/**
	 * Copy properties.
	 * 
	 * @param dest the dest
	 * @param src the src
	 */
	@SuppressWarnings("unchecked")
	protected void copyProperties(JSONObject dest, Object src) {
		try {
			PropertyDescriptor[] descriptors = getPropertyDescriptors(src.getClass());
			for (PropertyDescriptor descriptor : descriptors) {
				if (!descriptor.getName().equals("class") && descriptor.getReadMethod() != null) {
					Object value = descriptor.getReadMethod().invoke(dest);
					if (includeProperty(descriptor.getName(), value)) {
						dest.put(convertToUnderscores(descriptor.getName()), value);
					}
				}
			}
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Error while setting properties.", e);
		}
	}

	/**
	 * Convert to camel case.
	 * 
	 * @param original the original
	 * 
	 * @return the string
	 */
	protected String convertToCamelCase(String original) {
		if (original.startsWith("is_")) {
			original = original.substring(3);			
		}
		StringBuilder builder = new StringBuilder();
		boolean upperCase = false;
		for (int i = 0; i < original.length(); i++) {
			if (original.charAt(i) == '_') {
				upperCase = true;
			} else {
				if (upperCase) {
					builder.append(Character.toUpperCase(original.charAt(i)));
					upperCase = false;
				} else {
					if (i == 0 && Character.isUpperCase(original.charAt(i))) {
						builder.append(Character.toLowerCase(original.charAt(i)));
					} else {
						builder.append(original.charAt(i));
					}
				}
			}
		}

		return builder.toString();
	}

	/**
	 * Convert to underscores.
	 * 
	 * @param original the original
	 * 
	 * @return the string
	 */
	protected String convertToUnderscores(String original) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < original.length(); i++) {
			if (Character.isUpperCase(original.charAt(i))) {
				builder.append('_');
				builder.append(Character.toLowerCase(original.charAt(i)));
			} else {
				builder.append(original.charAt(i));
			}
		}

		return builder.toString();
	}

	/*
	 * Stolen liberally from commons-beanutils.
	 */
	/**
	 * Gets the property descriptors.
	 * 
	 * @param beanClass the bean class
	 * 
	 * @return the property descriptors
	 */
	public PropertyDescriptor[] getPropertyDescriptors(Class<?> beanClass) {

		if (beanClass == null) {
			throw new IllegalArgumentException("No bean class specified");
		}

		// Look up any cached descriptors for this bean class
		PropertyDescriptor[] descriptors = null;
		descriptors = (PropertyDescriptor[]) descriptorsCache.get(beanClass);
		if (descriptors != null) {
			return (descriptors);
		}

		// Introspect the bean and cache the generated descriptors
		BeanInfo beanInfo = null;
		try {
			beanInfo = Introspector.getBeanInfo(beanClass);
		} catch (IntrospectionException e) {
			return (new PropertyDescriptor[0]);
		}
		descriptors = beanInfo.getPropertyDescriptors();
		if (descriptors == null) {
			descriptors = new PropertyDescriptor[0];
		}

		descriptorsCache.put(beanClass, descriptors);
		return (descriptors);
	}

	/*
	 * Stolen liberally from commons-beanutils.
	 */
	/**
	 * Gets the property descriptor.
	 * 
	 * @param bean the bean
	 * @param name the name
	 * 
	 * @return the property descriptor
	 * 
	 * @throws IllegalAccessException the illegal access exception
	 * @throws InvocationTargetException the invocation target exception
	 * @throws NoSuchMethodException the no such method exception
	 */
	public PropertyDescriptor getPropertyDescriptor(Object bean, String name)
			throws IllegalAccessException, InvocationTargetException,
			NoSuchMethodException {

		if (bean == null) {
			throw new IllegalArgumentException("No bean specified");
		}
		if (name == null) {
			throw new IllegalArgumentException(
					"No name specified for bean class '" + bean.getClass()
							+ "'");
		}

		// Resolve nested references
		PropertyDescriptor[] descriptors = getPropertyDescriptors(bean
				.getClass());
		if (descriptors != null) {
			for (int i = 0; i < descriptors.length; i++) {
				if (name.equals(descriptors[i].getName())) {
					return (descriptors[i]);
				}
			}
		}

		return null;
	}
	
	/**
	 * Include property.
	 * 
	 * @param name the name
	 * @param value the value
	 * 
	 * @return true, if successful
	 */
	protected boolean includeProperty(String name, Object value) {
		if (value != null) {
			return value.getClass().equals(String.class)
					|| value.getClass().isPrimitive()
					|| value.getClass().isEnum()
					|| value.getClass().equals(String.class)
					|| Number.class.isAssignableFrom(value.getClass());
		}
		return true;
	}
	
	/**
	 * Gets the long property.
	 * 
	 * @param src the src
	 * @param name the name
	 * 
	 * @return the long property
	 */
	protected long getLongProperty(JSONObject src, String name) {
		if (src.get(name) != null) {
			return ((Long) src.get(name)).longValue();
		}
		return 0L;
	}
	
	/**
	 * Gets the int property.
	 * 
	 * @param src the src
	 * @param name the name
	 * 
	 * @return the int property
	 */
	protected int getIntProperty(JSONObject src, String name) {
		if (src.get(name) != null) {
			return ((Long) src.get(name)).intValue();
		}
		return 0;
	}

	/**
	 * Gets the gsearch result class.
	 * 
	 * @return the gsearch result class
	 */
	public GsearchResultClass getGsearchResultClass() {
		return gsearchResultClass;
	}

	/**
	 * Sets the gsearch result class.
	 * 
	 * @param gsearchResultClass the new gsearch result class
	 */
	public void setGsearchResultClass(GsearchResultClass gsearchResultClass) {
		this.gsearchResultClass = gsearchResultClass;
	}
}
