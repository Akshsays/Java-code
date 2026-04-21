
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


class Q4 implements ActionListener
{
    JFrame frame;
    JPanel mpanel;
    JButton login;
    JButton cancel;
    JLabel username;
    JLabel password;

    JTextField getUsername;
    JPasswordField getPass;

    public static void main(String[] args) {
        new Q4().createUI();
    }

    void createUI()
    {
        frame=new JFrame("Login");
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(10,10)); // padding

        mpanel=new JPanel();
        mpanel.setLayout(new GridLayout(3,2,10,10));
        mpanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        //Row 1 : Username
        username=new JLabel("Username:");
        getUsername=new JTextField();
        mpanel.add(username);
        mpanel.add(getUsername);

        //Row 2 : Password
        password=new JLabel("Password:");
        getPass=new JPasswordField();
        mpanel.add(password);
        mpanel.add(getPass);

        //Row 3 : Buttons
        login=new JButton("Login");
        login.setFocusable(false);
        login.addActionListener(this);

        cancel=new JButton("Cancel");
        cancel.setFocusable(false);
        cancel.addActionListener(this);
        mpanel.add(login);
        mpanel.add(cancel);

        frame.add(mpanel,BorderLayout.CENTER);
        frame.pack();

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==login)
        {
            System.out.println("Welcome "+getUsername.getText());
            login.setEnabled(false);
            getUsername.setEditable(false);
        } else if(e.getSource()==cancel)
        {
            System.exit(0);
        }
    }
}