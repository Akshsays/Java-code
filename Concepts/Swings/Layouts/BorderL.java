
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;



class BorderL
{
    JFrame frame;
    JPanel NPanel;
    JPanel SPanel;
    JPanel EPanel;
    JPanel WPanel;
    JPanel CPanel;

    public static void main(String[] args) {
        new BorderL().createUI();
    }

    void createUI()
    {
        frame=new JFrame("MyFrame");
        frame.setSize(450,450);
        frame.setLayout(new BorderLayout(10,10)); // border layout with horizontal & vertical gap
        frame.setVisible(true);

        NPanel=new JPanel();
        NPanel.setBackground(Color.RED);

        SPanel=new JPanel();
        SPanel.setBackground(Color.BLUE);

        EPanel=new JPanel();
        EPanel.setBackground(Color.YELLOW);

        WPanel=new JPanel();
        WPanel.setBackground(Color.green);

        CPanel=new JPanel();
        CPanel.setBackground(Color.BLACK);

        // align panel in five diff areas 
        frame.add(NPanel,BorderLayout.NORTH);
        frame.add(SPanel,BorderLayout.SOUTH);
        frame.add(EPanel,BorderLayout.EAST);
        frame.add(WPanel,BorderLayout.WEST);
        frame.add(CPanel,BorderLayout.CENTER);
    }
}