package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.version"));

        DEV2 k = new DEV2();
        Dev1 t = new  Dev1();
        System.out.println(t.author);
        System.out.println(k.author);
    }
}
