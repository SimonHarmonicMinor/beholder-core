package com.kirekov.beholder.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ViolationLevelTest {
    @Test
    void testEnumValues() {
        assertNotNull(ViolationLevel.ERROR);
        assertNotNull(ViolationLevel.WARN);
    }
}