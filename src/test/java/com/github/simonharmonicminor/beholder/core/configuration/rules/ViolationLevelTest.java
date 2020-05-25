package com.github.simonharmonicminor.beholder.core.configuration.rules;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ViolationLevelTest {
    @Test
    void testEnumValues() {
        assertNotNull(ViolationLevel.ERROR);
        assertNotNull(ViolationLevel.WARN);
    }
}