/**
 * 1. Calculate Max
 * - Create a method GetMax() with two integer (int) parameters,
 * that returns maximal of the two numbers.
 * - Write a program that reads three numbers from the console
 * and prints the biggest of them.
 * Use the GetMax() method you just created.
 */

package main.java.ro.sci.tema2;

public class GetMax {

    private int first;
    private int second;

    public GetMax(int first, int second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Compares - the third number value with first and second number.
     * @param third - the third number.
     *
     */
    public void compareThirdNumber(int third) {
        if ((third > first) && (third > second)) {
            System.out.println("The biggest number of the tree of them is: " + third + " (the third)");
        }
    }

    /**
     * getMax method - use IF statement to "extract" the highest value
     * from the two entered numbers (first and second).
     */
    public void getMax() {
        if (first > second) {
            System.out.println("The maximal of the two numbers is: " + first + " (the first)");
        } else if (second > first) {
            System.out.println("The maximal of the two numbers is: " + second + " (the second)");
        } else {
            System.out.println("The entered numbers are equal");
        }
    }
}


