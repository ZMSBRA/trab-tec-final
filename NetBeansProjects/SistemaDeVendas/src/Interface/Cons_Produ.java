/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Dao.ProdutoDao;
import ModuloDeProdutos.Produto;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cesar.nascimento
 */
public class Cons_Produ extends javax.swing.JFrame {

    /** Creates new form Cons_Produ */
    public Cons_Produ() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCodigo = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jRadioButtonNome = new javax.swing.JRadioButton();
        jRadioButtonCodigo = new javax.swing.JRadioButton();
        jLabelNome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProd = new javax.swing.JTable();
        jLabel1Selecione = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCodigo.setText("Código:");

        jTextCodigo.setName(""); // NOI18N

        jRadioButtonNome.setText("Nome");
        jRadioButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNomeActionPerformed(evt);
            }
        });

        jRadioButtonCodigo.setText("Código");
        jRadioButtonCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCodigoActionPerformed(evt);
            }
        });

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTableProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Editar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProd);

        jLabel1Selecione.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1Selecione.setText("Selecione: ");

        jTextNome.setName(""); // NOI18N

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonConsultarMousePressed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNome)
                                .addComponent(jLabel1Selecione))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jRadioButtonNome)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButtonCodigo))
                                .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsultar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCodigo)
                                .addGap(18, 18, 18)
                                .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Selecione)
                    .addComponent(jRadioButtonNome)
                    .addComponent(jRadioButtonCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodigo)
                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultar)
                    .addComponent(jButtonCancelar))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        jRadioButtonNome.getAccessibleContext().setAccessibleName("codigo");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNomeActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableProd.getModel();
        model.setNumRows(0);
        if(jRadioButtonNome.isSelected()==true){
            jRadioButtonCodigo.setSelected(false);
            jTextNome.setEnabled(true);
            jTextCodigo.setText("");
            jTextCodigo.setEnabled(false);
        }else{
            jTextCodigo.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonNomeActionPerformed

    private void jRadioButtonCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCodigoActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableProd.getModel();
        model.setNumRows(0);
        if(jRadioButtonCodigo.isSelected()==true){
            jRadioButtonNome.setSelected(false);
            jTextCodigo.setEnabled(true);
            jTextNome.setText("");
            jTextNome.setEnabled(false);
        }else{
            jTextNome.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButtonCodigoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jRadioButtonNome.setSelected(true);
        jTextCodigo.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonConsultarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonConsultarMousePressed
        DefaultTableModel model = (DefaultTableModel) jTableProd.getModel();
        model.setNumRows(0);
        ProdutoDao p = new ProdutoDao();
        List<Produto> produtos = new ArrayList<>();
        int passa=0;
        if(jRadioButtonNome.isSelected()==true && jTextNome.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Nome em branco, por favor, preencha e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else if(jRadioButtonNome.isSelected()==true){
            produtos = p.consultar(jTextNome.getText());
        }
        if(jRadioButtonCodigo.isSelected()==true && jTextCodigo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo Código em branco, por favor, preencha e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else if(jRadioButtonCodigo.isSelected()==true){
            try{
                Integer.parseInt(jTextCodigo.getText());
                produtos = p.consultar(Integer.parseInt(jTextCodigo.getText()));
            }catch(NumberFormatException e){
                passa=1;
                JOptionPane.showMessageDialog(null, "O campo Código é numérico,por favor, verifique e pesquise novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
                jTextCodigo.setText("");
                jTextCodigo.requestFocus();
            }
        }
        if(passa==0 && produtos.isEmpty()){
            JOptionPane.showMessageDialog(null, "A pesquisa não retornou dados, tente novamente.", "Alerta", JOptionPane.WARNING_MESSAGE);
        }else{
            Object vec[] = new Object[2];
            for(Produto pi : produtos){
                vec[0] = pi.getNome();
                vec[1] = pi.getId();
                model.addRow(vec);
            }
        }
    }//GEN-LAST:event_jButtonConsultarMousePressed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JLabel jLabel1Selecione;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JRadioButton jRadioButtonCodigo;
    private javax.swing.JRadioButton jRadioButtonNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProd;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables

}
