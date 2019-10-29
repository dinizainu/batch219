package com.xsis.day03.quiz03;

import java.util.Scanner;

public class quiz06 {
    public static void main(String[] args) {
        int n, a;
        double total=0, avg = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        n = scan.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.println("Masukkan angka anda: ");
            a = scan.nextInt();
            total = total+a;
            avg = total/n;
        }
        System.out.println("Total: "+total);
        System.out.println("Avg: "+avg);
    }
}
