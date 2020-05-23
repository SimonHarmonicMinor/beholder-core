package com.github.simonharmonicminor.beholder.core.api.member;

import com.github.simonharmonicminor.beholder.core.api.Element;

/**
 * Represents variable declared inside one type (class, enum or interface)
 */
public interface TypeVariableElement extends Element {
    /**
     * @return variable's class
     */
    Class<?> getVariableClass();
}
