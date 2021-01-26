package com.kovalevskyi.academy.codingbootcamp.week0.day3;

public class NumberUtils {

  public static int factorialNormal(int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }

    int result = 1;
    while (number > 0) {
      result *= number--;
    }
    return result;
  }

  public static int factorialRecursive(int number) {
    if (number < 0) {
      throw new IllegalArgumentException();
    }
    if (number == 1) {
      return 1;
    }

    return number * factorialRecursive(--number);
  }

  public static int powerNormal(int base, int power) {
    if (power < 0) {
      throw new IllegalArgumentException();
    }
    if (power == 0) {
      return 1;
    }

    int result = base;
    while (power-- > 1) {
      result *= base;
    }
    return result;
  }

  public static int powerRecursive(int base, int power) {
    if (power < 0) {
      throw new IllegalArgumentException();
    }
    if (power == 0) {
      return 1;
    }

    return base * powerRecursive(base, --power);
  }

  public static int fibRecursive(int index) {
    if (index < 0) {
      throw new IllegalArgumentException();
    }
    if (index < 2) {
      return index;
    }
    return fibRecursive(index - 1) + fibRecursive(index - 2);
  }

  public static int[] fibSequence(int length) {
    if (length < 0) {
      throw new IllegalArgumentException();
    }
    if (length == 0) {
      return new int[0];
    }

    final int[] fib = new int[length];
    fib[0] = 0;
    if (length > 1) {
      fib[1] = 1;
      for (int index = 2; index < length; index++) {
        fib[index] = fib[index - 1] + fib[index - 2];
      }
    }
    return fib;
  }

  /**
   * Способ вычетов нечётного числа заключается в том, чтобы из подкоренного выражения
   * последовательно вычитать нечётные числа 1, 3, 5, 7 и т. д. пока разность не станет равной 0, а
   * затем подсчитать количество вычитаний. Это и будет ответ.
   */

  public static int sqrt(int target) {
    if (target < 0) {
      throw new IllegalArgumentException();
    }

    int result = 0;
    int odd = 1;
    while (target != 0) {
      if (target < odd) {
        return -1;
      }
      target = target - odd;
      odd += 2;
      result++;
    }
    return result;
  }

  public static boolean isPrime(int target) {
    if (target < 0) {
      throw new IllegalArgumentException();
    }

    return target == 2 || target == 3 || target > 2 && target % 2 != 0 && target % 3 != 0;
  }

  public static int nextPrime(int target) {
    while (true) {
      if (isPrime(target)) {
        return target;
      } else {
        target++;
      }
    }
  }
}