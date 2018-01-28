package test.java.ro.sci.tema2;

import main.java.ro.sci.tema2.GetMax;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GetMaxTest {
    private ByteArrayOutputStream consoleContent = new ByteArrayOutputStream();

    @Before
    public void beforeTest() {
        // Redirect all System.out to consoleContent.
        System.setOut(new PrintStream(consoleContent));
    }

    @Test
    public void compareThirdNumberIsHigherTest() {
        GetMax greater = new GetMax(4, 5);
        greater.compareThirdNumber(6);
        assertTrue(consoleContent.toString().contains("The biggest number of the tree of them is: 6 (the third)"));
    }

    @Test
    public void compareThirdNumberIsLowerTest() {
        GetMax greater = new GetMax(4, 5);
        greater.compareThirdNumber(2);
        assertFalse(consoleContent.toString().contains("The biggest number of the tree of them is: 6 (the third)"));
    }

    @Test
    public void getMaxFirstGreaterThanSecondTest(){
        GetMax biggest = new GetMax(4, 5);
        biggest.getMax();
        assertFalse(consoleContent.toString().contains("The maximal of the two numbers is: 4 (the first)"));
    }

    @Test
    public void getMaxSecondGreaterThanFirstTest(){
        GetMax biggest = new GetMax(4, 5);
        biggest.getMax();
        assertTrue(consoleContent.toString().contains("The maximal of the two numbers is: 5 (the second)"));
    }

    @Test
    public void getMaxFirstEqualWithSecondTest(){
        GetMax biggest = new GetMax(7, 7);
        biggest.getMax();
        assertTrue(consoleContent.toString().contains("The entered numbers are equal"));
    }
}

