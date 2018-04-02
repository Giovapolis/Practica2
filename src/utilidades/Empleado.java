package utilidades;

import java.io.File;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import practica2.lanzador;
import utilidades.Conectar;

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

    public void CrearTablas() {
        try {
            
            String sql = "CREATE TABLE IF NOT EXISTS Empleado( "
                    + "IDempleado INT AUTO_INCREMENT, "
                    + "nomEmpresa VARCHAR(40), "
                    + "fechaIngreso DATE, "
                    + "NOMBRE VARCHAR(30) NOT NULL, "
                    + "APATERNO VARCHAR(30) NOT NULL, "
                    + "AMATERNO VARCHAR(30) NOT NULL, "
                    + "EDAD INT NOT NULL, "
                    + "TEL VARCHAR(15), "
                    + "CEL VARCHAR(12), "
                    + "RFC VARCHAR(13), "
                    + "correo VARCHAR(30), "
                    + "cargo VARCHAR(30), "
                    + "CALLE TEXT, "
                    + "NUM_INT VARCHAR(5), "
                    + "NUM_EXT VARCHAR(5), "
                    + "COLONIA TEXT, "
                    + "MUNICIPIO TEXT, "
                    + "ESTADO TEXT, "
                    + "PRIMARY KEY(IDempleado)); "
                    + "CREATE TABLE IF NOT EXISTS Asistencia( "
                    + "IDasistencia INT AUTO_INCREMENT, "
                    + "IDempleado INT, "
                    + "diasTrab INT, "
                    + "faltas INT, "
                    + "PRIMARY KEY(IDasistencia), "
                    + "FOREIGN KEY(IDempleado) REFERENCES Empleado(IDempleado)); "
                    + "CREATE TABLE IF NOT EXISTS Recibo( "
                    + "IDrecibo INT AUTO_INCREMENT, "
                    + "IDempleado INT, "
                    + "IDsueldo INT, "
                    + "PRIMARY KEY(IDrecibo), "
                    + "FOREIGN KEY(IDempleado) REFERENCES Empleado(IDempleado));";

            Statement st = con.conectado().createStatement();
            st.executeUpdate(sql);
            con.desconectar();
        } catch (SQLException sqle) {
            JOptionPane.showMessageDialog(null, "Error al crear tablas", "Aceptar", 1);
        }
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
