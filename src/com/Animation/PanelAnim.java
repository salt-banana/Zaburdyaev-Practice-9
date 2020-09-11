package com.Animation;

import com.DrawImage.Frame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;


public class PanelAnim extends JPanel implements ActionListener {

    private Timer timer;



    private final int FRAME_DURATION = 120;



    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;


    private int x = 0;


    private int frameID = 0;
    private final int FRAMES_AMOUNT = 10;



    private BufferedImage[] frames = new BufferedImage[FRAMES_AMOUNT];



    public PanelAnim() {
        this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
        this.timer = new Timer(FRAME_DURATION,this);
        try {
            this.loadFrames();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void loadFrames() throws IOException  {

        for (int i = 1; i <= FRAMES_AMOUNT; i++) {
            frames[i-1] = ImageIO.read(PanelAnim.class.getResourceAsStream("../../resources/frames/frame" + i + ".png"));
        }

    }


    public void paint(Graphics g) {

        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.drawImage(this.frames[this.frameID], this.x, 0, null);

        timer.start();

    }


    public void actionPerformed(ActionEvent e) {
        if (this.frameID < FRAMES_AMOUNT-1) {
            this.frameID += 1;
            this.x += 60;
        }
        else {
            this.frameID = 0;
            this.x = 0;
        }
        this.repaint();
    }

}
