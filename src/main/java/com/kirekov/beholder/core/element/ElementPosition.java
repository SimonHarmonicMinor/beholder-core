package com.kirekov.beholder.core.element;

/**
 * Represents coordinates of one's code element
 */
public interface ElementPosition {

    /**
     * @return the line in the source file (1 indexed)
     */
    int lineNumber();

    /**
     * @return the column in the source file (1 indexed)
     */
    int columnNumber();
}
