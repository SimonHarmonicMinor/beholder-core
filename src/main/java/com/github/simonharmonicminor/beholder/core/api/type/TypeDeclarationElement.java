package com.github.simonharmonicminor.beholder.core.api.type;

import com.github.simonharmonicminor.beholder.core.api.Element;

/**
 * The base interface for all type declarations (classes, interfaces and enums)
 */
public interface TypeDeclarationElement extends Element {
    /**
     * Returns the depth of the declaration. For instance, a type declared
     * directly in a Java-file has depth of 1. A type declared inside another
     * one has depth of 2. A type declared inside the previous one has depth of 3 and so on.
     * @return the depth of the declaration. For instance, a type declared has
     */
    int getDepth();

    /**
     * Returns type declaration class.
     * @return type declaration class.
     */
    Class<?> getTypeDeclarationClass();
}
