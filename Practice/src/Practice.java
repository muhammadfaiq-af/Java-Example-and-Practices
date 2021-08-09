import java.util.*;
public class Practice {

  
    public static void main(String[] args) {
        boolean repeat = true;
        
        while (repeat){
        
        Scanner s=new Scanner(System.in);
        try
        {
        int a,b,Result;
        System.out.println("enter a");
        a=s.nextInt();
        System.out.println("enter b");
        b=s.nextInt();
        
        Result = a/b;
        System.out.println("Answer is equal to : "+ Result);
        repeat= false;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Sorry jani maghaz pa zor dalo 0 sa divide nae hosakta ");
        }
        
        }
    
    }
    
}
