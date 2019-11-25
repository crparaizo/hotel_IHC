
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

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "");
            st = (Statement) con.createStatement();

            JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Algo está errado!!!");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelUsuario = new javax.swing.JLabel();
        LabelSenha = new javax.swing.JLabel();
        BotaoEntrar = new javax.swing.JButton();
        CampoUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelUsuario.setText("Usuário:");

        LabelSenha.setText("Senha:");

        BotaoEntrar.setText("Entrar");
        BotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEntrarActionPerformed(evt);
            }
        });

        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(BotaoEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelUsuario)
                            .addComponent(LabelSenha))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoSenha)
                            .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario)
                    .addComponent(CampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSenha)
                    .addComponent(CampoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(BotaoEntrar)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEntrarActionPerformed

        //String sql1 = "select * from gerentes where email = '" + CampoUsuario.getText() + "'";
        String sql2 = "select * from recepcionistas where email = '" + CampoUsuario.getText() + "'";

        try {
            //ResultSet ger = st.executeQuery(sql1);
            ResultSet rec = st.executeQuery(sql2);

            /*
            while (ger.next()) {
                if (CampoSenha.getText().equals(ger.getString("senha"))) {
                    JOptionPane.showMessageDialog(null, "Carregando...");
                    Reservas tela1 = new Reservas();
                    tela1.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Senha incorreta!!");
                }
            }
             */
            while (rec.next()) {

                if (CampoSenha.getText().equals(rec.getString("senha"))) {
                    JOptionPane.showMessageDialog(null, "Carregando...");
                    Reservas tela1 = new Reservas();
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
    }//GEN-LAST:event_BotaoEntrarActionPerformed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton BotaoEntrar;
    private javax.swing.JPasswordField CampoSenha;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel LabelSenha;
    private javax.swing.JLabel LabelUsuario;
    // End of variables declaration//GEN-END:variables
}