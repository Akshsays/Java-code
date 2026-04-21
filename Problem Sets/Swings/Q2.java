/* Write a Java program to create a JFrame with a JButton that displays a message when
clicked. */


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Q2 implements ActionListener
{
    JFrame frame;
    JButton button;
    JLabel label;

    public static void main(String[] args) {
        new Q2().UserUI();
    }

    void UserUI()
    {
        frame=new JFrame();
        frame.setTitle("MyFrame Demo");
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        button=new JButton("MyButton");
        button.setBounds(50, 100, 100, 100);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button.setBackground(Color.lightGray);
        button.addActionListener(this);

        label=new JLabel();
        label.setText("You just clicked the button!!");
        label.setBounds(50, 250, 300, 50);
        label.setVisible(false);

        frame.add(button);
        frame.add(label);

    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label.setVisible(true);

    }
}