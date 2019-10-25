package com.xsis.day02.quiz;

import java.util.Scanner;

public class quiz03 {
    public static void main(String[] args) {
        String s, upper, a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = scan.nextLine();
        upper = s.toUpperCase();
        System.out.println(upper);

        if( s.equals(upper) ) {
            System.out.println("Upercase");
        }
        else{
            System.out.println("Not uppercase");
        }
    }
}
