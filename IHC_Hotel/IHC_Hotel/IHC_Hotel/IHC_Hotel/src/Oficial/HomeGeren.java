package Oficial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.text.MaskFormatter;

public class HomeGeren extends javax.swing.JFrame {

    public Connection con;
    public Statement st;

    public HomeGeren() {
        initComponents();

        //this.setLocationRelativeTo(null);           
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newhotel", "root", "");
            st = con.createStatement();

            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Algo está errado!!!");
        }

        //pnlInicio.setVisible(true);
        pnlQuartos.setVisible(false);
        pnlRecep.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("newhotel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        recepcionistasQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Recepcionistas r");
        recepcionistasList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : recepcionistasQuery.getResultList();
        quartosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT q FROM Quartos q");
        quartosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : quartosQuery.getResultList();
        reservassQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reservass r");
        reservassList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reservassQuery.getResultList();
        reservassQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reservass r");
        reservassList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reservassQuery1.getResultList();
        recepcionistasQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Recepcionistas r");
        recepcionistasList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : recepcionistasQuery1.getResultList();
        pnlRecep = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();
        ftxtCpf = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ftxtRg = new javax.swing.JFormattedTextField();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        ftxtDataN = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtCel = new javax.swing.JTextField();
        cbxUF = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnHosNovo1 = new javax.swing.JButton();
        btnHosCriar1 = new javax.swing.JButton();
        btnHosAtu1 = new javax.swing.JButton();
        btnHosDel1 = new javax.swing.JButton();
        btnHosLim1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbHospede1 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        pnlQuartos = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNMaxPessoa = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtValorUnit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtQQuartos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHospede = new javax.swing.JTable();
        btnHosNovo = new javax.swing.JButton();
        btnHosCriar = new javax.swing.JButton();
        btnHosAtu = new javax.swing.JButton();
        btnHosDel = new javax.swing.JButton();
        btnHosLim = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlMenu = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnQuartos = new javax.swing.JButton();
        btnRecep = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(898, 572));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        pnlRecep.setFocusable(false);
        pnlRecep.setMaximumSize(new java.awt.Dimension(700, 570));
        pnlRecep.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setText("CÓDIGO:");
        pnlRecep.add(jLabel20);
        jLabel20.setBounds(20, 11, 70, 20);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("NOME:");
        pnlRecep.add(jLabel8);
        jLabel8.setBounds(20, 40, 47, 19);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("CPF:");
        pnlRecep.add(jLabel9);
        jLabel9.setBounds(20, 70, 30, 19);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlRecep.add(txtNome);
        txtNome.setBounds(100, 40, 220, 30);

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setText("---");
        pnlRecep.add(lblCodigo);
        lblCodigo.setBounds(100, 10, 30, 20);

        ftxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCpfActionPerformed(evt);
            }
        });
        pnlRecep.add(ftxtCpf);
        ftxtCpf.setBounds(100, 70, 220, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("RG:");
        pnlRecep.add(jLabel18);
        jLabel18.setBounds(20, 100, 33, 19);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("SEXO:");
        pnlRecep.add(jLabel19);
        jLabel19.setBounds(20, 130, 50, 19);
        pnlRecep.add(ftxtRg);
        ftxtRg.setBounds(100, 100, 220, 30);

        rbtnMasculino.setText("Masculino");
        rbtnMasculino.setMargin(new java.awt.Insets(0, 2, 0, 2));
        pnlRecep.add(rbtnMasculino);
        rbtnMasculino.setBounds(100, 130, 71, 19);

        rbtnFeminino.setText("Feminino");
        pnlRecep.add(rbtnFeminino);
        rbtnFeminino.setBounds(210, 130, 67, 23);

        ftxtDataN.setText("xxxx/xx/xx - (ano/mês/dia)");
        ftxtDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataNActionPerformed(evt);
            }
        });
        pnlRecep.add(ftxtDataN);
        ftxtDataN.setBounds(140, 170, 180, 30);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("DATA DE NASC.:");
        pnlRecep.add(jLabel10);
        jLabel10.setBounds(20, 170, 120, 19);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("E-MAIL:");
        pnlRecep.add(jLabel15);
        jLabel15.setBounds(20, 200, 48, 19);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlRecep.add(txtEmail);
        txtEmail.setBounds(110, 200, 210, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("TEL.:");
        pnlRecep.add(jLabel16);
        jLabel16.setBounds(20, 230, 40, 19);

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        pnlRecep.add(txtTel);
        txtTel.setBounds(110, 230, 210, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("PESQUISAR:");
        pnlRecep.add(jLabel17);
        jLabel17.setBounds(300, 350, 80, 19);

        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });
        pnlRecep.add(txtCel);
        txtCel.setBounds(110, 260, 210, 30);

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        pnlRecep.add(cbxUF);
        cbxUF.setBounds(460, 160, 50, 20);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel21.setText("UF:");
        pnlRecep.add(jLabel21);
        jLabel21.setBounds(340, 160, 20, 19);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel22.setText("CIDADE:");
        pnlRecep.add(jLabel22);
        jLabel22.setBounds(340, 130, 55, 19);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel23.setText("CEP:");
        pnlRecep.add(jLabel23);
        jLabel23.setBounds(340, 100, 31, 19);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel24.setText("NÚM:");
        pnlRecep.add(jLabel24);
        jLabel24.setBounds(340, 70, 36, 19);

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel25.setText("ENDEREÇO:");
        pnlRecep.add(jLabel25);
        jLabel25.setBounds(340, 40, 80, 19);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        pnlRecep.add(txtEndereco);
        txtEndereco.setBounds(460, 40, 200, 30);
        pnlRecep.add(txtNumero);
        txtNumero.setBounds(460, 70, 200, 30);
        pnlRecep.add(txtCep);
        txtCep.setBounds(460, 100, 200, 30);

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        pnlRecep.add(txtCidade);
        txtCidade.setBounds(460, 130, 200, 30);

        btnHosNovo1.setText("NOVO");
        btnHosNovo1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosNovo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosNovo1ActionPerformed(evt);
            }
        });
        pnlRecep.add(btnHosNovo1);
        btnHosNovo1.setBounds(20, 300, 70, 23);

        btnHosCriar1.setText("CRIAR");
        btnHosCriar1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosCriar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosCriar1ActionPerformed(evt);
            }
        });
        pnlRecep.add(btnHosCriar1);
        btnHosCriar1.setBounds(100, 300, 70, 23);

        btnHosAtu1.setText("ATUALIZAR");
        btnHosAtu1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosAtu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosAtu1ActionPerformed(evt);
            }
        });
        pnlRecep.add(btnHosAtu1);
        btnHosAtu1.setBounds(180, 300, 100, 23);

        btnHosDel1.setText("DELETAR");
        btnHosDel1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosDel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHosDel1MouseClicked(evt);
            }
        });
        btnHosDel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosDel1ActionPerformed(evt);
            }
        });
        pnlRecep.add(btnHosDel1);
        btnHosDel1.setBounds(290, 300, 90, 23);

        btnHosLim1.setText("LIMPAR");
        btnHosLim1.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosLim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosLim1ActionPerformed(evt);
            }
        });
        pnlRecep.add(btnHosLim1);
        btnHosLim1.setBounds(390, 300, 90, 23);
        pnlRecep.add(jSeparator2);
        jSeparator2.setBounds(10, 330, 670, 10);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, recepcionistasList1, tbHospede1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rg}"));
        columnBinding.setColumnName("Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sexo}"));
        columnBinding.setColumnName("Sexo");
        columnBinding.setColumnClass(Character.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datanasc}"));
        columnBinding.setColumnName("Datanasc");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tel}"));
        columnBinding.setColumnName("Tel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cel}"));
        columnBinding.setColumnName("Cel");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${endereco}"));
        columnBinding.setColumnName("Endereco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${num}"));
        columnBinding.setColumnName("Num");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uf}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${senha}"));
        columnBinding.setColumnName("Senha");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tbHospede1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHospede1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbHospede1);

        pnlRecep.add(jScrollPane3);
        jScrollPane3.setBounds(20, 380, 660, 190);

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel26.setText("SENHA:");
        pnlRecep.add(jLabel26);
        jLabel26.setBounds(330, 200, 48, 19);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        pnlRecep.add(txtSenha);
        txtSenha.setBounds(450, 200, 200, 30);

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel27.setText("CEL.:");
        pnlRecep.add(jLabel27);
        jLabel27.setBounds(20, 260, 40, 19);

        getContentPane().add(pnlRecep);
        pnlRecep.setBounds(200, 0, 700, 570);

        pnlQuartos.setFocusable(false);
        pnlQuartos.setMaximumSize(new java.awt.Dimension(700, 570));
        pnlQuartos.setLayout(null);

        jLabel11.setText("CÓDIGO:");
        pnlQuartos.add(jLabel11);
        jLabel11.setBounds(50, 40, 50, 20);

        jLabel12.setText("---");
        pnlQuartos.add(jLabel12);
        jLabel12.setBounds(110, 40, 12, 14);

        jLabel13.setText("DESCRIÇÃO:");
        pnlQuartos.add(jLabel13);
        jLabel13.setBounds(50, 80, 80, 20);

        jLabel14.setText("VALOR UNIT.:");
        pnlQuartos.add(jLabel14);
        jLabel14.setBounds(50, 120, 80, 20);

        txtNMaxPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNMaxPessoaActionPerformed(evt);
            }
        });
        pnlQuartos.add(txtNMaxPessoa);
        txtNMaxPessoa.setBounds(170, 150, 130, 30);

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });
        pnlQuartos.add(txtDescricao);
        txtDescricao.setBounds(130, 80, 170, 30);

        jLabel5.setText("Nº MAX DE PESSOAS:");
        pnlQuartos.add(jLabel5);
        jLabel5.setBounds(50, 150, 110, 20);

        txtValorUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorUnitActionPerformed(evt);
            }
        });
        pnlQuartos.add(txtValorUnit);
        txtValorUnit.setBounds(140, 120, 160, 30);

        jLabel6.setText("QUANT. DE QUARTOS:");
        pnlQuartos.add(jLabel6);
        jLabel6.setBounds(50, 190, 120, 30);

        txtQQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQQuartosActionPerformed(evt);
            }
        });
        pnlQuartos.add(txtQQuartos);
        txtQQuartos.setBounds(180, 200, 120, 30);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("PESQUISAR:");
        pnlQuartos.add(jLabel7);
        jLabel7.setBounds(300, 320, 90, 19);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, quartosList, tbHospede);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricao}"));
        columnBinding.setColumnName("Descricao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantpessoas}"));
        columnBinding.setColumnName("Quantpessoas");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantquartos}"));
        columnBinding.setColumnName("Quantquartos");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tbHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHospedeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbHospede);

        pnlQuartos.add(jScrollPane2);
        jScrollPane2.setBounds(20, 350, 660, 210);

        btnHosNovo.setText("NOVO");
        btnHosNovo.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosNovoActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnHosNovo);
        btnHosNovo.setBounds(20, 270, 70, 23);

        btnHosCriar.setText("CRIAR");
        btnHosCriar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosCriarActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnHosCriar);
        btnHosCriar.setBounds(100, 270, 70, 23);

        btnHosAtu.setText("ATUALIZAR");
        btnHosAtu.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosAtuActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnHosAtu);
        btnHosAtu.setBounds(180, 270, 100, 23);

        btnHosDel.setText("DELETAR");
        btnHosDel.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosDelActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnHosDel);
        btnHosDel.setBounds(290, 270, 90, 23);

        btnHosLim.setText("LIMPAR");
        btnHosLim.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosLimActionPerformed(evt);
            }
        });
        pnlQuartos.add(btnHosLim);
        btnHosLim.setBounds(390, 270, 90, 23);
        pnlQuartos.add(jSeparator1);
        jSeparator1.setBounds(10, 300, 670, 10);

        getContentPane().add(pnlQuartos);
        pnlQuartos.setBounds(200, 0, 700, 570);

        pnlMenu.setBackground(new java.awt.Color(204, 105, 255));
        pnlMenu.setMaximumSize(new java.awt.Dimension(200, 570));
        pnlMenu.setName(""); // NOI18N
        pnlMenu.setPreferredSize(new java.awt.Dimension(200, 570));
        pnlMenu.setLayout(null);

        btnSair.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnSair.setText("SAIR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        pnlMenu.add(btnSair);
        btnSair.setBounds(0, 520, 200, 40);

        btnQuartos.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnQuartos.setText("QUARTOS");
        btnQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuartosActionPerformed(evt);
            }
        });
        pnlMenu.add(btnQuartos);
        btnQuartos.setBounds(0, 230, 200, 40);

        btnRecep.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnRecep.setText("RECEPCIONISTAS");
        btnRecep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecepActionPerformed(evt);
            }
        });
        pnlMenu.add(btnRecep);
        btnRecep.setBounds(0, 280, 200, 40);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 0, 200, 570);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        Login obj = new Login();
        obj.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuartosActionPerformed
        //pnlInicio.setVisible(false);
        pnlQuartos.setVisible(true);
        pnlRecep.setVisible(false);

    }//GEN-LAST:event_btnQuartosActionPerformed

    private void btnRecepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecepActionPerformed
        //pnlInicio.setVisible(false);
        pnlQuartos.setVisible(false);
        pnlRecep.setVisible(true);

    }//GEN-LAST:event_btnRecepActionPerformed

    private void txtNMaxPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNMaxPessoaActionPerformed

        int NMaxPessoa = 0;
        NMaxPessoa = Integer.valueOf(txtNMaxPessoa.getText());
    }//GEN-LAST:event_txtNMaxPessoaActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed

        String Descricao = "";
        Descricao = txtDescricao.getText();
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void txtValorUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorUnitActionPerformed

        int Valor = 0;
        Valor = Integer.valueOf(txtValorUnit.getText());
    }//GEN-LAST:event_txtValorUnitActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed

        String Nome = "";
        Nome = txtNome.getText();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void ftxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCpfActionPerformed

        //int Cpf;
        //Cpf= Integer.valueOf(ftxtCpf.getText());
    }//GEN-LAST:event_ftxtCpfActionPerformed

    private void ftxtDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataNActionPerformed
        //String Data = "  /  /    ";
        //Data = ftxtDataN.getText();
    }//GEN-LAST:event_ftxtDataNActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed

        String Email = "";
        Email = txtEmail.getText();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed

        String Endereco = "";
        Endereco = txtEndereco.getText();
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed

        String Cidade = "";
        Cidade = txtCidade.getText();
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtQQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQQuartosActionPerformed
        // TODO add your handling code here:
        int QQuartos = 0;
        QQuartos = Integer.valueOf(txtQQuartos.getText());
    }//GEN-LAST:event_txtQQuartosActionPerformed

    private void btnHosCriar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosCriar1ActionPerformed
        //OK
        String sexo = "";
        if (rbtnMasculino.isSelected()) {
            sexo = "M";
        }
        if (rbtnFeminino.isSelected()) {
            sexo = "F";
        }

        String estado = "";
        if (cbxUF.getSelectedItem().equals("AC")) {
            estado = "AC";
        } else if (cbxUF.getSelectedItem().equals("AL")) {
            estado = "AL";
        } else if (cbxUF.getSelectedItem().equals("AP")) {
            estado = "AP";
        } else if (cbxUF.getSelectedItem().equals("AM")) {
            estado = "AM";
        } else if (cbxUF.getSelectedItem().equals("BA")) {
            estado = "BA";
        } else if (cbxUF.getSelectedItem().equals("CE")) {
            estado = "CE";
        } else if (cbxUF.getSelectedItem().equals("DF")) {
            estado = "DF";
        } else if (cbxUF.getSelectedItem().equals("ES")) {
            estado = "ES";
        } else if (cbxUF.getSelectedItem().equals("GO")) {
            estado = "GO";
        } else if (cbxUF.getSelectedItem().equals("MA")) {
            estado = "MA";
        } else if (cbxUF.getSelectedItem().equals("MT")) {
            estado = "MT";
        } else if (cbxUF.getSelectedItem().equals("MS")) {
            estado = "MS";
        } else if (cbxUF.getSelectedItem().equals("MG")) {
            estado = "MG";
        } else if (cbxUF.getSelectedItem().equals("PA")) {
            estado = "PA";
        } else if (cbxUF.getSelectedItem().equals("PB")) {
            estado = "PB";
        } else if (cbxUF.getSelectedItem().equals("PR")) {
            estado = "PR";
        } else if (cbxUF.getSelectedItem().equals("PE")) {
            estado = "PE";
        } else if (cbxUF.getSelectedItem().equals("PI")) {
            estado = "PI";
        } else if (cbxUF.getSelectedItem().equals("RJ")) {
            estado = "RJ";
        } else if (cbxUF.getSelectedItem().equals("RN")) {
            estado = "RN";
        } else if (cbxUF.getSelectedItem().equals("RS")) {
            estado = "RS";
        } else if (cbxUF.getSelectedItem().equals("RR")) {
            estado = "RR";
        } else if (cbxUF.getSelectedItem().equals("SC")) {
            estado = "SC";
        } else if (cbxUF.getSelectedItem().equals("SP")) {
            estado = "SP";
        } else if (cbxUF.getSelectedItem().equals("SE")) {
            estado = "SE";
        } else if (cbxUF.getSelectedItem().equals("RO")) {
            estado = "RO";
        } else if (cbxUF.getSelectedItem().equals("TO")) {
            estado = "TO";
        }

        String sql = "INSERT INTO recepcionistas (NOME, CPF, RG, SEXO, DATANASC, EMAIL, TEL, CEL, ENDERECO, NUM, CEP, CIDADE, UF, SENHA) "
                + "VALUES ('"
                + txtNome.getText() + "','"
                + ftxtCpf.getText() + "','"
                + ftxtRg.getText() + "','"
                + sexo + "','"
                + ftxtDataN.getText() + "','" //FORMATAR DATA
                + txtEmail.getText() + "','"
                + txtTel.getText() + "','"
                + txtCel.getText() + "','"
                + txtEndereco.getText() + "','"
                + txtNumero.getText() + "','"
                + txtCep.getText() + "','"
                + txtCidade.getText() + "','"
                + estado + "','"
                + txtSenha.getText() + "');";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado!");
        }
    }//GEN-LAST:event_btnHosCriar1ActionPerformed

    private void btnHosNovo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosNovo1ActionPerformed
        //OK
        txtNome.setText(null);
        ftxtCpf.setText(null);
        ftxtRg.setText(null);
        rbtnMasculino.setText(null);
        ftxtDataN.setText(null);
        txtEmail.setText(null);
        txtTel.setText(null);
        txtCel.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        txtCep.setText(null);
        txtCidade.setText(null);
        txtSenha.setText(null);
    }//GEN-LAST:event_btnHosNovo1ActionPerformed

    private void tbHospede1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHospede1MouseClicked

        int selectedRow = tbHospede1.getSelectedRow();
        TableModel model = tbHospede1.getModel();

        txtNome.setText(model.getValueAt(selectedRow, 1).toString());
        ftxtCpf.setText(model.getValueAt(selectedRow, 2).toString());
        ftxtRg.setText(model.getValueAt(selectedRow, 3).toString());
        //rbtnMasculino.setText(model.getValueAt(selectedRow, 3).toString());
        //rbtnFeminino.setText(model.getValueAt(selectedRow, 3).toString());
        ftxtDataN.setText(model.getValueAt(selectedRow, 5).toString());
        txtEmail.setText(model.getValueAt(selectedRow, 6).toString());
        txtTel.setText(model.getValueAt(selectedRow, 7).toString());
        txtCel.setText(model.getValueAt(selectedRow, 8).toString());
        txtEndereco.setText(model.getValueAt(selectedRow, 9).toString());
        txtNumero.setText(model.getValueAt(selectedRow, 10).toString());
        txtCep.setText(model.getValueAt(selectedRow, 11).toString());
        txtCidade.setText(model.getValueAt(selectedRow, 12).toString());
        cbxUF.setSelectedItem(model.getValueAt(selectedRow, 13).toString());
        txtSenha.setText(model.getValueAt(selectedRow, 14).toString());

        String sexo = "";
        if (rbtnMasculino.isSelected()) {
            sexo = "M";
        }
        if (rbtnFeminino.isSelected()) {
            sexo = "F";
        }

        String estado = "";
        if (cbxUF.getSelectedItem().equals("AC")) {
            estado = "AC";
        } else if (cbxUF.getSelectedItem().equals("AL")) {
            estado = "AL";
        } else if (cbxUF.getSelectedItem().equals("AP")) {
            estado = "AP";
        } else if (cbxUF.getSelectedItem().equals("AM")) {
            estado = "AM";
        } else if (cbxUF.getSelectedItem().equals("BA")) {
            estado = "BA";
        } else if (cbxUF.getSelectedItem().equals("CE")) {
            estado = "CE";
        } else if (cbxUF.getSelectedItem().equals("DF")) {
            estado = "DF";
        } else if (cbxUF.getSelectedItem().equals("ES")) {
            estado = "ES";
        } else if (cbxUF.getSelectedItem().equals("GO")) {
            estado = "GO";
        } else if (cbxUF.getSelectedItem().equals("MA")) {
            estado = "MA";
        } else if (cbxUF.getSelectedItem().equals("MT")) {
            estado = "MT";
        } else if (cbxUF.getSelectedItem().equals("MS")) {
            estado = "MS";
        } else if (cbxUF.getSelectedItem().equals("MG")) {
            estado = "MG";
        } else if (cbxUF.getSelectedItem().equals("PA")) {
            estado = "PA";
        } else if (cbxUF.getSelectedItem().equals("PB")) {
            estado = "PB";
        } else if (cbxUF.getSelectedItem().equals("PR")) {
            estado = "PR";
        } else if (cbxUF.getSelectedItem().equals("PE")) {
            estado = "PE";
        } else if (cbxUF.getSelectedItem().equals("PI")) {
            estado = "PI";
        } else if (cbxUF.getSelectedItem().equals("RJ")) {
            estado = "RJ";
        } else if (cbxUF.getSelectedItem().equals("RN")) {
            estado = "RN";
        } else if (cbxUF.getSelectedItem().equals("RS")) {
            estado = "RS";
        } else if (cbxUF.getSelectedItem().equals("RR")) {
            estado = "RR";
        } else if (cbxUF.getSelectedItem().equals("SC")) {
            estado = "SC";
        } else if (cbxUF.getSelectedItem().equals("SP")) {
            estado = "SP";
        } else if (cbxUF.getSelectedItem().equals("SE")) {
            estado = "SE";
        } else if (cbxUF.getSelectedItem().equals("RO")) {
            estado = "RO";
        } else if (cbxUF.getSelectedItem().equals("TO")) {
            estado = "TO";
        }

    }//GEN-LAST:event_tbHospede1MouseClicked

    private void btnHosAtu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosAtu1ActionPerformed

        String sexo = "";
        if (rbtnMasculino.isSelected()) {
            sexo = "M";
        }
        if (rbtnFeminino.isSelected()) {
            sexo = "F";
        }

        String estado = "";
        if (cbxUF.getSelectedItem().equals("AC")) {
            estado = "AC";
        } else if (cbxUF.getSelectedItem().equals("AL")) {
            estado = "AL";
        } else if (cbxUF.getSelectedItem().equals("AP")) {
            estado = "AP";
        } else if (cbxUF.getSelectedItem().equals("AM")) {
            estado = "AM";
        } else if (cbxUF.getSelectedItem().equals("BA")) {
            estado = "BA";
        } else if (cbxUF.getSelectedItem().equals("CE")) {
            estado = "CE";
        } else if (cbxUF.getSelectedItem().equals("DF")) {
            estado = "DF";
        } else if (cbxUF.getSelectedItem().equals("ES")) {
            estado = "ES";
        } else if (cbxUF.getSelectedItem().equals("GO")) {
            estado = "GO";
        } else if (cbxUF.getSelectedItem().equals("MA")) {
            estado = "MA";
        } else if (cbxUF.getSelectedItem().equals("MT")) {
            estado = "MT";
        } else if (cbxUF.getSelectedItem().equals("MS")) {
            estado = "MS";
        } else if (cbxUF.getSelectedItem().equals("MG")) {
            estado = "MG";
        } else if (cbxUF.getSelectedItem().equals("PA")) {
            estado = "PA";
        } else if (cbxUF.getSelectedItem().equals("PB")) {
            estado = "PB";
        } else if (cbxUF.getSelectedItem().equals("PR")) {
            estado = "PR";
        } else if (cbxUF.getSelectedItem().equals("PE")) {
            estado = "PE";
        } else if (cbxUF.getSelectedItem().equals("PI")) {
            estado = "PI";
        } else if (cbxUF.getSelectedItem().equals("RJ")) {
            estado = "RJ";
        } else if (cbxUF.getSelectedItem().equals("RN")) {
            estado = "RN";
        } else if (cbxUF.getSelectedItem().equals("RS")) {
            estado = "RS";
        } else if (cbxUF.getSelectedItem().equals("RR")) {
            estado = "RR";
        } else if (cbxUF.getSelectedItem().equals("SC")) {
            estado = "SC";
        } else if (cbxUF.getSelectedItem().equals("SP")) {
            estado = "SP";
        } else if (cbxUF.getSelectedItem().equals("SE")) {
            estado = "SE";
        } else if (cbxUF.getSelectedItem().equals("RO")) {
            estado = "RO";
        } else if (cbxUF.getSelectedItem().equals("TO")) {
            estado = "TO";
        }

        int i = tbHospede1.getSelectedRow();
        int C = tbHospede1.getSelectedColumn();
        TableModel model = tbHospede1.getModel();

        if (i >= 0) {
            model.setValueAt(txtNome.getText(), i, 1);
            model.setValueAt(ftxtCpf.getText(), i, 2);
            model.setValueAt(ftxtRg.getText(), i, 3);
            model.setValueAt(sexo, i, 4);
            //model.setValueAt(ftxtDataN.getText(), i, 5);
            model.setValueAt(txtEmail.getText(), i, 6);
            model.setValueAt(txtTel.getText(), i, 7);
            model.setValueAt(txtCel.getText(), i, 8);
            model.setValueAt(txtEndereco.getText(), i, 9);
            model.setValueAt(txtNumero.getText(), i, 10);
            model.setValueAt(txtCep.getText(), i, 11);
            model.setValueAt(txtCidade.getText(), i, 12);
            model.setValueAt(estado, i, 13);
            model.setValueAt(txtSenha.getText(), i, 14);

        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

        String sql = "UPDATE recepcionistas SET"
                + " NOME = '" + txtNome.getText() + "' ,"
                + " CPF = '" + ftxtCpf.getText() + "' ,"
                + " RG = '" + ftxtRg.getText() + "' ,"
                + " SEXO = '" + sexo + "' ,"
                //+ " DATANASC = "+ftxtDataN.getText()+ "','"
                + " EMAIL = '" + txtEmail.getText() + "' ,"
                + " TEL = '" + txtTel.getText() + "' ,"
                + " CEL = '" + txtCel.getText() + "' ,"
                + " ENDERECO = '" + txtEndereco.getText() + "' ,"
                + " NUM = '" + txtNumero.getText() + "' ,"
                + " CEP = '" + txtCep.getText() + "' ,"
                + " CIDADE = '" + txtCidade.getText() + "' ,"
                + " UF = '" + estado + "',"
                + " SENHA = '" + txtSenha.getText() + "' "
                + " WHERE NOME = '" + txtNome.getText() + "';";

        System.out.print(sql);
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado!");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não Atualizado!");
        }

    }//GEN-LAST:event_btnHosAtu1ActionPerformed

    private void btnHosLim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosLim1ActionPerformed
        //OK
        txtNome.setText(null);
        ftxtCpf.setText(null);
        ftxtRg.setText(null);
        rbtnMasculino.setText(null);
        ftxtDataN.setText(null);
        txtEmail.setText(null);
        txtTel.setText(null);
        txtCel.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        txtCep.setText(null);
        txtCidade.setText(null);
        txtSenha.setText(null);
    }//GEN-LAST:event_btnHosLim1ActionPerformed

    private void btnHosDel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosDel1ActionPerformed

        String sql = "DELETE FROM recepcionistas "
                + " WHERE NOME = '" + txtNome.getText() + "';";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Deletado!");
        }

    }//GEN-LAST:event_btnHosDel1ActionPerformed

    private void btnHosDel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHosDel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHosDel1MouseClicked

    private void btnHosNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosNovoActionPerformed

        txtDescricao.setText(null);
        txtValorUnit.setText(null);
        txtNMaxPessoa.setText(null);
        txtQQuartos.setText(null);

    }//GEN-LAST:event_btnHosNovoActionPerformed

    private void btnHosLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosLimActionPerformed

        txtDescricao.setText(null);
        txtValorUnit.setText(null);
        txtNMaxPessoa.setText(null);
        txtQQuartos.setText(null);
    }//GEN-LAST:event_btnHosLimActionPerformed

    private void btnHosCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosCriarActionPerformed

        String sql = "INSERT INTO quartos (DESCRICAO, VALOR, QUANTPESSOAS, QUANTQUARTOS) "
                + "VALUES ('"
                + txtDescricao.getText() + "','"
                + txtValorUnit.getText() + "','"
                + txtNMaxPessoa.getText() + "','"
                + txtQQuartos.getText() + "');";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado!");
        }
    }//GEN-LAST:event_btnHosCriarActionPerformed

    private void tbHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHospedeMouseClicked

        int selectedRow = tbHospede.getSelectedRow();
        TableModel model = tbHospede.getModel();

        txtDescricao.setText(model.getValueAt(selectedRow, 1).toString());
        txtValorUnit.setText(model.getValueAt(selectedRow, 2).toString());
        txtNMaxPessoa.setText(model.getValueAt(selectedRow, 3).toString());
        txtQQuartos.setText(model.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_tbHospedeMouseClicked

    private void btnHosDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosDelActionPerformed

        String sql = "DELETE FROM quartos "
                + " WHERE DESCRICAO = '" + txtDescricao.getText() + "';";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Deletado!");
        }
    }//GEN-LAST:event_btnHosDelActionPerformed

    private void btnHosAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosAtuActionPerformed

        String sql = "UPDATE quartos SET"
                + " DESCRICAO = '" + txtDescricao.getText() + "' ,"
                + " VALOR = '" + txtValorUnit.getText() + "' ,"
                + " QUANTPESSOAS = '" + txtNMaxPessoa.getText() + "' ,"
                + " QUANTQUARTOS = '" + txtQQuartos.getText() + "'"
                + " WHERE DESCRICAO = '" + txtDescricao.getText() + "';";

        System.out.print(sql);
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado!");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não Atualizado!");
        }
    }//GEN-LAST:event_btnHosAtuActionPerformed

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
            java.util.logging.Logger.getLogger(HomeRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeRecep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeRecep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHosAtu;
    private javax.swing.JButton btnHosAtu1;
    private javax.swing.JButton btnHosCriar;
    private javax.swing.JButton btnHosCriar1;
    private javax.swing.JButton btnHosDel;
    private javax.swing.JButton btnHosDel1;
    private javax.swing.JButton btnHosLim;
    private javax.swing.JButton btnHosLim1;
    private javax.swing.JButton btnHosNovo;
    private javax.swing.JButton btnHosNovo1;
    private javax.swing.JButton btnQuartos;
    private javax.swing.JButton btnRecep;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JFormattedTextField ftxtDataN;
    private javax.swing.JFormattedTextField ftxtRg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlQuartos;
    private javax.swing.JPanel pnlRecep;
    private java.util.List<Oficial.Quartos> quartosList;
    private javax.persistence.Query quartosQuery;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private java.util.List<Oficial.Recepcionistas> recepcionistasList;
    private java.util.List<Oficial.Recepcionistas> recepcionistasList1;
    private javax.persistence.Query recepcionistasQuery;
    private javax.persistence.Query recepcionistasQuery1;
    private java.util.List<Oficial.Reservass> reservassList;
    private java.util.List<Oficial.Reservass> reservassList1;
    private javax.persistence.Query reservassQuery;
    private javax.persistence.Query reservassQuery1;
    private javax.swing.JTable tbHospede;
    private javax.swing.JTable tbHospede1;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNMaxPessoa;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtQQuartos;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtValorUnit;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
