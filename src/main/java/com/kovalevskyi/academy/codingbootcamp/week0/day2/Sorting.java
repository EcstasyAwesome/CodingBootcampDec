package com.kovalevskyi.academy.codingbootcamp.week0.day2;

import java.util.Comparator;

public class Sorting {

  public static <T> void sort(T[] target, Comparator<T> comparator) {
    sortArray(target, comparator, false);
  }

  public static <T> void sortReversedOrder(T[] target, Comparator<T> comparator) {
    sortArray(target, comparator, true);
  }

  private static <T> void sortArray(final T[] target, final Comparator<T> comparator,
      final boolean reservedOrder) {
    if (target == null || comparator == null) {
      throw new NullPointerException();
    }
    for (int current = 0; current < target.length; current++) {
      for (int search = current + 1; search < target.length; search++) {
        if (reservedOrder) {
          if (comparator.compare(target[current], target[search]) < 0) {
            swap(target, current, search);
          }
        } else {
          if (comparator.compare(target[current], target[search]) > 0) {
            swap(target, current, search);
          }
        }
      }
    }
  }

  private static <T> void swap(final T[] target, final int index1, final int index2) {
    T tmp = target[index1];
    target[index1] = target[index2];
    target[index2] = tmp;
  }
}