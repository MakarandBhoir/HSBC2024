package jdbc01;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest01 {
    public static void main(String[] args) {
        try {
            // Step 1 - Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded.");

            // Step 2 - Establish the connection
            DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");
            System.out.println("Db connection is successful");
        }
        catch (ClassNotFoundException e){
            System.out.println("Driver class not found.");
        }
        catch (SQLException e){
            System.out.println("Problem in connection.");
        }
    }
}
