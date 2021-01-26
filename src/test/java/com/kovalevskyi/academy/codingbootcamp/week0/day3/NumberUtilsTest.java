package com.kovalevskyi.academy.codingbootcamp.week0.day3;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {

    @Test
    void factorialNormal() {
        var input = 5;
        var expected = 5 * 4 * 3 * 2 * 1;

        assertEquals(expected, NumberUtils.factorialNormal(input));
    }

    @Test
    void factorialNormalWithZeroInput() {
        var input = 0;
        var expected = 1;

        assertEquals(expected, NumberUtils.factorialNormal(input));
    }

    @Test
    void factorialNormalWithNegativeInput() {
        var input = -2;
        try {
            NumberUtils.factorialNormal(input);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void factorialRecursive() {
        var input = 5;
        var expected = 5 * 4 * 3 * 2 * 1;

        assertEquals(expected, NumberUtils.factorialRecursive(input));
    }

    @Test
    void factorialRecursiveWithOneAsInput() {
        var input = 1;
        var expected = 1;

        assertEquals(expected, NumberUtils.factorialRecursive(input));
    }

    @Test
    void factorialRecursiveWithNegativeInput() {
        var input = -2;
        try {
            NumberUtils.factorialRecursive(input);
            fail();
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void powerNormal() {
        var inputX = 2;
        var inputY = 6;
        var expected = 64;

        assertEquals(expected, NumberUtils.powerNormal(inputX, inputY));
    }

    @Test
    void powerNormalWithZeroPower() {
        var inputBase = 2;
        var inputPower = 0;
        var expected = 1;

        assertEquals(expected, NumberUtils.powerNormal(inputBase, inputPower));
    }

    @Test
    void powerNormalWithNegativePower() {
        var inputBase = 2;
        var inputPower = -1;
        try {
            NumberUtils.powerNormal(inputBase, inputPower);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void powerNormalWithNegativeBase() {
        var inputBase = -2;
        var inputPower = 3;
        var expected = -8;

        assertEquals(expected, NumberUtils.powerNormal(inputBase, inputPower));
    }

    @Test
    void powerRecursive() {
        var inputX = 2;
        var inputY = 6;
        var expected = 64;

        assertEquals(expected, NumberUtils.powerRecursive(inputX, inputY));
    }

    @Test
    void powerRecursiveWithZeroPower() {
        var inputBase = 2;
        var inputPower = 0;
        var expected = 1;

        assertEquals(expected, NumberUtils.powerRecursive(inputBase, inputPower));
    }

    @Test
    void powerRecursiveWithNegativeBase() {
        var inputBase = -2;
        var inputPower = 3;
        var expected = -8;

        assertEquals(expected, NumberUtils.powerRecursive(inputBase, inputPower));
    }

    @Test
    void powerRecursiveWithNegativePower() {
        var inputBase = 1;
        var inputPower = -1;
        try {
            NumberUtils.powerRecursive(inputBase, inputPower);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void fibRecursive() {
        var input = 12;
        var expectedOutput = 144;

        assertEquals(expectedOutput, NumberUtils.fibRecursive(input));
    }

    @Test
    void fibRecursiveWithInputOne() {
        var input = 1;
        var expectedOutput = 1;

        assertEquals(expectedOutput, NumberUtils.fibRecursive(input));
    }

    @Test
    void fibRecursiveWithInputTwo() {
        var input = 2;
        var expectedOutput = 1;

        assertEquals(expectedOutput, NumberUtils.fibRecursive(input));
    }

    @Test
    void fibRecursiveWithNegativeInput() {
        var input = -2;
        var expectedOutput = 1;
        try {
            NumberUtils.fibRecursive(input);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void fibSequence() {
        var input = 12;
        var expectedOutput = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

        assertArrayEquals(expectedOutput, NumberUtils.fibSequence(input));
    }

    @Test
    void fibSequenceWithNegative() {
        try {
            NumberUtils.fibSequence(-1);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void fibSequenceWithZeroLength() {
        var input = 0;
        var expectedOutput = new int[]{};

        assertArrayEquals(expectedOutput, NumberUtils.fibSequence(input));
    }

    @Test
    void sqrt() {
        var input = 4;
        var expectedOutput = 2;

        assertEquals(expectedOutput, NumberUtils.sqrt(input));
        assertEquals(expectedOutput, NumberUtils.sqrt(input));
    }

    @Test
    void sqrtWhenIntSqrtDoesNotExist() {
        var input = 3;
        var expectedOutput = -1;

        assertEquals(expectedOutput, NumberUtils.sqrt(input));
    }

    @Test
    void sqrtWithNegativeInput() {
        var input = -4;

        try {
            NumberUtils.sqrt(input);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void isPrime() {
        Stream.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
                61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131,
                137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199)
                .forEach(number -> assertTrue(NumberUtils.isPrime(number)));

        assertFalse(NumberUtils.isPrime(9));
        assertFalse(NumberUtils.isPrime(0));
        assertFalse(NumberUtils.isPrime(1));
    }

    @Test
    void isPrimeWithNegativeInput() {
        try {
            NumberUtils.isPrime(-5);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void nextPrime() {
        var inputNumber = 6;
        var expectedNumber = 7;

        assertEquals(expectedNumber, NumberUtils.nextPrime(inputNumber));
    }

    @Test
    void nextPrimeWithNegativeInput() {
        var inputNumber = -6;
        try {
            NumberUtils.nextPrime(inputNumber);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }
}
