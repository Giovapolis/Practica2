package practica2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import utilidades.Conectar;

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
