package test.java.ro.sci.tema2;

import main.java.ro.sci.tema2.InputDataValidation;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class InputDataValidationTest {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();

    @Before
    public void beforeTest(){
        // Redirect all System.out to consoleContent.
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    public void validateTimeTest(){
        InputDataValidation insertTime = new InputDataValidation();
        insertTime.validateTime(15, 32);
        assertTrue(consoleContent.toString().contains("The time is: 15 hh : 32 mm, now!"));
    }

    @Test
    public void validateHourInRangeTest() {
        InputDataValidation insertHour = new InputDataValidation();
        insertHour.validateHour(23);
        assertTrue(consoleContent.toString().contains("The time is: 23 hh"));
    }

    @Test
    public void validateHourOutOfRangeTest() {
        InputDataValidation insertHour = new InputDataValidation();
        insertHour.validateHour(27);
        assertTrue(consoleContent.toString().contains("Incorrect time!"));
    }

    @Test
    public void validateMinutesInRangeTest() {
        InputDataValidation insertMinutes = new InputDataValidation();
        insertMinutes.validateMinutes(32);
        assertTrue(consoleContent.toString().contains(" : 32 mm, now"));
    }

    @Test
    public void validateMinutesOutOfRangeTest() {
        InputDataValidation insertMinutes = new InputDataValidation();
        insertMinutes.validateMinutes(61);
        assertTrue(consoleContent.toString().contains("Incorrect time!"));
    }

}
