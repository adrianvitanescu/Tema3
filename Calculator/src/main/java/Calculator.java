package main.java;

public class Calculator {

    private Integer a;
    private Integer b;

    public Calculator(){

    }

    public Calculator(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }


    public Integer sum() {
        if(a == null){
            return b;
        }else if(b == null){
            return a;
        }else if((a == null) && (b == null)){
            return null;
        }
        return a+b;
    }

    public Integer min() {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public Integer max() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean lessThan(int x) {
        if ((a < x) && (b < x)) {
            return true;
        }
        return false;
    }
}
