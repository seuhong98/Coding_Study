package Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class MakeImage {
    public static void main(String[] args) throws IOException {
        Path target = Paths.get("/Users/sinseungho/Desktop/sample2.jpeg");
        BufferedReader reader = new BufferedReader(new FileReader("/Users/sinseungho/Desktop/sample.txt"));

        String t[] = reader.readLine().replace(" ","").split(",");
        byte[] bytes = new byte[t.length];
        for(int i=0;i<t.length;i++){
            bytes[i] = Byte.parseByte(t[i]);
        }
        InputStream is = new ByteArrayInputStream(bytes);
        BufferedImage newBi = ImageIO.read(is);

        // add a text on top on the image, optional, just for fun
        ImageIO.write(newBi, "jpeg", target.toFile());
    }
}
