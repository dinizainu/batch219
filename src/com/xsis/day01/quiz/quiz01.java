package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz01 {
    static final double jumlahSudutSegitiga = 180;

    public static void main(String[] args) {
        double sudutSatu, sudutDua, sudutTiga;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan sudut segitiga pertama: ");
        sudutSatu = scan.nextDouble();
        System.out.print("Masukkan sudut segitiga kedua: ");
        sudutDua = scan.nextDouble();
        sudutTiga = jumlahSudutSegitiga - (sudutSatu+sudutDua);
        System.out.println("Jadi sudut segitiga yang ketiga adalah: "+sudutTiga);
    }
}
