package com.github.simonharmonicminor.beholder.core.configuration;

import com.github.simonharmonicminor.beholder.core.configuration.rules.constructor.ConstructorRule;
import com.github.simonharmonicminor.beholder.core.configuration.rules.method.FunctionRule;
import com.github.simonharmonicminor.beholder.core.configuration.rules.method.ProcedureRule;

public interface BeholderConfig {
    ConstructorRule getConstructorRule();

    FunctionRule getFunctionRule();

    ProcedureRule getProcedureRule();
}
