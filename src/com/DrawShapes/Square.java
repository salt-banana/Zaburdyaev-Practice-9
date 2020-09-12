package com.DrawShapes;

import java.awt.*;

public class Square extends Rectangle {

    public Square() {}

    public Square(int x, int y, int side) {
        super(x,y,side,side);
    }

    public Square(int x, int y, int side, String color, boolean filled) {
        super(x,y,side,side,color,filled);
    }



    public int getSide() {
        return this.width;
    }

    public void setSide(int side) {
        this.width = side;
        this.height = side;
    }



    @Override
    public void setWidth(int width) {
        this.setSide(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSide(height);
    }



    @Override
    public void render(Graphics2D g2d) {
        g2d.setColor( Color.decode( this.getColor() ) );
        g2d.fillRect( this.getX(), this.getY(), this.getSide(), this.getSide() );
        g2d.drawRect( this.getX(), this.getY(), this.getSide(), this.getSide() );
    }



    @Override
    public String toString() {
        return "SQUARE'S INFO:\nWIDTH: " + this.width + "\nLENGTH: " + this.height + "\nAREA: " + this.getArea()
                + "\nPERIMETER: " + this.getPerimeter();
    }

}
