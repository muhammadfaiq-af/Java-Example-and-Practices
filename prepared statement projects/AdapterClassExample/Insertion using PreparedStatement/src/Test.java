import java.sql.*;
import java.util.Scanner;

public class Test {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Connection con= null;
        int id;
        String name,address;
        
        try
        {
        //con = DriverManager.getConnection("jdbc:ucanacess://E:/Student Information System.mdb");
        con = DriverManager.getConnection("jdbc:ucanaccess://E:/Student Information System.mdb");
        PreparedStatement pst = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
        System.out.println("Enter the student ID");
        id = input.nextInt();
        System.out.println("Enter the student NAME");
        name = input.next();
        System.out.println("Enter the student ADDRESS");
        address = input.next();
        
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3, address);
        int records = pst.executeUpdate();
        System.out.println(records + " record inserted successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if (con!= null)
                    con.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
    
}
