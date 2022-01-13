
package frontend;

import BaseDeDados.Serializacao;
import backend.Aplicacao;
import backend.Parque;
import backend.ListaParque;
import backend.Utente;
import javax.swing.JOptionPane;


public class RegistoParquesAdmin extends javax.swing.JFrame {

    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private int avancar=0;
    private String erro;

    public RegistoParquesAdmin(Aplicacao aplicacao, Serializacao serializacao) {
        initComponents();
        this.aplicacao = aplicacao;
        this.serializacao = serializacao;

    }

    private void registar() {
          
        if (txtNomeParque.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o nome do parque", "Nome do parque em falta", JOptionPane.WARNING_MESSAGE);
            txtNomeParque.requestFocus();
        }
       
        if (txtNumeroLugares.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o numero de lugares!", "Numero de lugares em falta", JOptionPane.WARNING_MESSAGE);
            txtNumeroLugares.requestFocus();
        }
        if (txtPreco.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o preço!", "Preço do parque em falta", JOptionPane.WARNING_MESSAGE);
            txtPreco.requestFocus();  
        }
       
        
        String nome = txtNomeParque.getText();
        String numeroLugares = txtNumeroLugares.getText();
        String preco = txtPreco.getText();
        //not sure em relação a esse construtor (diferentes tipos)
       // aplicacao.getListaParque().adicionarParque(new Parque(nome, numeroLugares, preco));
        
    }
    


        public void fechar() {
            dispose();
        }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNomeParque = new javax.swing.JLabel();
        txtNumeroLugares = new javax.swing.JTextField();
        labelParques1 = new javax.swing.JLabel();
        labelNomeParque1 = new javax.swing.JLabel();
        txtNomeParque = new javax.swing.JTextField();
        labelNomeParque2 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        bRegistoParque = new javax.swing.JButton();
        bCancelarRegistoParque = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNomeParque.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque.setText("Preço");
        labelNomeParque.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque.setPreferredSize(new java.awt.Dimension(174, 34));

        txtNumeroLugares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroLugaresActionPerformed(evt);
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

        txtNomeParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeParqueActionPerformed(evt);
            }
        });

        labelNomeParque2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        labelNomeParque2.setText("Numero Lugares");
        labelNomeParque2.setMaximumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setMinimumSize(new java.awt.Dimension(174, 34));
        labelNomeParque2.setPreferredSize(new java.awt.Dimension(174, 34));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });

        bRegistoParque.setText("Registar");
        bRegistoParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistoParqueActionPerformed(evt);
            }
        });

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
                                .addComponent(txtNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bCancelarRegistoParque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bRegistoParque, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(txtNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroLugares, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNomeParque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bCancelarRegistoParque, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(bRegistoParque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroLugaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroLugaresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroLugaresActionPerformed

    private void txtNomeParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeParqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeParqueActionPerformed

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    private void bCancelarRegistoParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarRegistoParqueActionPerformed
        fechar();
        
    }//GEN-LAST:event_bCancelarRegistoParqueActionPerformed

    private void bRegistoParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistoParqueActionPerformed
        registar();
        
    }//GEN-LAST:event_bRegistoParqueActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelarRegistoParque;
    private javax.swing.JButton bRegistoParque;
    private javax.swing.JLabel labelNomeParque;
    private javax.swing.JLabel labelNomeParque1;
    private javax.swing.JLabel labelNomeParque2;
    private javax.swing.JLabel labelParques1;
    private javax.swing.JTextField txtNomeParque;
    private javax.swing.JTextField txtNumeroLugares;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
