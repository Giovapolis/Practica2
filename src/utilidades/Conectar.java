//Funcion de conexion a la base de datos MySQL
package utilidades;

import java.sql.*;
import javax.swing.*;

public class Conectar {
     
    Connection con = null;
	
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/Practica2","root","");//Conexión con usuario y contraseña
            JOptionPane.showMessageDialog(null, "Conexion Establecida");
            return con;
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error\n"+e);
            return null;
        }
    }
     
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    } 
     
}