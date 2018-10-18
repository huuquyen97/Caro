    package caro.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * 
 * */
public class Connections {
     //static String userName = "sa";
     //static String passWord = "sa";
     //static String url = "jdbc:sqlserver://localhost:1433;databaseName=ca";
        static String dbUrl="jdbc:sqlserver://;databaseName=caro [sa on db_accessadmin];Database=caro;UserName=sa;Password=123456";
      public static Connection con = null;
     public static Connection Newconnect(){
       
        try
        {
            String url="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            Class.forName(url);
            con=DriverManager.getConnection(dbUrl);
        }
        catch (Exception ex)
        {
            System.out.println( "Conection fail!");
        }
         return con;
    }
     public ResultSet LoadData(String sql){
        ResultSet result = null;
        try {
            Statement statement = con.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }     

}
