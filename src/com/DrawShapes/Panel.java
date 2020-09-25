package com.DrawShapes;

import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Panel extends JPanel {

    private Random random = new Random();
    private ShapeGenerator shapeGen = new ShapeGenerator();

    private ArrayList<Shape> shapes = new ArrayList<>();


    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;


    private final int CIRCLE = 0;
    private final int RECT = 1;
    private final int SQUARE = 2;
    private final int AMOUNT_OF_SHAPES = 3;



    public Panel() {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
        this.genShapes();
    }



    private void genShapes() {

        this.shapes.clear();



        int shapesToGen = 20;
        int shapeCode;


        while (shapesToGen > 0) {

            shapeCode = random.nextInt(AMOUNT_OF_SHAPES);

            switch (shapeCode) {

                case CIRCLE:
                    this.shapes.add( shapeGen.genCircleAtRandPos() );
                    break;
                case RECT:
                    this.shapes.add( shapeGen.genRectAtRandPos() );
                    break;
                case SQUARE:
                    this.shapes.add( shapeGen.genSquareAtRandPos() );
                    break;
                default:
                    break;

            }

            --shapesToGen;

        }

    }



    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        this.setBackground(Color.WHITE);


        for (Shape shape : shapes) {
            shape.render(g2d);
        }

    }


}
