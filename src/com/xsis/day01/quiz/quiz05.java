package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz05 {
    static final double c = 0.56;
    public static void main(String[] args) {
        double fahrenheit, celcius;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input temperatur in fahrenheit: ");
        fahrenheit = scan.nextDouble();
        celcius = (fahrenheit - 32) * c;
        System.out.print("Setelah dikonversi ke celcius: "+celcius);
    }
}
