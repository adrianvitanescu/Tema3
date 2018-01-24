package main;
import main.java.ro.sci.tema2.FahrenheitToCelsius;
import main.java.ro.sci.tema2.GetMax;
import main.java.ro.sci.tema2.InputDataValidation;

public class Main {

    public static void main(String[] args) {

        System.out.println("What time is it? ");
        InputDataValidation time = new InputDataValidation();
        time.validateTime(6, 32);

        System.out.println("\nCompare numbers and display biggest: ");
        GetMax greater = new GetMax(5, 4);
        greater.getMax();
        greater.compareThirdNumber(7);

        System.out.println("\nYour body temperature in Celsius degrees is: ");
        FahrenheitToCelsius convert = new FahrenheitToCelsius();
        convert.convertTemperature(100);

    }
}
