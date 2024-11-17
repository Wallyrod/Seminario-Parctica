/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebamysql;
import java.sql.*;

/**
 *
 * @author zihk
 */
public class DBConnection {
   static String url="jdbc:mysql:localhost:3306/bd_SEGUNDAENTREGA";
   static String user="root";
   static String pass="26548956";
  public static Connection conectar()
  {
      Connection con=null;
      try
      {
      con=DriverManager.getConnection(url,user,pass);
      System.out.println("Conexión Exitosa");
      }catch(SQLException e) 
      {   
      e.printStackTrace();
      }
      
      return con;
  }
}
