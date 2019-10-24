package com.xsis.day01;

import java.util.Scanner;

//konferensi temperatur dari fahrenheit ke kelvin
// rumus: kelvin = (fahrenheit + 459.67)/1.8
public class practice08 {
    static final double cf = 459.67;
    static final double cd = 1.8;
    public static void main(String[] args) {
        double kelvin, fahrenheit;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Temperatur in Fahrenheit");
        fahrenheit = scan.nextDouble();
        kelvin = (fahrenheit + cf)/cd;
        System.out.println("sfter conversation to kelvin: "+kelvin);
    }
}
