package ru.geekbrains.lesson8;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class ImageComponent extends JComponent {
    private Image image;

    public ImageComponent(){
        try{
            image = ImageIO.read(new File("D:\\Projects\\GB\\Module 1\\src\\ru\\geekbrains\\lesson8\\Maya Shot 1.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void paint(Graphics g){
        if(image == null) return;
        int imageWidth = image.getWidth(this);
        int imageHeight = image.getHeight(this);

            // Отображение рисунка в левом верхнем углу.
        g.drawImage(image, 0, 0, null);

        // Многократный вывод изображения в панели.

        for(int i = 0; i * imageWidth <= getWidth(); i++)
            for(int j = 0; j * imageHeight <= getHeight(); j++)
                if(i + j > 0) g.copyArea(0, 0, imageWidth, imageHeight, i * imageWidth, j * imageHeight);
    }
}
