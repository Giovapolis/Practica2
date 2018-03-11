package practica2;

import utilidades.Archivo;
import utilidades.Empleado;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        genera_reci = new javax.swing.JButton();
        ver_reci = new javax.swing.JButton();
        empleado_alta = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        empleado_alta1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        genera_reci.setText("Generacion de Recibos");
        genera_reci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genera_reciActionPerformed(evt);
            }
        });

        ver_reci.setText("Ver Recibos Generados");

        empleado_alta.setText("Alta de Empleado");
        empleado_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleado_altaActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione una accion:");

        jLabel1.setText("Menú");

        jButton1.setText("Cargar Empleados (Excel)");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        empleado_alta1.setText("Bajas de Empleados");
        empleado_alta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleado_alta1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(empleado_alta)
                .addGap(18, 18, 18)
                .addComponent(empleado_alta1)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ver_reci, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(genera_reci, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(137, 137, 137))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleado_alta)
                    .addComponent(empleado_alta1))
                .addGap(18, 18, 18)
                .addComponent(genera_reci)
                .addGap(18, 18, 18)
                .addComponent(ver_reci)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        utilidades.Archivo excel = new Archivo();
        String ruta = excel.SelectorExcel();
        utilidades.Empleado cargar = new Empleado();
        cargar.ReadExcel(ruta);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void genera_reciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genera_reciActionPerformed
        //Acciones de boton genera_reci
        this.dispose();
        lanzador.generar.setVisible(true);
    }//GEN-LAST:event_genera_reciActionPerformed

    private void empleado_alta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleado_alta1ActionPerformed
        this.dispose();
        lanzador.elim_emp.setVisible(true);
    }//GEN-LAST:event_empleado_alta1ActionPerformed

    private void empleado_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleado_altaActionPerformed
        this.dispose();
        lanzador.altas.setVisible(true);
    }//GEN-LAST:event_empleado_altaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empleado_alta;
    private javax.swing.JButton empleado_alta1;
    private javax.swing.JButton genera_reci;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ver_reci;
    // End of variables declaration//GEN-END:variables
}