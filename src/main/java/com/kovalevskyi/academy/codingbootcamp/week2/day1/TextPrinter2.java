package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import java.util.Objects;

/**
 * Same as TextPrinter, however in this case program expect 2 arguments: 1. test 2. character to use
 * to draw a box
 * <p>
 * For example, for the input: "text", "?"
 * <p>
 * the program should print: ???????? ? test ? ????????
 */
public class TextPrinter2 {

  private final String[] arguments;

  public TextPrinter2(final String[] arguments) {
    this.arguments = arguments;
  }

  public void run() {
    final boolean isNull = Objects.isNull(arguments);
    if (isNull || arguments.length != 2) {
      System.out
          .printf("Please provide 2 input argument, current amount: %d\n",
              isNull ? 0 : arguments.length);
    } else {
      var border = Objects.requireNonNullElse(arguments[0], "*");
      var message = Objects.requireNonNullElse(arguments[1], "");
      var length = message.isEmpty() ? 4 : message.length() + 4;

      LineGenerator.generateLine(border, border + "\n", border, length)
          .forEach(System.out::print);

      System.out.printf("%s %s %s\n", border, message, border);

      LineGenerator.generateLine(border, border + "\n", border, length)
          .forEach(System.out::print);
    }
  }

  public static void main(String[] args) {
    new TextPrinter2(args).run();
  }
}
