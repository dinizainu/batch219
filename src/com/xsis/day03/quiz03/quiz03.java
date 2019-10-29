package com.xsis.day03.quiz03;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        int n, total=0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println("Masukkan nomor: ");
            n = scan.nextInt();
            if (n>=100 && n<=999){
                total = total + n;
            }
        }
        System.out.println("Total nomor 3 digit adalah: "+total);
    }
}
