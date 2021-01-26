package com.kovalevskyi.academy.codingbootcamp.week1.day2;

import com.kovalevskyi.academy.codingbootcamp.common.BasicStdTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainPrintSortedParamTest extends BasicStdTest {

    @Test
    void main() {
        var inputArgs = new String[] {"c", "a", "b"};
        var expectedString = "a b c\n";
        MainPrintSortedParam.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }

    @Test
    void mainWithZeroArguments() {
        var inputArgs = new String[] {};
        var expectedString = "Please specify at least one argument!\n";
        MainPrintSortedParam.main(inputArgs);
        assertEquals(expectedString, outputStreamCaptor.toString());
    }
}