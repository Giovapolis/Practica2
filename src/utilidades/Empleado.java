/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.io.File;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import utilidades.Conectar;

/**
 *
 * @author mvillanuevas
 */
public class Empleado {

    private int Id;
    private String Empresa;
    private String fechaIngreso;
    private String Nombre;
    private String Paterno;
    private String Materno;
    private String Edad;
    private String Tel;
    private String Cel;
    private String CURP;
    private String RFC;
    private String correo;
    private String Cargo;
    private String Calle;
    private String Colonia;
    private String Int;
    private String Ext;
    private String Municipio;
    private String Estado;
    DefaultTableModel dtm;
    private Conectar con;

    public Empleado() {
        con = new Conectar();
    }

    public Empleado(int Id, String Empresa, String fechaIngreso, String Nombre,
            String Paterno, String Materno, String Edad, String Tel, String Cel,
            String CURP, String RFC, String correo, String Cargo, String Calle,
            String Colonia, String Int, String Ext, String Municipio, String Estado) {
        this.Id = Id;
        this.Empresa = Empresa;
        this.fechaIngreso = fechaIngreso;
        this.Nombre = Nombre;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.Edad = Edad;
        this.Tel = Tel;
        this.Cel = Tel;
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

    public boolean Verificar(String rfc) {
        boolean v = false;
        try {
            PreparedStatement pstm;
            String sql = "SELECT RFC FROM EMPLEADO WHERE RFC = '" + rfc + "';";
            pstm = con.conectado().prepareStatement(sql);
            ResultSet rst = pstm.executeQuery();
            v = rst.next();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en la base de Datos al Verificar existente", "Aceptar", 1);
        }
        return v;
    }

    public void ReadExcel(String ruta) {
        int cont = 1;
        try {
            Workbook archivo = Workbook.getWorkbook(new File(ruta));
            for (int i = 0; i < archivo.getNumberOfSheets(); i++) {
                Sheet hoja = archivo.getSheet(i);
                int columnas = hoja.getColumns();
                int filas = hoja.getRows();
                String dato;
                for (int j = 0; j < filas; j++) {
                    for (int k = 0; k < columnas; k++) {
                        dato = hoja.getCell(k, j).getContents();
                        //System.out.println(dato + " ");
                        switch (cont) {
                            case 1:
                                Empresa = dato;
                                cont++;
                                break;
                            case 2:
                                fechaIngreso = dato;
                                cont++;
                                break;
                            case 3:
                                Nombre = dato;
                                cont++;
                                break;
                            case 4:
                                Paterno = dato;
                                cont++;
                                break;
                            case 5:
                                Materno = dato;
                                cont++;
                                break;
                            case 6:
                                Edad = dato;
                                cont++;
                                break;
                            case 7:
                                Tel = dato;
                                cont++;
                                break;
                            case 8:
                                Cel = dato;
                                cont++;
                                break;
                            case 9:
                                CURP = dato;
                                cont++;
                                break;
                            case 10:
                                RFC = dato;
                                cont++;
                                break;
                            case 11:
                                correo = dato;
                                cont++;
                                break;
                            case 12:
                                Cargo = dato;
                                cont++;
                                break;
                            case 13:
                                Calle = dato;
                                cont++;
                                break;
                            case 14:
                                Int = dato;
                                cont++;
                                break;
                            case 15:
                                Ext = dato;
                                cont++;
                                break;
                            case 16:
                                Colonia = dato;
                                cont++;
                                break;
                            case 17:
                                Municipio = dato;
                                cont++;
                                break;
                            case 18:
                                Estado = dato;
                                cont = 1;
                                break;
                        }
                    }
                    if (Verificar(RFC) == false) {
                        //System.out.println("\n");
                        String sql = "INSERT INTO EMPLEADO(NOMEMPRESA, FECHAINGRESO, "
                                + "NOMBRE, APATERNO, AMATERNO, EDAD,TEL, CEL, "
                                + "CURP, RFC, CORREO, CARGO, CALLE, NUM_INT, "
                                + "NUM_EXT,COLONIA, MUNICIPIO, ESTADO)"
                                + " values('" + Empresa + "','" + fechaIngreso + "','" 
                                + Nombre + "','" + Paterno + "','" + Materno + "','" 
                                + Edad + "','" + Tel + "','" + Cel + "','" + CURP + "','" 
                                + RFC + "','" + correo + "','" + Cargo + "','" + Calle + "','" 
                                + Int + "','" + Ext + "','" + Colonia + "','" + Municipio + "','" 
                                + Estado + "');";
                        PreparedStatement pstm = con.conectado().prepareStatement(sql);                        
                        //Ejecucion de la sentencia insert
                        pstm.execute();
                    } else {
                        JOptionPane.showMessageDialog(null, "El Empleado ya existe (Excel)", "Aceptar", 1);
                    }

                }
            }
            //Desconexion de la BD
            con.desconectar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la base de Datos Nuevo Empleado Excel ", "Aceptar", 1);
            System.out.println(e);
        }
    }
}
