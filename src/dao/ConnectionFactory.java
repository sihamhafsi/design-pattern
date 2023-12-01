package dao;
import dao.MySqlConnection;
import java.sql.SQLException;

public class ConnectionFactory {
    public static IConnection createConnection() throws SQLException {
        return new MySqlConnection();
    }
}

