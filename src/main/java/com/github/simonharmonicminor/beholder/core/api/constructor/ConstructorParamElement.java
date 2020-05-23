package com.github.simonharmonicminor.beholder.core.api.constructor;

import com.github.simonharmonicminor.beholder.core.api.Element;

public interface ConstructorParamElement extends Element {
    Class<?> getParamClass();
}
