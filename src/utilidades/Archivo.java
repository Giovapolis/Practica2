package utilidades;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Archivo {

    private FileNameExtensionFilter filter = new FileNameExtensionFilter("Formato de intercambio de archivos JPEG", "jpg", "jpeg");

    public void abrirarchivo(String archivo) {
        try {
            File objetofile = new File(archivo);
            Desktop.getDesktop().open(objetofile);

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public String Selector() {
        String ruta = null;
        JFileChooser jFileChooser3 = new JFileChooser();
        jFileChooser3.setFileFilter(filter);
        int option = jFileChooser3.showOpenDialog(jFileChooser3);
        if (option == JFileChooser.APPROVE_OPTION) {
            ruta = jFileChooser3.getSelectedFile().toString();
        }
        return ruta;
    }

    
}
