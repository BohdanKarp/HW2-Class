package com.BohdanKarp;

public class Car {
    private boolean on=false;
    private boolean run=false;
    private int speed=0;
    public void print(){
        System.out.println("Car start: "+on+"; car run: "+run+"; car speed: "+speed);
    }
    public void start(){
        if(!on){
            on=true;
            System.out.println("motor start");
        }
        else {
            System.out.println("!not start motor already working");
        }
    }
    public void finish(){
        if(on){
            on=false;
            speed=0;
            run=false;
            System.out.println("motor finish");
        }
        else {
            System.out.println("!not finish motor not working");
        }
    }
    public void run() {
        if (on) {
            on = true;
            speed = 5;
            run=true;
            System.out.println("Car run; speed " + speed + "km/h");
        } else {
            System.out.println("!motor not working");
        }
    }
    public void addSpeed(int acceleration){
        if(run) {
        speed+=acceleration;
        System.out.println("Car speed " + speed + "km/h");
        }
        else  System.out.println("!Car not run ");

    }

    public void addDecrease(int decrease){
        if(run) {
            if (speed > decrease) {
                speed -= decrease;
                System.out.println("Car speed " + speed + "km/h");
            } else System.out.println("!too big decrease; Car speed " + speed + "km/h");
        }
        else  System.out.println("!Car not run ");

    }

}
