package com.kirekov.beholder.core.configuration.rule.param;

import com.kirekov.beholder.core.configuration.rule.Rule;

/**
 * Represents a rule that defines restriction to parameters passed to either constructor or to method
 */
public interface ParamRule extends Rule {
    /**
     * @return true if a parameter should be final
     */
    boolean requireFinal();

    /**
     * @return true if a parameter should be written in "camelCase"
     */
    boolean requireCamelCase();
}
