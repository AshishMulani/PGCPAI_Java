package IOStreams;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImageStream {
    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("Taj.jpg")) {

            // 1. Read the stream into a BufferedImage
            BufferedImage image = ImageIO.read(in);

            if (image != null) {
                // 2. Display the image in a window (JFrame)
                JFrame frame = new JFrame("JPG Viewer");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Wrap BufferedImage in an ImageIcon to put it on a JLabel
                JLabel label = new JLabel(new ImageIcon(image));
                frame.add(label);

                frame.pack(); // Adjust window size to fit the image
                frame.setVisible(true);
            } else {
                System.out.println("Could not decode the image.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
