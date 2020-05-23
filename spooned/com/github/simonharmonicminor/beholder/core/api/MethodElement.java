package com.github.simonharmonicminor.beholder.core.api;
public interface MethodElement extends com.github.simonharmonicminor.beholder.core.api.Element {
    java.lang.Class<?> getReturningType();

    boolean isProcedure();
}