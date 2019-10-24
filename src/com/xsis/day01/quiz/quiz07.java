package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz07 {
    static final double tax = .2;
    static final int item = 3;
    public static void main(String[] args) {
        double item1, item2, item3, totalAwal, totalAfterTax, averageBeforeTax, averageAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga item1: ");
        item1 = scan.nextDouble();
        System.out.print("Harga item2: ");
        item2 = scan.nextDouble();
        System.out.print("Harga item3: ");
        item3 = scan.nextDouble();
        totalAwal = item1+item2+item3;
        System.out.println("Total harga awal: "+totalAwal);
        System.out.println("##################################");
        totalAfterTax = totalAwal + (totalAwal*tax);
        System.out.println("Total setelah kena pajak: "+totalAfterTax);
        System.out.println("###################################");
        averageBeforeTax = totalAwal/item;
        System.out.print("Rata - rata sebelum kena pajak: "+averageBeforeTax);
        averageAfterTax = totalAfterTax/item;
        System.out.println("Rata - rata setelah kena pajak: "+averageAfterTax);

    }
}
