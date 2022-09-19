package Test;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class GetImage {
    public static void main(String[] args) throws IOException {
        // /Users/sinseungho/Desktop

        byte[] imageInByte;
        BufferedImage originalImage = ImageIO.read(new File("/Users/sinseungho/Desktop/sample.jpeg"));
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(originalImage, "jpeg", baos);
        baos.flush();

        imageInByte = baos.toByteArray();
        System.out.println(Arrays.toString(imageInByte));
    }
}
