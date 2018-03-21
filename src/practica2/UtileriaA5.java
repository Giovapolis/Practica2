/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author mvillanuevas
 */
public class UtileriaA5 {
    
    private int id;
    private String fechaIngeso;
    private String nombre;
    private String paterno;
    private String materno;
    private String edad;
    private String RFC;
    private String CURP;
    private String correo;
    private float sueldo;
    private String diastrab;
    private String faltas;
    private String Empresa;
    private String LogoEmp;
    
    public UtileriaA5(){
        
    }  

    public UtileriaA5(int id, String fechaIngeso, String nombre, String paterno, 
            String materno, String edad, String RFC, String CURP, String correo, 
            float sueldo, String diastrab, String faltas, String Empresa, String LogoEmp) {
        this.id = id;
        this.fechaIngeso = fechaIngeso;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.RFC = RFC;
        this.CURP = CURP;
        this.correo = correo;
        this.sueldo = sueldo;
        this.diastrab = diastrab;
        this.faltas = faltas;
        this.Empresa = Empresa;
        this.LogoEmp = LogoEmp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaIngeso() {
        return fechaIngeso;
    }

    public void setFechaIngeso(String fechaIngeso) {
        this.fechaIngeso = fechaIngeso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getCURP() {
        return CURP;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getDiastrab() {
        return diastrab;
    }

    public void setDiastrab(String diastrab) {
        this.diastrab = diastrab;
    }

    public String getFaltas() {
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String Empresa) {
        this.Empresa = Empresa;
    }

    public String getLogoEmp() {
        return LogoEmp;
    }

    public void setLogoEmp(String LogoEmp) {
        this.LogoEmp = LogoEmp;
    }
    
}
