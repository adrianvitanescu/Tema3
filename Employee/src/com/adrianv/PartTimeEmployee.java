package com.adrianv;

public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(double grossPay){
        super(grossPay); //super se refera la clasa parinte si trebuie sa fie prima instructuiune din corpul constructorului!
        System.out.println("Constructor");
    }

    @Override
    public double evalNetPay (double grossPay, double tax){
        return super.evalNetPay(grossPay, tax) - 100;
    }
}
