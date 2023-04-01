import java.sql.*;

public class JDBCDriverManager {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels", "william", "william")) {
            System.out.println("connection: " + connection.isValid(0));

            // CRUD = create, read, update, delete
            // SELECT (read) statement
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where employeeNumber = ?");
            preparedStatement.setInt(1, 1143);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstName") + " " + resultSet.getString("lastName") + ", " + resultSet.getInt("employeeNumber"));
            }

            // INSERT (create) statement
            PreparedStatement insertPs = connection.prepareStatement("insert into employees (employeenumber, lastname, firstname, extension, email, officecode, jobtitle) values (?, ?, ?, ?, ?, ?, ?)");
            insertPs.setInt(1, 131313); // SQL starts counting at 1
            insertPs.setString(2, "The Thrill");
            insertPs.setString(3, "Bill");
            insertPs.setString(4, "x1313");
            insertPs.setString(5, "bill@billthethrill.com");
            insertPs.setString(6, "1");
            insertPs.setString(7, "El Presidente");
            int insertCount = insertPs.executeUpdate();
            System.out.println("records were added: " + insertCount); // this just a sanity check; it's not necessary

            // UPDATE statement

            // DELETE statement


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
