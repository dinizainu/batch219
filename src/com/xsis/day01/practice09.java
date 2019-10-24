package com.xsis.day01;

import java.util.Scanner;

public class practice09 {
    static final double hargaCelana = 200000;
    static final double hargaBaju = 150000;
    public static void main(String[] args) {
        int celana, baju;
        double totalHarga, bayar, kembali;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah celana: ");
        celana = scan.nextInt();
        System.out.print("Masukkan jumlah baju: ");
        baju = scan.nextInt();
        totalHarga = (celana*hargaCelana) + (baju*hargaBaju);
        System.out.println("#################STRUK BELANJA#################");
        System.out.println("Item \t Unit \t Harga Satuan \t Harga Total");
        System.out.println("Total harga belanja Anda adalah : "+totalHarga);
        System.out.print("Uang yang Anda bayarkan : ");
        bayar = scan.nextDouble();
        kembali = bayar - totalHarga;
        System.out.print("Kembali: "+kembali);
    }
}
