package com.github.simonharmonicminor.beholder.core.api;

/**
 * Represents variable declared inside one type (class, enum or interface)
 */
public interface MemberElement extends Element {
    /**
     * @return member's class
     */
    Class<?> getMemberClass();
}
