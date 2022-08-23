package Project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author 111
 */
public class ConnectionProvider {
    public static java.sql.Connection getCon()
    {
            String USERNAME = "root";
            String PASSWORD = "";
            String CONN_STRING = "jdbc:mysql://localhost:3306/mydb";
            java.sql.Connection conn = null;
        try
        {
            conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
            return conn;
        }
        catch (SQLException e)
        {
            System.err.println(e);
            return null;
        }
        
    }
        
}

