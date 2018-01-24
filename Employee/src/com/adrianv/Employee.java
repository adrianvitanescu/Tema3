package com.adrianv;

public class Employee {

    private double grossPay;

    public Employee(double grossPay){
        this.grossPay = grossPay;
    }

    public double evalNetPay(double grossPay, double tax){
        return grossPay - (grossPay / tax);
    }

    public double evalNetPay(final double grossPay, final String title){//supraincarcare (Overloading) metode
        return 0.0;
    }

//    public double evalNetPay();
//        return 1.0D

}
