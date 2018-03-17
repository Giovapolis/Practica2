package practica2;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Consultas {
    
    public DefaultTableModel Consulta(String tabla){
         try {
              Statement st = lanzador.conexion.conectado().createStatement();
              
              String sql;
              sql = "SELECT * FROM "+tabla;
              
              ResultSet rstb = st.executeQuery(sql);
              ResultSetMetaData rscol = rstb.getMetaData();
              int numCol = rscol.getColumnCount();
              DefaultTableModel modelo = new DefaultTableModel();
              for (int i = 1; i <= numCol; i++) {
                   modelo.addColumn(rscol.getColumnLabel(i));
              }
              while (rstb.next()) {                   
                   String filas[] = new String[numCol];
                   for (int j = 0; j < numCol; j++) {
                        filas[j] = rstb.getString(j+1);
                   }
                   modelo.addRow(filas);
              }
              return modelo;
              
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error al cargar la Tabla\n"+e );
              return null;
         }
         
    }
    
}