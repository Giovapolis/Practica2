package utilidades;

import java.awt.Desktop;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de imagen", "jpg", "jpeg","png");// filtros para elegir la imagen de la empresa
    private FileNameExtensionFilter filterE = new FileNameExtensionFilter("Archivos de Excel", "xls");// filtros para elegir el archivo de carga masiva de empleados

    public void abrirarchivo(String archivo) { // Funcion que abfre el recibo despues de su creacion
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public String Selector() { // Selector que escoge la imgen de acuerdo a los filtros
        String ruta = null;
        JFileChooser jFileChooser3 = new JFileChooser();
        jFileChooser3.setFileFilter(filter);
        int option = jFileChooser3.showOpenDialog(jFileChooser3);
        if (option == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser3.getSelectedFile().toString();
        }
        return ruta;
    }
   
    public String SelectorExcel() { // Selector que escoge el archivo de carga masiva de acuerdo a los filtros
        String ruta = null;
        JFileChooser jFileChooser3 = new JFileChooser();
        jFileChooser3.setFileFilter(filterE);
        int option = jFileChooser3.showOpenDialog(jFileChooser3);
        if (option == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser3.getSelectedFile().toString();
        }
        return ruta;
    }
}