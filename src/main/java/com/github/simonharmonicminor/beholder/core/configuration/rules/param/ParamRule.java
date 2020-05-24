package com.github.simonharmonicminor.beholder.core.configuration.rules.param;

import com.github.simonharmonicminor.beholder.core.configuration.rules.Rule;

/**
 * Represents the rule applied to either constructor's or method's parameters
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
