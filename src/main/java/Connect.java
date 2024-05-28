
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nhu Ngoc
 */
public class Connect {
    private String hostName;
    private String user;
    private String pass;
    private String dbName;
    private String url;
    private Connection conn;
    private Statement stmt;

    public Connect() {
        //readConfigFile();
        hostName = "localhost";
        user = "root";
        pass = "password";
        dbName = "supermarketdb";
        url = "jdbc:mysql://" + hostName + "/" + dbName + "?user=" + user + "&password=" + pass;
        conn = null;
        stmt = null;
    }

    public Connection getConnection() throws SQLException {
  try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    return DriverManager.getConnection(url);
  } catch (ClassNotFoundException e) {
    throw new SQLException("Could not load JDBC driver", e);
  }
}
}
