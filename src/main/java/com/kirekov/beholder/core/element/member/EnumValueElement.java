package com.kirekov.beholder.core.element.member;

import com.kirekov.beholder.core.element.Element;

/**
 * Represents a value containing in one enum
 */
public interface EnumValueElement extends Element {
    /**
     * @return the enum's value
     */
    Enum<?> value();
}
