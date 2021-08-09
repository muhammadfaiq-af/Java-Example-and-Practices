import java.util.*;
public class MF {

   
    public static void main(String[] args) {
        boolean repeat=true;
        Scanner s=new Scanner(System.in);
        
        while(repeat)
        {
        
        int num1,num2,result;
        try
        {
           System.out.println("Enter Num1: ");
        num1=s.nextInt();
        System.out.println("Enter Num2: ");
        num2=s.nextInt();
        
        result=num1/num2; 
        System.out.println("Answer is Equal To:" + result);
        repeat=false;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Sorry number cant be Divided by 0");
        }
        }
        
        
        
      
        
    }
    
}
