/**
 *
 */
package com.google.code.googlesearch.schema.adapter;

/**
 * @author nmukhtar
 *
 *
 * @param <Adapter>
 * @param <Adaptee>
 */
public interface Adaptable<Adapter, Adaptee> {

    /**
     * Method description
     *
     *
     * @param adaptee
     */
    public void adaptFrom(Adaptee adaptee);

    /**
     * Method description
     *
     *
     * @return
     */
    public Adaptee adaptTo();
}
