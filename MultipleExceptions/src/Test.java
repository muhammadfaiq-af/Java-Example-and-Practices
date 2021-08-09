import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {   
    public static void main(String[] args) {
        boolean repeat = true;
        while (repeat)
        {
        Scanner input = new Scanner(System.in);
        int a,b,c = 1;
        System.out.println("Enter Numerator");
        try
        {
        a = input.nextInt();
        System.out.println("Enter Denominator");
        b = input.nextInt();          
        c = a/b;
        System.out.println("The answer is " + c);
        System.out.println("The program will terminate now");
        System.out.println("Take care until next time");
        repeat = false;
        }
        catch(ArithmeticException ae)
        {
         System.out.println("Please try again, denominator can not be equal to zero");   
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Enter only integers. Try again");
        }
        }
         
        
    }
    
}
