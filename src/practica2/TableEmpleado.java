package practica2;

import com.placeholder.PlaceHolder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utilidades.Empleado;

//Ventana para vizualisar todos los empleados 

public class TableEmpleado extends javax.swing.JFrame {

    PlaceHolder holder; String h = "RFC...";
    utilidades.Empleado empleado = new Empleado();
    String sql = "SELECT DISTINCT EMPLEADO.*, ASISTENCIA.DIASTRAB, "
            + "ASISTENCIA.FALTAS FROM EMPLEADO, ASISTENCIA WHERE ASISTENCIA.IDEMPLEADO = EMPLEADO.IDEMPLEADO";

    public TableEmpleado() throws Exception {
        initComponents();
        holder = new PlaceHolder(jTextFieldBuscar, h);
        jTableEmpleado.requestFocus();
        setExtendedState(MAXIMIZED_BOTH);// se inicia el frame maximizado
        jTableEmpleado.setModel(lanzador.consulta.Consulta(sql));
        setLocationRelativeTo(null);
    }

    public void Check(int c) {
        lanzador.u6.setCheck(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Buscar Empleado:");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableEmpleado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        lanzador.recibo1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadoMouseClicked

        int select = jTableEmpleado.rowAtPoint(evt.getPoint());
        String id = String.valueOf(jTableEmpleado.getValueAt(select, 0));
        String empresa = String.valueOf(jTableEmpleado.getValueAt(select, 1));
        String ingreso = String.valueOf(jTableEmpleado.getValueAt(select, 2));
        String nombre = String.valueOf(jTableEmpleado.getValueAt(select, 3));
        String paterno = String.valueOf(jTableEmpleado.getValueAt(select, 4));
        String materno = String.valueOf(jTableEmpleado.getValueAt(select, 5));
        String edad = String.valueOf(jTableEmpleado.getValueAt(select, 6));
        String curp = String.valueOf(jTableEmpleado.getValueAt(select, 9));
        String rfc = String.valueOf(jTableEmpleado.getValueAt(select, 10));
        String correo = String.valueOf(jTableEmpleado.getValueAt(select, 11));
        String dtrab = String.valueOf(jTableEmpleado.getValueAt(select, 19));
        String faltas = String.valueOf(jTableEmpleado.getValueAt(select, 20));

        System.out.println(lanzador.u6.getCheck());

        if (lanzador.u6.getCheck() == 1) {

            lanzador.recibo1.jTextFieldId.setText(id);
            lanzador.recibo1.jTextFieldEmpresa.setText(empresa);
            lanzador.recibo1.jTextFieldFingreso.setText(ingreso);
            lanzador.recibo1.jTextFieldNombre.setText(nombre);
            lanzador.recibo1.jTextFieldaterno.setText(paterno);
            lanzador.recibo1.jTextFieldMaterno.setText(materno);
            lanzador.recibo1.jTextFieldRFC.setText(rfc);
            lanzador.recibo1.jTextFieldDiastrab.setText(dtrab);
            lanzador.recibo1.jTextFieldFaltas.setText(faltas);
            TableEmpleado.this.setVisible(false);
            lanzador.recibo1.setVisible(true);
            dispose();

        } else if (lanzador.u6.getCheck() == 2) {

            lanzador.recibo2.jTextFieldId.setText(id);
            lanzador.recibo2.jTextFieldEmpresa.setText(empresa);
            lanzador.recibo2.jTextFieldFingreso.setText(ingreso);
            lanzador.recibo2.jTextFieldNombre.setText(nombre);
            lanzador.recibo2.jTextFieldaterno.setText(paterno);
            lanzador.recibo2.jTextFieldMaterno.setText(materno);
            lanzador.recibo2.jTextFieldEdad.setText(edad);
            lanzador.recibo2.jTextFieldRFC.setText(rfc);
            lanzador.recibo2.jTextFieldCURP.setText(curp);
            lanzador.recibo2.jTextFielCorreo.setText(correo);
            lanzador.recibo2.jTextFieldDiastrab.setText(dtrab);
            lanzador.recibo2.jTextFieldFaltas.setText(faltas);
            TableEmpleado.this.setVisible(false);
            lanzador.recibo2.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableEmpleadoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String rfc = jTextFieldBuscar.getText();
        String b;  
        int point;

        int row = jTableEmpleado.getRowCount();

        if (rfc != h || rfc != "") {

            for (int i = 0; i < row; i++) {

                if (rfc.equals(b = String.valueOf(jTableEmpleado.getValueAt(i, 10)))) {
                    point = i;
                    jTableEmpleado.setRowSelectionInterval(point, point);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un RFC");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TableEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TableEmpleado().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(TableEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
