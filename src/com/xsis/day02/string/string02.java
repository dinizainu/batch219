package com.xsis.day02.string;

import java.util.Scanner;

public class string02 {
    public static void main(String[] args) {
        String s, reverse;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string : ");
        s = scan.nextLine();
        reverse = " "+s.charAt(3)+s.charAt(2)+s.charAt(1)+s.charAt(0);
        System.out.println("The reverse of your string is: "+reverse);


    }
}
