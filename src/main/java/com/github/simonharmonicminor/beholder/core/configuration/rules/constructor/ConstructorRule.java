package com.github.simonharmonicminor.beholder.core.configuration.rules.constructor;

import com.github.simonharmonicminor.beholder.core.configuration.rules.Rule;
import com.github.simonharmonicminor.beholder.core.configuration.rules.param.ParamRule;

import java.util.OptionalInt;

/**
 * Represents a rule that defines restrictions to constructors
 */
public interface ConstructorRule extends Rule {
    /**
     * Returns max allowed parameters count in a constructor, if such restriction is specified.
     * Returns {@linkplain OptionalInt#empty()} otherwise.
     * @return max parameters count or {@linkplain OptionalInt#empty()}
     */
    OptionalInt maxParamsCount();

    ParamRule paramRule();
}
