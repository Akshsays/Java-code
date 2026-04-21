import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



class SwingbTF implements ActionListener
{
    JFrame frame;
    JTextField textfield;
    JButton button;
    
    public static void main(String[] args) {
        new SwingbTF().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        textfield=new JTextField();
        textfield.setPreferredSize(new Dimension(250,40));

        button=new JButton("Submit");
        button.addActionListener(this);

        frame.add(textfield);
        frame.add(button);
        frame.pack();
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Welcome "+textfield.getText());
        button.setEnabled(false);
        textfield.setEditable(false);
    }
}