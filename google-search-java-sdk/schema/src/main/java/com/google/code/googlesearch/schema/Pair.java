/**
 * 
 */
package com.google.code.googlesearch.schema;

import java.io.Serializable;

/**
 * @author nmukhtar
 *
 */
public class Pair<E,F> implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2364226974814179388L;
	
	private E first;
    private F second;

    public Pair(final E first, final F second) {
        this.first = first;
        this.second = second;
    }
    
    public E getFirst() {
    	return first;
    }
    
    public F getSecond() {
    	return second;
    }

	public void setFirst(E first) {
		this.first = first;
	}

	public void setSecond(F second) {
		this.second = second;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Pair<?, ?> other = (Pair<?, ?>) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}
	
	
}