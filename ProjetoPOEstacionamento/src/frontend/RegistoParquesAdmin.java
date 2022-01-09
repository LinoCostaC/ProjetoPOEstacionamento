
package frontend;

import BaseDeDados.Serializacao;
import backend.Aplicacao;


public class RegistoParquesAdmin extends javax.swing.JFrame {
        private Aplicacao aplicacao;
        private Serializacao database;
    
    public RegistoParquesAdmin(Aplicacao aplicacao, Serializacao database) {
        initComponents();
        this.aplicacao = aplicacao;
        this. database = database;
    }

    private RegistoParquesAdmin() {
        
    }

    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeParque = new javax.swing.JLabel();
        txtNomeParque = new javax.swing.JTextField();
        labelParques1 = new javax.swing.JLabel();
        labelNomeParque1 = new javax.swing.JLabel();
        txtNomeParque1 = new javax.swing.JTextField();
        labelNomeParque2 = new javax.swing.JLabel();
        txtNomeParque2 = new javax.swing.JTextField();
        bRegistoParque = new javax.swing.JButton();
        bCancelarRegistoParque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeParque.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque.setText("Preço");
        labelNomeParque.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setPreferredSize(new java.awt.Dimension(174, 34));

        txtNomeParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeParqueActionPerformed(evt);
            }
        });

        labelParques1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        labelParques1.setText("Registar Parques");
        labelParques1.setMaximumSize(new java.awt.Dimension(174, 34));
        labelParques1.setMinimumSize(new java.awt.Dimension(174, 34));
        labelParques1.setPreferredSize(new java.awt.Dimension(174, 34));

        labelNomeParque1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque1.setText("Nome Parque");
        labelNomeParque1.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque1.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque1.setPreferredSize(new java.awt.Dimension(174, 34));

        txtNomeParque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeParque1ActionPerformed(evt);
            }
        });

        labelNomeParque2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque2.setText("Numero Lugares");
        labelNomeParque2.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setPreferredSize(new java.awt.Dimension(174, 34));

        txtNomeParque2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeParque2ActionPerformed(evt);
            }
        });

        bRegistoParque.setText("Registar");

        bCancelarRegistoParque.setText("Cancelar");
        bCancelarRegistoParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarRegistoParqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCancelarRegistoParque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRegistoParque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelParques1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelParques1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bCancelarRegistoParque, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(bRegistoParque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeParqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeParqueActionPerformed

    private void txtNomeParque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeParque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeParque1ActionPerformed

    private void txtNomeParque2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeParque2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeParque2ActionPerformed

    private void bCancelarRegistoParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarRegistoParqueActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarRegistoParqueActionPerformed

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
            java.util.logging.Logger.getLogger(RegistoParquesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistoParquesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistoParquesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistoParquesAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistoParquesAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarRegistoParque;
    private javax.swing.JButton bRegistoParque;
    private javax.swing.JLabel labelNomeParque;
    private javax.swing.JLabel labelNomeParque1;
    private javax.swing.JLabel labelNomeParque2;
    private javax.swing.JLabel labelParques1;
    private javax.swing.JTextField txtNomeParque;
    private javax.swing.JTextField txtNomeParque1;
    private javax.swing.JTextField txtNomeParque2;
    // End of variables declaration//GEN-END:variables
}
