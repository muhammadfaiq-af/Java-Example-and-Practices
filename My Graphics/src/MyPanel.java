import java.awt.*;
import javax.swing.*;
public class MyPanel extends JPanel{
    int choice=-1,width,height,x,y;
    Color color;
public void paintComponent(Graphics g)
    {
        
        g.setColor(color);
        super.paintComponent(g);

     switch(choice)
     {
         case 0:
             g.drawOval(x, y,width,height);
             break;
         case 1:
             g.drawRect(x,y,width,height);
             break;
             case 2:
             g.fillOval(x,y,width,height);
             break;
         case 3:
             g.fillRect(x,y,width,height);
             break;
         case 4:
             g.drawRoundRect(x, y, width, height, 50, 50);
             break;
         case 5:
             g.fillRoundRect(x, y, width, height, 50, 50);
             break;
     }
    
   
}
}
