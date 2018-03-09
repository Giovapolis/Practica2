package practica2;

public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        empleado_alta = new javax.swing.JButton();
        genera_reci = new javax.swing.JButton();
        ver_reci = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú");

        jLabel1.setText("Menú");

        jLabel2.setText("Seleccione una accion:");

        empleado_alta.setText("Alta de Empleado");

        genera_reci.setText("Generacion de Recibos");
        genera_reci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genera_reciActionPerformed(evt);
            }
        });

        ver_reci.setText("Ver Recibos Generados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(genera_reci)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(empleado_alta)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(168, 168, 168)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel2))))
                            .addGap(15, 15, 15)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(ver_reci)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(empleado_alta)
                .addGap(18, 18, 18)
                .addComponent(genera_reci)
                .addGap(18, 18, 18)
                .addComponent(ver_reci)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void genera_reciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genera_reciActionPerformed
        //Acciones de boton genera_reci
        this.dispose();
        lanzador.generar.setVisible(true);
    }//GEN-LAST:event_genera_reciActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton empleado_alta;
    private javax.swing.JButton genera_reci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton ver_reci;
    // End of variables declaration//GEN-END:variables
}
