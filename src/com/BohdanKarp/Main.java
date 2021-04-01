package com.BohdanKarp;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(3, -1, -1);
        circle1.Print();
        circle1.setRadius(-2);
        circle1.Print();
        circle1.setRadius(2);
        circle1.Print();
        circle2.Print();
        circle3.Print();
        Count count1 = new Count();
        Count count2 = new Count();
        Count.print();
        Car car1 = new Car();
        car1.start();
        car1.run();
        car1.addSpeed(50);
        car1.decrease(70);
        car1.decrease(20);
        car1.finish();
        Fraction fraction1 = new Fraction(1, (short) 4);
        Fraction fraction2 = new Fraction(2, (short) 5);
        System.out.println(fraction1.add(fraction2).toString());
        System.out.println(fraction1.minus(fraction2).toString());
        System.out.println(fraction1.mul(fraction2).toString());
        System.out.println(fraction1.div(fraction2).toString());
        System.out.println("Equals fraction: " + fraction1.equals(fraction2));
        Money money1 = new Money();
        Money money2 = new Money(4, (byte) 99);
        money1.add(money2);
        money1.add(money2);
        money1.minus(money2);
        System.out.println((money1.multiplication(money2)).toString());
        System.out.println(money1.multiplication(4.99).toString());
        System.out.println(money1.div(2).toString());
        System.out.println(money1.div(money2).toString());

    }
}

