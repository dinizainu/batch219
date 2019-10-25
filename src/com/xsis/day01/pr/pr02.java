package com.xsis.day01.pr;

import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        int bilangan, bil1, bil2, bil3, bil4, bil5, sisa, hasil;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter five digit");
        bilangan = scan.nextInt();
        bil1 = bilangan/10000;
        sisa = bilangan%10000;
        bil2 = sisa/1000;
        sisa = sisa%1000;
        bil3 = sisa/100;
        sisa = sisa%100;
        bil4 = sisa/10;
        sisa = sisa%10;
        bil5 = sisa;
        sisa = sisa%1;
        hasil = (bil5*10000)+(bil4*1000)+(bil3*100)+(bil2*10)+bil1;
        System.out.println("Revers digit is: "+hasil);
    }
}
