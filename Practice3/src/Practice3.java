import javax.swing.*;
import java.util.*;
public class Practice3 {

    
    public static void main(String[] args) {
        boolean repeat =true;
        while(repeat)
        {
        try{
        int num1,num2,Result;
        
        String number;
        number= JOptionPane.showInputDialog(null,"Enter num1");
        num1=Integer.parseInt(number);
        number=JOptionPane.showInputDialog(null,"enter num2");
        num2=Integer.parseInt(number);
        
        Result=num1/num2;
        
        JOptionPane.showMessageDialog(null,"Answer is equal to= "+ Result);
        JOptionPane.showMessageDialog(null,"Program will Terminate now");
        repeat = false;
        }
        catch(NumberFormatException ae)
        {
            JOptionPane.showMessageDialog(null,"Character can't be added with Integer");
        }
        catch(ArithmeticException ae)
        {
            JOptionPane.showMessageDialog(null,"BSDK 0 sa kon divide karta hai sharam karo");
        }
    }
    
}}
