package com.kirekov.beholder.core.converter;

import com.kirekov.beholder.core.element.Element;

@FunctionalInterface
public interface ElementConverter<IN, OUT extends Element> {
    OUT convert(IN input);
}
