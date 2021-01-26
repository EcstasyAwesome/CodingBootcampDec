package com.kovalevskyi.academy.codingbootcamp.week1.day3;


import static com.kovalevskyi.academy.codingbootcamp.week1.day0.StringUtils.toAsciiLowercase;
import static com.kovalevskyi.academy.codingbootcamp.week1.day0.StringUtils.toAsciiUppercase;

import java.util.Arrays;

public class StdString extends com.kovalevskyi.academy.codingbootcamp.week1.day2.StdString {

  /**
   * Constructor that creates string from the specified char array.
   *
   * @param base char array to use as a string base
   */
  public StdString(char[] base) {
    super(base);
  }

  /**
   * Constructor that creates empty string with length 0.
   */
  public StdString() {
    this(new char[0]);
  }

  /**
   * Constructor that creates a copy of the string. New String should have exactly same characters
   * as the original one.
   *
   * @param that to copy from.
   */
  public StdString(StdString that) {
    super(that);
  }

  /**
   * Creates a copy of the string with all ascii characters in lower case. Example "CaT12" =>
   * "cat12" "   asdT2" => "   asdt2"
   *
   * @return new string with all the characters lowercase
   * @throws IllegalArgumentException if one of characters is not ascii
   */
  public StdString toAsciiLowerCase() {
    final char[] result = Arrays.copyOf(this.base, this.base.length);
    for (int index = 0; index < this.base.length; index++) {
      result[index] = toAsciiLowercase(result[index]);
    }
    return new StdString(result);
  }

  /**
   * Creates a copy of the string with all ascii characters in upper case. Example "CaT12" =>
   * "CAT12" "   asdT2" => "   ASDT2"
   *
   * @return new string with all the characters uppercase
   * @throws IllegalArgumentException if one of characters is not ascii
   */
  public StdString toAsciiUpperCase() {
    final char[] result = Arrays.copyOf(this.base, this.base.length);
    for (int index = 0; index < this.base.length; index++) {
      result[index] = toAsciiUppercase(result[index]);
    }
    return new StdString(result);
  }

  /**
   * return new string that contains all the characters of this string from the specific range
   * [from; to). From is inclusive, to is exclusive. Example: "ased 79s", 1 5 => "sed "
   * "cat-dog-123", 2, 3 => "t"
   *
   * @param from inclusive index
   * @param to   exclusive index
   * @return substring
   * @throws IndexOutOfBoundsException if index is incorrect
   * @throws IllegalArgumentException  if from >= to
   */
  public StdString subString(int from, int to) {
    return new StdString(Arrays.copyOfRange(this.base, from, to));
  }

  /**
   * creates new string that includes all characters from this string and all characters in all the
   * input strings. Example: "thisStr", "thatStr123", "thatStr222" => "thisStrthatStr123thatStr222"
   *
   * @param that strings to add
   * @return new string that combines all strings together
   * @throws NullPointerException if input is null
   */
  public StdString concat(StdString... that) {
    char[] result = this.base;
    for (StdString item : that) {
      final char[] tmp = new char[result.length + item.length()];
      System.arraycopy(result, 0, tmp, 0, result.length);
      System.arraycopy(item.toCharArray(), 0, tmp, result.length, item.length());
      result = tmp;
    }
    return new StdString(result);
  }

  /**
   * Split one string on array of substrings, based on separator. Example: "cat trim dog", ' ' =>
   * "cat", "trim", "dog" "one!str !two    ! three", '!' => "one", "str ", "two    ", " three" "cat
   * dog   ", ' ' => "cat", "dog", "", "" "cat dog   ", '!' => "cat dog   "
   *
   * @param separator to use for splitting the string
   * @return array of strings
   */
  public StdString[] split(char separator) {
    final StdString[] result = new StdString[this.base.length];
    int elements = 0;
    int from = 0;
    for (int to = 0; to < this.base.length; to++) {
      if (this.base[to] == separator) {
        result[elements++] = this.subString(from, to);
        from = to + 1;
      }
    }
    return elements == 0 ? new StdString[]{this} : Arrays.copyOf(result, elements);
  }

  /**
   * Removes all the whitespaces at the beginning and at the end of the string and returns result in
   * a new string. For example: "  hi    " => "hi" "hi" => "hi" "    1      2" => "1      2" " " =>
   * ""
   *
   * @return new string without whitespaces
   */
  public StdString trim() {
    if (this.base.length == 0) {
      return this;
    }
    int from = 0;
    int to = this.base.length - 1;
    for (; from < this.base.length; from++) {
      if (this.base[from] != ' ') {
        break;
      }
    }
    for (; to >= 0; to--) {
      if (this.base[to] != ' ') {
        to++;
        break;
      }
    }
    return this.subString(from, to);
  }

  /**
   * removes all cases of a specified character in a string and returns new string without it.
   * Example: "new,1,2,3" ',' => "new123" "  1  2 ", ' ' => "12" "asdf123", '!' => "asdf123"
   *
   * @param toRemove character to search for
   * @return new string without specified character
   */
  public StdString removeCharacter(char toRemove) {
    final char[] result = new char[this.base.length];
    int elements = 0;
    for (char symbol : this) {
      if (symbol != toRemove) {
        result[elements++] = symbol;
      }
    }
    return new StdString(Arrays.copyOf(result, elements));
  }
}
