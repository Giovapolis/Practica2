/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author mvillanuevas
 */
public class AsistentesDataSource implements JRDataSource {

    private List<Utileria> RegEmpleado = new ArrayList<Utileria>();
    private int indiceParticipanteActual = -1;

    @Override
    public boolean next() throws JRException {
        return ++indiceParticipanteActual < RegEmpleado.size();
    }

    public void addAsistente(Utileria Empleado) {

        this.RegEmpleado.add(Empleado);

    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;

        if ("IdEmp".equals(jrf.getName())) {

            valor = RegEmpleado.get(indiceParticipanteActual).getId();
        }else if ("FechaIngreso".equals(jrf.getName())){
            
            valor = RegEmpleado.get(indiceParticipanteActual).getFechaIngeso();

        } else if ("Nombre".equals(jrf.getName())) {

            valor = RegEmpleado.get(indiceParticipanteActual).getNombre();

        } else if ("Paterno".equals(jrf.getName())) {

            valor = RegEmpleado.get(indiceParticipanteActual).getPaterno();

        } else if ("Materno".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getMaterno();
            
        } else if ("RFC".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getRFC();
            
        } else if ("Sueldo".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getSueldo();
            
        } else if ("DiasTrab".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getDiastrab();
            
        } else if ("Faltas".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getFaltas();
            
        } else if ("NomEmpresa".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getEmpresa();
            
        } else if ("LogoEmpresa".equals(jrf.getName())) {
            
            valor = RegEmpleado.get(indiceParticipanteActual).getLogoEmp();
        }

        return valor;
    }

}
