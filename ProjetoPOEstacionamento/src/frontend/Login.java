
package frontend;

import BaseDeDados.Serializacao;
import backend.Administrador;
import backend.Aplicacao;
import backend.Seguranca;
import backend.Utente;
import backend.PedidoAcesso;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class Login extends javax.swing.JFrame {
    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private String usern; 
    private String showusern; 
    private String passw;
    private String showpassw;
    private PedidoAcesso pedidoacesso;
    
     
     public Login(Aplicacao apli ,Serializacao serializacao) {
        initComponents();
        this.aplicacao = apli;
        this.serializacao = serializacao;
         //Para manter o dimensionamento da janela
         this.setResizable(false);
         //Mostrar a janela centralizada
         this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
     }
        
        private void login() {                
        
        if (txtUsername.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o nome de utilizador!");            
            txtUsername.requestFocus();
            return;
        }
        
        if (pfPassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Introduza a password!");
            pfPassword.requestFocus();
            return;
        } 
        
            usern = txtUsername.getText() ;
            showusern = usern.replaceAll("\\s+$", "");
            passw = new String (pfPassword.getPassword());
            showpassw = passw.replaceAll("\\s+$", "");
        
        
        if (!aplicacao.autenticarUser(showusern, showpassw)){
            JOptionPane.showMessageDialog(this, "Credenciais inválidas!");
            txtUsername.requestFocus();            
        }else{
            aplicacao.autenticarUser(showusern, showpassw);
            if (aplicacao.getUtilizadorLigado() instanceof Utente) {
                UtenteGUI principal= new UtenteGUI(aplicacao,serializacao,pedidoacesso);
                principal.setVisible(true);
            }
            
            if (aplicacao.getUtilizadorLigado() instanceof Administrador) {
                
                AdminGUI_Teste principal = new AdminGUI_Teste(aplicacao,serializacao);
                principal.setVisible(true);
            }
            
            if (aplicacao.getUtilizadorLigado() instanceof Seguranca) {
                
                SegurancaGUI principal= new SegurancaGUI(aplicacao,serializacao);
                principal.setVisible(true);
            }
            JOptionPane.showMessageDialog(null, "Utilizador logado com sucesso"); 
            
            
            this.dispose();            
        }               
    } 
   
     private void terminar() {
        if (JOptionPane.showConfirmDialog(null,
                "Tem a certeza que pretende terminar o programa?",
                "Terminar",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            aplicacao.terminar();
        }
    }
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsername = new javax.swing.JTextField();
        jlUsername = new javax.swing.JLabel();
        jlPassword = new javax.swing.JLabel();
        cbMostrarPassword = new javax.swing.JCheckBox();
        jlLogin = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jbRegistar = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jlUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlUsername.setText("Username");

        jlPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlPassword.setText("Password");

        cbMostrarPassword.setText("Mostrar Password");
        cbMostrarPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMostrarPasswordActionPerformed(evt);
            }
        });

        jlLogin.setFont(new java.awt.Font("Dubai", 1, 48)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(255, 51, 51));
        jlLogin.setText("LOGIN");

        jbEntrar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbSair.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jbRegistar.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jbRegistar.setText("Registar");
        jbRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistarActionPerformed(evt);
            }
        });

        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbMostrarPassword)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlUsername)
                                    .addComponent(jlPassword))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsername)
                                    .addComponent(pfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbRegistar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                            .addComponent(jbEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlUsername))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPassword)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbMostrarPassword)
                .addGap(18, 18, 18)
                .addComponent(jbEntrar)
                .addGap(18, 18, 18)
                .addComponent(jbRegistar)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbMostrarPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMostrarPasswordActionPerformed
        if (cbMostrarPassword.isSelected()) {
            pfPassword.setEchoChar((char) 0);
        } else {
            pfPassword.setEchoChar('•');
        } 
    }//GEN-LAST:event_cbMostrarPasswordActionPerformed

    private void jbRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistarActionPerformed
    RegistarUser janela = new RegistarUser(aplicacao, serializacao);
    janela.setVisible(true);
    dispose();
    }//GEN-LAST:event_jbRegistarActionPerformed

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        serializacao.guardar(aplicacao);
        terminar();
    }//GEN-LAST:event_jbSairActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
    login(); // TODO add your handling code here:
    }//GEN-LAST:event_jbEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbMostrarPassword;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbRegistar;
    private javax.swing.JButton jbSair;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlPassword;
    private javax.swing.JLabel jlUsername;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
