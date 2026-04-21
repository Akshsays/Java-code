// Write a Java program to create a JLabel that changes color when a button is clicked.

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



class Q3 implements ActionListener
{
    JFrame frame;
    JButton button;
    JLabel label;

    public static void main(String[] args) {
        new Q3().createui();
    }

    void createui()
    {

        frame=new JFrame("MyFrame");
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        button=new JButton("My Button");
        button.setBounds(175, 100, 100, 50);
        button.setFocusable(false);
        button.setBackground(Color.LIGHT_GRAY);
        button.addActionListener(this);


        label=new JLabel("I am a text label");
        label.setBounds(75, 200, 300, 50);
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setForeground(Color.WHITE);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setHorizontalTextPosition(JLabel.CENTER);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        frame.add(button);
        frame.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        label.setBackground(Color.blue);
    }
}