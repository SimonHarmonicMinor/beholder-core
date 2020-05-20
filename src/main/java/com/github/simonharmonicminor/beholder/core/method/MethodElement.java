package com.github.simonharmonicminor.beholder.core.method;

import com.github.simonharmonicminor.beholder.core.api.Element;

/**
 * The base interface for all procedures and functions declared in one type
 */
public interface MethodElement extends Element {
    /**
     * @return true if this method overrides one from extended type, returns false otherwise
     */
    boolean isOverridden();
}
