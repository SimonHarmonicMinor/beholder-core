package com.github.simonharmonicminor.beholder.core.api.constructor;

import com.github.simonharmonicminor.beholder.core.api.Element;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

public interface ConstructorElement extends Element {
    ImmutableList<ConstructorParamElement> getConstructorParams();
}
