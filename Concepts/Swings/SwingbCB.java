
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


class SwingbCB implements ActionListener
{
    JFrame frame;
    JButton button;
    JCheckBox checkBox;
    

    public static void main(String[] args) {
        new SwingbCB().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        button=new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        checkBox=new JCheckBox("Robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));

        frame.add(checkBox);
        frame.add(button);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button is "+checkBox.isSelected());
    }
}