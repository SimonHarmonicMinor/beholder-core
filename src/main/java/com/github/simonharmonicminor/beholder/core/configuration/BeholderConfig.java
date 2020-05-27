package com.github.simonharmonicminor.beholder.core.configuration;

import com.github.simonharmonicminor.beholder.core.configuration.rule.constructor.ConstructorRule;
import com.github.simonharmonicminor.beholder.core.configuration.rule.method.FunctionRule;
import com.github.simonharmonicminor.beholder.core.configuration.rule.method.ProcedureRule;

/**
 * Configuration that defines rules that will be applied to all code elements
 */
public interface BeholderConfig {
    /**
     * @return rule applied to constructors
     */
    ConstructorRule constructorRule();

    /**
     * @return rule applied to functions
     */
    FunctionRule functionRule();

    /**
     * @return rule applied to procedures
     */
    ProcedureRule procedureRule();
}
