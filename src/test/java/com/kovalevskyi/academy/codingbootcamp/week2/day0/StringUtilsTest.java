package com.kovalevskyi.academy.codingbootcamp.week2.day0;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

  @Test
  void sortStrings() {
    var input = new String[]{
        "stringa",
        "stringb",
        "123string",
        "stringb",
        "veryveryverylongstringc"
    };
    var expectedResult = new String[]{
        "123string",
        "stringa",
        "stringb",
        "stringb",
        "veryveryverylongstringc"
    };
    StringUtils.sortStrings(input);
    assertArrayEquals(expectedResult, input);
  }

  @Test
  void sortStringsWithZeroInput() {
    var input = new String[]{};
    var expectedResult = new String[]{};
    StringUtils.sortStrings(input);
    assertArrayEquals(expectedResult, input);
  }

  @Test
  void sortStringsWithNull() {
    var input = (String[]) null;
    StringUtils.sortStrings(input);
  }
}
