/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import com.placeholder.PlaceHolder;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Empleado;

/**
 *
 * @author mvillanuevas
 */
public class TableEmpleado extends javax.swing.JFrame {

    PlaceHolder holder;
    utilidades.Empleado empleado = new Empleado();
    UtileriaA6 u;

    /**
     * Creates new form TableEmpleado
     */
    public TableEmpleado() throws Exception {
        initComponents();
        holder = new PlaceHolder(jTextFieldBuscar, "RFC...");
        jTableEmpleado.requestFocus();
        setExtendedState(MAXIMIZED_BOTH);// se inicia el frame maximizado
        empleado.ConsultaEmpleado(jTableEmpleado);
        setLocationRelativeTo(null);
        u = new UtileriaA6();
    }

    public void Check(int c) {
        u.setCheck(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEmpleado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTableEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Empresa", "Fecha de ingreso", "Nombre", "Paterno", "Materno", "Edad", "Telefono", "Celular", "Curp", "RFC", "Correo", "Cargo", "Calle", "Num Int", "Num Ext", "Colonia", "Municipio", "Estado", "Dias Trabajados", "Faltas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEmpleado);

        jLabel1.setText("Buscar Empleado:");

        jButton1.setText("Buscar");

        jButton2.setText("Volver");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
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

    private void jTableEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEmpleadoMouseClicked
        // TODO add your handling code here:
        
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
        
        System.out.println(u.getCheck());
        
        if (u.getCheck() == 1) {
            
            reciboA6 r = new reciboA6();
            r.jTextFieldId.setText(id);
            r.jTextFieldEmpresa.setText(empresa);
            r.jTextFieldFingreso.setText(ingreso);
            r.jTextFieldNombre.setText(nombre);
            r.jTextFieldaterno.setText(paterno);
            r.jTextFieldMaterno.setText(materno);
            r.jTextFieldRFC.setText(rfc);
            r.jTextFieldDiastrab.setText(dtrab);
            r.jTextFieldFaltas.setText(faltas);
            TableEmpleado.this.setVisible(false);
            r.setVisible(true);
            dispose();
            
        }else if(u.getCheck() == 2){
            reciboA5 r = new reciboA5();
            r.jTextFieldId.setText(id);
            r.jTextFieldEmpresa.setText(empresa);
            r.jTextFieldFingreso.setText(ingreso);
            r.jTextFieldNombre.setText(nombre);
            r.jTextFieldaterno.setText(paterno);
            r.jTextFieldMaterno.setText(materno);
            r.jTextFieldEdad.setText(edad);
            r.jTextFieldRFC.setText(rfc);
            r.jTextFieldCURP.setText(curp);
            r.jTextFielCorreo.setText(correo);
            r.jTextFieldDiastrab.setText(dtrab);
            r.jTextFieldFaltas.setText(faltas);
            TableEmpleado.this.setVisible(false);
            r.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jTableEmpleadoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        lanzador.recibo1.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEmpleado;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
