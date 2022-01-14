
package frontend;


import BaseDeDados.Serializacao;
import backend.Seguranca;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import backend.ListaUtilizador;
import backend.Aplicacao;
import backend.ListaPedidoAcesso;
import backend.PedidoAcesso;
import backend.Utilizador;




public class ListaSegurancas extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Serializacao database;
    private ListaUtilizador listaSegurancas;
    private Seguranca seguranca;
    private Utilizador utilizador;
    private ModeloTabelaListaSeguranca modeloTabelaListaSeguranca;
    
    public ListaSegurancas(Aplicacao aplicacao, Serializacao database) {
        initComponents();
        this.database = database;
        this.aplicacao = aplicacao;
        
        setTitle("Informação de Seguranças");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        modeloTabelaListaSeguranca = new ModeloTabelaListaSeguranca(aplicacao.getListaUtilizador().listaSegurancas());
        tabelaSeguranca.setModel(modeloTabelaListaSeguranca);
        
        
    }   
    
      private void registar() {
          
        if (txtUsernameSeguranca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu Username", "Username EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtUsernameSeguranca.requestFocus();
        }
       
        if (txtPasswordSeguranca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua Password!", "PASSWORD EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtPasswordSeguranca.requestFocus();
        }
        if (txtNomeSeguranca.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu Nome!", "NOME EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtNomeSeguranca.requestFocus();  
        }
        
        
        String nome = txtNomeSeguranca.getText();
        String username = txtUsernameSeguranca.getText();
        String password = txtPasswordSeguranca.getText();
        

        aplicacao.getListaUtilizador().adicionar(new Seguranca(username,password,nome));
        
    } 
      
      public void removerSeguranca() {
        int rowIndex = tabelaSeguranca.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel editar
        if (rowIndex == -1) {
            return;
        }

        String username = (String) modeloTabelaListaSeguranca.getValueAt(rowIndex, 1);
        
        
        seguranca = aplicacao.getListaUtilizador().getSeguranca(username);
        
        if (JOptionPane.showConfirmDialog(null,
                "Deseja eliminar o Segurança?",
                "Eliminado",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            seguranca = aplicacao.getListaUtilizador().getSeguranca(username);
            aplicacao.getListaUtilizador().remover(seguranca);
            }
        modeloTabelaListaSeguranca.fireTableDataChanged();
        }
    
    
    private void editar() {
        int rowIndex = tabelaSeguranca.getSelectedRow();
        
        
    }
    
  
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSeguranca = new javax.swing.JTable();
        bRemover = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeSeguranca = new javax.swing.JTextField();
        txtUsernameSeguranca = new javax.swing.JTextField();
        txtPasswordSeguranca = new javax.swing.JTextField();
        bRegistarSeguranca = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelaSeguranca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Password", "Nome"
            }
        ));
        tabelaSeguranca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSegurancaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSeguranca);

        bRemover.setText("Remover");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Registar Segurança");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setText("Lista de Seguranças");
        jLabel2.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel2.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel2.setPreferredSize(new java.awt.Dimension(174, 34));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Password:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Nome:");

        bRegistarSeguranca.setText("Registar");
        bRegistarSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarSegurancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bRegistarSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtNomeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtUsernameSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPasswordSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(583, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsernameSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasswordSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNomeSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(bRegistarSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(378, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaSegurancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSegurancaMouseClicked

    }//GEN-LAST:event_tabelaSegurancaMouseClicked

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        modeloTabelaListaSeguranca.fireTableDataChanged();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bRegistarSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarSegurancaActionPerformed
        registar();
        this.dispose();
    }//GEN-LAST:event_bRegistarSegurancaActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        removerSeguranca();
    }//GEN-LAST:event_bRemoverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bRegistarSeguranca;
    private javax.swing.JButton bRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSeguranca;
    private javax.swing.JTextField txtNomeSeguranca;
    private javax.swing.JTextField txtPasswordSeguranca;
    private javax.swing.JTextField txtUsernameSeguranca;
    // End of variables declaration//GEN-END:variables
}
