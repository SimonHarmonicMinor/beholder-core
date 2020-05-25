package com.github.simonharmonicminor.beholder.core.configuration.rules.param;

import com.github.simonharmonicminor.beholder.core.configuration.rules.Rule;

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
