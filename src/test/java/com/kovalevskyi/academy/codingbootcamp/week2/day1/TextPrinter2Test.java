package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextPrinter2Test extends BasicStdTest {

  @Test
  void main() {
    var inputArgs = new String[]{"#", "5sdfgadsf3"};
    var expectedString = "##############\n# 5sdfgadsf3 #\n##############\n";
    TextPrinter2.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithEmptyArgument() {
    var inputArgs = new String[]{"#", ""};
    var expectedString = "####\n#  #\n####\n";
    TextPrinter2.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithIncorrectArgumentAmount() {
    var inputArgs = new String[]{"", "asdfasdf", "K"};
    var expectedString = "Please provide 2 input argument, current amount: 3\n";
    TextPrinter2.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithZeroArguments() {
    var inputArgs = new String[]{};
    var expectedString = "Please provide 2 input argument, current amount: 0\n";
    TextPrinter2.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }
}