package com.kirekov.beholder.core.element.type;

import com.kirekov.beholder.core.element.Element;

/**
 * The base interface for all type declarations (classes, interfaces and enums)
 */
public interface TypeDeclarationElement extends Element {
    /**
     * Returns the depth of the declaration. For instance, a type declared
     * directly in a Java-file has depth of 1. A type declared inside another
     * one has depth of 2. A type declared inside the previous one has depth of 3 and so on.
     * @return the depth of the declaration.
     */
    int depth();

    /**
     * Returns type declaration class.
     * @return type declaration class.
     */
    Class<?> typeDeclarationClass();

    /**
     * @return type's simple name
     */
    String simpleName();
}
