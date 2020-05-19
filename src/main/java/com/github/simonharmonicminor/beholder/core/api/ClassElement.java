package com.github.simonharmonicminor.beholder.core.api;


import java.util.Optional;

public interface ClassElement extends Element {
    boolean isInner();

    Optional<ClassElement> getParent();
}
