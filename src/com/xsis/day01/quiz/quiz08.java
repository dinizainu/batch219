package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz08 {
    public static void main(String[] args) {
        double harga, diskon, hemat;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan harga barang");
        harga = scan.nextDouble();
        System.out.println("Anda mendapatkan diskon: ");
        diskon = scan.nextDouble();
        hemat = harga*(diskon/100);
        System.out.println("Anda telah menghemat : "+hemat);
    }
}
