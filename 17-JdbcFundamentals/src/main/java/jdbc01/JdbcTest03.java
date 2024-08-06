package jdbc01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcTest03 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Step 1 - Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 - Establish the connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");

            // Step 3: We disabled auto commit mode of conneciton
            connection.setAutoCommit(false);

            // Setp 4: Create query
            String query = "Insert Into Student(Student_Id, Student_Name, Student_Score, Dept_Id) Values(?, ?, ?, ?)";

            // Step 4: We need to create prepare statement
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 1005);
            preparedStatement.setString(2, "Test");
            preparedStatement.setDouble(3, 50.0);
            preparedStatement.setInt(4, 10);
            int result = preparedStatement.executeUpdate();
            connection.commit();
            if(result == 1){
                System.out.println("Data inserted successfully.");
            }

            // Step 5: Close connection
            preparedStatement.close();
            connection.close();
        }
        catch (ClassNotFoundException e){
            System.out.println("Driver class not found.");
        }
        catch (SQLException e){
            try {
                connection.rollback();
            }
            catch (SQLException e){

            }
            System.out.println("Problem in connection.");
        }
    }
}
