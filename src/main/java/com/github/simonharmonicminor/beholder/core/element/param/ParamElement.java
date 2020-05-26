package com.github.simonharmonicminor.beholder.core.element.param;

import com.github.simonharmonicminor.beholder.core.element.Element;

/**
 * Represents a param passed inside a constructor a method
 */
public interface ParamElement extends Element {
    /**
     * @return parameter's class
     */
    Class<?> paramClass();
}
