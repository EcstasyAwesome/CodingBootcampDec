package com.kovalevskyi.academy.codingbootcamp.week2.day1;


import com.kovalevskyi.academy.codingbootcamp.week0.day2.StringTools;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * The program droving boxes on the screen, like this:
 * <p>
 * #----# -    - -    - #----#
 * <p>
 * The program takes four input arguments: 1. width of the box 2. height of the box 3. character for
 * the walls 4. character for the corners
 * <p>
 * So in order to get exactly the same box as shown in the example one should pass the following
 * arguments: 6 4 - #
 * <p>
 * if amount of the arguments is not 4 the program should prinet: Please provide 4 input arguments,
 * current amount: %d\n
 * <p>
 * with the current amount of arguments.
 * <p>
 * In case of any illegal arguments the program should throw IllegalArgumentException
 */
public class BoxGenerator {

  private final String[] arguments;
  private int width;
  private int height;
  private String wall;
  private String corner;

  public BoxGenerator(final String[] arguments) {
    this.arguments = arguments;
    parseArguments();
  }

  private void parseArguments() {
    Objects.requireNonNull(arguments, "Input parameter should be not null!");
    if (arguments.length != 4) {
      System.out.printf("Please provide 4 input arguments, current amount: %d", arguments.length);
    } else {
      Stream.of(arguments)
          .forEach(entry -> {
            Objects.requireNonNull(entry, "Array's entry should be not null!");
            if (entry.length() != 1) {
              throw new IllegalArgumentException("Array's entry has invalid format!");
            }
          });
      width = StringTools.toInt(arguments[0]);
      height = StringTools.toInt(arguments[1]);
      wall = arguments[2];
      corner = arguments[3];
    }
  }

  public void run() {
    if (width == 0 || height == 0) {
      System.out.println();
    } else {
      IntStream.range(0, height)
          .forEach(index -> {
            if (index == 0 || index == height - 1) {
              LineGenerator.generateLine(corner, corner, wall, width)
                  .limit(width)
                  .forEach(System.out::print);
            } else {
              LineGenerator.generateLine(wall, wall, " ", width)
                  .limit(width)
                  .forEach(System.out::print);
            }
            System.out.println();
          });
    }
  }

  public static void main(String[] args) {
    new BoxGenerator(args).run();
  }
}
