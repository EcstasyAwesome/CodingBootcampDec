package com.kovalevskyi.academy.codingbootcamp.week0.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class AlphabetTest {

    @Test
    public void testGenerateAlphabet() {
        var expectedResult =
                new char[]{
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                        's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
                };

        assertArrayEquals(expectedResult, Alphabet.generateAlphabet());
    }

    @Test
    public void testGenerateReversedAlphabet() {
        var expectedResult =
                new char[]{
                        'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i',
                        'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'
                };

        assertArrayEquals(expectedResult, Alphabet.generateReversedAlphabet());
    }
}
