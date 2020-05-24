package com.github.simonharmonicminor.beholder.core.configuration.rules.method;

import java.util.OptionalInt;

public interface MethodRule {
    OptionalInt getMaxParamsCount();

    boolean publicShouldBeOverridden();

    boolean requiresCamelCase();
}
