package com.DrawShapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener {

    Panel panel;
    JButton button;

    public Frame() {

        button = new JButton();

        button.setLocation(300,200);
        button.setText("Start");
        button.setFocusable(false);
        button.addActionListener(this);


        this.setLayout(new GridBagLayout());
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        this.add(button);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.button) {
            panel = new Panel();
            this.remove(button);
            this.add(panel);
            this.pack();
        }
    }

}
