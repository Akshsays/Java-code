
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


class Q5 implements ActionListener
{
    JFrame frame;
    JPanel mpanel;
    JLabel label;
    JLabel messagel;
    JButton button;
    JComboBox colorbox;

    public static void main(String[] args) {
        new Q5().createUI();
    }
    
    void createUI()
    {
        frame=new JFrame("Color Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750,750);
        frame.setLayout(new BorderLayout(10, 10));

        label=new JLabel("Select Color:");
        label.setForeground(Color.BLACK);

        mpanel=new JPanel();
        mpanel.setLayout(new GridLayout(3,1,10,10));
        mpanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        button=new JButton("Show");
        button.setFocusable(false);
        button.addActionListener(this);

        String[] colors={"Blue","Green","Yellow"};
        colorbox=new JComboBox(colors);
        colorbox.setPreferredSize(new Dimension(5,5));

        messagel=new JLabel();
        messagel.setVisible(false);

        frame.add(mpanel);
        mpanel.add(label);
        mpanel.add(messagel);
        mpanel.add(colorbox);
        mpanel.add(button);
        frame.setVisible(true);
        frame.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            String selectcolor=(String) colorbox.getSelectedItem();
            messagel.setText("Selected Color: "+selectcolor);
            messagel.setVisible(true);
        }

        frame.revalidate();
        frame.repaint();
    }
}