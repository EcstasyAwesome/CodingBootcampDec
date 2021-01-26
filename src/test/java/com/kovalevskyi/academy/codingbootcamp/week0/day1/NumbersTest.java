package com.kovalevskyi.academy.codingbootcamp.week0.day1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void testGenerateNumbers() {
        var expectedResult = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        assertArrayEquals(expectedResult, Numbers.generateNumbers());
    }

    @Test
    void testIsNegative() {
        assertTrue(Numbers.isNegative(-1));
        assertTrue(Numbers.isNegative(-200));
        assertFalse(Numbers.isNegative(0));
        assertFalse(Numbers.isNegative(200));
    }

    @Test
    void testGenerateTriplets() {
        var expected = new HashSet<String>();
        IntStream.range(0, 10)
                .forEach(
                        n1 -> {
                            IntStream.range(n1 + 1, 10)
                                    .forEach(
                                            n2 -> {
                                                IntStream.range(n2 + 1, 10)
                                                        .forEach(
                                                                n3 -> {
                                                                    if (n1 != n2 && n1 != n3 && n2 != n3) {
                                                                        expected.add(String.format("%d%d%d", n1, n2, n3));
                                                                    }
                                                                });
                                            });
                        });

        var actualResult = Numbers.generateTriplets();

        Stream.of(actualResult)
                .forEach(value -> assertTrue(expected.contains(value), String.format("value: %s", value)));
        assertEquals(expected.size(), actualResult.length);
        assertEquals("012", actualResult[0]);
        assertEquals("013", actualResult[1]);
    }

    @Test
    void testGenerateTuples() {
        var expected = new HashSet<String>();
        IntStream.range(0, 100)
                .forEach(first -> {
                    IntStream.range(first + 1, 100)
                            .forEach(second -> {
                                expected.add(String.format("%02d %02d", first, second));
                            });
                });

        var actualResult = Numbers.generateTuples();

        Stream.of(actualResult).forEach(value -> assertTrue(expected.contains(value)));
        assertEquals(expected.size(), actualResult.length);
    }

    @Test
    void testGenerateNTuples() {
        var n = 5;
        var expected = new HashSet<String>();
        IntStream.range(0, (int) Math.pow(10, n))
                .forEach(
                        value -> {
                            var str = new String(Numbers.convertToString(value));
                            while (str.length() < n) {
                                str = String.format("0%s", str);
                            }
                            expected.add(str);
                        });

        var actualResult = Numbers.generateTuples(n);

        Stream.of(actualResult).forEach(value -> assertTrue(expected.contains(value)));
        assertEquals(expected.size(), actualResult.length);
    }

    @Test
    void testGenerateNTuplesWithNegativeNumber() {
        var n = -1;

        try {
            Numbers.generateTuples(n);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void testGenerateNTuplesWithZero() {
        var n = 0;

        var actualResult = Numbers.generateTuples(n);
        assertTrue(actualResult.length == 0);
    }

    @Test
    void testToString() {
        assertArrayEquals(new char[]{'1', '2'}, Numbers.convertToString(12));
        assertArrayEquals(new char[]{'0'}, Numbers.convertToString(0));
        assertArrayEquals(new char[]{'-', '3', '2'}, Numbers.convertToString(-32));
        assertArrayEquals(
                String.valueOf(Integer.MAX_VALUE).toCharArray(),
                Numbers.convertToString(Integer.MAX_VALUE));
        assertArrayEquals(
                String.valueOf(Integer.MIN_VALUE).toCharArray(),
                Numbers.convertToString(Integer.MIN_VALUE));
    }
}
