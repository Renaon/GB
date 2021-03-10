package ru.geekbrains.lesson8;

import javax.swing.*;

public class ImageFrame extends JFrame {
    public ImageFrame(){
        setTitle("I show you a pic");
        setSize(500,700);
        ImageComponent comp = new ImageComponent();
        add(comp);
    }
}
