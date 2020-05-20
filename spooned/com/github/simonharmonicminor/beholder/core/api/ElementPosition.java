package com.github.simonharmonicminor.beholder.core.api;
/**
 * Represents coordinates of one code element
 */
public interface ElementPosition {
    /**
     *
     *
     * @return the line in the source file (1 indexed)
     */
    int getLineNumber();

    /**
     *
     *
     * @return the column in the source file (1 indexed)
     */
    int getColumnNumber();
}