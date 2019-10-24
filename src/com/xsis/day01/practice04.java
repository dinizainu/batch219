package com.xsis.day01;

import java.util.Scanner;

public class practice04 {
    static final double phi = 3.14;
    public static void main(String[] args) {
        double radius, area;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan radius: ");
        radius = scan.nextDouble();
        area = phi*(radius*radius);
        System.out.print("Luas Lingkaran adalah: "+area);
    }
}
