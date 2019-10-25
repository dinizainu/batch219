package com.xsis.day01.pr;

import java.util.Scanner;

public class pr7 {
    public static void main(String[] args) {
        int distance, mil, yard, foot, inche, residu;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a robot distances :");
        distance = scan.nextInt();
        mil = distance/63360;
        residu = distance%63360;
        yard = residu/36;
        residu = residu%36;
        foot = residu/12;
        residu = residu%12;
        inche = residu;
        residu = residu%1;
        System.out.println(mil+" miles, "+yard+" yards, "+foot+" feet, "+inche+" inches.");
    }
}
