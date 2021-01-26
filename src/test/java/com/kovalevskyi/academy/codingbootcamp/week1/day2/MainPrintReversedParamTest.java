package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPrintReversedParamTest extends BasicStdTest {

    @Test
    void main() {
        var inputArgs = new String[] {"arg1", "arg2"};
        var expectedString = "arg2 arg1\n";
        MainPrintReversedParam.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    void mainWithZeroArguments() {
        var inputArgs = new String[] {};
        var expectedString = "Please specify at least one argument!\n";
        MainPrintReversedParam.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }
}