import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

public class GUI
{
JFrame f;
MyPanel panel;
public GUI()
{
f = new JFrame();
panel = new MyPanel();
f.add(panel);
f.setVisible(true);
f.setSize(400,400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
}
}
