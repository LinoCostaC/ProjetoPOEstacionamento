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

        jLabel1 = new javax.swing.JLabel();
        bViaturaSeguranca = new javax.swing.JButton();
        bInformacaoParque = new javax.swing.JButton();
        bTerminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bMudarUtilizador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Segurança");
        jLabel1.setMaximumSize(new java.awt.Dimension(174, 34));
        jLabel1.setMinimumSize(new java.awt.Dimension(174, 34));
        jLabel1.setPreferredSize(new java.awt.Dimension(174, 34));

        bViaturaSeguranca.setText("Viaturas");
        bViaturaSeguranca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViaturaSegurancaActionPerformed(evt);
            }
        });

        bInformacaoParque.setText("Parques");
        bInformacaoParque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInformacaoParqueActionPerformed(evt);
            }
        });

        bTerminar.setForeground(new java.awt.Color(255, 51, 51));
        bTerminar.setText("Terminar");
        bTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTerminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Informação Parques");

        jLabel3.setText("Entrada e Saída");

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
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(bViaturaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(bInformacaoParque, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bMudarUtilizador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bInformacaoParque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bViaturaSeguranca, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(bTerminar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTerminarActionPerformed
        this.serializacao.guardar(aplicacao);
        terminar();
    }//GEN-LAST:event_bTerminarActionPerformed

    private void bInformacaoParqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInformacaoParqueActionPerformed
        ListaDeParques listaParques = new ListaDeParques(aplicacao, serializacao);
        listaParques.setVisible(true);
    }//GEN-LAST:event_bInformacaoParqueActionPerformed

    private void bViaturaSegurancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViaturaSegurancaActionPerformed
        EntradaSaidaViatura listaEntradaSaida = new EntradaSaidaViatura(aplicacao, serializacao);
        listaEntradaSaida.setVisible(true);
    }//GEN-LAST:event_bViaturaSegurancaActionPerformed

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
    private javax.swing.JButton bInformacaoParque;
    private javax.swing.JButton bMudarUtilizador;
    private javax.swing.JButton bTerminar;
    private javax.swing.JButton bViaturaSeguranca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
