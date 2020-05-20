package com.github.simonharmonicminor.beholder.core.api;
public interface ClassElement extends com.github.simonharmonicminor.beholder.core.api.Element {
    boolean isInner();

    java.util.Optional<com.github.simonharmonicminor.beholder.core.api.ClassElement> getParent();
}