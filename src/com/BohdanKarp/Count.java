package com.BohdanKarp;

public class Count {
    public static int count;

    Count() {
        count++;
    }

    public static void print() {
        System.out.println("count of created objects: " + count);
    }
}
