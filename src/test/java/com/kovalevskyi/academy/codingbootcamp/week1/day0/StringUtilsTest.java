package com.kovalevskyi.academy.codingbootcamp.week1.day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StringUtilsTest {

  @Test
  void isAsciiUppercase() {
    assertTrue(StringUtils.isAsciiUppercase('A'));
    assertTrue(StringUtils.isAsciiUppercase('Z'));
    assertTrue(StringUtils.isAsciiUppercase('X'));
    assertFalse(StringUtils.isAsciiUppercase('a'));
    assertFalse(StringUtils.isAsciiUppercase('d'));
    assertFalse(StringUtils.isAsciiUppercase('u'));
  }

  @Test
  void isAsciiUppercaseWithIllegalInput() {
    try {
      StringUtils.isAsciiUppercase((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void isAsciiLowercase() {
    assertFalse(StringUtils.isAsciiLowercase('A'));
    assertFalse(StringUtils.isAsciiLowercase('Z'));
    assertFalse(StringUtils.isAsciiLowercase('X'));
    assertTrue(StringUtils.isAsciiLowercase('a'));
    assertTrue(StringUtils.isAsciiLowercase('d'));
    assertTrue(StringUtils.isAsciiLowercase('u'));
  }

  @Test
  void isAsciiLowercaseWithIllegalInput() {
    try {
      StringUtils.isAsciiLowercase((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void isAsciiNumeric() {
    assertFalse(StringUtils.isAsciiNumeric('A'));
    assertFalse(StringUtils.isAsciiNumeric('Z'));
    assertFalse(StringUtils.isAsciiNumeric('X'));
    assertTrue(StringUtils.isAsciiNumeric('1'));
    assertTrue(StringUtils.isAsciiNumeric('2'));
    assertTrue(StringUtils.isAsciiNumeric('3'));
  }

  @Test
  void isAsciiNumericWithIllegalInput() {
    try {
      StringUtils.isAsciiNumeric((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void isAsciiAlphabetic() {
    assertTrue(StringUtils.isAsciiAlphabetic('A'));
    assertTrue(StringUtils.isAsciiAlphabetic('Z'));
    assertTrue(StringUtils.isAsciiAlphabetic('X'));
    assertFalse(StringUtils.isAsciiAlphabetic('1'));
    assertFalse(StringUtils.isAsciiAlphabetic('2'));
    assertFalse(StringUtils.isAsciiAlphabetic('3'));
  }

  @Test
  void isAsciiAlphabeticWithIllegalInput() {
    try {
      StringUtils.isAsciiAlphabetic((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void toAsciiUppercase() {
    assertEquals('A', StringUtils.toAsciiUppercase('a'));
    assertEquals('B', StringUtils.toAsciiUppercase('b'));
    assertEquals('A', StringUtils.toAsciiUppercase('A'));
    assertEquals('B', StringUtils.toAsciiUppercase('B'));
    assertEquals('!', StringUtils.toAsciiUppercase('!'));
    assertEquals(' ', StringUtils.toAsciiUppercase(' '));
  }

  @Test
  void toAsciiUppercaseWithIllegalInput() {
    try {
      StringUtils.toAsciiUppercase((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void toAsciiLowercase() {
    assertEquals('a', StringUtils.toAsciiLowercase('a'));
    assertEquals('b', StringUtils.toAsciiLowercase('b'));
    assertEquals('a', StringUtils.toAsciiLowercase('A'));
    assertEquals('b', StringUtils.toAsciiLowercase('B'));
    assertEquals('!', StringUtils.toAsciiLowercase('!'));
    assertEquals(' ', StringUtils.toAsciiLowercase(' '));
  }

  @Test
  void toAsciiLowercaseWithIllegalInput() {
    try {
      StringUtils.toAsciiLowercase((char) 257);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void makeUppercase() {
    var inputValue = new char[]{'h', 'e', 'l', 'L', 'o'};
    var expectedValue = "HELLO";

    assertEquals(expectedValue,
        StringUtils.makeUppercase(inputValue).toString());
  }

  @Test
  void makeUppercaseWithLegalNonCharacters() {
    var inputValue = new char[]{'1', '2', '3', ' ', 'h', 'e', 'l', 'L', 'o'};
    var expectedValue = "123 HELLO";

    assertEquals(expectedValue,
        StringUtils.makeUppercase(inputValue).toString());
  }

  @Test
  void makeUppercaseWithIllegalInput() {
    var inputValue = new char[]{(char) 299, 'e', 'l', 'L', 'o'};
    try {
      StringUtils.makeUppercase(inputValue);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void makeLowercase() {
    var inputValue = new char[]{'H', 'E', 'l', 'L', 'o'};
    var expectedValue = "hello";

    assertEquals(expectedValue,
        StringUtils.makeLowercase(inputValue).toString());
  }

  @Test
  void makeLowercaseWithLegalNonCharacters() {
    var inputValue = new char[]{'1', '2', '3', ' ', 'H', 'E', 'l', 'L', 'o'};
    var expectedValue = "123 hello";

    assertEquals(expectedValue,
        StringUtils.makeLowercase(inputValue).toString());
  }

  @Test
  void makeLowercaseWithIllegalCharacter() {
    var inputValue = new char[]{'1', '2', '3', (char) 299, ' ', 'H', 'E', 'l', 'L', 'o'};
    try {
      StringUtils.makeLowercase(inputValue);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void makeCamel() {
    var inputValue = new char[]{'H', 'E', 'l', 'L', 'o'};
    var expectedValue = "hElLo";

    assertEquals(expectedValue,
        StringUtils.makeCamel(inputValue).toString());
  }

  @Test
  void makeCamelWithLegalNonAlphabeticCharacters() {
    var inputValue = new char[]{'1', ' ', 'H', 'E', 'l', 'L', 'o', '?', 'O'};
    var expectedValue = "1 hElLo?o";

    assertEquals(expectedValue,
        StringUtils.makeCamel(inputValue).toString());
  }

  @Test
  void makeCamelWithIllegalCharacters() {
    var inputValue = new char[]{'1', (char) 399, 'H', 'E', 'l', 'L', 'o', '?', 'O'};
    try {
      StringUtils.makeCamel(inputValue);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void isStringAlphaNumerical() {
    assertTrue(StringUtils.isStringAlphaNumerical(
        new char[]{'a', 'b', '1', ' '}
    ));
    assertFalse(StringUtils.isStringAlphaNumerical(
        new char[]{'a', ',', '1', ' '}
    ));
  }

  @Test
  void isStringAlphaNumericalWithIllegalInput() {
    try {
      StringUtils.isStringAlphaNumerical(
          new char[]{(char) 399, 'b', '1', ' '}
      );
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void concatStrings() {
    var input = new char[][]{
        {'H', 'e', 'l', 'l', 'o'},
        {' '},
        {'w', 'o', 'r', 'l', 'd', '!'}};
    var expectedOut = new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
    assertArrayEquals(expectedOut, StringUtils.concatStrings(input));
  }

  @Test
  void concatStringsWithZeroInput() {
    var input = new char[][]{};
    var expectedOut = new char[]{};
    assertArrayEquals(expectedOut, StringUtils.concatStrings(input));
  }

  @Test
  void concatStringsWithNullInput() {
    try {
      StringUtils.concatStrings(null);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void concatStringsWithIllegalChars() {
    try {
      StringUtils.concatStrings(new char[][]{
          {'H', 'e', 'l', 'l', 'o'},
          {' '},
          {'w', 'o', 'r', 'l', 'd', '!', (char) 266}});
      fail();
    } catch (IllegalArgumentException ignored) {
    }
  }

  @Test
  void concatStringsWithNullInputWithinNonNullArray() {
    var input = new char[][]{null};
    try {
      StringUtils.concatStrings(input);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void toInt() {
    assertEquals(12, StringUtils.toInt(new char[]{'1', '2'}));
    assertEquals(0, StringUtils.toInt(new char[]{'0'}));
    assertEquals(-12, StringUtils.toInt(new char[]{'-', '1', '2'}));
    assertEquals(Integer.MAX_VALUE,
        StringUtils.toInt(
            String.valueOf(Integer.MAX_VALUE).toCharArray()
        ));
  }

  @Test
  void toIntWithNullInput() {
    try {
      StringUtils.toInt(null);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void toIntWithIllegalInput() {
    var input = new char[]{'1', '2', 'a'};
    try {
      StringUtils.toInt(input);
      fail();
    } catch (NumberFormatException e) {

    }
  }

  @Test
  void toIntWithIllegalInput2() {
    var input = new char[]{'-', '-', '1', '2', 'a'};
    try {
      StringUtils.toInt(input);
      fail();
    } catch (NumberFormatException ignored) {
    }
  }
}