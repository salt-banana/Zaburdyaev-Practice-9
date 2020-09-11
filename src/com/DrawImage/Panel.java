package com.DrawImage;

import java.awt.*;
import javax.swing.*;

public class Panel extends JPanel {

    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;

    public Panel() {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(Frame.img,0,0,null);


    }

}
