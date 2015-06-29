/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Classes.ButtonColumnAdd;
import Classes.ButtonColumnRemove;
import Classes.JanelaUtil;
import Classes.MenuUtil;
import Controller.ControlProduto;
import Controller.ControlVenda;
import Model.Itens;
import Model.Produto;
import Model.Venda;
import View.Menu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar.nascimento
 */
public class Cad_Venda extends javax.swing.JFrame {
    int id_func;
    Menu m = MenuUtil.MENU.get("Menu");
    /**
     * Creates new form Cad_Venda
     * @param id_func
     */
    public Cad_Venda(int id_func) {
        this.id_func = id_func;
        initComponents();
        JanelaUtil.JANELAS.put("Venda", this);
        ButtonColumnRemove b1 = new ButtonColumnRemove(jTableComprados, 4);
        ButtonColumnAdd b = new ButtonColumnAdd(jTableEstoque,4,jTableComprados);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Cliente = new javax.swing.JLabel();
        jTextCliente = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jLabelEstoque = new javax.swing.JLabel();
        TitulojComprado = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableComprados = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextConsultaProd = new javax.swing.JTextField();
        jLabelIdProd = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelTotal = new javax.swing.JLabel();
        jLabelRS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Vendas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1Cliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1Cliente.setText("Cliente:");

        jTextCliente.setName(""); // NOI18N

        jLabelValor.setFont(new java.awt.Font("Raleway", 1, 16)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 0, 0));
        jLabelValor.setText("Total:");

        jTableEstoque.setAutoCreateRowSorter(true);
        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade", "Adicionar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoque.setRowHeight(24);
        jScrollPane1.setViewportView(jTableEstoque);

        jLabelEstoque.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstoque.setText("Produtos em Estoque");

        TitulojComprado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TitulojComprado.setText("Produtos Comprados");

        jTableComprados.setAutoCreateRowSorter(true);
        jTableComprados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Preço", "Quantidade", "Excluir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableComprados.setRowHeight(24);
        jScrollPane2.setViewportView(jTableComprados);

        jButtonCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMousePressed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jTextConsultaProd.setName(""); // NOI18N

        jLabelIdProd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdProd.setText("Nome:");

        jButtonPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find.png"))); // NOI18N
        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonPesquisarMousePressed(evt);
            }
        });

        jLabelTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTotal.setText("0.0");

        jLabelRS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRS.setText("R$");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("ID-Vendedor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCadastrar)
                                .addGap(32, 32, 32)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelValor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelRS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TitulojComprado)
                            .addComponent(jScrollPane2)
                            .addComponent(jLabelEstoque)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelIdProd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPesquisar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Cliente)
                    .addComponent(jTextCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelEstoque)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdProd)
                    .addComponent(jButtonPesquisar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TitulojComprado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelValor)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelRS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableComprados.getModel();
        int qtdRows = model.getRowCount();
        ControlProduto cp = new ControlProduto();
        for(int i=0;i<qtdRows;i++){
            try {
                cp.adicionarProduto((int)model.getValueAt(i, 0), (double)model.getValueAt(i, 3));
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPesquisarMousePressed
        DefaultTableModel model = (DefaultTableModel) jTableEstoque.getModel();
        model.setNumRows(0);
        List<Produto> produtos = new ArrayList<>();
        if(jTextConsultaProd.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Campo Nome do produto em branco, para adicionar produtos na venda, você precisa pesquisá-los antes.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                ControlProduto cp = new ControlProduto();
                produtos = cp.consultarProduto(jTextConsultaProd.getText());
                Object vec[] = new Object[4];
                for(Produto pi : produtos){
                    vec[0] = pi.getId();
                    vec[1] = pi.getNome();
                    vec[2] = pi.getPreco();
                    vec[3] = 0.0;
                    model.addRow(vec);
                }
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonPesquisarMousePressed

    private void jButtonCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMousePressed
        if(Double.parseDouble(jLabelTotal.getText())==0.0){
            if(JOptionPane.showConfirmDialog(this, "Você não comprou nenhum produto e está "
                    + "finalizando a venda, tem certeza que quer continuar? \n Sim - não será gerado nada e você voltará para o Menu, Não - "
                    + "você continuará nessa tela", "Alerta", JOptionPane.YES_NO_OPTION)==0){
                dispose();
            }
        }else{
            DefaultTableModel model = (DefaultTableModel) jTableComprados.getModel();
            Venda v = new Venda();
            ControlProduto cp = new ControlProduto();
            int id=0,preco=2,qtd=3;
            int qtdRows = model.getRowCount();
            v.setIdVendedor(id_func);
            if(jTextCliente.getText().isEmpty()){
                v.setCpfCliente(-1);
            }else{
                v.setCpfCliente(Long.parseLong(jTextCliente.getText()));
            }
            v.setValorTotal(Double.parseDouble(jLabelTotal.getText()));
            ArrayList<Itens> itens = new ArrayList<>();
            for(int i=0;i<qtdRows;i++){
                Itens it = new Itens();
                it.setIdProduto((int)model.getValueAt(i, id));
                it.setQuantidade((double)model.getValueAt(i, qtd));
                it.setPreco((double)model.getValueAt(i, preco));
                itens.add(it);
            }
            v.setItens(itens);
            try {
                ControlVenda cv = new ControlVenda();
                cv.cadastrarVenda(v);
                JOptionPane.showMessageDialog(this, "Venda cadastrada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        m.atualizaMenu();
    }//GEN-LAST:event_jButtonCadastrarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jLabel2.setText(String.valueOf(id_func));
    }//GEN-LAST:event_formWindowOpened
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitulojComprado;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Cliente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstoque;
    private javax.swing.JLabel jLabelIdProd;
    private javax.swing.JLabel jLabelRS;
    public javax.swing.JLabel jLabelTotal;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableComprados;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTextField jTextCliente;
    private javax.swing.JTextField jTextConsultaProd;
    // End of variables declaration//GEN-END:variables
}
