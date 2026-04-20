
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;


class Swingbl
{
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("FrameDemo");

        frame.setSize(450,450);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setLayout(null); // set layout for changing the label alignment

        // Jlabel instance 
        JLabel label=new JLabel("This is the Goat");

        ImageIcon image=new ImageIcon("Technothepig.jpeg");
        Border border=BorderFactory.createLineBorder(Color.BLACK,3); // create border line

        label.setIcon(image); // set icon for label

        label.setHorizontalTextPosition(JLabel.CENTER); // set text on left,center or right of imageicon

        label.setVerticalTextPosition(JLabel.TOP); // set text on top, center or bottom of image

        label.setForeground(Color.BLACK); // set label text color

        label.setFont(new Font("MV Boli", Font.PLAIN, 20)); 

        label.setBackground(Color.PINK);
        label.setOpaque(true); // paint the background color

        label.setBorder(border); // set border

        // set label on center (image+text)
        label.setVerticalAlignment(JLabel.CENTER); // vertical alignment
        label.setHorizontalAlignment(JLabel.CENTER); // horiziontal alignment

        // label.setBounds(100,100,250,250); // x,y,width & height ( within frame as well as dimensions)

        

        frame.add(label); // add on screen
        // frame.pack(); // resize the frame according to the label components
    }
}