import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created by user on 2016-04-01.
 */
public interface ConnectionMaker {
    Connection getConnection() throws ClassNotFoundException, SQLException;
}
