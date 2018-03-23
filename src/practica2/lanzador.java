package practica2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utilidades.Archivo;
import utilidades.Conectar;
import utilidades.Empleado;

public class lanzador {
    public static menu menu_p = new menu();
    public static reciboA6 generar = new reciboA6();
    public static Conectar conexion = new Conectar();
    public static Consultas consulta = new Consultas();
    public static eliminaEmpleados elim_emp = new eliminaEmpleados();
    public static altasEmpleados altas = new altasEmpleados();
    public static OpcionesImpresion opciones = new OpcionesImpresion();
    public static reciboA6 recibo1 = new reciboA6();
    public static reciboA5 recibo2 = new reciboA5();
    public static utilidades.Empleado empleado = new Empleado();
    public static utilidades.Archivo archivo = new Archivo();
    public static UtileriaA6 u6 = new UtileriaA6();
    public static UtileriaA5 u5 = new UtileriaA5();
    public static horas asig = new horas();

    //Clase que inicia todo el proyecto
    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(lanzador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(lanzador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(lanzador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(lanzador.class.getName()).log(Level.SEVERE, null, ex);
        }
        menu_p.setVisible(true);        
    }    
}
