package com.kovalevskyi.academy.codingbootcamp.week2.day0;

import com.kovalevskyi.academy.codingbootcamp.week0.day2.StringTools;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 * Program that is capable of performing simple mathematical operation. Program expects three input
 * arguments. If amount of arguments is not equal to 3 the program should print the following
 * string: "Please provide 3 input arguments, example: 2 + 3"
 * <p>
 * Arguments to the program should be: 1. integer 2. math operation, can be "+", "-", "/", "*", "%"
 * 3. integer
 * <p>
 * program should do specified math operation and print result in the following format: result:
 * %s\n
 * <p>
 * for example:
 * <p>
 * 3 + 2 result: 5
 * <p>
 * -5 + -10 result: -15
 * <p>
 * asfdasd + 2 IllegalArgumentException
 */
public class Calculator {

  private final Pattern operationsPattern;
  private final String[] arguments;
  private final String resultPattern;
  private String operation;
  private int arg1;
  private int arg2;

  public Calculator(String[] arguments) {
    this.arguments = arguments;
    this.operationsPattern = Pattern.compile("^\\+|-|/|\\*|%$");
    this.resultPattern = "result: %d\n";
  }

  public void run() {
    try {
      parseArguments();
      int result = 0;
      if (operation.equals("+")) {
        result = plus();
      } else if (operation.equals("-")) {
        result = minus();
      } else if (operation.equals("*")) {
        result = multiply();
      } else if (operation.equals("/")) {
        result = divide();
      } else if (operation.equals("%")) {
        result = modulo();
      }
      System.out.printf(resultPattern, result);
    } catch (NullPointerException exception) {
      System.out.print(exception.getMessage());
    }

  }

  private void parseArguments() {
    if (arguments == null || arguments.length != 3) {
      throw new NullPointerException("Please provide 3 input arguments, example: 2 + 3\n");
    }

    arg1 = StringTools.toInt(arguments[0]);
    arg2 = StringTools.toInt(arguments[2]);
    operation = Objects.requireNonNullElse(arguments[1], "");
    if (!operation.matches(operationsPattern.pattern())) {
      throw new IllegalArgumentException(
          String.format("%s is not an available operator!", operation));
    }
  }

  private int plus() {
    return arg1 + arg2;
  }

  private int minus() {
    return arg1 - arg2;
  }

  private int multiply() {
    return arg1 * arg2;
  }

  private int divide() {
    return arg1 / arg2;
  }

  private int modulo() {
    return arg1 % arg2;
  }

  public static void main(String[] args) {
    new Calculator(args).run();
  }
}
