package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxGeneratorTest extends BasicStdTest {

  @Test
  void main5x4() {
    var inputArgs = new String[]{"5", "4", "*", "?"};
    var expectedString = "?***?\r\n*   *\r\n*   *\r\n?***?\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void main1x1() {
    var inputArgs = new String[]{"1", "1", "*", "?"};
    var expectedString = "?\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void main1x4() {
    var inputArgs = new String[]{"1", "4", "*", "?"};
    var expectedString = "?\r\n*\r\n*\r\n?\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void main4x1() {
    var inputArgs = new String[]{"4", "1", "*", "?"};
    var expectedString = "?**?\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void main0x4() {
    var inputArgs = new String[]{"0", "4", "*", "?"};
    var expectedString = "\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void main4x0() {
    var inputArgs = new String[]{"0", "4", "*", "?"};
    var expectedString = "\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithOneArgument() {
    var inputArgs = new String[]{"0"};
    var expectedString = "Please provide 4 input arguments, current amount: 1\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithWrongArgumentsNumber() {
    var inputArgs = new String[]{"0", "2", "*", "?", "1"};
    var expectedString = "Please provide 4 input arguments, current amount: 5\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithZeroArgumentsNumber() {
    var inputArgs = new String[]{};
    var expectedString = "Please provide 4 input arguments, current amount: 0\r\n";
    BoxGenerator.main(inputArgs);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }

  @Test
  void mainWithIllegalWidth() {
    var inputArgs = new String[]{"-1", "4", "*", "?"};
    try {
      BoxGenerator.main(inputArgs);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void mainWithIllegalHeight() {
    var inputArgs = new String[]{"1", "-4", "*", "?"};
    try {
      BoxGenerator.main(inputArgs);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void mainWithIllegalCorner() {
    var inputArgs = new String[]{"1", "4", "*", "??"};
    try {
      BoxGenerator.main(inputArgs);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }

  @Test
  void mainWithIllegalMid() {
    var inputArgs = new String[]{"1", "4", "**", "?"};
    try {
      BoxGenerator.main(inputArgs);
      fail();
    } catch (IllegalArgumentException e) {

    }
  }
}