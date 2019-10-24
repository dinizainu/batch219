package com.xsis.day01;

import java.util.Scanner;

public class practice06 {
    static final double pajak = .15;
    public static void main(String[] args) {
        double itemBeforeTax, itemAfterTax;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga barang sebelum pajak: ");
        itemBeforeTax = scan.nextDouble();
        itemAfterTax = itemBeforeTax + (itemBeforeTax*pajak);
        System.out.println("Harga barang setelah pajak: "+itemAfterTax);
    }
}
