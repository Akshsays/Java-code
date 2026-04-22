

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


class SwingbR implements ActionListener
{
    JFrame frame;
    JRadioButton LewisButton;
    int Lcount=0;
    JRadioButton MaxButton;
    int Mcount=0;
    JRadioButton FernandoButton;
    int Fcount=0;

    JLabel labelmessage;

    public static void main(String[] args) {
        new SwingbR().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(750,750);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        labelmessage=new JLabel("Count:");
        labelmessage.setVisible(false);

        LewisButton=new JRadioButton("Lewis");
        LewisButton.setFocusable(false);
        LewisButton.setFont(new Font("COMBINA", Font.PLAIN, 30));
        LewisButton.addActionListener(this);

        MaxButton=new JRadioButton("Max");
        MaxButton.setFocusable(false);
        MaxButton.setFont(new Font("COMBINA", Font.PLAIN, 30));
        MaxButton.addActionListener(this);

        FernandoButton=new JRadioButton("Alonso");
        FernandoButton.setFocusable(false);
        FernandoButton.setFont(new Font("COMBINA", Font.PLAIN, 30));
        FernandoButton.addActionListener(this);

        ButtonGroup grp=new ButtonGroup();
        grp.add(LewisButton);
        grp.add(MaxButton);
        grp.add(FernandoButton);

        frame.add(LewisButton);
        frame.add(MaxButton);
        frame.add(FernandoButton);
        frame.add(labelmessage);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==LewisButton)
        {
            Lcount++;
            labelmessage.setVisible(true);
            labelmessage.setText("Lewis Count:"+Lcount);
        } else if (e.getSource() == MaxButton) 
        {
            Mcount++;
            labelmessage.setVisible(true);
            labelmessage.setText("Max Count: " + Mcount);
        } else if (e.getSource() == FernandoButton) 
        {
            Fcount++;
            labelmessage.setVisible(true);
            labelmessage.setText("Alonso Count: " + Fcount);
        }

        frame.revalidate();
        frame.repaint();

    }
}