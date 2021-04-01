package com.BohdanKarp;

public class Car {
    private boolean isMotorStart = false;
    private boolean isRunning = false;
    private int speed = 0;

    public void print() {
        System.out.println("Car start: " + isMotorStart + "; car run: " + isRunning + "; car speed: " + speed);
    }

    public void start() {
        if (!isMotorStart) {
            isMotorStart = true;
            System.out.println("motor start");
        } else {
            System.out.println("!not start motor already working");
        }
    }

    public void finish() {
        if (isMotorStart) {
            isMotorStart = false;
            speed = 0;
            isRunning = false;
            System.out.println("motor finish");
        } else {
            System.out.println("!not finish motor not working");
        }
    }

    public void run() {
        if (isMotorStart) {
            isMotorStart = true;
            speed = 5;
            isRunning = true;
            System.out.println("Car run; speed " + speed + "km/h");
        } else {
            System.out.println("!motor not working");
        }
    }

    public void addSpeed(int acceleration) {
        if (isRunning) {
            speed += acceleration;
            System.out.println("Car speed " + speed + "km/h");
        } else System.out.println("!Car not run ");

    }

    public void decrease(int decrease) {
        if (isRunning) {
            if (speed > decrease) {
                speed -= decrease;
                System.out.println("Car speed " + speed + "km/h");
            } else System.out.println("!too big decrease; Car speed " + speed + "km/h");
        } else System.out.println("!Car not run ");

    }
}
