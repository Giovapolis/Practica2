package practica2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import utilidades.*;

public class reciboA5 extends javax.swing.JFrame {

    String logo;
    float saldo;

    public reciboA5() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_logo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldEmpresa = new javax.swing.JTextField();
        jPanelEmpleado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldaterno = new javax.swing.JTextField();
        jTextFieldMaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRFC = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDiastrab = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFaltas = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSueldo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldFingreso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCURP = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFielCorreo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEdad = new javax.swing.JTextField();
        confirma = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_logo.setText("Ok");
        btn_logo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccionar logo:");

        jLabel2.setText("Empresa:");

        jTextFieldEmpresa.setEnabled(false);

        jPanelEmpleado.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setText("Nombre:");

        jLabel4.setText("Paterno:");

        jLabel5.setText("Materno:");

        jTextFieldNombre.setEnabled(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldaterno.setEnabled(false);

        jTextFieldMaterno.setEnabled(false);

        jLabel6.setText("ID-Empleado:");

        jTextFieldId.setEnabled(false);

        jLabel7.setText("RFC:");

        jTextFieldRFC.setEnabled(false);
        jTextFieldRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRFCActionPerformed(evt);
            }
        });

        jLabel8.setText("Dias trabajaos:");

        jTextFieldDiastrab.setEnabled(false);
        jTextFieldDiastrab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDiastrabActionPerformed(evt);
            }
        });

        jLabel9.setText("Faltas:");

        jTextFieldFaltas.setEnabled(false);

        jLabel10.setText("Sueldo:");

        jTextFieldSueldo.setEditable(false);

        jLabel11.setText("Fecha Ingreso:");

        jTextFieldFingreso.setEnabled(false);

        jLabel12.setText("CURP:");

        jTextFieldCURP.setEditable(false);
        jTextFieldCURP.setEnabled(false);

        jLabel13.setText("Correo:");

        jTextFielCorreo.setEditable(false);
        jTextFielCorreo.setEnabled(false);

        jLabel15.setText("Edad:");

        jTextFieldEdad.setEditable(false);
        jTextFieldEdad.setEnabled(false);

        javax.swing.GroupLayout jPanelEmpleadoLayout = new javax.swing.GroupLayout(jPanelEmpleado);
        jPanelEmpleado.setLayout(jPanelEmpleadoLayout);
        jPanelEmpleadoLayout.setHorizontalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDiastrab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldSueldo))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFingreso))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                                    .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGap(12, 12, 12))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmpleadoLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15))
                                .addGap(17, 17, 17)))
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldaterno, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(jTextFieldMaterno)
                            .addComponent(jTextFieldNombre)
                            .addComponent(jTextFieldRFC)
                            .addComponent(jTextFieldCURP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFielCorreo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldEdad, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanelEmpleadoLayout.setVerticalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextFieldFingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldCURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFielCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldDiastrab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldFaltas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        confirma.setText("Ok");
        confirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmaActionPerformed(evt);
            }
        });

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jRadioButton1.setText("Empleado existente");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Calcular Saldo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(btn_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2)
                        .addGap(64, 64, 64)
                        .addComponent(confirma, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_logo)
                    .addComponent(jLabel1)
                    .addComponent(jRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirma)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoActionPerformed
        utilidades.Archivo a = new Archivo();
        logo = a.Selector();
        System.out.println(logo);
    }//GEN-LAST:event_btn_logoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed

    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        lanzador.opciones.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        try {
            // TODO add your handling code here:
            TableEmpleado tabla = new TableEmpleado();
            tabla.Check(2);
            tabla.setVisible(true);
            dispose();
        } catch (Exception ex) {
            Logger.getLogger(reciboA5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextFieldRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRFCActionPerformed

    private void jTextFieldDiastrabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDiastrabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDiastrabActionPerformed

    private void confirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmaActionPerformed
        // TODO add your handling code here:
        InputStream inputStream = null;
        JasperPrint jasperPrint = null;
        EmpleadosDataSourceA5 datasource5 = new EmpleadosDataSourceA5();
        File f = new File("A5.jrxml");
        String ruta = null;

        lanzador.u5 = new UtileriaA5(Integer.valueOf(jTextFieldId.getText()), jTextFieldFingreso.getText(),
                jTextFieldNombre.getText(), jTextFieldaterno.getText(), jTextFieldMaterno.getText(), jTextFieldEdad.getText(),
                jTextFieldRFC.getText(), jTextFieldCURP.getText(), jTextFielCorreo.getText(), saldo, jTextFieldDiastrab.getText(),
                jTextFieldFaltas.getText(), jTextFieldEmpresa.getText(), logo);
        datasource5.addAsistente(lanzador.u5);

        try {
            inputStream = new FileInputStream(f.getAbsolutePath());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "***Error al leer el fichero de carga jasper report " + ex.getMessage());
        }

        try {
            JasperDesign jasperDesign = JRXmlLoader.load(inputStream);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            jasperPrint = JasperFillManager.fillReport(jasperReport, null, datasource5);

            JasperExportManager.exportReportToPdfFile(jasperPrint, ruta = lanzador.archivo.guardarArchivo());
            System.out.println("Archivo PDF Generado");

        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar fichero jrml jasper report " + e.getMessage());
        }
        Archivo abrir = new Archivo();
        abrir.abrirarchivo(ruta);
    }//GEN-LAST:event_confirmaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int dias = 0, faltas = 0;
        try {
            dias = Integer.parseInt(jTextFieldDiastrab.getText());
            faltas = Integer.parseInt(jTextFieldFaltas.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debe cargar primero los datos del empleado - " + e.getMessage());
        }
        if (dias != 0 && faltas != 0) {
            saldo = (float) (88.36 * (dias - faltas));
            jTextFieldSueldo.setText(String.valueOf(saldo));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logo;
    private javax.swing.JButton confirma;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelEmpleado;
    private javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JTextField jTextFielCorreo;
    public javax.swing.JTextField jTextFieldCURP;
    public javax.swing.JTextField jTextFieldDiastrab;
    public javax.swing.JTextField jTextFieldEdad;
    public javax.swing.JTextField jTextFieldEmpresa;
    public javax.swing.JTextField jTextFieldFaltas;
    public javax.swing.JTextField jTextFieldFingreso;
    public javax.swing.JTextField jTextFieldId;
    public javax.swing.JTextField jTextFieldMaterno;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldRFC;
    public javax.swing.JTextField jTextFieldSueldo;
    public javax.swing.JTextField jTextFieldaterno;
    // End of variables declaration//GEN-END:variables
}
