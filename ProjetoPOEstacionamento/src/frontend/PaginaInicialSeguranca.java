/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import BaseDeDados.Serializacao;
import backend.Aplicacao;
import backend.EntradaSaida;
import backend.ListaParque;
import backend.ListaUtilizador;
import backend.Parque;
import backend.Seguranca;
import backend.Utente;
import backend.Viatura;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class PaginaInicialSeguranca extends javax.swing.JFrame {

    
    public PaginaInicialSeguranca() {
        initComponents();
    }

    private Aplicacao aplicacao;
    private Serializacao database;
    private ListaUtilizador listaUtilizador;
    private Parque parque;
    private Seguranca seguranca;
    private Viatura viatura;
    private Utente utente;
    private EntradaSaida entradaSaida;
    private ListaParque listaParque;
   /* private ModeloTabelaMarcacoes modeloTabelaMarcacoes;
    private ModeloTabelaCentroVacinacao modeloTabelaCentroVacinacao;
    private ModeloTabelaUtentes modeloTabelaUtentes;
    */

    public PaginaInicialSeguranca(Aplicacao aplicacao, Parque parque, Serializacao database) {
        initComponents();
        this.database = database;
        this.aplicacao = aplicacao;
        this.parque = parque; 
         //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        setTitle("Página Inicial Gestor");
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMudarUtilizador = new javax.swing.JButton();
        botaoTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        btEscolherCentro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCombustivel = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        bFazerMarcacao = new javax.swing.JButton();
        bAtualizarMarcacoes = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtEstadoPedidoAcesso = new javax.swing.JTextField();
        bPedidoAcesso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btMudarUtilizador.setBackground(new java.awt.Color(255, 255, 255));
        btMudarUtilizador.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btMudarUtilizador.setText("Mudar Utilizador");
        btMudarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMudarUtilizadorActionPerformed(evt);
            }
        });

        botaoTerminar.setBackground(new java.awt.Color(255, 255, 255));
        botaoTerminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoTerminar.setText("Terminar");
        botaoTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTerminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Segurança");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        btEscolherCentro.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        btEscolherCentro.setText("Editar Dados");
        btEscolherCentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscolherCentroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("DADOS DA SUA VIATURA ");

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setText("Matrícula");

        txtMatricula.setEditable(false);
        txtMatricula.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel4.setText("Marca");

        txtMarca.setEditable(false);
        txtMarca.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        txtModelo.setEditable(false);
        txtModelo.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel5.setText("Combustível");

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel7.setText("Modelo");

        txtCombustivel.setEditable(false);
        txtCombustivel.setFont(new java.awt.Font("Rockwell", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btEscolherCentro, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btEscolherCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );

        jPanel.addTab("Viatura", jPanel6);

        bFazerMarcacao.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        bFazerMarcacao.setText("Fazer Marcação");
        bFazerMarcacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFazerMarcacaoActionPerformed(evt);
            }
        });

        bAtualizarMarcacoes.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        bAtualizarMarcacoes.setText("Atualizar Marcações");
        bAtualizarMarcacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarMarcacoesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("Estado do Pedido De Acesso");

        bPedidoAcesso.setText("Fazer Pedido de Acesso");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(bFazerMarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(bAtualizarMarcacoes))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtEstadoPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstadoPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(bPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bFazerMarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAtualizarMarcacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel.addTab("Pedidos de Acesso", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 322, Short.MAX_VALUE)
                .addComponent(btMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(140, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(557, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMudarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMudarUtilizadorActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente mudar de utilizador?", "A mudar...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            guardar();
            dispose();
            Login jl = new Login(aplicacao, database);
            jl.setLocationRelativeTo(null);
            jl.setVisible(true);
        }
    }//GEN-LAST:event_btMudarUtilizadorActionPerformed

    private void botaoTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTerminarActionPerformed
        terminar();
    }//GEN-LAST:event_botaoTerminarActionPerformed

    private void btEscolherCentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherCentroActionPerformed
        AssociarCentro ac = new AssociarCentro (sistema);
        ac.setVisible(true);
    }//GEN-LAST:event_btEscolherCentroActionPerformed

    private void bFazerMarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFazerMarcacaoActionPerformed
        Utente u = (Utente) sistema.getUserLigado();
        FazerMarcacao fmarc = new FazerMarcacao(sistema, u);
        fmarc.setVisible(true);
    }//GEN-LAST:event_bFazerMarcacaoActionPerformed

    private void bAtualizarMarcacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarMarcacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtualizarMarcacoesActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicialSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicialSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicialSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicialSeguranca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicialSeguranca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarMarcacoes;
    private javax.swing.JButton bFazerMarcacao;
    private javax.swing.JButton bPedidoAcesso;
    private javax.swing.JButton botaoTerminar;
    private javax.swing.JButton btEscolherCentro;
    private javax.swing.JButton btMudarUtilizador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jPanel;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField txtCombustivel;
    private javax.swing.JTextField txtEstadoPedidoAcesso;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
