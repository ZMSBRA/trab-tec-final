/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.BorderLayout;
import Classes.Sessao;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author cesar.nascimento
 */
public class Menu extends javax.swing.JFrame {
    Sessao s = new Sessao();
    /**
     * Creates new form Menu
     */
    public Menu(Sessao s) {
        this.s = s;
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        getContentPane().setLayout(new BorderLayout());
        setVisible(true);
        add(jPanel2, BorderLayout.CENTER);
        //centralizado
        //int panelX = (getWidth() - jPanel2.getWidth() - getInsets().left - getInsets().right) / 2;
        //int panelY = (getHeight() - jPanel2.getHeight() - getInsets().top - getInsets().bottom) / 2;
        //jPanel2.setLocation(panelX, panelY);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cadVenda = new javax.swing.JLabel();
        consVenda = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cadProd = new javax.swing.JLabel();
        consProd = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cadCliente = new javax.swing.JLabel();
        consCliente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cadFunc = new javax.swing.JLabel();
        consFunc = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        tiBox = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        textOla = new javax.swing.JLabel();
        textDia = new javax.swing.JLabel();
        valDia = new javax.swing.JLabel();
        texMes = new javax.swing.JLabel();
        valMes = new javax.swing.JLabel();
        vendasText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHorarioVenda = new javax.swing.JTable();
        nameFunc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        logoBox = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemCad_Venda = new javax.swing.JMenuItem();
        jMenuItemCons_Venda = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemCad_Prod = new javax.swing.JMenuItem();
        jMenuItemCons_Prod = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemCad_Func = new javax.swing.JMenuItem();
        jMenuItemCons_Func = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItemCad_Clien = new javax.swing.JMenuItem();
        jMenuItemCons_Client = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(null);
        setPreferredSize(new java.awt.Dimension(1200, 745));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(252, 252, 252));
        jPanel2.setMinimumSize(new java.awt.Dimension(1217, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1217, 600));

        jPanel4.setBackground(new java.awt.Color(46, 204, 113));
        jPanel4.setPreferredSize(new java.awt.Dimension(320, 200));
        jPanel4.setVerifyInputWhenFocusTarget(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vendas.png"))); // NOI18N

        cadVenda.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        cadVenda.setForeground(new java.awt.Color(255, 255, 255));
        cadVenda.setText("+ Cadastrar Venda");
        cadVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadVendaMousePressed(evt);
            }
        });

        consVenda.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        consVenda.setForeground(new java.awt.Color(255, 255, 255));
        consVenda.setText("+ Consultar Venda");
        consVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consVendaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(consVenda)
                    .addComponent(cadVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(cadVenda)
                .addGap(33, 33, 33)
                .addComponent(consVenda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(45, 198, 110));
        jPanel1.setPreferredSize(new java.awt.Dimension(320, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/produtos.png"))); // NOI18N

        cadProd.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        cadProd.setForeground(new java.awt.Color(255, 255, 255));
        cadProd.setText("+ Cadastrar Produto");
        cadProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadProdMousePressed(evt);
            }
        });

        consProd.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        consProd.setForeground(new java.awt.Color(255, 255, 255));
        consProd.setText("+ Consultar Produto");
        consProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consProdMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadProd)
                    .addComponent(consProd))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(cadProd)
                .addGap(31, 31, 31)
                .addComponent(consProd)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(46, 204, 113));
        jPanel5.setPreferredSize(new java.awt.Dimension(320, 200));
        jPanel5.setVerifyInputWhenFocusTarget(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N

        cadCliente.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        cadCliente.setForeground(new java.awt.Color(255, 255, 255));
        cadCliente.setText("+ Cadastrar Cliente");
        cadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadClienteMousePressed(evt);
            }
        });

        consCliente.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        consCliente.setForeground(new java.awt.Color(255, 255, 255));
        consCliente.setText("+ Consultar Cliente");
        consCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consClienteMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(cadCliente)
                .addGap(41, 41, 41)
                .addComponent(consCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(45, 198, 110));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/funcionario.png"))); // NOI18N
        jLabel5.setText(" ");

        cadFunc.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        cadFunc.setForeground(new java.awt.Color(255, 255, 255));
        cadFunc.setText("+ Cadastrar Funcionário");
        cadFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cadFuncMousePressed(evt);
            }
        });

        consFunc.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        consFunc.setForeground(new java.awt.Color(255, 255, 255));
        consFunc.setText("+ Consultar Funcionário");
        consFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                consFuncMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(consFunc)
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(cadFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(cadFunc)
                .addGap(40, 40, 40)
                .addComponent(consFunc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBackground(new java.awt.Color(45, 198, 110));

        tiBox.setFont(new java.awt.Font("Lato Medium", 0, 16)); // NOI18N
        tiBox.setForeground(new java.awt.Color(255, 255, 255));
        tiBox.setText("Informações Gerais - ");

        jLabelData.setFont(new java.awt.Font("Lato Medium", 0, 16)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText(" ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(tiBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tiBox, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabelData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        textOla.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N
        textOla.setText("Olá,");

        textDia.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        textDia.setText("Total de vendas realizadas no dia:");

        valDia.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        valDia.setForeground(new java.awt.Color(51, 204, 0));
        valDia.setText("Valor");

        texMes.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        texMes.setText("Total de vendas no mês:");

        valMes.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        valMes.setForeground(new java.awt.Color(51, 204, 0));
        valMes.setText("Valor");

        vendasText.setFont(new java.awt.Font("Lato", 0, 16)); // NOI18N
        vendasText.setText("Ultimas vendas realizadas:");

        tableHorarioVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Horário", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableHorarioVenda.setRowHeight(22);
        jScrollPane1.setViewportView(tableHorarioVenda);

        nameFunc.setFont(new java.awt.Font("Lato Medium", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Lato Semibold", 0, 18)); // NOI18N
        jLabel7.setText("Aqui estão as suas informações:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(texMes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valMes))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(textDia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valDia))
                            .addComponent(jLabel7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(textOla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(vendasText)
                                .addGap(219, 219, 219)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textOla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDia)
                    .addComponent(valDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texMes)
                    .addComponent(valMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vendasText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(45, 200, 111));

        logoBox.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        logoBox.setForeground(new java.awt.Color(255, 255, 255));
        logoBox.setText("Bem-Vindo ao ZMS  -  Sistema de Vendas");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(logoBox)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                .addGap(357, 357, 357))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(6, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("Vendas");

        jMenuItemCad_Venda.setText("Cadastro");
        jMenuItemCad_Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCad_VendaMousePressed(evt);
            }
        });
        jMenu1.add(jMenuItemCad_Venda);

        jMenuItemCons_Venda.setText("Consulta");
        jMenuItemCons_Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCons_VendaMousePressed(evt);
            }
        });
        jMenu1.add(jMenuItemCons_Venda);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Produtos");

        jMenuItemCad_Prod.setText("Cadastro");
        jMenuItemCad_Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCad_ProdMousePressed(evt);
            }
        });
        jMenu2.add(jMenuItemCad_Prod);

        jMenuItemCons_Prod.setText("Consulta");
        jMenuItemCons_Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCons_ProdMousePressed(evt);
            }
        });
        jMenu2.add(jMenuItemCons_Prod);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Funcionários");

        jMenuItemCad_Func.setText("Cadastro");
        jMenuItemCad_Func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCad_FuncMousePressed(evt);
            }
        });
        jMenu4.add(jMenuItemCad_Func);

        jMenuItemCons_Func.setText("Consulta");
        jMenuItemCons_Func.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCons_FuncMousePressed(evt);
            }
        });
        jMenu4.add(jMenuItemCons_Func);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Clientes");

        jMenuItemCad_Clien.setText("Cadastro");
        jMenuItemCad_Clien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCad_ClienMousePressed(evt);
            }
        });
        jMenu5.add(jMenuItemCad_Clien);

        jMenuItemCons_Client.setText("Consulta");
        jMenuItemCons_Client.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenuItemCons_ClientMousePressed(evt);
            }
        });
        jMenu5.add(jMenuItemCons_Client);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCad_ProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCad_ProdMousePressed
        Cad_Produ cf = new Cad_Produ();
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItemCad_ProdMousePressed

    private void jMenuItemCad_FuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCad_FuncMousePressed
        Cad_Func cf = new Cad_Func();
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItemCad_FuncMousePressed

    private void jMenuItemCons_FuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCons_FuncMousePressed
        Cons_Func cf = new Cons_Func();
        cf.setVisible(true);
    }//GEN-LAST:event_jMenuItemCons_FuncMousePressed

    private void jMenuItemCad_ClienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCad_ClienMousePressed
        Cad_Clien cc = new Cad_Clien();
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItemCad_ClienMousePressed

    private void jMenuItemCad_VendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCad_VendaMousePressed
        Cad_Venda cv = new Cad_Venda(s.getId());
        cv.setVisible(true);
    }//GEN-LAST:event_jMenuItemCad_VendaMousePressed

    private void jMenuItemCons_VendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCons_VendaMousePressed
        Cons_Venda cv = new Cons_Venda();
        cv.setVisible(true);
    }//GEN-LAST:event_jMenuItemCons_VendaMousePressed

    private void jMenuItemCons_ProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCons_ProdMousePressed
        Cons_Produ cp = new Cons_Produ();
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItemCons_ProdMousePressed

    private void jMenuItemCons_ClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCons_ClientMousePressed
        Cons_Clien cc = new Cons_Clien();
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItemCons_ClientMousePressed

    private void cadVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadVendaMousePressed
        Cad_Venda cv = new Cad_Venda(s.getId());
        cv.setVisible(true);
    }//GEN-LAST:event_cadVendaMousePressed

    private void consVendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consVendaMousePressed
        Cons_Venda cv = new Cons_Venda();
        cv.setVisible(true);
    }//GEN-LAST:event_consVendaMousePressed

    private void cadProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadProdMousePressed
        Cad_Produ cp = new Cad_Produ();
        cp.setVisible(true);
    }//GEN-LAST:event_cadProdMousePressed

    private void consProdMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consProdMousePressed
        Cons_Produ cp = new Cons_Produ();
        cp.setVisible(true);
    }//GEN-LAST:event_consProdMousePressed

    private void cadClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadClienteMousePressed
        Cad_Clien cc = new Cad_Clien();
        cc.setVisible(true);
    }//GEN-LAST:event_cadClienteMousePressed

    private void consClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consClienteMousePressed
        Cons_Clien cc = new Cons_Clien();
        cc.setVisible(true);
    }//GEN-LAST:event_consClienteMousePressed

    private void cadFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadFuncMousePressed
        Cad_Func cf = new Cad_Func();
        cf.setVisible(true);
    }//GEN-LAST:event_cadFuncMousePressed

    private void consFuncMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consFuncMousePressed
        Cons_Func cf = new Cons_Func();
        cf.setVisible(true);
    }//GEN-LAST:event_consFuncMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nameFunc.setText(s.getNome());
        Calendar c = Calendar.getInstance();
        c.setTime(c.getTime());
        SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
        jLabelData.setText(s.format(c.getTime()));
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadCliente;
    private javax.swing.JLabel cadFunc;
    private javax.swing.JLabel cadProd;
    private javax.swing.JLabel cadVenda;
    private javax.swing.JLabel consCliente;
    private javax.swing.JLabel consFunc;
    private javax.swing.JLabel consProd;
    private javax.swing.JLabel consVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCad_Clien;
    private javax.swing.JMenuItem jMenuItemCad_Func;
    private javax.swing.JMenuItem jMenuItemCad_Prod;
    private javax.swing.JMenuItem jMenuItemCad_Venda;
    private javax.swing.JMenuItem jMenuItemCons_Client;
    private javax.swing.JMenuItem jMenuItemCons_Func;
    private javax.swing.JMenuItem jMenuItemCons_Prod;
    private javax.swing.JMenuItem jMenuItemCons_Venda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logoBox;
    private javax.swing.JLabel nameFunc;
    private javax.swing.JTable tableHorarioVenda;
    private javax.swing.JLabel texMes;
    private javax.swing.JLabel textDia;
    private javax.swing.JLabel textOla;
    private javax.swing.JLabel tiBox;
    private javax.swing.JLabel valDia;
    private javax.swing.JLabel valMes;
    private javax.swing.JLabel vendasText;
    // End of variables declaration//GEN-END:variables
}
