package test.java.ro.sci.tema2;

import main.java.ro.sci.tema2.FahrenheitToCelsius;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FahrenheitToCelsiusTest {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();

    @Before
    public void beforeTest(){
        // Redirect all System.out to consoleContent.
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    public void convertTemperatureTest(){
        FahrenheitToCelsius insertTemperature = new FahrenheitToCelsius();
        insertTemperature.convertTemperature(100);
        assertTrue(consoleContent.toString().contains("37"));
    }

    @Test
    public void convertTemperatureEquationTest(){
        FahrenheitToCelsius calc = new FahrenheitToCelsius();
        calc.convertTemperature(100);
        assertEquals(calc.getCelsius(), 37);
    }
}
