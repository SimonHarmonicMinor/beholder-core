package com.github.simonharmonicminor.beholder.core.api;

import com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet;

import java.lang.annotation.Annotation;

public interface Element {
    ElementPosition getElementPosition();

    ImmutableSet<Modifier> getModifiers();

    ImmutableSet<Annotation> getAnnotations();
}
