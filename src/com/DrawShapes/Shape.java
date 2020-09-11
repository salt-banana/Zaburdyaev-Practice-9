package com.DrawShapes;

public abstract class Shape {

    protected String color;
    protected boolean filled;
    protected int x;
    protected int y;



    public Shape() {}

    public Shape(int x, int y, String color, boolean filled) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.filled = filled;
    }



    public int getX() { return this.x; }
    public void setX(int x) { this.x = x; }

    public int getY() { return this.y; }
    public void setY(int y) { this.y = y; }



    public String getColor() { return this.color; }
    public void setColor(String color) { this.color = color; }



    public boolean isFilled() { return this.filled; }
    public void setFilled(boolean filled) { this.filled = filled; }



    public abstract double getArea();
    public abstract double getPerimeter();



    public abstract String toString();

}
