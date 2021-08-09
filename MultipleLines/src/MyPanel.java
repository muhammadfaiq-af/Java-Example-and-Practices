import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.util.Random;

public class MyPanel extends JPanel
{
    int x1 = 5;
    int y1 = 5;
    int x2 = 400;
    int y2 = 5;
    
    int red,green,blue;
public void paintComponent(Graphics g)
{
    Random rand = new Random();
    super.paintComponent(g);
    for (int i = 1;i<=40;i++)
    {
        red = rand.nextInt(256);
        green = rand.nextInt(256);
        blue = rand.nextInt(256);
        
        g.setColor(new Color(red,green,blue));
        g.drawLine(x1, y1, x2, y2);
        y1 = y1 + 5;
        y2 = y2 + 5;
        x1 = x1 + 5;
        x2 = x2 - 5;
    }
    
}
}
