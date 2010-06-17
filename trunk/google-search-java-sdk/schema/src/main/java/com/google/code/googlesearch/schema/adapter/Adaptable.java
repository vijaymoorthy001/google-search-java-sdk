/**
 *
 */
package com.google.code.googlesearch.schema.adapter;

/**
 * The Interface Adaptable.
 */
public interface Adaptable<Adapter, Adaptee> {

    /**
     * Adapt from.
     * 
     * @param adaptee the adaptee
     */
    public void adaptFrom(Adaptee adaptee);

    /**
     * Adapt to.
     * 
     * @return the adaptee
     */
    public Adaptee adaptTo();
}
