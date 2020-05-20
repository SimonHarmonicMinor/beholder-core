package com.github.simonharmonicminor.beholder.core.api.type;
public interface TypeDeclarationElement extends com.github.simonharmonicminor.beholder.core.api.Element {
    int getDepth();

    java.lang.Class<?> getTypeDeclarationClass();
}