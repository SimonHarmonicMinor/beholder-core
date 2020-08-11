package com.kirekov.beholder.core.element.method;

/**
 * Represents function declared in one type
 */
public interface FunctionElement extends MethodElement {
    /**
     * @return the type returned by the function
     */
    Class<?> returningType();
}
