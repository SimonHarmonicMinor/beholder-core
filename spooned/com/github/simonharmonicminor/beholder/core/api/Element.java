package com.github.simonharmonicminor.beholder.core.api;
public interface Element {
    com.github.simonharmonicminor.beholder.core.api.ElementPosition getElementPosition();

    com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet<com.github.simonharmonicminor.beholder.core.api.Modifier> getModifiers();

    com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet<java.lang.annotation.Annotation> getAnnotations();

    java.lang.String getName();
}