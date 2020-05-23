package com.github.simonharmonicminor.beholder.core.method;

/**
 * Represents function declared in one type
 */
public interface FunctionElement extends MethodElement {
    /**
     * @return the type returned by the function
     */
    Class<?> getReturningType();
}
