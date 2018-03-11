/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.Conectar;

/**
 *
 * @author mvillanuevas
 */
public class Empleado {
    int Id;
    String Empresa;
    Date fechaIngreso;
    String Nombre;
    String Paterno;
    String Materno;
    Date Edad;
    String tel;
    String cel;
    String CURP;
    String RFC;
    String correo;
    String Cargo;
    String Calle;
    String Colonia;
    String Int;
    String Ext;
    String Municipio;
    String Estado;
    DefaultTableModel dtm;
    private  Conectar con;

    public Empleado() {
        con = new Conectar();
    }
    
    public Empleado(int Id, String Empresa, Date fechaIngreso, String Nombre, 
            String Paterno, String Materno, Date Edad, String tel, String cel, 
            String CURP, String RFC, String correo, String Cargo, String Calle, 
            String Colonia, String Int, String Ext, String Municipio, String Estado) {
        this.Id = Id;
        this.Empresa = Empresa;
        this.fechaIngreso = fechaIngreso;
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.Edad = Edad;
        this.tel = tel;
        this.cel = cel;
        this.CURP = CURP;
        this.RFC = RFC;
        this.correo = correo;
        this.Cargo = Cargo;
        this.Calle = Calle;
        this.Colonia = Colonia;
        this.Int = Int;
        this.Ext = Ext;
        this.Municipio = Municipio;
        this.Estado = Estado;
        con = new Conectar();
    }
    
        public ArrayList ConsultaEmpleado(JTable tabla) throws Exception {
        ArrayList<Object[]> data = new ArrayList<>();
        try {
            PreparedStatement pstm = con.conectado().prepareStatement("SELECT * FROM EMPLEADO");
            ResultSet rst = pstm.executeQuery();
            ResultSetMetaData rsm = rst.getMetaData();

            ArrayList<Object[]> datos = new ArrayList<>();
            while (rst.next()) {
                Object[] filas = new Object[rsm.getColumnCount()];
                for (int i = 0; i < filas.length; i++) {
                    filas[i] = rst.getObject(i + 1);

                }
                datos.add(filas);
            }
            dtm = (DefaultTableModel) tabla.getModel();
            for (int i = 0; i < datos.size(); i++) {
                dtm.addRow(datos.get(i));
            }
            //Desconexion de la BD
            con.desconectar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la base de Datos Consulta eMPLEADOS", "Aceptar", 1);
        }
        return data;
    }
}
