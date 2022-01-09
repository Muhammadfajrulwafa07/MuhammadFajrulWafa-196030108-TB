/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
/**
 *
 * @author ASUS
 */
public class koneksi {
    
    private static Connection MySQLConfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/db_gudangku";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e) {
            System.out.println("koneksi ke database gagal" + e.getMessage());
        }
        
        return MySQLConfig;
    }
    public static Connection getConnection() {
        Connection connection = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/db_gudangku"; //ganti dengan database mu
        String user = "root";
        String password = "";
        if (connection == null) {
            try{
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            }catch (ClassNotFoundException | SQLException error) {
               System.exit(0);
            }

        }
        return connection;
    }
}
