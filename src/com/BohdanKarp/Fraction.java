package com.BohdanKarp;

public class Fraction {
    private long numerator;
    private short denominator;

    public Fraction(long numerator, short denominator) {
        if (denominator == 0) {
            System.out.println("!Denominator zero");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public Fraction add(Fraction fractions) {
        long resultNum = this.numerator * fractions.denominator + this.denominator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fraction(resultNum, resultDen);
    }

    public Fraction minus(Fraction fractions) {
        long resultNum = this.numerator * fractions.denominator - this.denominator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fraction(resultNum, resultDen);
    }

    public Fraction mul(Fraction fractions) {
        long resultNum = this.numerator * fractions.numerator;
        short resultDen = (short) (this.denominator * fractions.denominator);
        return new Fraction(resultNum, resultDen);
    }

    public Fraction div(Fraction fractions) {
        long resultNum = this.numerator * fractions.denominator;
        short resultDen = (short) (this.denominator * fractions.numerator);
        return new Fraction(resultNum, resultDen);
    }

    public boolean isHighNumber(Fraction fractions) {
        return ((double) this.numerator / (double) this.denominator) > ((double) fractions.numerator / (double) fractions.denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fractions = (Fraction) o;
        return ((double) this.numerator / (double) this.denominator) > ((double) fractions.numerator / (double) fractions.denominator);
    }

    @Override
    public String toString() {
        return numerator +
                "/" + denominator;
    }
}
