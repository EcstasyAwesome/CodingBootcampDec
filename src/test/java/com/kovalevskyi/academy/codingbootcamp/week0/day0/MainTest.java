package com.kovalevskyi.academy.codingbootcamp.week0.day0;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest extends BasicStdTest {

  @Test
  public void testGreen() {
    var expectedString = "Hello World";
    Main.main(null);
    assertEquals(expectedString, outputStreamCaptor.toString());
  }
}
