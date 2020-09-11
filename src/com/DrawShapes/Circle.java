package com.DrawShapes;
import java.lang.Math;

public class Circle extends Shape {

    protected int radius;



    public Circle() {}

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(int x, int y, int radius, String color, boolean filled) {
        super(x,y,color,filled);
        this.radius = radius;
    }



    public int getRadius() {
        return this.radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }



    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }




    @Override
    public String toString() {
        return "CIRCLE'S INFO:\nRADIUS: " + this.radius +
               "\nAREA: " + this.getArea() +
               "\nCIRCUMFERENCE: " + this.getPerimeter();
    }

}
