import java.util.Scanner;
public class ExceptioneExample {

    
    public static void main(String[] args) {
        boolean mf=true;
                while(mf)
                {
        
                
        Scanner s=new Scanner(System.in);
        int a,b,c =1;
        System.out.println("Enter numerator ");
        a=s.nextInt();
        System.out.println("Enter Denominator ");
        b=s.nextInt();
        try
        {
            c=a/b;
            System.out.println("Answer is "+c);
            System.out.println("Program is Treminated ");
            
        }
        catch(ArithmeticException ae)
        {
            System.out.println("Sorry Number cant be divided by zero");
                    
        }
        
        
        
        
                }
    }
    
    
}
