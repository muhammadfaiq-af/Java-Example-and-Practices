import java.sql.*;
import java.util.Scanner;

public class Test {
       
    public static void main(String[] args) 
    {
        Connection connection = null;
        Statement statement;
        ResultSet rs = null;
        int id;
        String name;
        String address; 
        Scanner input = new Scanner(System.in);
        // Step 1: Loading or registering MSACCESS JDBC driver class
        try{
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        }
        catch(ClassNotFoundException cnfex) 
        {
        System.out.println("Problem in loading or registering MS Access JDBC driver");   
        }
        // Step 2: Opening database connection
        try {
 
            String msAccDB = "E:/Student Information System.mdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB; 
 
            // Step 2.A: Create and get connection using DriverManager class
           connection = DriverManager.getConnection(dbURL); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // Step 2.C: Executing SQL &amp; retrieve data into ResultSet
            //rs = statement.executeQuery("SELECT * FROM STUDENT");
            // processing returned data and printing into console
System.out.println("Enter ID of that record which will be updated");
id = input.nextInt();
System.out.println("Enter the updated value of Name");
name = input.next();
System.out.println("Enter the updated value of Address");
address = input.next();
int records = statement.executeUpdate("UPDATE STUDENT SET NAME = '" + name + "',ADDRESS = '"+ address +"' WHERE ID = " + id);
//rs = statement.executeQuery("SELECT * FROM STUDENT WHERE ID = " + id);
//rs.next();
//System.out.println(rs.getInt(1) + " \t\t" + rs.getString(2) + "\t\t"+ rs.getString(3));

        }
        catch(SQLException sqlex){
         System.out.println(sqlex);   
        }
        finally 
        {
 
            // Step 3: Closing database connection
            try {
                if(connection!= null) {
 
                // close connection
                    connection.close();
                    System.out.println("Connection Closed");
                }
            }
            catch (SQLException sqlex) {
                System.out.println(sqlex);
            }
        }
    }   
    }
