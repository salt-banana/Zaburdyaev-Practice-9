package com.DrawImage;

import javax.swing.*;
import java.awt.image.BufferedImage;

public class Frame extends JFrame {

    public static BufferedImage img;

    Panel panel;



    public Frame(BufferedImage newImg) {

        panel = new Panel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setVisible(true);

        img = newImg;

    }

}
