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


public class SegurancaGUI extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Seguranca segurancaligado;
    Serializacao serializacao;

    
   public SegurancaGUI(Aplicacao apli, Serializacao database) {
       initComponents();
        aplicacao = apli;
        segurancaligado=(Seguranca) aplicacao.utilizadorLigado;
        serializacao = database;
    }
    
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

    public SegurancaGUI(Aplicacao aplicacao, Parque parque, Serializacao database) {
        this.serializacao = database;
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
        jPanel7 = new javax.swing.JPanel();
        bFazerMarcacao = new javax.swing.JButton();
        bAtualizarMarcacoes = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(bFazerMarcacao, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(bAtualizarMarcacoes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(409, 409, 409)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 253, Short.MAX_VALUE)
                .addComponent(btMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(139, 139, 139)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
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
                .addContainerGap(483, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(123, 123, 123)
                    .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMudarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMudarUtilizadorActionPerformed
       /* if (JOptionPane.showConfirmDialog(null, "Deseja realmente mudar de utilizador?", "A mudar...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
           guardar();
            dispose();
            Login jl = new Login(aplicacao, database);
            jl.setLocationRelativeTo(null);
            jl.setVisible(true);
        }*/
    }//GEN-LAST:event_btMudarUtilizadorActionPerformed

    private void botaoTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTerminarActionPerformed
        //terminar();
    }//GEN-LAST:event_botaoTerminarActionPerformed

    private void bFazerMarcacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFazerMarcacaoActionPerformed
        Utente u = (Utente) aplicacao.getUtilizadorLigado();
        //FazerMarcacao fmarc = new FazerMarcacao(aplicacao, );
        //fmarc.setVisible(true);
    }//GEN-LAST:event_bFazerMarcacaoActionPerformed

    private void bAtualizarMarcacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarMarcacoesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bAtualizarMarcacoesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizarMarcacoes;
    private javax.swing.JButton bFazerMarcacao;
    private javax.swing.JButton botaoTerminar;
    private javax.swing.JButton btMudarUtilizador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jPanel;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
