package com.kovalevskyi.academy.codingbootcamp.week0.day2;

public class Numbers {

  public static void sort(int[] target) {
    if (target == null || target.length == 0) {
      return;
    }

    for (int current = 0; current < target.length; current++) {
      for (int search = current + 1; search < target.length; search++) {
        if (target[current] > target[search]) {
          //it's swap without creating a local variable
          target[current] = target[current] + target[search];
          target[search] = target[current] - target[search];
          target[current] = target[current] - target[search];
        }
      }
    }
  }
}
