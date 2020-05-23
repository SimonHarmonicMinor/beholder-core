package com.github.simonharmonicminor.beholder.core.api.type;
public interface EnumDeclarationElement extends com.github.simonharmonicminor.beholder.core.api.type.TypeDeclarationElement {
    com.github.simonharmonicminor.juu.collection.immutable.ImmutableSet<? extends java.lang.Enum<?>> getEnumValues();
}