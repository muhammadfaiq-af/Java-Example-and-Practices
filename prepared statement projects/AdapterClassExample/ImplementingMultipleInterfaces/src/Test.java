import java.awt.Color;
import java.awt.Container;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
class GUI implements ActionListener
{
JFrame frame;
JButton button;
Container con;

public GUI()
{
    frame = new JFrame();
    button = new JButton("Set Red Color");
    con = frame.getContentPane();
    con.setBackground(Color.BLACK);
    frame.setLayout(new FlowLayout());
    frame.add(button);
    frame.setVisible(true);
    frame.setSize(400,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addMouseListener(new MouseHandler());
    frame.addWindowListener(new WindowHandler());
    button.addActionListener(this);  
}
@Override
    public void actionPerformed(ActionEvent ae) {
        if (button.getText().equals("Set Red Color"))
        {
            con.setBackground(Color.red);
            button.setText("Set Black Color");
        }
        else
        {
            con.setBackground(Color.BLACK);
            button.setText("Set Red Color");
        }
        }

    
    
    private class WindowHandler extends WindowAdapter
    {
    public void windowOpened(WindowEvent we) {
        JOptionPane.showMessageDialog(frame, "Welcome");
    }
    public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(frame, "Good Bye");
    }
    }
    
    private class MouseHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse was clicked on the frame");
    }
    }
}
public class Test {

    
    public static void main(String[] args) {
        new GUI();
    }
    
}
