package com.DrawShapes;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class Panel extends JPanel {

    private Random random = new Random();
    private ShapeGenerator shapeGen = new ShapeGenerator();


    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;


    private final int CIRCLE = 0;
    private final int RECT = 1;
    private final int SQUARE = 2;
    private final int AMOUNT_OF_SHAPES = 3;


    public Panel() {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH,WINDOW_HEIGHT));
    }



    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;


        this.setBackground(Color.WHITE);



        int shapesToDraw = 20;



        while (shapesToDraw > 0) {

            int shapeCode = random.nextInt(AMOUNT_OF_SHAPES);

            switch (shapeCode) {

                case CIRCLE:
                    Circle circle = shapeGen.genCircleAtRandPos();
                    g2d.setColor( Color.decode( circle.getColor() ) );
                    g2d.fillArc( circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius(), 0, 360 );
                    g2d.drawArc( circle.getX(), circle.getY(), circle.getRadius(), circle.getRadius(), 0, 360 );
                    break;
                case RECT:
                    Rectangle rect = shapeGen.getRectAtRandPos();
                    g2d.setColor( Color.decode( rect.getColor() ) );
                    g2d.fillRect( rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight() );
                    g2d.drawRect( rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight() );
                    break;
                case SQUARE:
                    Square square = shapeGen.getSquareAtRandPos();
                    g2d.setColor( Color.decode( square.getColor() ) );
                    g2d.fillRect( square.getX(), square.getY(), square.getSide(), square.getSide() );
                    g2d.drawRect( square.getX(), square.getY(), square.getSide(), square.getSide() );
                    break;
                default:
                    break;

            }

            --shapesToDraw;

        }


    }

}
