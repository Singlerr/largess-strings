package io.github.singlerr.strings;

import static org.junit.jupiter.api.Assertions.*;

class AnimatedStringsTest {

    @org.junit.jupiter.api.Test
    void shiftString() {
        String example = AnimatedStrings.shiftString("abcd", 1,true);
        System.out.println(example);
    }
}