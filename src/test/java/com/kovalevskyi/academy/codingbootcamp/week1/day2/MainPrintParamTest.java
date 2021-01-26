package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPrintParamTest extends BasicStdTest {

  @Test
  void main() {
    var inputArgs = new String[]{"arg1", "arg2"};
    var expectedString = "arg1 arg2\n";
    MainPrintParam.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithZeroArguments() {
    var inputArgs = new String[]{};
    var expectedString = "Please specify at least one argument!\n";
    MainPrintParam.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }
}