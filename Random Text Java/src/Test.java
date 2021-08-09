import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*; 
class RandomText extends JPanel 
{  
Color col = Color.BLACK;
Font f = new Font("Arial",Font.BOLD,24);
int xLocation = 100,yLocation = 100;
int clear = 0;
public void paintComponent(Graphics g) 
{ 
clear++;
if (clear == 10)
{
g.clearRect(0, 0, 1000, 700);
clear = 0;
}
for (int i = 1;i <= 40;i++)
{
g.setColor(chooseColor());   
g.setFont(chooseFont());
chooseLocation();
g.drawString("Java",xLocation,yLocation);      
}
}

public Color chooseColor() 
{  
int r = (int) (Math.random() * 256);  
int g = (int) (Math.random() * 256);  
int b = (int) (Math.random() * 256);  
Color c = new Color(r, g, b);  
return c;
}  
public Font chooseFont()
 {  
int fontChoice = (int) (Math.random() * 4);  
Font f = null;  
switch (fontChoice) 
{  
case 0:  
f = new Font("Serif", Font.BOLD + Font.ITALIC, 12);  
break;  
case 1:  
f = new Font("SansSerif", Font.PLAIN, 25);  
break;  
case 2:  
f = new Font("Monospaced", Font.ITALIC, 36);  
break;  
case 3:  
f = new Font("Dialog", Font.ITALIC, 48);  
break;  
}  
return f;  
}  
public void chooseLocation()
{
int x = (int) (Math.random() * 1000);  
int y = (int) (Math.random() * 700);   
xLocation = x;
yLocation = y;
}
}
public class Test implements ActionListener
{
JFrame frame;
RandomText panel;
public void init()
{
frame = new JFrame ("Random Text.....");
panel = new RandomText();
frame.add(panel,BorderLayout.CENTER);
frame.setSize(1000,700);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setResizable(false);
Timer t = new Timer(500, this);
t.start();
}

public Test()
{
init();
}
public void actionPerformed(ActionEvent ae)
{
panel.repaint();
}
public static void main(String [] args)
{
    new Test();
}
}