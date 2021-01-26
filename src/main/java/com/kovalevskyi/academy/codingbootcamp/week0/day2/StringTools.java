package com.kovalevskyi.academy.codingbootcamp.week0.day2;

import com.kovalevskyi.academy.codingbootcamp.misc.Writer;

public class StringTools {

  public static void println(Character[] target, Writer writer) {
    if (writer == null) {
      throw new NullPointerException();
    }
    if (target == null || target.length == 0) {
      return;
    }

    for (char symbol : target) {
      writer.write(symbol);
    }
    writer.write('\n');
  }

  public static String reverse(String target) {
    return new StringBuilder(target).reverse().toString();
  }

  public static int toInt(String target) {
    if (target == null || target.isEmpty()) {
      throw new IllegalArgumentException();
    }

    final char[] symbols = target.toCharArray();
    final boolean isNegative = symbols[0] == '-';
    int result = 0;
    int index = isNegative ? 1 : 0;
    int distanceBetweenSymbols = symbols.length - index;
    while (index < symbols.length) {
      if ('0' <= symbols[index] && symbols[index] <= '9') {
        result += pow(Character.getNumericValue(symbols[index++]), distanceBetweenSymbols);
        distanceBetweenSymbols--;
      } else {
        throw new NumberFormatException(String.format("%s is not a number!", target));
      }
    }
    return isNegative ? -result : result;
  }

  private static int pow(final int base, final int pow) {
    int result = base;
    for (int i = 1; i < pow; i++) {
      result *= 10;
    }
    return result;
  }
}