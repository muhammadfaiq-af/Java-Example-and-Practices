import javax.swing.*;
public class Finally {

    
    public static void main(String[] args) {
        try
        {
        String number;
        int a,b,c;
        number=JOptionPane.showInputDialog(null,"Enter a");
        a=Integer.parseInt(number);
        number=JOptionPane.showInputDialog(null,"Enter b");
        b=Integer.parseInt(number);
        
        c=a/b;
        
        JOptionPane.showMessageDialog(null,"Answer is equal to: "+ c);
    }
    
    catch(NumberFormatException ne)
    {
        JOptionPane.showMessageDialog(null,"Alphabet Can't be added with numbers");
    }
catch(ArithmeticException ae)
{
JOptionPane.showMessageDialog(null, "number cant be divided by xero");
}
    finally
    {
        JOptionPane.showMessageDialog(null,"The program will be terminated");
    }
}
}
