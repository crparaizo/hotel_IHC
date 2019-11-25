package Oficial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Connection con;
    public Statement st;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newhotel", "root", "");
            st = (Statement) con.createStatement();

            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Algo está errado!!!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(204, 105, 255));
        jPanel3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setText("LOGIN");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(130, 30, 120, 60);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel1.setText("SENHA:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(30, 170, 80, 30);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        jLabel2.setText("E-MAIL:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 120, 80, 30);

        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel3.add(txtEmail);
        txtEmail.setBounds(120, 120, 250, 30);

        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setMargin(new java.awt.Insets(0, 14, 2, 14));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel3.add(btnSair);
        btnSair.setBounds(50, 230, 120, 40);

        btnEntrar.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel3.add(btnEntrar);
        btnEntrar.setBounds(230, 230, 120, 40);

        txtSenha.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtSenha.setPreferredSize(new java.awt.Dimension(250, 30));
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        jPanel3.add(txtSenha);
        txtSenha.setBounds(120, 170, 250, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        //this.dispose();
        //HomeGeren obj = new HomeGeren();
        //obj.setVisible(true);

        String sql = "select * from recepcionistas where email = '" + txtEmail.getText() + "'";

        try {
            ResultSet rec = st.executeQuery(sql);

            while (rec.next()) {

                if (txtEmail.getText().equals("luis@gmail.com") || txtEmail.getText().equals("candida@gmail.com")) {

                    if (txtSenha.getText().equals(rec.getString("senha"))) {
                        JOptionPane.showMessageDialog(null, "Carregando...");
                        //HomeRecep tela1 = new HomeRecep();
                        HomeGeren tela1 = new HomeGeren();
                        tela1.setVisible(true);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta!!");
                    }
                } else if (txtSenha.getText().equals(rec.getString("senha"))) {
                    JOptionPane.showMessageDialog(null, "Carregando...");
                    HomeRecep tela1 = new HomeRecep();
                    //HomeGeren tela1 = new HomeGeren();
                    tela1.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!!");
                }

                //JOptionPane.showMessageDialog(null, "Usuário inexistente no Banco de Dados!!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tem certeza que o usuário está correto?");
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
