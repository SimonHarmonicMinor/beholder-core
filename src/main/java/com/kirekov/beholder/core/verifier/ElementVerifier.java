package com.kirekov.beholder.core.verifier;

import com.kirekov.beholder.core.element.Element;
import com.github.simonharmonicminor.juu.collection.immutable.ImmutableList;

/**
 * Represents a verifier which applies to one's AST tree element
 * and decides whether it contains some errors or not
 *
 * @param <E> the type of the verifying element
 */
public interface ElementVerifier<E extends Element> {
    /**
     * Verifies the given element and returns the list of found errors.
     * If no errors are found, return empty list
     *
     * @param element the verifying element
     * @return the list of found errors
     */
    ImmutableList<VerifyingError> verify(E element);
}
