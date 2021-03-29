package com.BohdanKarp;

public class Circle {
    private double radius;
    private double coordinateX;
    private double coordinateY;

    Circle() {
        radius = 0;
        coordinateX = 0;
        coordinateY = 0;
    }

    Circle(double radius) {
        this.radius = radius;
        coordinateX = 0;
        coordinateY = 0;
    }

    Circle(double radius, double coordinateX, double coordinateY) {
        this.radius = radius;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double square() {
        return radius * radius * 3.14159;
    }

    public void Print() {
        System.out.println("coordinateX: " + coordinateX + " coordinateY: " + coordinateY + " radius: " + radius + " square: " + square());
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public double getRadius() {
        return radius;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else System.out.println("radius must be positive");

    }
}
