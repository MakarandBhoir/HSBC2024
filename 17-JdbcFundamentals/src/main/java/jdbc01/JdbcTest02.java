package jdbc01;

import java.sql.*;

public class JdbcTest02 {
    public static void main(String[] args) {
        try {
            // Step 1 - Load the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 - Establish the connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "makarand@1234");

            // Step 3 - We need to create a statement
            Statement statement = conn.createStatement();

            // Step 4 - Set up sql query
            String query = "select * from student";

            // Step 5 - Execute the query
            ResultSet resultSet = statement.executeQuery(query);

            // Step 6 - Process the Result Set
            while(resultSet.next()){
                //resultSet.getInt("student_id");
                int studentId = resultSet.getInt(1);
                String studentName =  resultSet.getString("student_name");
                double studentScore = resultSet.getDouble("student_score");
                int deptId = resultSet.getInt("dept_id");

                System.out.println(studentId+", "+studentName+", "+studentScore+", "+deptId);
            }
            // Step 7 - Close the connection
            statement.close();
            conn.close();

        }
        catch (ClassNotFoundException e){
            System.out.println("Driver class not found.");
        }
        catch (SQLException e){
            System.out.println("Problem in connection.");
        }
    }
}
