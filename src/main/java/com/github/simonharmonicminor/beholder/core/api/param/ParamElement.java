package com.github.simonharmonicminor.beholder.core.api.param;

import com.github.simonharmonicminor.beholder.core.api.Element;

/**
 * Represents a param passed inside a constructor a method
 */
public interface ParamElement extends Element {
    /**
     * @return parameter's class
     */
    Class<?> paramClass();
}
