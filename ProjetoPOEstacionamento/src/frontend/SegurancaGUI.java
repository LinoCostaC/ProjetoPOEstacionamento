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
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class SegurancaGUI extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Seguranca segurancaligado;
    private Serializacao serializacao;

    
   public SegurancaGUI(Aplicacao apli, Serializacao database) {
       initComponents();
        aplicacao = apli;
        segurancaligado=(Seguranca) aplicacao.getUtilizadorLigado();
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
    private void terminar() {
        if (JOptionPane.showConfirmDialog(null,
                "Deseja realmente terminar o programa?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            aplicacao.terminar();
        }
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMudarUtilizador = new javax.swing.JButton();
        botaoTerminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bViaturaSeguranca = new javax.swing.JButton();
        bPedidoAcessoSeguranca = new javax.swing.JButton();

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

        bViaturaSeguranca.setText("Viaturas");

        bPedidoAcessoSeguranca.setText("Parques");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(bViaturaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(btMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(bPedidoAcessoSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bViaturaSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(bPedidoAcessoSeguranca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
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
        terminar();
    }//GEN-LAST:event_botaoTerminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPedidoAcessoSeguranca;
    private javax.swing.JButton bViaturaSeguranca;
    private javax.swing.JButton botaoTerminar;
    private javax.swing.JButton btMudarUtilizador;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
