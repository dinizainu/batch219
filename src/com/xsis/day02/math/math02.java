package com.xsis.day02.math;

import java.util.Scanner;

public class math02 {
    public static void main(String[] args) {
        double s, a, t;
        Scanner scan = new Scanner(System.in);
        System.out.println("Jarak: ");
        s = scan.nextDouble();
        System.out.println("Percepatan: ");
        a = scan.nextDouble();
        t = Math.sqrt(2*s/a);
        System.out.println("Waktu: "+Math.round(t));
        System.out.println("Waktu: "+Math.floor(t));
    }
}
