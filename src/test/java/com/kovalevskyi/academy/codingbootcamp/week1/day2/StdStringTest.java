package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

class StdStringTest {

  @Test
  void copyConstructor() {
    var testStr = new StdString(new char[]{'h', 'e', 'l', 'l', 'o'});
    var testStr2 = new StdString(testStr);

    assertEquals(testStr, testStr2);
    assertNotSame(testStr.toCharArray(), testStr2.toCharArray());
  }

  @Test
  void length() {
    var testStr = new StdString(new char[]{'h', 'e', 'l', 'l', 'o'});

    assertEquals(5, testStr.length());
  }

  @Test
  void lengthOfEmptyString() {
    var testStr = new StdString();

    assertEquals(0, testStr.length());
  }

  @Test
  void append() {
    var testStr = new StdString(new char[]{'h', 'e', 'l', 'l', 'o'});
    var testStr2 = new StdString(new char[]{'1', '2', '3'});

    assertEquals("hello123", testStr.append(testStr2).toString());
    assertEquals("hello", testStr.toString());
    assertEquals("123", testStr2.toString());
  }

  @Test
  void appendEmptyString() {
    var testStr = new StdString(new char[]{'h', 'e', 'l', 'l', 'o'});
    var testStr2 = new StdString();

    assertEquals("hello", testStr.append(testStr2).toString());
  }

  @Test
  void toCharArray() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    assertArrayEquals(inputChars, testStr.toCharArray());
  }

  @Test
  void toCharArrayWithEmptyString() {
    var testStr = new StdString();

    assertArrayEquals(new char[0], testStr.toCharArray());
  }

  @Test
  void charAt() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    assertEquals('e', testStr.charAt(1));
    assertEquals('o', testStr.charAt(4));
  }

  @Test
  void charAtWithIllegalIndex() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    try {
      testStr.charAt(-2);
      fail();
    } catch (IndexOutOfBoundsException e) {

    }
  }

  @Test
  void indexOf() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    assertEquals(2, testStr.indexOf('l'));
    assertEquals(-1, testStr.indexOf('z'));
  }

  @Test
  void testEquals() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var inputChars2 = new char[]{'h', 'e', 'l', 'l', 'o', '2'};
    var testStr = new StdString(inputChars);
    var testStr2 = new StdString(inputChars);
    var testStr3 = new StdString(inputChars2);

    assertTrue(testStr.equals(testStr2));
    assertFalse(testStr.equals(testStr3));
    assertFalse(testStr.equals(null));
    assertFalse(testStr.equals(1));
  }

  @Test
  void testHashCode() {
    var hashCode = (int) 'h' + (int) 'e' + (int) 'l' * 2 + (int) 'o';
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    assertEquals(hashCode, testStr.hashCode());
  }

  @Test
  void testHashCodeOfEmptyString() {
    var testStr = new StdString();

    assertEquals(0, testStr.hashCode());
  }

  @Test
  void testToString() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);

    assertEquals("hello", testStr.toString());
  }

  @Test
  void testToStringWithEmptyString() {
    var testStr = new StdString();

    assertEquals("", testStr.toString());
  }

  @Test
  void iterator() {
    var inputChars = new char[]{'h', 'e', 'l', 'l', 'o'};
    var testStr = new StdString(inputChars);
    var index = 0;

    for (var ch : testStr) {
      assertEquals(inputChars[index], ch);
      index++;
    }
  }

  @Test
  void iteratorWithOneElement() {
    var inputChars = new char[]{'a'};
    var testStr = new StdString(inputChars);
    var index = 0;

    for (var ch : testStr) {
      assertEquals(inputChars[index], ch);
      index++;
    }
  }

  @Test
  void iteratorWithEmptyString() {
    var testStr = new StdString();

    assertFalse(testStr.iterator().hasNext());
    try {
      char impossible = testStr.iterator().next();
      fail();
    } catch (NoSuchElementException ignore) {
    }
  }

  @Test
  void forEach() {
    var inputChars = new char[]{'h', 'e', 'l', 'o'};
    var testStr = new StdString(inputChars);
    var result = new HashSet<Character>();

    testStr.forEach(result::add);

    for (var ch : inputChars) {
      assertTrue(result.contains(ch));
    }

    assertEquals(4, result.size());
  }
}