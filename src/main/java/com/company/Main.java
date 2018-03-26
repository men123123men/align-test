package com.company;


import org.openjdk.jol.info.ClassLayout;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(ClassLayout.parseClass(Bools2.class).toPrintable());

        System.out.println(ClassLayout.parseClass(Bools.class).toPrintable());

        System.out.println(ClassLayout.parseClass(Bools3.class).toPrintable());
    }
}
