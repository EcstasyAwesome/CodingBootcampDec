package com.kovalevskyi.academy.codingbootcamp.week0.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

  @Test
  void sort() {
    var input = new Integer[] {3, 8, 6};
    var expectedOutput = new Integer[] {3, 6, 8};

    Sorting.sort(input, Integer::compare);

    assertArrayEquals(input, expectedOutput);
  }

  @Test
  void sortWithNullInput() {
    try {
      Sorting.sort(null, Integer::compare);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void sortWithNullComparatorAndEmptyArray() {
    try {
      Sorting.sort(new Integer[0], null);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void sortReversedOrder() {
    var input = new Integer[] {3, 8, 6};
    var expectedOutput = new Integer[] {8, 6, 3};

    Sorting.sortReversedOrder(input, Integer::compare);

    assertArrayEquals(input, expectedOutput);
  }

  @Test
  void sortReversedOrderWithNullInput() {
    try {
      Sorting.sortReversedOrder(null, Integer::compare);
      fail();
    } catch (NullPointerException e) {

    }
  }

  @Test
  void sortReversedOrderWithNullComparator() {
    try {
      Sorting.sortReversedOrder(new Integer[0], null);
      fail();
    } catch (NullPointerException e) {

    }
  }
}
