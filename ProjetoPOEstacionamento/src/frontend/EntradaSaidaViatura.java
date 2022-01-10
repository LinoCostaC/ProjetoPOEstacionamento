
package frontend;


import BaseDeDados.Serializacao;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import backend.Aplicacao;
import backend.EntradaSaida;
import backend.ListaEntradaSaida;
import backend.Utente;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;




public class EntradaSaidaViatura extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Serializacao database;
    private ListaEntradaSaida listaEntradaSaida;
    private EntradaSaida entradaSaida;
    private ModeloTabelaEntradaSaida modeloTabelaEntradaSaida;
    
    public EntradaSaidaViatura(Aplicacao aplicacao, Serializacao database) {
        initComponents();
        this.database = database;
        this.aplicacao = aplicacao;
        
        setTitle("Informação de Entradas e Saídas");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        modeloTabelaEntradaSaida = new ModeloTabelaEntradaSaida(aplicacao.getListaEntradaSaida());
        tabelaEntradaSaida.setModel(modeloTabelaEntradaSaida);
        
        
    }    
    
    
    /*
    private void carregarCb(){
        for(int i=0; i<this.aplicacao.getListaParque().size(); i++){
            this.cbViaturas.addItem(this.aplicacao.getListaViatura().get(i).getMatricula());
        }
    }*/
    
    

     private void guardar() {
        database.guardar(aplicacao);
    }
    
    private void editar() {
        int rowIndex = tabelaEntradaSaida.getSelectedRow();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        bAtualizar = new javax.swing.JButton();
        bRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntradaSaida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtRegistoEntrada = new javax.swing.JTextField();
        bRegistoEntrada = new javax.swing.JButton();
        jlUsername = new javax.swing.JLabel();
        jlUsername1 = new javax.swing.JLabel();
        cbViaturas = new javax.swing.JComboBox<>();
        jlUsername2 = new javax.swing.JLabel();
        cbParques = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAtualizar.setText("Atualizar");
        bAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtualizarActionPerformed(evt);
            }
        });

        bRemover.setText("Remover");
        bRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverActionPerformed(evt);
            }
        });

        tabelaEntradaSaida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data Entrada", "Data Saída", "Viatura", "Parque"
            }
        ));
        tabelaEntradaSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaEntradaSaidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaEntradaSaida);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Registo de Entrada de Viaturas");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        bRegistoEntrada.setText("Registar");

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername.setText("Data de Entrada");

        jlUsername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername1.setText("Viaturas");

        cbViaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlUsername2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername2.setText("Parques");

        cbParques.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("Lista Entradas e Saídas");
        jLabel3.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel3.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel3.setPreferredSize(new java.awt.Dimension(174, 34));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jlUsername1))
                            .addComponent(jlUsername2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbParques, 0, 167, Short.MAX_VALUE)
                            .addComponent(cbViaturas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(188, 188, 188))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUsername1)
                            .addComponent(cbViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUsername2)
                            .addComponent(cbParques, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(bRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(379, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtualizarActionPerformed
        modeloTabelaEntradaSaida.fireTableDataChanged();
    }//GEN-LAST:event_bAtualizarActionPerformed

    private void bRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bRemoverActionPerformed

    private void tabelaEntradaSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEntradaSaidaMouseClicked

    }//GEN-LAST:event_tabelaEntradaSaidaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAtualizar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bRegistoEntrada;
    private javax.swing.JButton bRemover;
    private javax.swing.JComboBox<String> cbParques;
    private javax.swing.JComboBox<String> cbViaturas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlUsername1;
    private javax.swing.JLabel jlUsername2;
    private javax.swing.JTable tabelaEntradaSaida;
    private javax.swing.JTextField txtRegistoEntrada;
    // End of variables declaration//GEN-END:variables
}
