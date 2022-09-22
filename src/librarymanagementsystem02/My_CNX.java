
package librarymanagementsystem02;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class My_CNX {
    
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "librarymanagementsystem001";
    private static Integer portnumber = 3306;
    private static String password = "cuteako";
    private static boolean ssl = false;
    
    public static Connection getConnection(){
        
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPassword(password);
        datasource.setPortNumber(portnumber);
        datasource.setUseSSL(false);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection " + My_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }
}