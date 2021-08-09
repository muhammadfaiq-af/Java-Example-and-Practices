import java.awt.Graphics;
import javax.swing.JPanel;
public class MyPanel extends JPanel
{
    int x = 10;
    int y = 10;
    int width = 400;
    int hieght = 400;
public void paintComponent(Graphics g)
{
super.paintComponent(g);
for (int a = 1; a<=30;a++)
{
    g.drawOval(x,y,width,hieght);
    x = x + 10;
    y = y + 10;
    width = width - 20;
    hieght = hieght - 20;
}
}
    
}
