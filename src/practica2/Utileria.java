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
public class Utileria {
    
    private int id;
    private String fechaIngeso;
    private String nombre;
    private String materno;
    private String paterno;
    private String RFC;
    private float sueldo;
    private String diastrab;
    private String faltas;
    private String Empresa;
    private String LogoEmp;
    private int check;
    
    public Utileria(){
        
    }

    public Utileria(int id, String fechaIngeso, String nombre, String materno, 
            String paterno, String RFC, float sueldo, String diastrab, 
            String faltas, String Empresa, String LogoEmp) {
        this.id = id;
        this.fechaIngeso = fechaIngeso;
        this.nombre = nombre;
        this.materno = materno;
        this.paterno = paterno;
        this.RFC = RFC;
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

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
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

    public int getCheck() {
        return check;
    }

    public void setCheck(int check) {
        this.check = check;
    }
    
}
