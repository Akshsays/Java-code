import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;



class GridL
{
    JFrame frame;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;


    public static void main(String[] args) {
        new GridL().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create flowLayout
        frame.setLayout(new GridLayout(3,3,5,5));
        frame.setVisible(true);


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



        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);

    }
}