import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

class GUI implements MouseMotionListener,MouseListener
{
JFrame frame;
JLabel label;
JPanel panel;

public GUI()
{
    frame = new JFrame();
    label = new JLabel("This is my label");
    panel = new JPanel();
    panel.setBackground(Color.white);
    frame.add(panel,BorderLayout.CENTER);
    frame.add(label,BorderLayout.SOUTH);
    panel.addMouseMotionListener(this);
    panel.addMouseListener(this);
    frame.setVisible(true);
    frame.setSize(400,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
}
public void mouseDragged(MouseEvent me) {
    label.setText("Mouse pointer was dragged on the panel");
    }

    public void mouseMoved(MouseEvent me) {
        int x, y;
        x = me.getX();
        y = me.getY();
        label.setText(x + " , " + y);
    }

    public void mouseClicked(MouseEvent me) {
        label.setText("Panel was clicked");
    }

    public void mousePressed(MouseEvent me) {
    }    
    public void mouseReleased(MouseEvent me) {
    }

    public void mouseEntered(MouseEvent me) {
        label.setText("Mouse Entered into the dimensions of the panel");
        panel.setBackground(Color.red);
    }

    public void mouseExited(MouseEvent me) {
         label.setText("Mouse Exited from the dimensions of the panel");
        panel.setBackground(Color.white);
    }
    
}


public class Test {

   
    public static void main(String[] args)
    {
    new GUI();    
    }
    
}
