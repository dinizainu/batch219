package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz03 {
    static final double tax = .07;
    static final double tips = .1;
    public static void main(String[] args) {
        double hargaOrder, afterTax, afterTips, hargaAkhir;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga order makanan: ");
        hargaOrder = scan.nextDouble();
        afterTax = hargaOrder + (hargaOrder*tax);
        afterTips = hargaOrder - (hargaOrder*tips);
        System.out.println("Harga Setelah pajak: "+afterTax);
        System.out.println("Harga setelah tips: "+afterTips);
        hargaAkhir = hargaOrder + (hargaOrder*tax) - (hargaOrder*tips);
        System.out.println("Harga setelah kena pajak dan tips adalah :"+hargaAkhir);
    }
}
