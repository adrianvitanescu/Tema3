package com.adrianv;

public class Main {

    public static void main(String args[]) {
        int sumOfAandB = calculateSum(5, 4);
        System.out.println("Sum is: " + calculateSum(5, 4 ));
    }

    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

}
