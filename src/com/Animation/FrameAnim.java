package com.Animation;

import com.DrawShapes.Panel;

import javax.swing.*;

public class FrameAnim extends JFrame {

    PanelAnim panel;

    public FrameAnim() {

        panel = new PanelAnim();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
