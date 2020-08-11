package com.kirekov.beholder.core.element.constructor;

import com.kirekov.beholder.core.element.param.ParamElement;
import com.kirekov.beholder.core.element.Element;
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
