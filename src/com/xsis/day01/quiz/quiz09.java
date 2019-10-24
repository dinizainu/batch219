package com.xsis.day01.quiz;

import java.util.Scanner;

public class quiz09 {
    static final double tagihanPerkwh = 15000;
    static final double tax = .2;
    public static void main(String[] args) {
        double kwh, tagihan, totalBayar;
        double totalkwh = 0;
        Scanner scan = new Scanner(System.in);
        for(int day=1; day<31; day++) {
            System.out.print("Jumlah pemakaian kwh day-" + day);
            kwh = scan.nextDouble();
            totalkwh = totalkwh+kwh;
        }
        System.out.println("total kwh: "+totalkwh);
        tagihan = (totalkwh*tagihanPerkwh);
        totalBayar = tagihan + (tagihan*tax);
        System.out.println("Jadi total yang harus dibayarkan adalah: "+totalBayar);
    }
}
