
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



class FlowL
{
    JFrame frame;
    JPanel panel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;


    public static void main(String[] args) {
        new FlowL().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create flowLayout
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,1,10));
        frame.setVisible(true);

        panel=new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(250,250));

        b1=new JButton("B1");
        b1.setFocusable(false);

        b2=new JButton("B2");
        b2.setFocusable(false);

        b3=new JButton("B3");
        b3.setFocusable(false);

        b4=new JButton("B4");
        b4.setFocusable(false);

        b5=new JButton("B5");
        b5.setFocusable(false);

        b6=new JButton("B6");
        b6.setFocusable(false);



        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);

        frame.add(panel);
    }
}