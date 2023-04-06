package Exercise1;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class MovieJDBC {
    public static void main(String[] args) {
        DataSource dataSource = createNewDatasource();
        try (Connection connection = dataSource.getConnection()) {
            // create 'movies' database
            String createDBCommand = "create database if not exists movies;";
            Statement createDBStatement = connection.createStatement();
            createDBStatement.executeUpdate(createDBCommand);

            // use 'movies' database
            String useCommand = "use movies;";
            Statement useStatement = connection.createStatement();
            useStatement.executeUpdate(useCommand);

            // drop the 'movies' table before beginning
            String dropCommand = "drop table if exists movies;";
            Statement truncateStatement = connection.createStatement();
            truncateStatement.executeUpdate(dropCommand);

            // create the 'movies' table
            String createCommand = "create table movies (id int not null auto_increment, title varchar(255) not null, genre varchar(255) not null, yearofrelease int not null, primary key (id));";
            Statement createTableStatement = connection.createStatement();
            createTableStatement.executeUpdate(createCommand);

            // insert some initial data into the 'movies' table
            String insertCommand = "insert into movies(title, genre, yearofrelease) values ('The Apartment', 'Comedy/Drama/Romance', 1960), ('No Country for Old Men', 'Crime/Drama/Thriller', 2007), ('Zola', 'Black comedy', 2021), ('The Big Lebowski', 'Comedy/Crime', 1998);";
            Statement insertRowsStatement = connection.createStatement();
            insertRowsStatement.executeUpdate(insertCommand);

            // insert
            int insertCount = 0;
            PreparedStatement insertMoviePS = connection.prepareStatement("insert into movies (title, genre, yearofrelease) values (?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            insertMoviePS.setString(1, "Favorite Son");
            insertMoviePS.setString(2, "Political drama miniseries");
            insertMoviePS.setInt(3, 1988);
            insertMoviePS.executeUpdate();
            insertCount++;

            insertMoviePS.setString(1, "Full Metal Jacket");
            insertMoviePS.setString(2, "War drama");
            insertMoviePS.setInt(3, 1987);
            insertMoviePS.executeUpdate();
            insertCount++;

            insertMoviePS.setString(1, "The Departed");
            insertMoviePS.setString(2, "Epic crime thriller");
            insertMoviePS.setInt(3, 2006);
            insertMoviePS.executeUpdate();
            insertCount++;

            insertMoviePS.setString(1, "Bill's dummy movie to be edited later");
            insertMoviePS.setString(2, "N/A");
            insertMoviePS.setInt(3, 2023);
            insertMoviePS.executeUpdate();
            insertCount++;
            ResultSet resultSet2 = insertMoviePS.getGeneratedKeys(); // get the ID of the movie to update and delete later
            int updateMovieID = 0;
            while (resultSet2.next()) {
//                System.out.println(resultSet2.getInt(1));
                updateMovieID = resultSet2.getInt(1);
            }

            System.out.println(insertCount + " records were inserted.");

            // update
            PreparedStatement updateMoviePS = connection.prepareStatement("update movies set title = ?, genre = ? where id = ?");
            updateMoviePS.setString(1, "Bill's Future Oscar Winner: The Oscars are Dumb");
            updateMoviePS.setString(2, "Satire/Mockumentary");
            updateMoviePS.setInt(3, updateMovieID);

            int updateCount = updateMoviePS.executeUpdate();
            System.out.println(updateCount + " record was updated.");

            // delete
            PreparedStatement deleteMoviePS = connection.prepareStatement("delete from movies where id = ?");
            deleteMoviePS.setInt(1, updateMovieID);
            int deleteCount = deleteMoviePS.executeUpdate();
            System.out.println(deleteCount + " record was deleted.");

            // read (display all records in the database)
            PreparedStatement readAllMoviesPS = connection.prepareStatement("select * from movies");
            ResultSet resultSet = readAllMoviesPS.executeQuery();
            while (resultSet.next()) {
                System.out.println("----------");
                System.out.println(resultSet.getString("title") + ", released in " + resultSet.getInt("yearofrelease") + ", is a " + resultSet.getString("genre") + " film.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static DataSource createNewDatasource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl("jdbc:mysql://localhost/movies");
        hikariDataSource.setUsername("william");
        hikariDataSource.setPassword("william");
        return hikariDataSource;
    }
}
