import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCDataSource {
    public static void main(String[] args) {
        DataSource dataSource = createDataSource();

        try (Connection connection = dataSource.getConnection()) {
            System.out.println("connection: " + connection.isValid(0));

            // CRUD = create, read, update, delete

            // SELECT (read)
            PreparedStatement preparedStatement = connection.prepareStatement("select * from employees where employeenumber = ?");
            preparedStatement.setInt(1, 1216);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(resultSet.getString("firstname") + " " + resultSet.getString("lastname") + ", " + resultSet.getInt("employeenumber"));
            }

            // INSERT (create) statement
            PreparedStatement insertPs = connection.prepareStatement("insert into employees (employeenumber, lastname, firstname, extension, email, officecode, jobtitle) values (?, ?, ?, ?, ?, ?, ?)");
            insertPs.setInt(1, 13131313); // SQL starts counting at 1
            insertPs.setString(2, "The Thrill");
            insertPs.setString(3, "Bill");
            insertPs.setString(4, "x1313");
            insertPs.setString(5, "bill@billthethrill.com");
            insertPs.setString(6, "1");
            insertPs.setString(7, "El Presidente");
            int insertCount = insertPs.executeUpdate();
            System.out.println("records were added: " + insertCount); // this just a sanity check; it's not necessary

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource createDataSource() {
        // find article about the optimal number of connections
        // Pavel question: the DB connection is in a separate thread?
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost/classicmodels");
        hikariDataSource.setUsername("william");
        hikariDataSource.setPassword("william");
        return hikariDataSource;
    }
}
