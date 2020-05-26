package com.github.simonharmonicminor.beholder.core.verifier;

import com.github.simonharmonicminor.beholder.core.ViolationLevel;

/**
 * Describes an error which was occurred during element verification
 */
public interface VerifyingError {
    /**
     * @return the error's severeness
     * @see ViolationLevel
     */
    ViolationLevel violationLevel();

    /**
     * @return the error's message
     */
    String message();
}
