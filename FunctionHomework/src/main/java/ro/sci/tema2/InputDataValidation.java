/**
 *  3. Input Data Validation
 - write a program that asks the user what time it is,
 by printing on the console "What time is it?".
 Then the user must enter two numbers – one for hours and one for minutes.
 If the input data represents a valid time,
 the program must output the message " The time is hh:mm now.",
 where hh respectively means the hours, and mm – the minutes.
 If the entered hours or minutes are not valid,
 the program must print the message " Incorrect time!".
 The displayIncorrectTimeMessage must be implemented in a separate method.
 */

package main.java.ro.sci.tema2;

public class InputDataValidation {

    public InputDataValidation() {
    }

    public void validateTime(final int hour, final int minutes) {
        validateHour(hour);
        validateMinutes(minutes);
    }

    /**
     * validateHour method - IF statement limits the hour value
     * within a certain range
     * @param hour
     */
    private void validateHour(int hour) {
        if ((hour <= 23) && (hour > 0)) {
            System.out.print("The time is: " + hour + " hh");
        } else {
            displayIncorrectTimeMessage();
        }
    }

    /**
     * validateMinutes method - IF statement limits the minutes value
     * within a certain range.
     * @param minutes
     */
    private void validateMinutes(int minutes) {
        if (minutes < 60 && minutes > 0) {
            System.out.print(" : " + minutes + " mm, now!\n");
        } else {
            displayIncorrectTimeMessage();
        }
    }

    /**
     * displayIncorrectTimeMessage - display message for errors.
     */
    public static void displayIncorrectTimeMessage() {
        System.out.println("Incorrect time!");
    }
}
