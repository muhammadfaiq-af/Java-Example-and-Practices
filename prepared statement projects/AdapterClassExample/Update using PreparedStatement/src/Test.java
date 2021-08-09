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
        PreparedStatement pst = con.prepareStatement("UPDATE STUDENT SET NAME = ?,ADDRESS = ? WHERE ID = ?");
        System.out.println("Enter the student ID to update its record");
        id = input.nextInt();
        System.out.println("Enter the updated student NAME");
        name = input.next();
        System.out.println("Enter the updated student ADDRESS");
        address = input.next();
        
        pst.setString(1,name);
        pst.setString(2,address);
        pst.setInt(3, id);
        int records = pst.executeUpdate();
        System.out.println(records + " record updated successfully");
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
