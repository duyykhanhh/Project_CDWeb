package vn.edu.hcmuaf.cdwed.projecttkhdt.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection conn;
    static String  connectionURL = "";
    private static String USER_NAME = "khanh";
    private static String PASSWORD = "1234";
    private static Connection connectSQLServer(){

        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(connectionURL, USER_NAME, PASSWORD);
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;

    }
    public static Connection getConnection(){
        if(conn == null){
            conn = connectSQLServer();
        }
        return conn;
    }
}