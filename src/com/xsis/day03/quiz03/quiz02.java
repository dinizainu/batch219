package com.xsis.day03.quiz03;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class quiz02 {
//    public static void main(String[] args) {
//        int n,a, product = 1;
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter N number: ");
//        n = scan.nextInt();
//        for (int i = 0; i <n ; i++) {
//            System.out.println("Masukkan a: ");
//            a = scan.nextInt();
//            if(a%2==0){
//                product = product*a;
//            }
//        }
//        System.out.println("The product are: "+product);
//    }
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int i = 1, a, n;
        String even = "";
    System.out.println("Enter N number: ");
    n = scan.nextInt();

    while (i<=n){
        System.out.println("Enter "+i+" number");
        a = scan.nextInt();
        if(a%2==0){
            even+=Integer.toString(a)+" ";
        }
        i++;
    }
    System.out.println(even);
}
}
