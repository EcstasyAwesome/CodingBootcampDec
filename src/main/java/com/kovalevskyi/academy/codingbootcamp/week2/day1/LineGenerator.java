package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LineGenerator {

  public static <T> Stream<T> generateLine(
      final T cornerLeft,
      final T cornerRight,
      final T fill,
      final int width) {
    var line = Stream.<T>builder();
    IntStream.range(0, width)
        .forEach(index -> {
          if (index == 0) {
            line.add(cornerLeft);
          } else if (index == width - 1) {
            line.add(cornerRight);
          } else {
            line.add(fill);
          }
        });
    return line.build();
  }

}