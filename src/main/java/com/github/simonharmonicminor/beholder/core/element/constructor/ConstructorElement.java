package com.github.simonharmonicminor.beholder.core.element.constructor;

import com.github.simonharmonicminor.beholder.core.element.param.ParamElement;
import com.github.simonharmonicminor.beholder.core.element.Element;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

/**
 * Represents constructor declared in a type
 */
public interface ConstructorElement extends Element {
    /**
     * @return parameters passed to the constructor
     */
    ImmutableList<ParamElement> constructorParams();
}
