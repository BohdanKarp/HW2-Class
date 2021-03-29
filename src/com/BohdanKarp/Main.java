package com.BohdanKarp;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(3,-1,-1);
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
        car1.addDecrease(70);
        car1.addDecrease(20);
        car1.finish();





    }
}
