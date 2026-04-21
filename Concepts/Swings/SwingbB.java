import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;



class SwingbB implements ActionListener
{

    // Method automatically gets called whenever button is clicked- rep to implement ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("Button clicked!!");
    }

    public static void main(String[] args) {
        
        JFrame frame=new JFrame("MyFrame");
        frame.setSize(750, 750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

        // JPanel panel=new JPanel();
        // panel.setBackground(Color.GRAY);
        // panel.setBounds(150, 150, 400, 300);
        // panel.setLayout(null);



        JButton button=new JButton("My B1");
        button.setBounds(100, 100, 250, 100);
        // adding actionListener and passing obj 
        button.addActionListener(new SwingbB());
        button.setFocusable(false); // remove focus on button
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setForeground(Color.gray);
        button.setBackground(Color.blue);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // set order color

        // frame.add(panel);
        frame.add(button);
    }
}