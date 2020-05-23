package com.github.simonharmonicminor.beholder.core.api.constructor;

import com.github.simonharmonicminor.beholder.core.api.ParamElement;
import com.github.simonharmonicminor.beholder.core.api.Element;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

/**
 * Represents constructor declared in a type
 */
public interface ConstructorElement extends Element {
    /**
     * @return parameters passed to the constructor
     */
    ImmutableList<ParamElement> getConstructorParams();
}
