package com.company;
import java.lang.Math;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(Flaechenberechnung());
    }
    public static double Flaechenberechnung(){
        return calculateArea(distance2(), distance2(), distance2());
    }
    static double area;
    static double s;
    public static double calculateArea(double Abstand1, double Abstand2, double Abstand3) {
        //System.out.println("Abstand1: ("+Abstand1+", Abstand2: "+Abstand2+", Abstand3: "+Abstand3);
        s = 0.5 * (Abstand1 + Abstand2 + Abstand3);
        area = Math.sqrt(s * (s - Abstand1) * (s - Abstand2) * (s - Abstand3));
        System.out.println("The area of the triangle is " + area);
        return area;
    }
    public static double distance2() {
        MyPoint point1=coordinatEntering();
        MyPoint point2=coordinatEntering();
        //System.out.println(point1+""+point2);
        System.out.println("Distance is "+ Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + (point2.y - point1.y) * (point2.y - point1.y)));
        //System.out.println(point1 +""+ point2);
        return Math.sqrt((point2.x - point1.x) * (point2.x - point1.x) + (point2.y - point1.y) * (point2.y - point1.y));
    }
    public static MyPoint coordinatEntering() {
        System.out.println("Geben Sie Ihre Koordinate ein (x,y): ");
        Scanner scanner = new Scanner(System.in);
        String coordinatesString;
        MyPoint point = null;
        try {
            coordinatesString = scanner.nextLine();
            point= new MyPoint(Double.parseDouble(coordinatesString.substring(coordinatesString.indexOf("(")+1, coordinatesString.indexOf(","))), Double.parseDouble(coordinatesString.substring(coordinatesString.indexOf(",")+1, coordinatesString.indexOf(")"))));
        } catch (Exception exception) {
            System.out.println(exception);
            System.out.println("Falsche Eingabe!");
        }
        return point;
    }
}
