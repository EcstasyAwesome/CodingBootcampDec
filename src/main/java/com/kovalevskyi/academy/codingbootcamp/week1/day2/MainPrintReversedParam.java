package com.kovalevskyi.academy.codingbootcamp.week1.day2;

/**
 * Program that prints all the input arguments in reversed order. If executed with input arguments:
 * "arg2" "arg2" "arg3" It will print on the screen: "arg3 arg2 arg1\n"
 * <p>
 * if there are no arguments passed in the input it should print: "Please specify at least one
 * argument!\n"
 */
public class MainPrintReversedParam {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.print("Please specify at least one argument!");
    } else {
      final StringBuilder stringBuilder = new StringBuilder();
      for (int index = args.length - 1; index >= 0; index--) {
        stringBuilder.append(String.format("%s ", args[index]));
      }
      System.out.print(stringBuilder.toString().trim());
    }
    System.out.print("\n");
  }
}
