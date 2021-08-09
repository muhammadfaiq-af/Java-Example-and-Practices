import javax.swing.*;
import java.util.*;
public class Practice2 {

    
    public static void main(String[] args) {
        int a,b,Result;
        try
        {
        String number;
        number= JOptionPane.showInputDialog(null,"Enter value A");
        a=Integer.parseInt(number);
        number=JOptionPane.showInputDialog(null,"Enter value B ");
        b=Integer.parseInt(number);
        
        Result=a/b;
        JOptionPane.showMessageDialog(null,"Answer is Equal To: "+ Result);
        }
        catch(ArithmeticException ae)
        {
            JOptionPane.showMessageDialog(null,"Number cant br divided by zero");
        }
      // catch(InputMismatchException ae)
        //{
          //  JOptionPane.showMessageDialog(null,"Aplphabet Cant be added with Integer ");
        //}
        
        //Input mismatch exception occurs when the scanner class is imported
        
        
        
        catch(NumberFormatException as)
        {
            JOptionPane.showMessageDialog(null,"Alphabet cant be added");
        }
        
    }
    
}
