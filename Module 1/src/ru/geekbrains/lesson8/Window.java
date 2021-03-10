package ru.geekbrains.lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {

    public Window(){
        setTitle("Test window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300,300,400,400);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JButton but2 = new JButton("show Maya");
        add(but2);
        but2.setAlignmentX(CENTER_ALIGNMENT);
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ImageFrame frame = new ImageFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

            }
        });


        JButton but1 = new JButton("exit");
        add(but1);
        but1.setAlignmentX(CENTER_ALIGNMENT);
        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        setVisible(true);
    }

    public void paint(Graphics g){

        g.drawOval(150,150,200,200);
    }
}
