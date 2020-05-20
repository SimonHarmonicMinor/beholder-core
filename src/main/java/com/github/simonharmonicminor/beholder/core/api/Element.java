package com.github.simonharmonicminor.beholder.core.api;

import com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet;

import java.lang.annotation.Annotation;

/**
 * The base interface for all code elements.
 */
public interface Element {
    /**
     * @return element's position in the code
     */
    ElementPosition getElementPosition();

    /**
     * @return set of modifiers applied to this element
     * @see Modifier
     */
    ImmutableSet<Modifier> getModifiers();

    /**
     * @return set of annotations applied to this element
     */
    ImmutableSet<Annotation> getAnnotations();

    /**
     * @return fully-qualified name of the element
     */
    String getName();
}
