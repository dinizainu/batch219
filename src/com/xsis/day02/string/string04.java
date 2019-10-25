package com.xsis.day02.string;

public class string04 {
    public static void main(String[] args) {
        String s, st;
        s = "Hello .NET Developer Welcome to Xsis Academy";
        System.out.println(s);
        st = s.replace(".Net", "JAVA");
        System.out.println("After replace : "+st);
        st = st.replace("Welcome", "Hello");
        System.out.println("After replace");
        st = st.replace(".Net", "JAVA")
                .replace("Welcome", "JAVA").toUpperCase();
        System.out.println("After replace: "+st);
    }
}
