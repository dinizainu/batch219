package com.xsis.day01;

import java.util.Scanner;

public class practice05 {
    public static void main(String[] args) {
        double totalJarak, totalLiter, literPerKilo;
        Scanner scan = new Scanner(System.in);
        System.out.print("Total jarakk yang ditempuh adalah: ");
        totalJarak = scan.nextDouble();
        System.out.print("Total liter yang dibutuhkan");
        totalLiter = scan.nextDouble();
        literPerKilo = totalJarak/totalLiter;
        System.out.println("Liter per Kilo: "+totalLiter);
    }
}
