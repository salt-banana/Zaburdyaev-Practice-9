package com.DrawShapes;

public class Rectangle extends Shape {

    protected int width;
    protected int height;


    public Rectangle() {}

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height, String color, boolean filled) {
        super(x,y,color,filled);
        this.width = width;
        this.height = height;
    }



    public int getWidth() {
        return this.width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }



    @Override
    public double getArea() { return this.width * this.height; }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }



    @Override
    public String toString() {
        return "RECTANGLE'S INFO:\nWIDTH: " + this.width + "\nLENGTH: " + this.height + "\nAREA: " + this.getArea()
                + "\nPERIMETER: " + this.getPerimeter();
    }

}