package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Das Ergbenis ist " + Rechenarteingabe());
    }
    public static String Rechenarteingabe() {
        System.out.println("Wie moechten Sie rechnen?");
        Scanner scanner = new Scanner(System.in);
        String art = null;
        try {
            art = scanner.nextLine();
        } catch (Exception exception) {
            System.out.println("Falsche Eingabe");
        }
        return Rechnen(art);
    }
    public static String Rechnen(String art){
        art.trim();
        String ergebnis="";
        if (art.equals("a")) {
            ergebnis = "" + addieren();
        } else if (art.equals("m")) {
            ergebnis = "" + multiplizieren();
        } else if (art.equals("s")) {
            ergebnis = "" + subtrahieren();
        } else {
            ergebnis = "aufgrund einer fehlerhaften Eingabe nicht berechenbar.";
        }
        return ergebnis;
    }
    static Scanner scanner = new Scanner(System.in);
    public static double addieren() {
        double ergebnis = Zahleneingabe(scanner);
        while (Zahlenabfrage(scanner)) {
            ergebnis += Zahleneingabe(scanner);
        }
        return ergebnis;
    }
    public static double multiplizieren() {
        double ergebnis = Zahleneingabe(scanner);
        while (Zahlenabfrage(scanner)) {
            ergebnis *= Zahleneingabe(scanner);
        }
        return ergebnis;
    }
    public static double subtrahieren() {
        double ergebnis = Zahleneingabe(scanner);
        while (Zahlenabfrage(scanner)) {
            ergebnis -= Zahleneingabe(scanner);
        }
        return ergebnis;
    }
    public static double Zahleneingabe(Scanner scanner) {
        double result = 0;
        System.out.println("Geben Sie eine Zahl ein:");
        try {
            result = scanner.nextDouble();
        } catch (Exception exception) {
            System.out.println("Falsche Eingabe.");
        } finally {
            scanner.nextLine();
        }
        return result;
    }
    public static boolean Zahlenabfrage(Scanner scanner) {
        boolean isTrue = false;
        String answer = "";
        System.out.println("Wollen Sie eine Zahl eingeben?");
        try {
            answer = scanner.nextLine();
            isTrue =  answer.equals("y");
        } catch (Exception exception) {
            System.out.println("Falsche Eingabe.");
        }
        return isTrue;
    }
}
