package com.kirekov.beholder.core.configuration.rule;

import com.kirekov.beholder.core.ViolationLevel;

/**
 * The base interface for all rules.
 * A rule defines a set of restrictions that should be applied to one code element.
 */
public interface Rule {
    /**
     * @return the level that defines rule importance
     */
    ViolationLevel violationLevel();
}
