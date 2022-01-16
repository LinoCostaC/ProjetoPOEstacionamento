
package frontend;

import BaseDeDados.Serializacao;
import backend.Aplicacao;
import backend.ListaPedidoAcesso;
import backend.ListaUtilizador;
import backend.ListaViatura;
import backend.Parque;
import backend.Seguranca;
import backend.Utilizador;
import backend.Viatura;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;


public class AdminGUI_Teste extends javax.swing.JFrame {

    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private ListaUtilizador listaUtilizador;
    private Parque parque;
    private Utilizador utilizador;
    private Seguranca seguranca;
    private Viatura viatura;
    private ListaViatura listaViatura;
    private ListaPedidoAcesso listaPedidoAcesso;

    
    public AdminGUI_Teste(Aplicacao aplicacao, Serializacao database) {
        initComponents();
        this.serializacao = database;
        this.aplicacao = aplicacao;
        this.listaViatura = aplicacao.getListaViatura();
        this.listaPedidoAcesso = aplicacao.getListaPedidoAcesso();
        
        
        setTitle("Página Inicial Admnistrador");
        
        //Não permite o redimensionamento da janela
        this.setResizable(false);
        
        //Mostra a centralização da janela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
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
        bPedidosAcessoAdmin = new javax.swing.JButton();
        bSegurancas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPercentagemViaturas = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCombustivelAdmin = new javax.swing.JTextField();
        bVerPercentagem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotalAngariado = new javax.swing.JTextField();
        bVerTotalAngariado = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTotalAngariadoParqueLivre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTotalAngariadoAcessoCondicionado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalAngariadoAcessoSegurado = new javax.swing.JTextField();
        bVerTotalAngariadoParqueLivre = new javax.swing.JButton();
        bTotalAngariadoAcessoCondicionado = new javax.swing.JButton();
        bTotalAngariadoLugarAssegurado = new javax.swing.JButton();
        bParques = new javax.swing.JButton();
        bMudarUtilizador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Administrador");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        botaoTerminar.setBackground(new java.awt.Color(255, 255, 255));
        botaoTerminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoTerminar.setForeground(new java.awt.Color(255, 51, 51));
        botaoTerminar.setText("Terminar");
        botaoTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoTerminarActionPerformed(evt);
            }
        });

        bPedidosAcessoAdmin.setText("Informação");
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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PEDIDOS DE ACESSO:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("SEGURANÇAS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("VIATURAS:");

        txtPercentagemViaturas.setEditable(false);
        txtPercentagemViaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPercentagemViaturasActionPerformed(evt);
            }
        });

        jLabel6.setText("Combustível Desejado:");

        jLabel7.setText("Percentagem de Viaturas:");

        txtCombustivelAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCombustivelAdminActionPerformed(evt);
            }
        });

        bVerPercentagem.setText("Ver");
        bVerPercentagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerPercentagemActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("PARQUES:");

        jLabel9.setText("Total Angariado Global:");

        txtTotalAngariado.setEditable(false);
        txtTotalAngariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAngariadoActionPerformed(evt);
            }
        });

        bVerTotalAngariado.setText("Ver");
        bVerTotalAngariado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerTotalAngariadoActionPerformed(evt);
            }
        });

        jLabel10.setText("Total Angariado Parque Livre:");

        txtTotalAngariadoParqueLivre.setEditable(false);
        txtTotalAngariadoParqueLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAngariadoParqueLivreActionPerformed(evt);
            }
        });

        jLabel11.setText("Total Angariado Lugar Assegurado:");

        txtTotalAngariadoAcessoCondicionado.setEditable(false);
        txtTotalAngariadoAcessoCondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAngariadoAcessoCondicionadoActionPerformed(evt);
            }
        });

        jLabel12.setText("Total Angariado Acesso Condicionado:");

        txtTotalAngariadoAcessoSegurado.setEditable(false);
        txtTotalAngariadoAcessoSegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalAngariadoAcessoSeguradoActionPerformed(evt);
            }
        });

        bVerTotalAngariadoParqueLivre.setText("Ver");
        bVerTotalAngariadoParqueLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerTotalAngariadoParqueLivreActionPerformed(evt);
            }
        });

        bTotalAngariadoAcessoCondicionado.setText("Ver");
        bTotalAngariadoAcessoCondicionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTotalAngariadoAcessoCondicionadoActionPerformed(evt);
            }
        });

        bTotalAngariadoLugarAssegurado.setText("Ver");
        bTotalAngariadoLugarAssegurado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTotalAngariadoLugarAsseguradoActionPerformed(evt);
            }
        });

        bParques.setText("Registo de Parques");
        bParques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bParquesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bParques)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalAngariadoAcessoCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bTotalAngariadoAcessoCondicionado))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtTotalAngariado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bVerTotalAngariado))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTotalAngariadoParqueLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bVerTotalAngariadoParqueLivre))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtTotalAngariadoAcessoSegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(bTotalAngariadoLugarAssegurado))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalAngariado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerTotalAngariado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotalAngariadoParqueLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVerTotalAngariadoParqueLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalAngariadoAcessoSegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTotalAngariadoLugarAssegurado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtTotalAngariadoAcessoCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bTotalAngariadoAcessoCondicionado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bParques, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bMudarUtilizador.setBackground(new java.awt.Color(255, 255, 255));
        bMudarUtilizador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bMudarUtilizador.setForeground(new java.awt.Color(255, 51, 51));
        bMudarUtilizador.setText("Mudar Utilizador");
        bMudarUtilizador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMudarUtilizadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCombustivelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bVerPercentagem))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(bSegurancas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bPedidosAcessoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtPercentagemViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)))
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSegurancas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPedidosAcessoAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCombustivelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(bVerPercentagem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtPercentagemViaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoTerminarActionPerformed
        this.serializacao.guardar(aplicacao);
        terminar();
    }//GEN-LAST:event_botaoTerminarActionPerformed

    private void tabelaSegurancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSegurancaMouseClicked

    }//GEN-LAST:event_tabelaSegurancaMouseClicked

    private void bApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bApagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bApagarActionPerformed

    private void bParquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bParquesActionPerformed
        RegistoParquesAdmin registoParques = new RegistoParquesAdmin(aplicacao, serializacao);
        registoParques.setVisible(true);
    }//GEN-LAST:event_bParquesActionPerformed

    private void bSegurancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSegurancasActionPerformed
        ListaSegurancas janelaListaSegurancas = new ListaSegurancas(aplicacao, serializacao);
        janelaListaSegurancas.setVisible(true);
        
    }//GEN-LAST:event_bSegurancasActionPerformed

    private void bPedidosAcessoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPedidosAcessoAdminActionPerformed
        PedidoAcessoAdmin pedidoAcessoAdmin = new PedidoAcessoAdmin(aplicacao, serializacao);
        pedidoAcessoAdmin.setVisible(true);
    }//GEN-LAST:event_bPedidosAcessoAdminActionPerformed

    private void txtPercentagemViaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPercentagemViaturasActionPerformed
        
    }//GEN-LAST:event_txtPercentagemViaturasActionPerformed

    private void txtCombustivelAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCombustivelAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCombustivelAdminActionPerformed

    private void txtTotalAngariadoParqueLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAngariadoParqueLivreActionPerformed
        
    }//GEN-LAST:event_txtTotalAngariadoParqueLivreActionPerformed

    private void bVerPercentagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerPercentagemActionPerformed
        String combustivel = txtCombustivelAdmin.getText();
        String percentagem = String.valueOf(listaViatura.getPercentagemCombustível(combustivel));
        txtPercentagemViaturas.setText(percentagem + " % ");
    }//GEN-LAST:event_bVerPercentagemActionPerformed

    private void bVerTotalAngariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerTotalAngariadoActionPerformed
        String totalAngariado = String.valueOf(listaPedidoAcesso.calcularTotalAngariado());
        txtTotalAngariado.setText(totalAngariado);
    }//GEN-LAST:event_bVerTotalAngariadoActionPerformed

    private void txtTotalAngariadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAngariadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalAngariadoActionPerformed

    private void txtTotalAngariadoAcessoCondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAngariadoAcessoCondicionadoActionPerformed
        
    }//GEN-LAST:event_txtTotalAngariadoAcessoCondicionadoActionPerformed

    private void txtTotalAngariadoAcessoSeguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalAngariadoAcessoSeguradoActionPerformed
        
    }//GEN-LAST:event_txtTotalAngariadoAcessoSeguradoActionPerformed

    private void bVerTotalAngariadoParqueLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerTotalAngariadoParqueLivreActionPerformed
        String totalAngariadoPL = String.valueOf(listaPedidoAcesso.calcularValorParqueLivre());
        txtTotalAngariadoParqueLivre.setText(totalAngariadoPL);
    }//GEN-LAST:event_bVerTotalAngariadoParqueLivreActionPerformed

    private void bTotalAngariadoAcessoCondicionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTotalAngariadoAcessoCondicionadoActionPerformed
        String totalAngariadoAC = String.valueOf(listaPedidoAcesso.calcularValorParqueCondicionado());
        txtTotalAngariadoAcessoCondicionado.setText(totalAngariadoAC);
    }//GEN-LAST:event_bTotalAngariadoAcessoCondicionadoActionPerformed

    private void bTotalAngariadoLugarAsseguradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTotalAngariadoLugarAsseguradoActionPerformed
        String totalAngariadoLA = String.valueOf(listaPedidoAcesso.calcularValorLugarAssegurado());
        txtTotalAngariadoAcessoSegurado.setText(totalAngariadoLA);
    }//GEN-LAST:event_bTotalAngariadoLugarAsseguradoActionPerformed

    private void bMudarUtilizadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMudarUtilizadorActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente mudar de utilizador?", "A mudar...", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            this.serializacao.guardar(aplicacao);
            dispose();
            Login jl = new Login(aplicacao, serializacao);
            jl.setLocationRelativeTo(null);
            jl.setVisible(true);
        }
    }//GEN-LAST:event_bMudarUtilizadorActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bMudarUtilizador;
    private javax.swing.JButton bParques;
    private javax.swing.JButton bPedidosAcessoAdmin;
    private javax.swing.JButton bSegurancas;
    private javax.swing.JButton bTotalAngariadoAcessoCondicionado;
    private javax.swing.JButton bTotalAngariadoLugarAssegurado;
    private javax.swing.JButton bVerPercentagem;
    private javax.swing.JButton bVerTotalAngariado;
    private javax.swing.JButton bVerTotalAngariadoParqueLivre;
    private javax.swing.JButton botaoTerminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCombustivelAdmin;
    private javax.swing.JTextField txtPercentagemViaturas;
    private javax.swing.JTextField txtTotalAngariado;
    private javax.swing.JTextField txtTotalAngariadoAcessoCondicionado;
    private javax.swing.JTextField txtTotalAngariadoAcessoSegurado;
    private javax.swing.JTextField txtTotalAngariadoParqueLivre;
    // End of variables declaration//GEN-END:variables
}
