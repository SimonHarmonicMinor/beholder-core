package com.github.simonharmonicminor.beholder.core.configuration.rules.method;

import java.util.OptionalInt;

/**
 * Represents a rule that defines restrictions to methods
 */
public interface MethodRule {
    /**
     * Returns max allowed parameters count in a method, if such restriction is specified.
     * Returns {@linkplain OptionalInt#empty()} otherwise.
     *
     * @return max parameters count or {@linkplain OptionalInt#empty()}
     */
    OptionalInt maxParamsCount();

    /**
     * @return true if all public methods should be overridden from another type,
     * returns false otherwise
     */
    boolean publicShouldBeOverridden();

    /**
     * @return true if all overridden methods should have {@linkplain Override} annotation,
     * returns false otherwise
     */
    boolean overriddenShouldHaveAnnotation();

    /**
     * @return true if all methods should be written in camel case,
     * returns false otherwise
     */
    boolean requiresCamelCase();
}
