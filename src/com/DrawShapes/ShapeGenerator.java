package com.DrawShapes;

import java.util.Random;

public class ShapeGenerator {

    private final int WIN_WIDTH = 800;
    private final int WIN_HEIGHT = 600;

    private final int RGB_LIMIT = 256;

    private final int LIMIT_SIZE = 50;

    private final int LIMIT_X = WIN_WIDTH - LIMIT_SIZE;
    private final int LIMIT_Y = WIN_HEIGHT - LIMIT_SIZE;



    private String colorCode;
    private boolean fillCode;
    private int randX;
    private int randY;



    private Random random = new Random();



    public ShapeGenerator() {}



    private void genProps() {
        this.colorCode = "#" + Integer.toHexString( random.nextInt(RGB_LIMIT) )
                             + Integer.toHexString( random.nextInt(RGB_LIMIT) )
                             + Integer.toHexString( random.nextInt(RGB_LIMIT) );
        this.fillCode = random.nextBoolean();
        this.randX = random.nextInt(LIMIT_X);
        this.randY = random.nextInt(LIMIT_Y);
    }



    public Circle genCircleAtRandPos() {

        this.genProps();

        int randRadius = random.nextInt(LIMIT_SIZE);

        return new Circle(this.randX, this.randY, randRadius, this.colorCode, this.fillCode);

    }



    public Rectangle genRectAtRandPos() {

        this.genProps();

        int randWidth = random.nextInt(LIMIT_SIZE);
        int randHeight = random.nextInt(LIMIT_SIZE);

        return new Rectangle(this.randX, this.randY, randWidth, randHeight, this.colorCode, this.fillCode);

    }



    public Square genSquareAtRandPos() {

        this.genProps();

        int randSide = random.nextInt(LIMIT_SIZE);

        return new Square(this.randX, this.randY, randSide, this.colorCode, this.fillCode);

    }



}
