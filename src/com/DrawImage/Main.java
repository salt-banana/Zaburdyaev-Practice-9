package com.DrawImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        final String imgPath = args[0];

        final BufferedImage image = ImageIO.read(new File(imgPath));


        Frame frame = new Frame(image);

    }

}
