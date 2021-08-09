import java.awt.Color;
import javax.swing.JPanel;
import java.awt.*;
public class MyPanel extends JPanel 
{
    public void paintComponent(Graphics g)
    {
     super.paintComponent(g);
     //g.drawLine(50,50,200,50);
     //g.drawLine(50,50,50,200);
     //g.drawLine(200,50,200,200);
     //g.drawLine(50, 200, 200,200);
     g.setColor(Color.red);
     g.fillRoundRect(100, 100, 200, 200, 50, 50);
     Font f = new Font("Arial",Font.BOLD,22);
     g.setFont(f);
     g.setColor(Color.blue);
     g.drawString("This is first class of java graphics",50,50);
     //g.setColor(Color.blue);
     //g.drawRect(10,65,50,50);
     //g.setColor(Color.black);
     //g.drawRect(10, 120, 50, 50);
     //g.setColor(Color.blue);
     //g.fillOval(150, 100, 100, 100);
     
    }
}
