package ArsipDokumen;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class conn {
    private static Connection MYSQLConfig;

    public static Connection sambungDB() {
        try {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUser("root");
            dataSource.setPassword("");
            dataSource.setServerName("localhost");
            dataSource.setDatabaseName("arsip_dokumen");
            dataSource.setPortNumber(3306);
            dataSource.setAllowMultiQueries(true);
            Connection c = dataSource.getConnection();
            return c;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
