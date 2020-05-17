package com.github.simonharmonicminor.beholder.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        assertDoesNotThrow(() -> Main.main(new String[]{}));
    }
}