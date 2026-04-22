
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;


class SwingMouseL implements MouseListener
{
    JFrame frame;
    JLabel label;

    public static void main(String[] args) {
        new SwingMouseL().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MaFrame");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label=new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);

        frame.add(label);
        frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Clicked!!");
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
        System.out.println("Pressed!!");
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
        System.out.println("Released!!");
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        System.out.println("Entered my area!!");
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
        System.out.println("Coward left!!");
    }
}