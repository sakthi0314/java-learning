import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class App {
    public static void main(String[] args) {

        // instance of a frame
        JFrame frame = new JFrame();

        // instance of a image
        ImageIcon icon = new ImageIcon("logo.png");

        frame.setVisible(true); // make frame visible
        frame.setSize(450, 450); // set height and width
        frame.setTitle("GTA V"); // set title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out or hide
        frame.setIconImage(icon.getImage()); // set icon
        frame.getContentPane().setBackground(new Color(143, 132, 131)); // bg color

    }
}
