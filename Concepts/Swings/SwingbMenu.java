
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


class SwingbMenu
{
    JFrame frame;
    JMenuBar menuBar;
    JMenu File;
    JMenu Edit;
    JMenu Help;
    JMenuItem Cut;
    JMenuItem Copy;
    JMenuItem Paste;

    public static void main(String[] args) {
        new SwingbMenu().createUI();
    }

    void  createUI()
    {
        frame=new JFrame("Notepad");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        menuBar=new JMenuBar();

        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Help=new JMenu("Help");

        Cut=new JMenuItem("Cut");
        Copy=new JMenuItem("Copy");
        Paste=new JMenuItem("Paste");

        Edit.add(Cut);
        Edit.add(Copy);
        Edit.add(Paste);


        menuBar.add(File);
        menuBar.add(Edit);
        menuBar.add(Help);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}