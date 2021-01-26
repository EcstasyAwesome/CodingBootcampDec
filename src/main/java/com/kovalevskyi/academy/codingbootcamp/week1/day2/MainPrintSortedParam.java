package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import com.kovalevskyi.academy.codingbootcamp.week0.day2.Sorting;
import java.util.Comparator;

/**
 * Program that prints all the input arguments in reversed order. If executed with input arguments:
 * "c" "a" "z" "y" It will print on the screen: "a c y z\n"
 * <p>
 * if there are no arguments passed in the input it should print: "Please specify at least one
 * argument!\n"
 */
public class MainPrintSortedParam {

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.print("Please specify at least one argument!");
    } else {
      final StringBuilder stringBuilder = new StringBuilder();
      final Comparator<String> comparator = Comparator.comparingInt(x -> x.charAt(0));
      Sorting.sort(args, comparator);
      for (String string : args) {
        stringBuilder.append(String.format("%s ", string));
      }
      System.out.print(stringBuilder.toString().trim());
    }
    System.out.print("\n");
  }
}
