package com.kovalevskyi.academy.codingbootcamp.week0.day2;

import com.kovalevskyi.academy.codingbootcamp.misc.Writer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.*;

public class StringToolsTest {

    @Test
    void printWithNormalOutput() {
        var mockWriter = mock(Writer.class);
        var input = new Character[]{'h', 'e', 'l', 'l', 'o'};

        StringTools.println(input, mockWriter);

        verify(mockWriter).write('h');
        verify(mockWriter).write('e');
        verify(mockWriter, times(2)).write('l');
        verify(mockWriter).write('o');
        verify(mockWriter).write('\n');
        verifyNoMoreInteractions(mockWriter);
    }

    @Test
    void printWithNullString() {
        var mockWriter = mock(Writer.class);
        StringTools.println(null, mockWriter);

        verifyNoInteractions(mockWriter);
    }

    @Test
    void printWithEmptyString() {
        var mockWriter = mock(Writer.class);
        StringTools.println(new Character[0], mockWriter);

        verifyNoInteractions(mockWriter);
    }

    @Test
    void printWithNullWriter() {
        try {
            StringTools.println(new Character[]{'h', 'e'}, null);
            fail();
        } catch (NullPointerException e) {

        }
    }

    @Test
    void printWithNullWriterAndEmptyInput() {
        try {
            StringTools.println(new Character[0], null);
            fail();
        } catch (NullPointerException e) {

        }
    }

    @Test
    void reverse() {
        var input = "hello";
        var expectedOutput = "olleh";

        var actualOutput = StringTools.reverse(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void reverseWithNull() {
        try {
            StringTools.reverse(null);
            fail();
        } catch (NullPointerException e) {

        }
    }

    @Test
    void reverseWithEmptyInput() {
        assertEquals("", StringTools.reverse(""));
    }

    @Test
    void toInt() {
        assertEquals(1, StringTools.toInt("1"));
        assertEquals(Integer.MAX_VALUE, StringTools.toInt(String.valueOf(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, StringTools.toInt(String.valueOf(Integer.MIN_VALUE)));
        assertEquals(0, StringTools.toInt("0"));
        assertEquals(-1, StringTools.toInt("-1"));
    }

    @Test
    void toIntWithNullInput() {
        try {
            StringTools.toInt(null);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void toIntWithEmptyInput() {
        try {
            StringTools.toInt("");
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    void toIntWithIncorrectInput() {
        try {
            StringTools.toInt("asdf23 asd33");
            fail();
        } catch (IllegalArgumentException e) {

        }
    }
}
