package com.xsis.day02.string;

import java.util.Scanner;

public class string07 {
    public static void main(String[] args) {
        String s;
        double a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter username: ");
        s = scan.nextLine();
        a = 100*Math.random()+100;
        System.out.println("Hasilnya: "+s.substring(0,4)+Math.round(a));
    }
}
