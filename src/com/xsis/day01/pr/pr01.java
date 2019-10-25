package com.xsis.day01.pr;

import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {
        int bilangan, digit1, digit2, digit3, sisa, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan 3 bilangan: ");
        bilangan = scan.nextInt();
        digit1 = bilangan/100;
        sisa = bilangan%100;
        digit2 = sisa/10;
        sisa = sisa%10;
        digit3 = sisa/1;
        sisa = sisa%1;
        hasil = digit3*8;
        System.out.println("Jika bilangan terakhir dikali 8 hasilnya adalah: "+hasil);
    }
}
