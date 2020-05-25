package com.github.simonharmonicminor.beholder.core.configuration.rules;

/**
 * The base interface for all rules.
 * A rule defines a set of restrictions that should be applied to one code element.
 */
public interface Rule {
    ViolationLevel getViolationLevel();
}
