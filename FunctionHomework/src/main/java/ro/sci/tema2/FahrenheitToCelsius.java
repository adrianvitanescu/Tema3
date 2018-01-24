/**
 *  2. Fahrenheit to Celsius Conversion
 - create a method that converts temperature from Fahrenheit to Celsius.
 - write a program that for a given (by the user) body temperature,
 measured in Fahrenheit degrees, outputs it in Celsius degrees,
 with the following message: "Your body temperature in Celsius degrees is X",
 where X is respectively the Celsius degrees.
 In addition if the measured temperature in Celsius is higher than 37 degrees,
 the program should warn the user that they are ill,
 with the following message "You are ill!". ( use the method created before)
 */

package main.java.ro.sci.tema2;

public class FahrenheitToCelsius {

    /**
     * convertTemperature method - convert temperatures from fahrenheit to
     * celsius using a math. formula, and we use the IF statements to
     * receive a warn messages when of celsius is higher than 37.
     * @param fahrenheit
     */
    public void convertTemperature(int fahrenheit){
        char degrees = '\u00B0';
        int celsius = (fahrenheit - 32) * 5/9;
        System.out.println(celsius + "" + degrees + "C");
        if (celsius > 37){
            System.out.println("You are ill!");
        }
    }

}
