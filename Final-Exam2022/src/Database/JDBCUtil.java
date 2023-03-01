
package Database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class JDBCUtil {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://HOAILANG:1433;database=StudentManagement;user=sa;password=abc;encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    public static void closeConnection(Connection conn) {
        if(conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }
}
