package com.github.simonharmonicminor.beholder.core.api.member;

import com.github.simonharmonicminor.beholder.core.api.Element;

public interface EnumValueElement extends Element {
    Enum<?> getValue();
}
