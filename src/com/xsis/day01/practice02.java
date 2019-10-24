package com.xsis.day01;

import java.util.Scanner;

public class practice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda: ");
        String firstName = scan.nextLine();
        System.out.print("Masukkan nama belakang anda: ");
        String lastName = scan.nextLine();
        System.out.print("Nama anda adalah: "+firstName+" "+lastName);
    }
}
