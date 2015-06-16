/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Dao.ProdutoDao;
import ModuloDeProdutos.Produto;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author cesar.nascimento
 */
public class Edit_Produ extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Produ
     */
    public Edit_Produ() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitulojLabel = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextQuantidade = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jTextPreco = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextDescricao = new javax.swing.JTextArea();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jTextID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Produto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TitulojLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        TitulojLabel.setText("Cadastro de Produtos");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextNome.setName(""); // NOI18N

        jTextQuantidade.setName(""); // NOI18N
        jTextQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextQuantidadeFocusLost(evt);
            }
        });

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade: ");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPreco.setText("Preço(uni/kg): ");

        jTextPreco.setName(""); // NOI18N
        jTextPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextPrecoFocusLost(evt);
            }
        });

        jLabelDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDescricao.setText("Descrição: ");

        jTextDescricao.setColumns(20);
        jTextDescricao.setRows(5);
        jScrollPane1.setViewportView(jTextDescricao);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSalvarMousePressed(evt);
            }
        });

        jTextID.setName(""); // NOI18N

        jLabelID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelID.setText("ID - Produto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(TitulojLabel)
                        .addComponent(jLabelNome)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelPreco)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelQuantidade)
                            .addGap(18, 18, 18)
                            .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelDescricao)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonCancelar))))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitulojLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidade)
                    .addComponent(jTextQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jTextQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextQuantidadeFocusLost
        try{
            if(!jTextQuantidade.getText().equals("")){
                Integer.parseInt(jTextQuantidade.getText());
                jLabelQuantidade.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelQuantidade.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo Quantidade é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextQuantidade.setText("");
            jTextQuantidade.requestFocus();
        }
    }//GEN-LAST:event_jTextQuantidadeFocusLost

    private void jTextPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextPrecoFocusLost
        try{
            if(!jTextPreco.getText().equals("")){
                Double.parseDouble(jTextPreco.getText());
                jLabelPreco.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelPreco.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo Preço é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextPreco.setText("");
            jTextPreco.requestFocus();
        }
    }//GEN-LAST:event_jTextPrecoFocusLost

    private void jButtonSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMousePressed
        int erro = 0;
        Component components[] = getContentPane().getComponents();
        for (Component component : components) {
            //É campo de texto?
            if (component instanceof JTextField) {
                //Está preenchido?
                if (((JTextField) component).getText().isEmpty() ){
                    erro=1;
                    break;
                }

                if (jTextDescricao.getText().isEmpty() ){
                    erro=1;
                    break;
                }
            }
        }
        if(erro==1){
            JOptionPane.showMessageDialog(null,"Preencha todos os campos.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else{
            Produto p = new Produto();
            p.setNome(jTextNome.getText());
            p.setId(Integer.parseInt(jTextID.getText()));
            p.setPreco(Double.parseDouble(jTextPreco.getText()));
            p.setDescricao(jTextDescricao.getText());
            p.setQuantidade(Double.parseDouble(jTextQuantidade.getText()));
            ProdutoDao pd = new ProdutoDao();
            pd.atualizar(p);
            JOptionPane.showMessageDialog(null,"Dados alterados com sucesso.","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSalvarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextID.setEnabled(false);
        setAlwaysOnTop(true);
    }//GEN-LAST:event_formWindowOpened
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitulojLabel;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextDescricao;
    public javax.swing.JTextField jTextID;
    public javax.swing.JTextField jTextNome;
    public javax.swing.JTextField jTextPreco;
    public javax.swing.JTextField jTextQuantidade;
    // End of variables declaration//GEN-END:variables
}
