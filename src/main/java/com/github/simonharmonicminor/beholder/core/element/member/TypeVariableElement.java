package com.github.simonharmonicminor.beholder.core.element.member;

import com.github.simonharmonicminor.beholder.core.element.Element;

/**
 * Represents variable declared inside one type (class, enum or interface)
 */
public interface TypeVariableElement extends Element {
    /**
     * @return variable's class
     */
    Class<?> variableClass();
}
