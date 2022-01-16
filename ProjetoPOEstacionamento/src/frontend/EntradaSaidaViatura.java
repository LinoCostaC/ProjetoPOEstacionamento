
package frontend;


import BaseDeDados.Serializacao;
import backend.Aplicacao;
import backend.EntradaSaida;
import backend.ListaEntradaSaida;
import backend.PedidoAcesso;
import backend.Utente;
import java.time.LocalDateTime;

import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class EntradaSaidaViatura extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private ListaEntradaSaida listaEntradaSaida;
    private EntradaSaida entradaSaida;
    private ModeloTabelaEntradaSaida modeloTabela;
    
    public EntradaSaidaViatura(Aplicacao aplicacao, Serializacao serializacao) {
        initComponents();
        this.serializacao = serializacao;
        this.aplicacao = aplicacao;
        carregaCbPedidoAcesso();
        
        setTitle("Informação de Entradas e Saídas");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        modeloTabela = new ModeloTabelaEntradaSaida(aplicacao.getListaEntradaSaida());
        tabelaEntradaSaida.setModel(modeloTabela);

    }    
   
    private void carregaCbPedidoAcesso(){
        for(int i=0; i<this.aplicacao.getListaPedidoAcesso().getTotalAcesso(); i++){
            this.cbPedidoAcesso.addItem(this.aplicacao.getListaPedidoAcesso().get(i).getPedidoUtente().getUsernameUtente());
        }
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaEntradaSaida = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bRegistoEntrada = new javax.swing.JButton();
        jlUsername = new javax.swing.JLabel();
        jlUsername1 = new javax.swing.JLabel();
        cbPedidoAcesso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        bRegistarSaida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
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
        bRegistoEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistoEntradaActionPerformed(evt);
            }
        });

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername.setText("Data de Entrada");

        jlUsername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername1.setText("Pedido de Acesso:");

        cbPedidoAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedidoAcessoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setText("Lista Entradas e Saídas");
        jLabel3.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel3.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel3.setPreferredSize(new java.awt.Dimension(174, 34));

        bRegistarSaida.setText("Registar Saída");
        bRegistarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarSaidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bRegistarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlUsername1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jlUsername))))))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(686, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jlUsername)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlUsername1)
                            .addComponent(cbPedidoAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bRegistoEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegistarSaida, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void tabelaEntradaSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaEntradaSaidaMouseClicked

    }//GEN-LAST:event_tabelaEntradaSaidaMouseClicked

    private void bRegistoEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistoEntradaActionPerformed
        String username = cbPedidoAcesso.getSelectedItem().toString();
        Utente u = aplicacao.getListaUtilizador().getUtente(username);
        PedidoAcesso pa = u.getPedidoAcesso();
        aplicacao.getListaEntradaSaida().adicionarEntradaSaida(pa.getPedidoUtente().getViaturaUtente(), pa.getPedidoParque());
        //Diminuir os lugares do parque
        int numeroLugares = pa.getPedidoParque().getNumeroLugares();
        pa.getPedidoParque().setNumeroLugares(numeroLugares - 1);
        modeloTabela.fireTableDataChanged();
            
    }//GEN-LAST:event_bRegistoEntradaActionPerformed

    private void cbPedidoAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedidoAcessoActionPerformed
        
    }//GEN-LAST:event_cbPedidoAcessoActionPerformed

    private void bRegistarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarSaidaActionPerformed
        int rowIndex = tabelaEntradaSaida.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel editar
        if (rowIndex == -1) {
            return;
        }
        EntradaSaida es = aplicacao.getListaEntradaSaida().get(rowIndex);
        es.setDataHoraSaida(LocalDateTime.now());
        
        //Aumentar os lugares do parque
        int numeroLugares = es.getParque().getNumeroLugares();
        es.getParque().setNumeroLugares(numeroLugares + 1);
        modeloTabela.fireTableDataChanged();   
    }//GEN-LAST:event_bRegistarSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bRegistarSaida;
    private javax.swing.JButton bRegistoEntrada;
    private javax.swing.JComboBox<String> cbPedidoAcesso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JLabel jlUsername1;
    private javax.swing.JTable tabelaEntradaSaida;
    // End of variables declaration//GEN-END:variables
}
