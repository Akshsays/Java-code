import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;


class SwingbComb implements ActionListener
{
    JFrame frame;
    JComboBox Combox;
    JLabel driverlabel;

    public static void main(String[] args) {
        new SwingbComb().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] f1drvier={"Lewis","Max","Fernando"};
        Combox=new JComboBox(f1drvier);
        Combox.addActionListener(this);
        
        driverlabel=new JLabel();
        driverlabel.setVisible(false);

        frame.add(Combox);
        frame.add(driverlabel);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==Combox)
        {
            driverlabel.setText("Current Fav driver:"+Combox.getSelectedItem());
            driverlabel.setVisible(true);
        }
        frame.revalidate();
        frame.repaint();
    }
}