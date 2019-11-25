
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reservas extends javax.swing.JFrame {

    public Connection con;
    public Statement st;

    public Reservas() {
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

        CampoTitulo = new javax.swing.JTextField();
        CampoQuartos = new javax.swing.JTextField();
        CampoValor = new javax.swing.JTextField();
        CampoDescricao = new javax.swing.JTextField();
        CampoCamas = new javax.swing.JTextField();
        CampoStatus = new javax.swing.JTextField();
        BotaoCadastrar = new javax.swing.JButton();
        LabelTitulo = new javax.swing.JLabel();
        LabelQuarto = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelDescricao = new javax.swing.JLabel();
        LabelCamas = new javax.swing.JLabel();
        LabelStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CampoStatus.setText("1");

        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        LabelTitulo.setText("Título");

        LabelQuarto.setText("Nº Quarto");

        LabelValor.setText("Valor");

        LabelDescricao.setText("Descrição");

        LabelCamas.setText("Nº Camas");

        LabelStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelValor)
                    .addComponent(LabelTitulo)
                    .addComponent(LabelQuarto))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelStatus)
                    .addComponent(LabelCamas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelDescricao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CampoCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(BotaoCadastrar)
                        .addGap(69, 69, 69))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTitulo)
                    .addComponent(LabelDescricao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastrar)
                    .addComponent(LabelQuarto)
                    .addComponent(LabelCamas))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelValor)
                    .addComponent(LabelStatus))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed

        String sql = "INSERT INTO RESERVAS (TITULO, DESCRICAO, NQUARTO, NCAMAS, VALOR, ID_SITUACAO) "
                + "VALUES ('"
                + CampoTitulo.getText() + "','"
                + CampoDescricao.getText() + "','"
                + CampoQuartos.getText() + "','"
                + CampoCamas.getText() + "','"
                + CampoValor.getText() + "','"
                + CampoStatus.getText() + " ');";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado!");
        }

    }//GEN-LAST:event_BotaoCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JTextField CampoCamas;
    private javax.swing.JTextField CampoDescricao;
    private javax.swing.JTextField CampoQuartos;
    private javax.swing.JTextField CampoStatus;
    private javax.swing.JTextField CampoTitulo;
    private javax.swing.JTextField CampoValor;
    private javax.swing.JLabel LabelCamas;
    private javax.swing.JLabel LabelDescricao;
    private javax.swing.JLabel LabelQuarto;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelValor;
    // End of variables declaration//GEN-END:variables
}
