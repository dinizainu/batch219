package com.xsis.day02.string;

public class string05 {
    public static void main(String[] args) {
        String s = "Hello Java Programmer";
        System.out.println("Length: "+s.length());

        //search "Java" index
        System.out.println("Index: "+s.indexOf("Java"));

        //substr untuk get sebuah string dari index ke -i s/d index ke j
        System.out.println("substr : "+s.substring(6,10));
    }
}
