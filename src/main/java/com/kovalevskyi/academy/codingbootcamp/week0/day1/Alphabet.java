package com.kovalevskyi.academy.codingbootcamp.week0.day1;

public class Alphabet {

  public static char[] generateAlphabet() {
    return getAlphabet(false);
  }

  public static char[] generateReversedAlphabet() {
    return getAlphabet(true);
  }

  private static char[] getAlphabet(final boolean reversedOrder) {
    char a = 'a';
    final char z = 'z';
    final char[] alphabet = new char[(z - a) + 1];
    int index = reversedOrder ? alphabet.length - 1 : 0;
    while (a <= z) {
      alphabet[reversedOrder ? index-- : index++] = a++;
    }
    return alphabet;
  }
}