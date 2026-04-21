import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Q1
{
    public static void main(String[] args) {
        
        JFrame frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.getContentPane().setBackground(Color.RED);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


        JLabel label=new JLabel();
        label.setText("Hello World");
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);



        frame.add(label);
    }
}