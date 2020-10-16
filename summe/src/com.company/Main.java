package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /* write your code here
        int[] zahlen = new int[10];
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = (int) (Math.random() * 10);
            System.out.print(zahlen[i] + ", ");
        }
        System.out.println("\nAddition = " + addieren(zahlen));
        System.out.println("Subtraktion = " + subtrahieren2(zahlen));
        System.out.println("Multiplikation = " + multiplizieren2(zahlen));
        MyFrame myFrame = new MyFrame();
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein.");
        int Zahl1 = scanner.nextInt();
        System.out.println("Geben Sie die zweite Zahl ein.");
        int Zahl2 = scanner.nextInt();
        int Ergebnis = Zahl1+Zahl2;
        System.out.println(Ergebnis);

    }

    /*public static int addieren(int[] zahlen) {
        if (zahlen == null) {
            System.out.println("Fuelle bzw erstelle die Liste!");
            return 0;
        } else {
            int a = 0;
            for (int i = 0; i < zahlen.length; i++) {
                a += zahlen[i];
            }
            return a;
        }

    }

    public static int subtrahieren(int[] zahlen) {
        if (zahlen == null) {
            System.out.println("Fuelle bzw erstelle die Liste!");
            return 0;
        } else {
            int a = 0;
            for (int i = 0; i < zahlen.length; i++) {
                a -= zahlen[i];
            }
            return a;
        }
    }

    public static int subtrahieren2(int[] zahlen) {
        return addieren(zahlen)*-1;
    }

    public static long multiplizieren(int[] zahlen) {
        if (zahlen == null) {
            System.out.println("Fuelle bzw erstelle die Liste!");
            return 0;
        } else {
            long a = 1;
            for (int i: zahlen) {
                if (zahlen[i] == 0) {
                    zahlen[i] = 1;
                }
                a *= (zahlen[i]);
            }
            return a;
        }
    }

    public static long multiplizieren2(int[] zahlen) {
        if (zahlen == null) {
            System.out.println("Fuelle bzw erstelle die Liste!");
            return 0;
        } else {
            long a = 1;
            for (int i: zahlen) {
                if (zahlen[i] == 0) {
                    return 0;
                }
                else {
                    a *= (zahlen[i]);
                }
            }
            return a;

     */
}






