package com.kirekov.beholder.core.process;

import com.kirekov.beholder.core.verifier.VerifyingError;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

import java.io.File;

/**
 * Defines main process that scans the project and returns found errors
 */
public interface BeholderProcess {
    /**
     * Verifies given package recursively.
     *
     * @param pathToMainPackage path to package that should be verified
     * @return found errors
     */
    ImmutableList<VerifyingError> verifyProject(File pathToMainPackage);
}
