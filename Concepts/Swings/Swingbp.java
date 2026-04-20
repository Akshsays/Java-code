
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Swingbp
{
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("DemoFrame");
        frame.setSize(750,750);
        frame.setLayout(null); // required to set position of the panel component
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 

        JLabel redlabel=new JLabel("I'm in red");
        JLabel bluelabel=new JLabel("I'm in blue");
        JLabel greenLabel=new JLabel("I'm in green");

        JPanel redpanel=new JPanel();
        redpanel.setBackground(Color.RED); // change color
        redpanel.setBounds(0, 0, 250, 250); // set position of a panel

        JPanel bluePanel=new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(250,0, 250,250);

        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);

        frame.add(redpanel);
        // we can add multiple panels on screen
        frame.add(bluePanel);
        frame.add(greenPanel);
        
        redpanel.add(redlabel);
        bluePanel.add(bluelabel);
        greenPanel.add(greenLabel);
    }
}