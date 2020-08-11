package com.kirekov.beholder.core.configuration.rule.constructor;

import com.kirekov.beholder.core.configuration.rule.Rule;
import com.kirekov.beholder.core.configuration.rule.param.ParamRule;

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
