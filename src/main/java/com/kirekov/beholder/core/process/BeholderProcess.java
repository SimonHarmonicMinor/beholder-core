package com.kirekov.beholder.core.process;

import com.kirekov.beholder.core.exception.BeholderProcessException;
import com.kirekov.beholder.core.verifier.VerifyingError;

import java.io.File;
import java.util.List;

/**
 * Defines main process that scans the project and returns found errors
 */
public interface BeholderProcess {
    /**
     * Verifies given package recursively.
     *
     * @param pathToMainPackage path to package that should be verified
     * @return found errors
     * @throws BeholderProcessException if cannot read sources from the given file
     */
    List<VerifyingError> verifyProject(File pathToMainPackage);
}
