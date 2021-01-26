package com.kovalevskyi.academy.codingbootcamp.week2.day0;


import com.kovalevskyi.academy.codingbootcamp.week0.day2.Sorting;

public class StringUtils {

  /**
   * Soring array in-place according to the lexicographical strings order.
   *
   * @param target array that needs to be sorted
   */
  public static void sortStrings(String[] target) {
    if (target == null) {
      return;
    }
    Sorting.sort(target, (x, y) -> {
      if (x.length() == y.length()) {
        for (int index = 0; index < x.length(); index++) {
          if (x.charAt(index) - y.charAt(index) > 0) {
            return 1;
          }
        }
      }
      return x.charAt(0) - y.charAt(0);
    });
  }
}
