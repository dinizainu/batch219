package com.xsis.day01;

import java.util.Scanner;

public class practice10 {
    public static void main(String[] args) {
        int bilangan, d1,d2,d3,d4, sisa, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 4 bilangan");
        bilangan = scan.nextInt();
        d1 =(int) bilangan/1000;
        sisa =(int) bilangan%1000;
        System.out.println("digit1: "+d1+"sisa: "+sisa);
        d2 = (int)sisa/100;
        sisa =(int) sisa%100;
        System.out.println("digit2: "+d2+"sisa: "+sisa);
        d3 = (int)sisa/10;
        sisa = (int)sisa%10;
        System.out.println("digit3: "+d3+"sisa: "+sisa);
        d4 = (int)sisa/1;
        sisa =(int) sisa%1;
        System.out.println("digit4: "+d4+"sisa: "+sisa);
        total = d1+d2+d3+d4;
        System.out.println("total = "+total);
    }
}
