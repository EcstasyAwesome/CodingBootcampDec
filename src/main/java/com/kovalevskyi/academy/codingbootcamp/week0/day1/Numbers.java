package com.kovalevskyi.academy.codingbootcamp.week0.day1;

public class Numbers {

  private static final String DELIMITER = ";";

  public static int[] generateNumbers() {
    final int amountOfNumbers = 10;
    final int[] numbers = new int[amountOfNumbers];
    for (int number = 0; number < amountOfNumbers; number++) {
      numbers[number] = number;
    }
    return numbers;
  }

  public static boolean isNegative(int number) {
    return number < 0;
  }

  public static String[] generateTriplets() {
    final StringBuilder notParsedTriplets = new StringBuilder();
    for (int first = 0; first < 10; first++) {
      for (int second = first + 1; second < 10; second++) {
        for (int third = second + 1; third < 10; third++) {
          notParsedTriplets.append(String.format("%d%d%d%s", first, second, third, DELIMITER));
        }
      }
    }
    return notParsedTriplets.toString().split(DELIMITER);
  }

  public static String[] generateTuples() {
    final StringBuilder notParsedTuples = new StringBuilder();
    for (int first = 0; first < 100; first++) {
      for (int second = first + 1; second < 100; second++) {
        notParsedTuples.append(String.format("%02d %02d%s", first, second, DELIMITER));
      }
    }
    return notParsedTuples.toString().split(DELIMITER);
  }

  public static String[] generateTuples(int amount) throws IllegalArgumentException {
    if (amount < 0) {
      throw new IllegalArgumentException();
    }
    if (amount == 0) {
      return new String[0];
    }

    final StringBuilder notParsedTuples = new StringBuilder();
    final int pow = pow(amount);
    for (int index = 0; index < pow; index++) {
      notParsedTuples.append(String.format("%0" + amount + "d%s", index, DELIMITER));
    }
    return notParsedTuples.toString().split(DELIMITER);
  }

  public static char[] convertToString(int number) {
    return String.format("%d", number).toCharArray();
  }

  private static int pow(final int pow) {
    int x = 1;
    for (int iteration = 0; iteration < pow; iteration++) {
      x *= 10;
    }
    return x;
  }
}