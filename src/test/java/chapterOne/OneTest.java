package chapterOne;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class OneTest {

    @Test
    void main() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        One.main(null);

        // assertion
        assertEquals("Hello!", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}