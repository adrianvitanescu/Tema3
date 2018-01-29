package com.main.java.ro.sci;

public class Computer extends ElectronicsProduct{

    protected int guaranteePeriod;

    public Computer(String productName, double price, int quantity, String ageRestriction) {
        super(productName, price, quantity, ageRestriction);
        this.guaranteePeriod = 24;
    }

    @Override
    public double getPrice() {
        if(quantity > 1000){
            return (95 / 100) * 1000;
        }
        return getPrice();
    }

}
