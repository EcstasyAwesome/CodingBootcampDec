package com.kovalevskyi.academy.codingbootcamp.misc;

public interface Writer {

  default void write(String out) {
    System.out.println(out);
  }

  default void write(char charToPrint) {
    System.out.print(charToPrint);
  }
}
