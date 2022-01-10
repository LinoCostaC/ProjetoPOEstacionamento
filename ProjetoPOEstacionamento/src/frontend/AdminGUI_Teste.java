
package frontend;

import BaseDeDados.Serializacao;
import backend.Aplicacao;
import backend.ListaUtilizador;
import backend.Parque;
import backend.Seguranca;
import backend.Utilizador;
import backend.Viatura;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class AdminGUI_Teste extends javax.swing.JFrame {

    private Aplicacao aplicacao;
    private Serializacao database;
    private ListaUtilizador listaUtilizador;
    private Parque parque;
    private Utilizador utilizador;
    private Seguranca seguranca;
    private Viatura viatura;
    //private ModeloTabelaUtilizadores modeloTabelaUtilizadores;
    
      
    
    public AdminGUI_Teste(Aplicacao aplicacao, Serializacao database) {
        initComponents();
        this.database = database;
        this.aplicacao = aplicacao;
        
        setTitle("Página Inicial Admnistrador");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
       // ModeloTabelaUtilizadores = new ModeloTabelaUtilizadores(aplicacao.getListaUtilizador());
       // tabelaSeguranca.setModel(modeloTabelaSegurancas);
        
        
        
    }    
    
      
     private void guardar() {
        database.guardar(aplicacao);
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

        jLabel1 = new javax.swing.JLabel();
        botaoTerminar = new javax.swing.JButton();
        bParques = new javax.swing.JButton();
        bPedidosAcessoAdmin = new javax.swing.JButton();
        bSegurancas = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPercentagemViaturas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCombustivelAdmin1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Administrador");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        botaoTerminar.setBackground(new java.awt.Color(255, 255, 255));
        botaoTerminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoTerminar.setText("Terminar");
        botaoTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTerminarActionPerformed(evt);
            }
        });

        bParques.setText("Registo de Parques");
        bParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bParquesActionPerformed(evt);
            }
        });

        bPedidosAcessoAdmin.setText("Pedidos de Acesso");
        bPedidosAcessoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPedidosAcessoAdminActionPerformed(evt);
            }
        });

        bSegurancas.setText("Informação");
        bSegurancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSegurancasActionPerformed(evt);
            }
        });

        jLabel2.setText("PARQUES:");

        jLabel3.setText("PEDIDOS DE ACESSO:");

        jLabel4.setText("SEGURANÇAS:");

        jLabel5.setText("VIATURAS:");

        txtPercentagemViaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPercentagemViaturasActionPerformed(evt);
            }
        });

        jLabel6.setText("Combustível Desejado:");

        jLabel7.setText("Percentagem de Viaturas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPercentagemViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCombustivelAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(57, 57, 57)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(bSegurancas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(bParques, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bPedidosAcessoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bSegurancas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bParques, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPedidosAcessoAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCombustivelAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPercentagemViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTerminarActionPerformed
        terminar();
    }//GEN-LAST:event_botaoTerminarActionPerformed

    private void tabelaSegurancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSegurancaMouseClicked

    }//GEN-LAST:event_tabelaSegurancaMouseClicked

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bApagarActionPerformed

    private void bParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bParquesActionPerformed
        RegistoParquesAdmin registoParques = new RegistoParquesAdmin(aplicacao, database);
        registoParques.setVisible(true);
    }//GEN-LAST:event_bParquesActionPerformed

    private void bSegurancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegurancasActionPerformed
        ListaSegurancas janelaListaSegurancas = new ListaSegurancas(aplicacao, database);
        janelaListaSegurancas.setVisible(true);
        
    }//GEN-LAST:event_bSegurancasActionPerformed

    private void bPedidosAcessoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPedidosAcessoAdminActionPerformed
        PedidoAcessoAdmin pedidoAcessoAdmin = new PedidoAcessoAdmin(aplicacao, database);
        pedidoAcessoAdmin.setVisible(true);
    }//GEN-LAST:event_bPedidosAcessoAdminActionPerformed

    private void txtPercentagemViaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPercentagemViaturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPercentagemViaturasActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bParques;
    private javax.swing.JButton bPedidosAcessoAdmin;
    private javax.swing.JButton bSegurancas;
    private javax.swing.JButton botaoTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCombustivelAdmin1;
    private javax.swing.JTextField txtPercentagemViaturas;
    // End of variables declaration//GEN-END:variables
}
