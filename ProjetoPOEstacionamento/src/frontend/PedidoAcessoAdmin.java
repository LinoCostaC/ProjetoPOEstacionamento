package frontend;

import backend.ListaPedidoAcesso;
import backend.PedidoAcesso;
import backend.Aplicacao;
import BaseDeDados.Serializacao;
import backend.Estado;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class PedidoAcessoAdmin extends javax.swing.JFrame {

    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private ListaPedidoAcesso listaPedidoAcesso;
    private PedidoAcesso pedidoAcesso;
    private ModeloTabelaPedidoAcesso modeloTabela;
    
    
    
    public PedidoAcessoAdmin(Aplicacao aplicacao, Serializacao serializacao) {
        initComponents();
        this.serializacao = serializacao;
        this.aplicacao = aplicacao;
        this.listaPedidoAcesso = aplicacao.getListaPedidoAcesso();
        
        setTitle("Página Inicial Admnistrador");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        modeloTabela = new ModeloTabelaPedidoAcesso(listaPedidoAcesso);
        tabelaPedidoAcesso.setModel(modeloTabela);
   
    }   
    
    private void aceitarPedido(){
        int rowIndex = tabelaPedidoAcesso.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel editar
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um pedido!");
            return;
        }
 
     PedidoAcesso pa = listaPedidoAcesso.get(rowIndex);
     if(pa != null){
         pa.setEstado(Estado.ATRIBUIDO);
         JOptionPane.showMessageDialog(this, "Pedido Atribuído!");
     }
     this.modeloTabela.fireTableDataChanged();
    }
    
    private void rejeitarPedido(){
        int rowIndex = tabelaPedidoAcesso.getSelectedRow();
        //Se nenhum registo selecionado, nao é possivel editar
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(this, "Selecione um pedido!");
            return;
        }
 
     PedidoAcesso pa = listaPedidoAcesso.get(rowIndex);
     if(pa.getEstado() == Estado.PENDENTE) {
         pa.setEstado(Estado.RECUSADO);
         JOptionPane.showMessageDialog(this, "Pedido Recusado!");
     }
     this.modeloTabela.fireTableDataChanged();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPedidoAcesso = new javax.swing.JTable();
        bAceitarPedido = new javax.swing.JButton();
        bRejeitarPedido = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel1.setText("Pedidos De Acesso");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        tabelaPedidoAcesso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Estado Pedido", "Parque", "Utente"
            }
        ));
        tabelaPedidoAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPedidoAcessoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPedidoAcesso);

        bAceitarPedido.setText("Aceitar Pedido");
        bAceitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceitarPedidoActionPerformed(evt);
            }
        });

        bRejeitarPedido.setText("Rejeitar Pedido");
        bRejeitarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRejeitarPedidoActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bRejeitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bAceitarPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(bAceitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRejeitarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPedidoAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPedidoAcessoMouseClicked

    }//GEN-LAST:event_tabelaPedidoAcessoMouseClicked

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceitarPedidoActionPerformed
        aceitarPedido();
    }//GEN-LAST:event_bAceitarPedidoActionPerformed

    private void bRejeitarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRejeitarPedidoActionPerformed
        rejeitarPedido();
    }//GEN-LAST:event_bRejeitarPedidoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceitarPedido;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bRejeitarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPedidoAcesso;
    // End of variables declaration//GEN-END:variables
}
