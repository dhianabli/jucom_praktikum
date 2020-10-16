package com.company;
import java.awt.*;

public class MyPoint {
    public double x;
    public double y;

    MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}
