package com.kirekov.beholder.core.verifier;

import com.kirekov.beholder.core.ViolationLevel;

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
