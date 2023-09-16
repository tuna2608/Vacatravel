package DAO;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public interface DatabaseInfo {
    public static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    public static String dbURL="jdbc:sqlserver://localhost:1433;databaseName=HotelFeedback;encrypt=true;trustServerCertificate=true;";
    public static String userDB="sa";
    public static String passDB="Tuna1.dev";
    public static Connection getConnect(){
        try {
            Context initContext = new InitialContext();
            Context envContext  = (Context)initContext.lookup("java:/comp/env");
            DataSource ds = (DataSource)envContext.lookup("jdbc/mydb");
            return ds.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DatabaseInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
public static void main(String[] args) {
    try {
        Connection connection = getConnect();
        if (connection != null) {
            System.out.println("Connection to the database established successfully.");
            // Perform additional database operations here if needed
            connection.close();
        } else {
            System.out.println("Failed to connect to the database.");
        }
    } catch (Exception e) {
        System.out.println("Exception occurred: " + e.getMessage());
    }
}

}
