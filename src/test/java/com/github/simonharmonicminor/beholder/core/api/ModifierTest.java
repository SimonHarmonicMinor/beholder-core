package com.github.simonharmonicminor.beholder.core.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModifierTest {

    @Test
    void testToLowercase() {
        assertEquals("abstract", Modifier.ABSTRACT.toLowercase());
        assertEquals("final", Modifier.FINAL.toLowercase());
        assertEquals("private", Modifier.PRIVATE.toLowercase());
        assertEquals("protected", Modifier.PROTECTED.toLowercase());
        assertEquals("transient", Modifier.TRANSIENT.toLowercase());
        assertEquals("volatile", Modifier.VOLATILE.toLowercase());
        assertEquals("public", Modifier.PUBLIC.toLowercase());
        assertEquals("static", Modifier.STATIC.toLowercase());
        assertEquals("native", Modifier.NATIVE.toLowercase());
        assertEquals("synchronized", Modifier.SYNCHRONIZED.toLowercase());
        assertEquals("strictfp", Modifier.STRICTFP.toLowercase());
    }
}