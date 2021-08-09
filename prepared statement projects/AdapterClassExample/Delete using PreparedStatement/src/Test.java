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
        PreparedStatement pst = con.prepareStatement("DELETE FROM STUDENT WHERE ID = ?");
        System.out.println("Enter the student ID to delete its record");
        id = input.nextInt();        
        pst.setInt(1,id);
       
        int records = pst.executeUpdate();
        System.out.println(records + " record deleted successfully");
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
