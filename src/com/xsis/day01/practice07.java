package com.xsis.day01;

import java.util.Scanner;

public class practice07 {
    public static void main(String[] args) {
        double itemBeforeDiskon, diskon, itemAfterDiskon;
        Scanner scan = new Scanner(System.in);
        System.out.print("Harga item Barang: ");
        itemBeforeDiskon = scan.nextDouble();
        System.out.print("Diskon %: ");
        diskon = scan.nextDouble();
        itemAfterDiskon = itemBeforeDiskon - (itemBeforeDiskon*diskon/100);
        System.out.print("Harga item setelah diskon "+itemAfterDiskon);
    }
}
