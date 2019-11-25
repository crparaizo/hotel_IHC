package Oficial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

public class HomeRecep extends javax.swing.JFrame {

    public Connection con;
    public Statement st;

    public HomeRecep() {
        initComponents();

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/newhotel", "root", "");
            st = con.createStatement();

            //JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Algo está errado!!!");
        }

        //this.setLocationRelativeTo(null);
        //pnlInicio.setVisible(true);
        pnlHospedes.setVisible(true);
        pnlReservas.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jLabel1 = new javax.swing.JLabel();
        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("newhotel?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        hospedesQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Hospedes h");
        hospedesList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : hospedesQuery.getResultList();
        reservassQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reservass r");
        reservassList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reservassQuery.getResultList();
        reservassQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reservass r");
        reservassList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : reservassQuery1.getResultList();
        hospedesQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Hospedes h");
        hospedesList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : hospedesQuery1.getResultList();
        pnlMenu = new javax.swing.JPanel();
        btnSair = new javax.swing.JButton();
        btnHospedes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        pnlHospedes = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHospede = new javax.swing.JTable();
        lblCodigo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        rbtnMasculino = new javax.swing.JRadioButton();
        rbtnFeminino = new javax.swing.JRadioButton();
        ftxtCpf = new javax.swing.JFormattedTextField();
        ftxtRg = new javax.swing.JFormattedTextField();
        ftxtDataN = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtCel = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        cbxUF = new javax.swing.JComboBox<>();
        btnHosNovo = new javax.swing.JButton();
        btnHosCriar = new javax.swing.JButton();
        btnHosAtu = new javax.swing.JButton();
        btnHosDel = new javax.swing.JButton();
        btnHosLim = new javax.swing.JButton();
        pnlReservas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ftxtDataSaida = new javax.swing.JFormattedTextField();
        ftxtDataEntrada = new javax.swing.JFormattedTextField();
        txtNPessoas = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnResNovo = new javax.swing.JButton();
        btnResCriar = new javax.swing.JButton();
        btnResAtu = new javax.swing.JButton();
        btnResDel = new javax.swing.JButton();
        btnResLim = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        txtNPessoas1 = new javax.swing.JTextField();
        txtNPessoas2 = new javax.swing.JTextField();
        txtNPessoas3 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(898, 572));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

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

        btnHospedes.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnHospedes.setText("HOSPEDES");
        btnHospedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospedesActionPerformed(evt);
            }
        });
        pnlMenu.add(btnHospedes);
        btnHospedes.setBounds(0, 230, 200, 40);

        btnReservas.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        btnReservas.setText("RESERVAS");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        pnlMenu.add(btnReservas);
        btnReservas.setBounds(0, 280, 200, 40);

        getContentPane().add(pnlMenu);
        pnlMenu.setBounds(0, 0, 200, 570);

        pnlHospedes.setMaximumSize(new java.awt.Dimension(700, 570));
        pnlHospedes.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setText("PESQUISAR:");
        pnlHospedes.add(jLabel5);
        jLabel5.setBounds(320, 340, 90, 19);

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("NOME:");
        pnlHospedes.add(jLabel7);
        jLabel7.setBounds(20, 40, 47, 19);

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("CPF:");
        pnlHospedes.add(jLabel8);
        jLabel8.setBounds(20, 70, 30, 19);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("DATA DE NASC.:");
        pnlHospedes.add(jLabel9);
        jLabel9.setBounds(20, 170, 120, 19);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setText("E-MAIL:");
        pnlHospedes.add(jLabel10);
        jLabel10.setBounds(20, 200, 48, 19);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("ENDEREÇO:");
        pnlHospedes.add(jLabel11);
        jLabel11.setBounds(340, 40, 80, 19);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("NÚM:");
        pnlHospedes.add(jLabel12);
        jLabel12.setBounds(340, 70, 36, 19);

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("CEP:");
        pnlHospedes.add(jLabel13);
        jLabel13.setBounds(340, 100, 31, 19);

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("CIDADE:");
        pnlHospedes.add(jLabel14);
        jLabel14.setBounds(340, 130, 55, 19);

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setText("UF:");
        pnlHospedes.add(jLabel15);
        jLabel15.setBounds(340, 160, 20, 19);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel16.setText("TEL.:");
        pnlHospedes.add(jLabel16);
        jLabel16.setBounds(20, 230, 40, 19);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("CEL.:");
        pnlHospedes.add(jLabel17);
        jLabel17.setBounds(20, 260, 40, 19);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel18.setText("RG:");
        pnlHospedes.add(jLabel18);
        jLabel18.setBounds(20, 100, 33, 19);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel19.setText("SEXO:");
        pnlHospedes.add(jLabel19);
        jLabel19.setBounds(20, 130, 50, 19);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel20.setText("CÓDIGO:");
        pnlHospedes.add(jLabel20);
        jLabel20.setBounds(20, 11, 70, 20);
        pnlHospedes.add(jSeparator1);
        jSeparator1.setBounds(10, 330, 670, 10);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, hospedesList1, tbHospede);
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
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tbHospede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHospedeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbHospede);

        pnlHospedes.add(jScrollPane2);
        jScrollPane2.setBounds(20, 370, 660, 190);

        lblCodigo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCodigo.setText("---");
        pnlHospedes.add(lblCodigo);
        lblCodigo.setBounds(100, 10, 30, 20);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtNome);
        txtNome.setBounds(100, 40, 220, 30);

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtCidade);
        txtCidade.setBounds(460, 130, 200, 30);

        rbtnMasculino.setText("Masculino");
        rbtnMasculino.setMargin(new java.awt.Insets(0, 2, 0, 2));
        pnlHospedes.add(rbtnMasculino);
        rbtnMasculino.setBounds(100, 130, 71, 19);

        rbtnFeminino.setText("Feminino");
        pnlHospedes.add(rbtnFeminino);
        rbtnFeminino.setBounds(210, 130, 67, 23);

        ftxtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtCpfActionPerformed(evt);
            }
        });
        pnlHospedes.add(ftxtCpf);
        ftxtCpf.setBounds(100, 70, 220, 30);
        pnlHospedes.add(ftxtRg);
        ftxtRg.setBounds(100, 100, 220, 30);

        ftxtDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataNActionPerformed(evt);
            }
        });
        pnlHospedes.add(ftxtDataN);
        ftxtDataN.setBounds(140, 170, 180, 30);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtEmail);
        txtEmail.setBounds(110, 200, 210, 30);

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtTel);
        txtTel.setBounds(110, 230, 210, 30);

        txtCel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtCel);
        txtCel.setBounds(110, 260, 210, 30);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        pnlHospedes.add(txtEndereco);
        txtEndereco.setBounds(460, 40, 200, 30);
        pnlHospedes.add(txtNumero);
        txtNumero.setBounds(460, 70, 200, 30);
        pnlHospedes.add(txtCep);
        txtCep.setBounds(460, 100, 200, 30);

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));
        pnlHospedes.add(cbxUF);
        cbxUF.setBounds(460, 160, 50, 20);

        btnHosNovo.setText("NOVO");
        btnHosNovo.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosNovoActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnHosNovo);
        btnHosNovo.setBounds(20, 300, 70, 23);

        btnHosCriar.setText("CRIAR");
        btnHosCriar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosCriarActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnHosCriar);
        btnHosCriar.setBounds(100, 300, 70, 23);

        btnHosAtu.setText("ATUALIZAR");
        btnHosAtu.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosAtu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHosAtuMouseClicked(evt);
            }
        });
        btnHosAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosAtuActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnHosAtu);
        btnHosAtu.setBounds(180, 300, 100, 23);

        btnHosDel.setText("DELETAR");
        btnHosDel.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosDelActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnHosDel);
        btnHosDel.setBounds(290, 300, 90, 23);

        btnHosLim.setText("LIMPAR");
        btnHosLim.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnHosLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHosLimActionPerformed(evt);
            }
        });
        pnlHospedes.add(btnHosLim);
        btnHosLim.setBounds(390, 300, 90, 23);

        getContentPane().add(pnlHospedes);
        pnlHospedes.setBounds(200, 0, 700, 570);

        pnlReservas.setFocusable(false);
        pnlReservas.setMaximumSize(new java.awt.Dimension(700, 570));
        pnlReservas.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel6.setText("CÓDIGO:");
        pnlReservas.add(jLabel6);
        jLabel6.setBounds(30, 20, 60, 20);

        jLabel21.setText("---");
        pnlReservas.add(jLabel21);
        jLabel21.setBounds(100, 20, 60, 30);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel22.setText("CLIENTE:");
        pnlReservas.add(jLabel22);
        jLabel22.setBounds(30, 50, 60, 20);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel23.setText("DATA DE SAÍDA:");
        pnlReservas.add(jLabel23);
        jLabel23.setBounds(30, 130, 100, 30);

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel24.setText("DATA DE ENTRADA:");
        pnlReservas.add(jLabel24);
        jLabel24.setBounds(30, 100, 98, 20);

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel25.setText("TIPO DO QUARTO:");
        pnlReservas.add(jLabel25);
        jLabel25.setBounds(350, 20, 99, 20);

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel26.setText("Nº DE PESSOAS:");
        pnlReservas.add(jLabel26);
        jLabel26.setBounds(350, 60, 90, 30);

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel27.setText("VALOR:");
        pnlReservas.add(jLabel27);
        jLabel27.setBounds(350, 110, 50, 20);

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel29.setText("FORMA DE PAGAMENTO:");
        pnlReservas.add(jLabel29);
        jLabel29.setBounds(350, 150, 140, 20);

        ftxtDataSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataSaidaActionPerformed(evt);
            }
        });
        pnlReservas.add(ftxtDataSaida);
        ftxtDataSaida.setBounds(140, 130, 110, 30);

        ftxtDataEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtDataEntradaActionPerformed(evt);
            }
        });
        pnlReservas.add(ftxtDataEntrada);
        ftxtDataEntrada.setBounds(140, 100, 110, 30);

        txtNPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPessoasActionPerformed(evt);
            }
        });
        pnlReservas.add(txtNPessoas);
        txtNPessoas.setBounds(460, 110, 80, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cartão D.", "Cartão C.", "Dinheiro", "Cheque" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        pnlReservas.add(jComboBox3);
        jComboBox3.setBounds(500, 150, 72, 30);
        pnlReservas.add(jSeparator2);
        jSeparator2.setBounds(20, 300, 660, 20);

        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, reservassList1, jTable2);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigo}"));
        columnBinding.setColumnName("Codigo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codHospede}"));
        columnBinding.setColumnName("Cod Hospede");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataen}"));
        columnBinding.setColumnName("Dataen");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${datasa}"));
        columnBinding.setColumnName("Datasa");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoquarto}"));
        columnBinding.setColumnName("Tipoquarto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${npessoas}"));
        columnBinding.setColumnName("Npessoas");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valor}"));
        columnBinding.setColumnName("Valor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pagamento}"));
        columnBinding.setColumnName("Pagamento");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        pnlReservas.add(jScrollPane3);
        jScrollPane3.setBounds(20, 350, 660, 210);

        btnResNovo.setText("NOVO");
        btnResNovo.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResNovoActionPerformed(evt);
            }
        });
        pnlReservas.add(btnResNovo);
        btnResNovo.setBounds(20, 260, 70, 23);

        btnResCriar.setText("CRIAR");
        btnResCriar.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResCriarActionPerformed(evt);
            }
        });
        pnlReservas.add(btnResCriar);
        btnResCriar.setBounds(100, 260, 70, 23);

        btnResAtu.setText("ATUALIZAR");
        btnResAtu.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResAtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResAtuActionPerformed(evt);
            }
        });
        pnlReservas.add(btnResAtu);
        btnResAtu.setBounds(180, 260, 100, 23);

        btnResDel.setText("DELETAR");
        btnResDel.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResDelActionPerformed(evt);
            }
        });
        pnlReservas.add(btnResDel);
        btnResDel.setBounds(290, 260, 90, 23);

        btnResLim.setText("LIMPAR");
        btnResLim.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResLimActionPerformed(evt);
            }
        });
        pnlReservas.add(btnResLim);
        btnResLim.setBounds(390, 260, 90, 23);

        jLabel30.setText("PESQUISAR:");
        pnlReservas.add(jLabel30);
        jLabel30.setBounds(330, 320, 61, 14);

        txtNPessoas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPessoas1ActionPerformed(evt);
            }
        });
        pnlReservas.add(txtNPessoas1);
        txtNPessoas1.setBounds(460, 60, 210, 30);

        txtNPessoas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPessoas2ActionPerformed(evt);
            }
        });
        pnlReservas.add(txtNPessoas2);
        txtNPessoas2.setBounds(100, 50, 150, 20);

        txtNPessoas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNPessoas3ActionPerformed(evt);
            }
        });
        pnlReservas.add(txtNPessoas3);
        txtNPessoas3.setBounds(460, 10, 210, 30);

        getContentPane().add(pnlReservas);
        pnlReservas.setBounds(200, 0, 700, 570);

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
        Login obj = new Login();
        obj.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnHospedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospedesActionPerformed
        //pnlInicio.setVisible(false);
        pnlHospedes.setVisible(true);
        pnlReservas.setVisible(false);
    }//GEN-LAST:event_btnHospedesActionPerformed

    private void txtCelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCelActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
        String Nome = "";
        Nome = txtNome.getText();
    }//GEN-LAST:event_txtNomeActionPerformed

    private void ftxtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtCpfActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ftxtCpfActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
        String Endereco = "";
        Endereco = txtEndereco.getText();
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
        String Cidade = "";
        Cidade = txtCidade.getText();
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
        String Email = "";
        Email = txtEmail.getText();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void ftxtDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataNActionPerformed
        // TODO add your handling code here:
        //javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
        //txtDataN = new javax.swing.JFormattedTextField(data);
    }//GEN-LAST:event_ftxtDataNActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        //pnlInicio.setVisible(false);
        pnlHospedes.setVisible(false);
        pnlReservas.setVisible(true);

    }//GEN-LAST:event_btnReservasActionPerformed

    private void ftxtDataEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataEntradaActionPerformed
        // TODO add your handling code here:
        String DataEntrada = "";
        DataEntrada = ftxtDataEntrada.getText();
    }//GEN-LAST:event_ftxtDataEntradaActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void txtNPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPessoasActionPerformed
        // TODO add your handling code here:
        int Npessoas = 0;
        Npessoas = Integer.valueOf(txtNPessoas.getText());
    }//GEN-LAST:event_txtNPessoasActionPerformed

    private void ftxtDataSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtDataSaidaActionPerformed
        // TODO add your handling code here:
        String DataSaida = "";
        DataSaida = ftxtDataSaida.getText();
    }//GEN-LAST:event_ftxtDataSaidaActionPerformed

    private void txtNPessoas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPessoas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPessoas1ActionPerformed

    private void txtNPessoas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPessoas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPessoas2ActionPerformed

    private void txtNPessoas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNPessoas3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNPessoas3ActionPerformed

    private void btnResNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResNovoActionPerformed

        txtNPessoas2.setText(null);
        ftxtDataEntrada.setText(null);
        ftxtDataSaida.setText(null);
        txtNPessoas3.setText(null);
        txtNPessoas1.setText(null);
        txtNPessoas.setText(null);
    }//GEN-LAST:event_btnResNovoActionPerformed

    private void btnResLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResLimActionPerformed

        txtNPessoas2.setText(null);
        ftxtDataEntrada.setText(null);
        ftxtDataSaida.setText(null);
        txtNPessoas3.setText(null);
        txtNPessoas1.setText(null);
        txtNPessoas.setText(null);
    }//GEN-LAST:event_btnResLimActionPerformed

    private void btnResCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResCriarActionPerformed

        String pagamento = "";

        if (jComboBox3.getSelectedItem().equals("Cartão D.")) {
            pagamento = "Débito";

        } else if (jComboBox3.getSelectedItem().equals("Cartão C.")) {
            pagamento = "Crédito";

        } else if (jComboBox3.getSelectedItem().equals("Cheque")) {
            pagamento = "Cheque";

        } else if (jComboBox3.getSelectedItem().equals("Dinheiro")) {
            pagamento = "Dinheiro";

        } else if (jComboBox3.getSelectedItem().equals(" ")) {
            pagamento = "null";
        }

        String sql = "INSERT INTO reservass (COD_HOSPEDE,DATAEN ,DATASA ,TIPOQUARTO ,NPESSOAS ,VALOR ,PAGAMENTO) "
                + "VALUES ('"
                + txtNPessoas2.getText() + "','"
                + ftxtDataEntrada.getText() + "','"
                + ftxtDataSaida.getText() + "','"
                + txtNPessoas3.getText() + "','"
                + txtNPessoas1.getText() + "','"
                + txtNPessoas.getText() + "','"
                + pagamento + "');";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado!");
        }
    }//GEN-LAST:event_btnResCriarActionPerformed

    private void btnHosNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosNovoActionPerformed

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
    }//GEN-LAST:event_btnHosNovoActionPerformed

    private void btnHosCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosCriarActionPerformed

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

        String sql = "INSERT INTO hospedes (NOME, CPF, RG, SEXO, DATANASC, EMAIL, TEL, CEL, ENDERECO, NUM, CEP, CIDADE, UF) "
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
                + estado + "');";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Cadastrado!");
        }
    }//GEN-LAST:event_btnHosCriarActionPerformed

    private void btnHosLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosLimActionPerformed

        txtNome.setText(null);
        ftxtCpf.setText(null);
        ftxtRg.setText(null);
        rbtnMasculino.setText(null);
        rbtnFeminino.setText(null);
        ftxtDataN.setText(null);
        txtEmail.setText(null);
        txtTel.setText(null);
        txtCel.setText(null);
        txtEndereco.setText(null);
        txtNumero.setText(null);
        txtCep.setText(null);
        txtCidade.setText(null);
    }//GEN-LAST:event_btnHosLimActionPerformed

    private void tbHospedeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHospedeMouseClicked

        int selectedRow = tbHospede.getSelectedRow();
        TableModel model = tbHospede.getModel();

        txtNome.setText(model.getValueAt(selectedRow, 1).toString());
        ftxtCpf.setText(model.getValueAt(selectedRow, 2).toString());
        ftxtRg.setText(model.getValueAt(selectedRow, 3).toString());
        ftxtDataN.setText(model.getValueAt(selectedRow, 5).toString());
        txtEmail.setText(model.getValueAt(selectedRow, 6).toString());
        txtTel.setText(model.getValueAt(selectedRow, 7).toString());
        txtCel.setText(model.getValueAt(selectedRow, 8).toString());
        txtEndereco.setText(model.getValueAt(selectedRow, 9).toString());
        txtNumero.setText(model.getValueAt(selectedRow, 10).toString());
        txtCep.setText(model.getValueAt(selectedRow, 11).toString());
        txtCidade.setText(model.getValueAt(selectedRow, 12).toString());
        cbxUF.setSelectedItem(model.getValueAt(selectedRow, 13).toString());


    }//GEN-LAST:event_tbHospedeMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int selectedRow = jTable2.getSelectedRow();
        TableModel model = jTable2.getModel();

        txtNPessoas2.setText(model.getValueAt(selectedRow, 1).toString());
        ftxtDataEntrada.setText(model.getValueAt(selectedRow, 2).toString());
        ftxtDataSaida.setText(model.getValueAt(selectedRow, 3).toString());
        txtNPessoas3.setText(model.getValueAt(selectedRow, 4).toString());
        txtNPessoas1.setText(model.getValueAt(selectedRow, 5).toString());
        txtNPessoas.setText(model.getValueAt(selectedRow, 6).toString());


    }//GEN-LAST:event_jTable2MouseClicked

    private void btnHosDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosDelActionPerformed

        String sql = "DELETE FROM hospedes "
                + " WHERE NOME = '" + txtNome.getText() + "';";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Deletado!");
        }
    }//GEN-LAST:event_btnHosDelActionPerformed

    private void btnResDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResDelActionPerformed

        String sql = "DELETE FROM reservass "
                + " WHERE CODIGO = '" + txtNPessoas2.getText() + "';";

        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Deletado!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não Deletado!");
        }
    }//GEN-LAST:event_btnResDelActionPerformed

    private void btnHosAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHosAtuActionPerformed
        String sql = "UPDATE hospedes SET"
                + " NOME = '" + txtNome.getText() + "' ,"
                + " CPF = '" + ftxtCpf.getText() + "' ,"
                + " RG = '" + ftxtRg.getText() + "' ,"
                //+ " DATANASC = "+ftxtDataN.getText()+ "','"
                + " EMAIL = '" + txtEmail.getText() + "' ,"
                + " TEL = '" + txtTel.getText() + "' ,"
                + " CEL = '" + txtCel.getText() + "' ,"
                + " ENDERECO = '" + txtEndereco.getText() + "' ,"
                + " NUM = '" + txtNumero.getText() + "' ,"
                + " CEP = '" + txtCep.getText() + "' ,"
                + " CIDADE = '" + txtCidade.getText() + "' "
                + " WHERE NOME = '" + txtNome.getText() + "';";

        System.out.print(sql);
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado!");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não Atualizado!");
        }

    }//GEN-LAST:event_btnHosAtuActionPerformed

    private void btnResAtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResAtuActionPerformed

        String sql = "UPDATE reservass SET"
                + " COD_HOSPEDE = '" + txtNPessoas2.getText() + "' ,"
                //+ " DATAEN = '" + ftxtDataEntrada.getText() + "' ,"
                //+ " DATASA = '" + ftxtDataSaida.getText() + "' ,"
                + " TIPOQUARTO = '" + txtNPessoas3.getText() + "' ,"
                + " NPESSOAS = '" + txtNPessoas1.getText() + "' ,"
                + " VALOR = '" + txtNPessoas1.getText() + "' ,"
                + " PAGAMENTO = '" + txtNPessoas.getText() + "' "
                + " WHERE COD_HOSPEDE = '" + txtNPessoas2.getText() + "';";

        System.out.print(sql);
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Atualizado!");
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Não Atualizado!");
        }
    }//GEN-LAST:event_btnResAtuActionPerformed

    private void btnHosAtuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHosAtuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHosAtuMouseClicked

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
    private javax.swing.JButton btnHosCriar;
    private javax.swing.JButton btnHosDel;
    private javax.swing.JButton btnHosLim;
    private javax.swing.JButton btnHosNovo;
    private javax.swing.JButton btnHospedes;
    private javax.swing.JButton btnResAtu;
    private javax.swing.JButton btnResCriar;
    private javax.swing.JButton btnResDel;
    private javax.swing.JButton btnResLim;
    private javax.swing.JButton btnResNovo;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JFormattedTextField ftxtDataEntrada;
    private javax.swing.JFormattedTextField ftxtDataN;
    private javax.swing.JFormattedTextField ftxtDataSaida;
    private javax.swing.JFormattedTextField ftxtRg;
    private java.util.List<Oficial.Hospedes> hospedesList;
    private java.util.List<Oficial.Hospedes> hospedesList1;
    private javax.persistence.Query hospedesQuery;
    private javax.persistence.Query hospedesQuery1;
    private javax.swing.JComboBox<String> jComboBox3;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JPanel pnlHospedes;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlReservas;
    private javax.swing.JRadioButton rbtnFeminino;
    private javax.swing.JRadioButton rbtnMasculino;
    private java.util.List<Oficial.Reservass> reservassList;
    private java.util.List<Oficial.Reservass> reservassList1;
    private javax.persistence.Query reservassQuery;
    private javax.persistence.Query reservassQuery1;
    private javax.swing.JTable tbHospede;
    private javax.swing.JTextField txtCel;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNPessoas;
    private javax.swing.JTextField txtNPessoas1;
    private javax.swing.JTextField txtNPessoas2;
    private javax.swing.JTextField txtNPessoas3;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtTel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
