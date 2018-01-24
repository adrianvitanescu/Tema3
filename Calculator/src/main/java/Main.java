package main.java;

public class Main {

    public static void main(String[] args) {
	Calculator calculator = new Calculator( 7, 9);
        System.out.println(calculator.sum());
        System.out.println(calculator.min());
        System.out.println(calculator.max());
        System.out.println(calculator.lessThan(6));

    }


}
