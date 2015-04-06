import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import org.apache.log4j.Logger;

public class ConnectionToDB {
    private static Connection connection = null;
    
    public static Connection createConnection() throws ClassNotFoundException,
    SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "", "root", "root"); // enter db info
        return connection;
    }
}
