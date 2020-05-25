package com.github.simonharmonicminor.beholder.core.api.member;

import com.github.simonharmonicminor.beholder.core.api.Element;

/**
 * Represents a value containing in one enum
 */
public interface EnumValueElement extends Element {
    /**
     * @return the enum's value
     */
    Enum<?> value();
}
