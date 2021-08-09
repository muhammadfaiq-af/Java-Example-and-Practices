import java.sql.*;
import java.util.Scanner;
public class DatabaseExample {
 
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        int option;
        String name, address;
        int id;
        int records;
 
        // Step 1: Loading or registering MSACCESS JDBC driver class
        
 
        // Step 2: Opening database connection
        try {
 
      
 
            // Step 2.A: Create and get connection using DriverManager class
            connection = MyConnection.connect();
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
            do
            {
            System.out.println("==================================================");
            System.out.println("1.................. Press 1 to view records");
            System.out.println("2.................. Press 2 to insert record");
            System.out.println("3.................. Press 3 to update a record");
            System.out.println("4.................. Press 4 to delete a record");
            System.out.println("5.................. Press 5 to search record(s)");
            System.out.println("==================================================");
            
            option = input.nextInt();
            
            switch(option)
            {
                case 1:
                    rs = statement.executeQuery("SELECT * FROM STUDENT");
                    System.out.println("ID\tName\t\t\tAddress");
                    System.out.println("==\t=============\t\t============");
             // processing returned data and printing into console
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "\t" + 
                        rs.getString(2) + "\t\t\t" + 
                        rs.getString(3));
            }
                break;
                case 2:
                    System.out.println("Enter the ID of new student");
                    id = input.nextInt();
                    System.out.println("Enter the name of new student");
                    name =  input.next();
                    System.out.println("Enter the address of new student");
                    address = input.next();
                    records = statement.executeUpdate("INSERT INTO STUDENT VALUES (" + id + ",'" + name + "','" + address + "')");
                    break;
                    
                case 3:
                    System.out.println("Enter the new name");
                    name = input.next();
                    System.out.println("Enter the new address");
                    address = input.next();
                    System.out.println("Enter the ID to update its record");
                    id = input.nextInt();
                    records = statement.executeUpdate("UPDATE STUDENT SET NAME = '" + name + "', ADDRESS = '" + address + "' WHERE ID = " +id);
                    System.out.println(records + " Records have been updated successfully");
                    break;
                case 4:
                    System.out.println("Enter the id of the record to delete");
                    id = input.nextInt();
                    
                    records = statement.executeUpdate("DELETE FROM STUDENT WHERE ID =" + id);
                    System.out.println(records + " Records deleted successfully");
                    break;
                case 5:
                    System.out.println("Enter the name to search its records");
                    name = input.next();
                    rs = statement.executeQuery("SELECT * FROM STUDENT WHERE NAME = '" + name + "'");
      
             // processing returned data and printing into console
            while(rs.next())
            {
                System.out.println(rs.getInt(1) + "\t" + 
                        rs.getString(2) + "\t\t\t" + 
                        rs.getString(3));
                
            }
            }
            System.out.println("Do you wish to continue??? Y/N");
            name = input.next();
            }while(name.equals("Y") || name.equals("y"));            
        }
        catch(SQLException sqlex){
            
        }
        finally {
 
            // Step 3: Closing database connection
            try {
                if(connection != null) {
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                System.out.println(sqlex);
            }
        }
    }
}
