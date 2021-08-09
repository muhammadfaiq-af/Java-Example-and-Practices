import javax.swing.JOptionPane;
public class Test {
    public static void main(String[] args) 
    {
        int num1,num2,answer;
        boolean repeat = true;
        while (repeat)
        {
        try
        {
        
        
        String number = JOptionPane.showInputDialog("Enter your first number");
        num1 = Integer.parseInt(number);
        number = JOptionPane.showInputDialog("Enter your second number");
        num2 = Integer.parseInt(number);
        answer = num1 + num2;
        JOptionPane.showMessageDialog(null,"The sum is " + answer);
        JOptionPane.showMessageDialog(null, "The program will terminate now");
        repeat = false;
        }
        catch(NumberFormatException nfe)
        {
         JOptionPane.showMessageDialog(null, "Enter only numbers and then press OK");   
        }
        }
        
        
    }
    
}
