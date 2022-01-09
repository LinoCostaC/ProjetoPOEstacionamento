
package frontend;



import backend.Aplicacao;
import backend.Utente;
import BaseDeDados.Serializacao;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class RegistarUser extends javax.swing.JFrame {

    private Aplicacao aplicacao;
    private Serializacao serializacao;
    private int avancar=0;
    private String erro;

    public RegistarUser(Aplicacao aplicacao, Serializacao serializacao) {
        initComponents();
        this.aplicacao = aplicacao;
        this.serializacao = serializacao;

    }

    private void registar() {
          
        if (txtUsernameUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu Username", "Username EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtUsernameUser.requestFocus();
        }
       
        if (txtPasswordUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza a sua Password!", "PASSWORD EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtPasswordUser.requestFocus();
        }
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu Nome!", "NOME EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtNome.requestFocus();  
        }
        if(txtTelefoneUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Introduza o seu telefone", "Telefone EM FALTA", JOptionPane.WARNING_MESSAGE);
            txtUsernameUser.requestFocus();
        }
        
        String nome = txtNome.getText();
        String username = txtUsernameUser.getText();
        String password = txtPasswordUser.getText();
        String telefone = txtTelefoneUser.getText();

        aplicacao.getListaUtilizador().adicionar(new Utente(username,password,nome,telefone));
        Login login = new Login(aplicacao, serializacao);
        login.setVisible(true);
    }
    private void guardar() {
            String username = txtUsernameUser.getText() ;
            String showusern = username.replaceAll("\\s+$", "");
            String password = txtPasswordUser.getText();
            String showpassw = password.replaceAll("\\s+$", "");
            
         if (txtUsernameUser.getText().isEmpty()){
            avancar = 0;
            erro = "O campo username está vazio";
        }
        
        else if (txtPasswordUser.getText().isEmpty()) {
            avancar = 0;
            erro = "O campo password está vazio";
        }
        else if (txtNome.getText().isEmpty()) {
            avancar = 0;
            erro = "O campo nome está vazio";
        }
        else if (txtTelefoneUser.getText().isEmpty()) {
            avancar = 0;
            erro = "O campo telefone está vazio";           
        }   
        else {
            JOptionPane.showMessageDialog(this,erro);
  
        }
        JOptionPane.showMessageDialog(this, "Utilizador adicionada com sucesso.");
        fechar();
        
    }


        public void fechar() {
            dispose();
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsernameUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPasswordUser = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        bFechar = new javax.swing.JButton();
        bRegistar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtTelefoneUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel6.setText("Registar User");

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel1.setText("Username:");

        txtUsernameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameUserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel2.setText("Password:");

        txtPasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordUserActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");

        bFechar.setBackground(new java.awt.Color(204, 204, 204));
        bFechar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        bFechar.setText("Fechar");
        bFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFecharActionPerformed(evt);
            }
        });

        bRegistar.setBackground(new java.awt.Color(204, 204, 204));
        bRegistar.setFont(new java.awt.Font("Rockwell", 1, 12)); // NOI18N
        bRegistar.setText("Registar");
        bRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistarActionPerformed(evt);
            }
        });

        jLabel4.setText("Telefone:");

        txtTelefoneUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(25, 25, 25))))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUsernameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTelefoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 17, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 172, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTelefoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsernameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bRegistar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 29, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 274, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFecharActionPerformed
    fechar();

    }//GEN-LAST:event_bFecharActionPerformed

    private void bRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistarActionPerformed
    guardar();
    }//GEN-LAST:event_bRegistarActionPerformed

    private void txtUsernameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameUserActionPerformed
    registar();
    }//GEN-LAST:event_txtUsernameUserActionPerformed

    private void txtPasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordUserActionPerformed

    private void txtTelefoneUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bFechar;
    private javax.swing.JButton bRegistar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPasswordUser;
    private javax.swing.JTextField txtTelefoneUser;
    private javax.swing.JTextField txtUsernameUser;
    // End of variables declaration//GEN-END:variables
}
