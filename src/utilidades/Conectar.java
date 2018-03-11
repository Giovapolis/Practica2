package utilidades;

import java.sql.*;

public class Conectar {
     
    private String bd = "nomina";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost/"+bd;
    Connection con = null;
	
    //Constructor
    public Conectar(){
        try {
            //Obtener el driver para mysql
            Class.forName("com.mysql.jdbc.Driver");
            //Obtenemos la conexion
            con = DriverManager.getConnection(url,user,password);
            if (con!=null) {
                System.out.println("Conexion a "+bd);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e){
            System.err.println(e);
        }
    }
     /**
     *
     * @return
     */
    public Connection conectado(){
      return con;
}

    public void desconectar(){
      con = null;
      System.out.println("conexion terminada");

    }  
}