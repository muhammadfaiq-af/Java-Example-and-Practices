import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        int num1= 0,num2 =0,result;
        Scanner input = new Scanner(System.in);
        boolean repeat = true;
        while (repeat)
        {
        try
        {
        System.out.println("Enter your first number");
        num1 = input.nextInt();
         System.out.println("Enter your second number");
        num2 = input.nextInt();
        result = num1 + num2;
        
        System.out.println("The sum is equal to " + result);
        repeat = false;
        }
        catch(InputMismatchException ime)
        {
            System.out.println("Please enter only interger values.");
            input.next();
        }
        }
        
           
        
    }
    
}
