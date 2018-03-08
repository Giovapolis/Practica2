//Funcion de conexion a la base de datos MySQL
package utilidades;

import java.sql.*;
import javax.swing.*;

public class Conectar {
     
    Connection conecta = null;
	
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conecta = DriverManager.getConnection("jdbc:mysql://localhost/Practica2","root","");//Conexión con usuario y contraseña
            JOptionPane.showMessageDialog(null, "Conexion Establecida");
            return conecta;
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error\n"+e);
            return null;
        }
    }
     
    public Connection Obtenerconexion(){
       return conecta;
    }
     
}