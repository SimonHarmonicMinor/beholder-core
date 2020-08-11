package com.kirekov.beholder.core.element.param;

import com.kirekov.beholder.core.element.Element;

/**
 * Represents a param passed inside a constructor a method
 */
public interface ParamElement extends Element {
    /**
     * @return parameter's class
     */
    Class<?> paramClass();
}
