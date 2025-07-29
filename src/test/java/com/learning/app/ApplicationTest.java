package com.learning.app;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationTest {

    @Test
    void testMainPrintsCorrectMessage() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Act
        Application.main(new String[]{});

        // Restore System.out
        System.setOut(originalOut);

        // Assert
        assertEquals("My Java Application!\n", outContent.toString());
    }
}