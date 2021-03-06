package com.kirekov.beholder.core.element;

import com.github.simonharmonicminor.juu.lambda.CachedResultSupplier;

import java.util.function.Supplier;

public enum Modifier {
    PUBLIC,
    PROTECTED,
    PRIVATE,
    ABSTRACT,
    STATIC,
    FINAL,
    TRANSIENT,
    VOLATILE,
    SYNCHRONIZED,
    NATIVE,
    STRICTFP;

    private final Supplier<String> lowercase = new CachedResultSupplier<>(() -> name().toLowerCase());

    /**
     * Returns this modifier's name in lowercase.
     * @return modifier's lowercase name
     */
    public String toLowercase() {
        return lowercase.get();
    }
}
