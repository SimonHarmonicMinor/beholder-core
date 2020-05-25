package com.github.simonharmonicminor.beholder.core.configuration.rules.constructor;

import com.github.simonharmonicminor.beholder.core.configuration.rules.Rule;
import com.github.simonharmonicminor.beholder.core.configuration.rules.param.ParamRule;

import java.util.OptionalInt;

public interface ConstructorRule extends Rule {
    OptionalInt getMaxParamsCount();

    ParamRule getParamRule();
}
