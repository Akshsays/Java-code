import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
class Swingbf
{
    public static void main(String[] args) {

        // JFrame is a gui windows for components
        JFrame frame=new JFrame(); 

        frame.setSize(420,420); // set x & y dimension of framee

        frame.setTitle("Jframee demo"); // set title which we can do in instance also

        frame.setVisible(true); // by default not visible so method to enable visibility

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation 
        
        ImageIcon image=new ImageIcon("Technothepig.jpeg"); // ImageIcon instance to set the framee logo

        frame.setIconImage(image.getImage()); // change image

        frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background with use of frame
    }

}