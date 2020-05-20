package com.github.simonharmonicminor.beholder.core.api;
public enum Modifier {

    /**
     * The modifier <tt>public</tt>
     */
    PUBLIC,
    /**
     * The modifier <tt>protected</tt>
     */
    PROTECTED,
    /**
     * The modifier <tt>private</tt>
     */
    PRIVATE,
    /**
     * The modifier <tt>abstract</tt>
     */
    ABSTRACT,
    /**
     * The modifier <tt>static</tt>
     */
    STATIC,
    /**
     * The modifier <tt>final</tt>
     */
    FINAL,
    /**
     * The modifier <tt>transient</tt>
     */
    TRANSIENT,
    /**
     * The modifier <tt>volatile</tt>
     */
    VOLATILE,
    /**
     * The modifier <tt>synchronized</tt>
     */
    SYNCHRONIZED,
    /**
     * The modifier <tt>native</tt>
     */
    NATIVE,
    /**
     * The modifier <tt>strictfp</tt>
     */
    STRICTFP;
    private final java.util.function.Supplier<java.lang.String> lowercase = new com.github.simonharmonicminor.juu.lambda.CachedResultSupplier<>(() -> name().toLowerCase());

    /**
     * Returns this modifier's name in lowercase.
     */
    @java.lang.Override
    public java.lang.String toString() {
        return lowercase.get();
    }
}