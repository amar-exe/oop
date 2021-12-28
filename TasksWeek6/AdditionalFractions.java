package com.company;

public class AdditionalFractions {

    private int numerator;
    private int denominator;

    public AdditionalFractions(int n,int d) {
        this.numerator = n;
        this.denominator = d;
    }

    public void setNumberator(int n) {
        this.numerator=n;
    }
    public void setDenominator(int d) {
        this.denominator=d;
    }

    public String toString() {
        return System.out.println(this.numerator/findGCD(this.numerator,this.denominator)+"/"+this.denominator/findGCD(this.numerator,this.denominator));
    }

    public static int findGCD(int a, int b)
    {
        if (b == 0)return a;
        return findGCD(b, a % b);
    }
}

