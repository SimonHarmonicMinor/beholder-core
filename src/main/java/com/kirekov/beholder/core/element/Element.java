package com.kirekov.beholder.core.element;

import com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet;

import java.lang.annotation.Annotation;

/**
 * The base interface for all code elements.
 */
public interface Element {
    /**
     * @return element's position in the code
     */
    ElementPosition position();

    /**
     * @return set of modifiers applied to this element
     * @see Modifier
     */
    ImmutableSet<Modifier> modifiers();

    /**
     * @return set of annotations applied to this element
     */
    ImmutableSet<Annotation> annotations();

    /**
     * @return fully-qualified name of the element
     */
    String name();
}
