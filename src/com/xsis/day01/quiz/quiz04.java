package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz04 {
    static final double u = 0;
    public static void main(String[] args) {
        double s, a, t;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan kecepatan mobil Anda: ");
        a = scan.nextDouble();
        System.out.print("Masukkan waktu yang Anda butuhkan: ");
        t = scan.nextDouble();
        s = u + (.5*a*t*t);
        System.out.println("Jadi jarak yang Anda ditempuh adalah: "+s);
    }
}
