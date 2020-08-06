package sample;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.*;

public class Screenshots {

    public InputStream doScreenshots() throws Exception{
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "PNG", byteArrayOutputStream);
        InputStream in = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return in;
    }
}