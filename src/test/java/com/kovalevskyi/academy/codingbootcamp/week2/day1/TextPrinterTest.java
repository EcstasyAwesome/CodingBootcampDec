package com.kovalevskyi.academy.codingbootcamp.week2.day1;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextPrinterTest extends BasicStdTest {

    @Test
    void main() {
        var inputArgs = new String[] {"5sdfgadsf3"};
        var expectedString = "/############\\\n# 5sdfgadsf3 #\n\\############/\n";
        TextPrinter.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    void mainWithEmptyArgument() {
        var inputArgs = new String[] {""};
        var expectedString = "/##\\\n#  #\n\\##/\n";
        TextPrinter.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    void mainWithIncorrectArgumentAmount() {
        var inputArgs = new String[] {"", "asdfasdf"};
    var expectedString = "Please provide only one input argument, current amount: 2\n";
        TextPrinter.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    void mainWithZeroArguments() {
        var inputArgs = new String[] {};
        var expectedString = "Please provide only one input argument, current amount: 0\n";
        TextPrinter.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }
}