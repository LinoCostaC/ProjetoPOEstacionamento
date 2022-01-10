
package frontend;


public class RegistoViatura extends javax.swing.JFrame {

    
    public RegistoViatura() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bRegistoViatura = new javax.swing.JButton();
        labelParques1 = new javax.swing.JLabel();
        labelNomeParque1 = new javax.swing.JLabel();
        txtMatriculaViatura = new javax.swing.JTextField();
        txtMarcaViatura = new javax.swing.JTextField();
        labelNomeParque2 = new javax.swing.JLabel();
        labelNomeParque = new javax.swing.JLabel();
        txtModeloViatura = new javax.swing.JTextField();
        bCancelarRegistoViatura = new javax.swing.JButton();
        txtCombustivelViatura = new javax.swing.JTextField();
        labelNomeParque3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bRegistoViatura.setText("Registar");

        labelParques1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        labelParques1.setText("Registar Viatura");
        labelParques1.setMaximumSize(new java.awt.Dimension(174, 34));
        labelParques1.setMinimumSize(new java.awt.Dimension(174, 34));
        labelParques1.setPreferredSize(new java.awt.Dimension(174, 34));

        labelNomeParque1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque1.setText("Matrícula");
        labelNomeParque1.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque1.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque1.setPreferredSize(new java.awt.Dimension(174, 34));

        txtMatriculaViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatriculaViaturaActionPerformed(evt);
            }
        });

        txtMarcaViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaViaturaActionPerformed(evt);
            }
        });

        labelNomeParque2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque2.setText("Marca");
        labelNomeParque2.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setPreferredSize(new java.awt.Dimension(174, 34));

        labelNomeParque.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque.setText("Modelo");
        labelNomeParque.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setPreferredSize(new java.awt.Dimension(174, 34));

        txtModeloViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloViaturaActionPerformed(evt);
            }
        });

        bCancelarRegistoViatura.setText("Cancelar");
        bCancelarRegistoViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarRegistoViaturaActionPerformed(evt);
            }
        });

        txtCombustivelViatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustivelViaturaActionPerformed(evt);
            }
        });

        labelNomeParque3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque3.setText("Combustível");
        labelNomeParque3.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque3.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque3.setPreferredSize(new java.awt.Dimension(174, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelParques1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNomeParque3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCancelarRegistoViatura, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModeloViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCombustivelViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMarcaViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMatriculaViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bRegistoViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelParques1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatriculaViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeloViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCombustivelViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelarRegistoViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bRegistoViatura, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatriculaViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatriculaViaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatriculaViaturaActionPerformed

    private void txtMarcaViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaViaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaViaturaActionPerformed

    private void txtModeloViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloViaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloViaturaActionPerformed

    private void bCancelarRegistoViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarRegistoViaturaActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarRegistoViaturaActionPerformed

    private void txtCombustivelViaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustivelViaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustivelViaturaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarRegistoViatura;
    private javax.swing.JButton bRegistoViatura;
    private javax.swing.JLabel labelNomeParque;
    private javax.swing.JLabel labelNomeParque1;
    private javax.swing.JLabel labelNomeParque2;
    private javax.swing.JLabel labelNomeParque3;
    private javax.swing.JLabel labelParques1;
    private javax.swing.JTextField txtCombustivelViatura;
    private javax.swing.JTextField txtMarcaViatura;
    private javax.swing.JTextField txtMatriculaViatura;
    private javax.swing.JTextField txtModeloViatura;
    // End of variables declaration//GEN-END:variables
}
