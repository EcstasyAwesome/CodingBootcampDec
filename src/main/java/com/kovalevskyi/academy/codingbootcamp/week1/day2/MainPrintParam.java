package com.kovalevskyi.academy.codingbootcamp.week1.day2;

/**
 * Program that prints all the input arguments. If executed with input arguments: "arg2" "arg2"
 * "arg3" It will print on the screen: "arg1 arg2 arg3\n"
 * <p>
 * if there are no arguments passed in the input it should print: "Please specify at least one
 * argument!\n"
 */
public class MainPrintParam {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.print("Please specify at least one argument!");
    } else {
      final StringBuilder stringBuilder = new StringBuilder();
      for (String string : args) {
        stringBuilder.append(String.format("%s ", string));
      }
      System.out.print(stringBuilder.toString().trim());
    }
    System.out.print("\n");
  }
}
