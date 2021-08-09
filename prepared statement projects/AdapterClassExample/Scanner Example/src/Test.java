import java.util.Scanner;
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
    String first, second;
    System.out.println("Enter your word");
    
    first = input.nextLine();
    System.out.println("Enter your word");
    
    second = input.next();
    
    System.out.println("Your word was:  " + first);
    System.out.println("Your word was:  " + second);
    } 
    
}
