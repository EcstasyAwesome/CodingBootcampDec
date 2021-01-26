package com.kovalevskyi.academy.codingbootcamp.week2.day1;


import java.util.Objects;

public class TextPrinter {

  /**
   * The program prints the text from the input argument in a box like this:
   * <p>
   * /#################\ # test in the box # \#################/
   * <p>
   * if input argument is an empty string box will look like this: /##\ #  # \##/
   * <p>
   * if there is no input argument (or more than one) it is expected from the program to print:
   * Please provide only one input argument, current amount: %d\n
   * <p>
   * with the current amount of input arguments
   *
   * @param args
   */


  private final String[] arguments;

  public TextPrinter(final String[] arguments) {
    this.arguments = arguments;
  }

  public void run() {
    final var isNull = Objects.isNull(arguments);
    if (isNull || arguments.length != 1) {
      System.out
          .printf("Please provide only one input argument, current amount: %d\n",
              isNull ? 0 : arguments.length);
    } else {
      var message = Objects.requireNonNullElse(arguments[0], "");
      var length = message.isEmpty() ? 2 : message.length() + 2;

      LineGenerator.generateLine("/#", "#\\\n", "#", length)
          .forEach(System.out::print);

      System.out.printf("# %s #\n", message);

      LineGenerator.generateLine("\\#", "#/\n", "#", length)
          .forEach(System.out::print);
    }
  }

  public static void main(String[] args) {
    new TextPrinter(args).run();
  }
}
