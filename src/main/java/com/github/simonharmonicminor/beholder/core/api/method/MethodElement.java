package com.github.simonharmonicminor.beholder.core.api.method;

import com.github.simonharmonicminor.beholder.core.api.Element;
import com.github.simonharmonicminor.beholder.core.api.param.ParamElement;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

/**
 * The base interface for all procedures and functions declared in one type
 */
public interface MethodElement extends Element {
    /**
     * @return true if this method overrides one from extended type, returns false otherwise
     */
    boolean isOverridden();

    /**
     * @return params passed to the method
     */
    ImmutableList<ParamElement> getMethodParams();
}
