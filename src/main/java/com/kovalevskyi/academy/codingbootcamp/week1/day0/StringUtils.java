package com.kovalevskyi.academy.codingbootcamp.week1.day0;

import com.kovalevskyi.academy.codingbootcamp.week0.day2.StringTools;
import java.util.stream.IntStream;

public class StringUtils {

  static {
    DISTANCE_BETWEEN_CHARACTERS = 'a' - 'A';
  }

  public static final int ASCII_MAX_VALUE = 255;

  private static final int DISTANCE_BETWEEN_CHARACTERS;

  public static boolean isAsciiUppercase(char ch) {
    if (ch > ASCII_MAX_VALUE) {
      throw new IllegalArgumentException();
    }

    return 'A' <= ch && ch <= 'Z';
  }

  public static boolean isAsciiLowercase(char ch) {
    if (ch > ASCII_MAX_VALUE) {
      throw new IllegalArgumentException();
    }

    return 'a' <= ch && ch <= 'z';
  }

  public static boolean isAsciiNumeric(char ch) {
    if (ch > ASCII_MAX_VALUE) {
      throw new IllegalArgumentException();
    }

    return '0' <= ch && ch <= '9';
  }

  public static boolean isAsciiAlphabetic(char ch) {
    return isAsciiUppercase(ch) || isAsciiLowercase(ch);
  }

  public static char toAsciiUppercase(char ch) {
    if (isAsciiLowercase(ch)) {
      return (char) (ch - DISTANCE_BETWEEN_CHARACTERS);
    }
    return ch;
  }

  public static char toAsciiLowercase(char ch) {
    if (isAsciiUppercase(ch)) {
      return (char) (ch + DISTANCE_BETWEEN_CHARACTERS);
    }
    return ch;
  }

  public static StringBuilder makeUppercase(char[] input) {
    final StringBuilder result = new StringBuilder();
    for (char symbol : input) {
      result.append(toAsciiUppercase(symbol));
    }
    return result;
  }

  public static StringBuilder makeLowercase(char[] input) {
    final StringBuilder result = new StringBuilder();
    for (char symbol : input) {
      result.append(toAsciiLowercase(symbol));
    }
    return result;
  }

  public static StringBuilder makeCamel(char[] input) {
    final StringBuilder result = new StringBuilder();
    boolean toUpperCase = false;
    for (char symbol : input) {
      if (toUpperCase) {
        result.append(toAsciiUppercase(symbol));
        toUpperCase = false;
      } else {
        result.append(toAsciiLowercase(symbol));
        toUpperCase = true;
      }
    }
    return result;
  }

  public static boolean isStringAlphaNumerical(char[] input) {
    for (char symbol : input) {
      if (!isAsciiAlphabetic(symbol) && !isAsciiNumeric(symbol) && symbol != ' ') {
        return false;
      }
    }
    return true;
  }

  public static char[] concatStrings(char[][] input) {
    final StringBuilder stringBuilder = new StringBuilder();
    IntStream.range(0, input.length)
        .forEach(index -> {
          IntStream.range(0, input[index].length)
              .forEach(entry -> {
                final char symbol = input[index][entry];
                if (symbol > ASCII_MAX_VALUE) {
                  throw new IllegalArgumentException();
                } else {
                  stringBuilder.append(symbol);
                }
              });
        });
    return stringBuilder.toString().toCharArray();
  }

  public static int toInt(char[] input) {
    return StringTools.toInt(new String(input));
  }
}