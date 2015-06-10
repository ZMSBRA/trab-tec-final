/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import ModuloDePessoas.Funcionario;
import Classes.*;
import Dao.FuncionarioDao;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;
/**
 *
 * @author cesar.nascimento
 */
public class Cad_Func extends javax.swing.JInternalFrame {

    /**
     * Creates new form Cad_Func_Teste
     */
    public Cad_Func() {
        initComponents();
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioSexoM = new javax.swing.JRadioButton();
        jLabelComple = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelAcesso = new javax.swing.JLabel();
        jLabelDtNasc = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextCPF = new javax.swing.JTextField();
        jTextComple = new javax.swing.JTextField();
        jFormattedDtNasc = new javax.swing.JFormattedTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jLabelConfSenha = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonLimpar = new javax.swing.JButton();
        jLabelRua = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jTextRua = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextNumero = new javax.swing.JTextField();
        jPasswordConfSenha = new javax.swing.JPasswordField();
        jLabelNumero = new javax.swing.JLabel();
        jTextRG = new javax.swing.JTextField();
        jLabelCEP = new javax.swing.JLabel();
        jPasswordSenha = new javax.swing.JPasswordField();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jComboEstado = new javax.swing.JComboBox();
        Endereço = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelDados = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jTextBairro = new javax.swing.JTextField();
        jRadioSexoF = new javax.swing.JRadioButton();
        jTextLogin = new javax.swing.JTextField();

        jRadioSexoM.setText("M");
        jRadioSexoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSexoMActionPerformed(evt);
            }
        });

        jLabelComple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelComple.setText("Complemento:");

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");

        jLabelAcesso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAcesso.setText("Dados de Acesso");

        jLabelDtNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDtNasc.setText("Nascimento: ");

        jTextCPF.setName(""); // NOI18N

        try {
            jFormattedDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLogin.setText("Login:");

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF:");

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSenha.setText("Senha:");

        jLabelRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRG.setText("RG:");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado");

        jLabelConfSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelConfSenha.setText("Confirme a senha:");

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCadastrarMousePressed(evt);
            }
        });

        jButtonLimpar.setText("Limpar Campos");
        jButtonLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonLimparMousePressed(evt);
            }
        });

        jLabelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRua.setText("Rua:");

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        jTextRua.setName(""); // NOI18N

        jTextNumero.setName(""); // NOI18N
        jTextNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNumeroFocusLost(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Numero:");

        jTextRG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextRGFocusLost(evt);
            }
        });

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCEP.setText("CEP:");

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        Endereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Endereço.setText("Endereço");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jLabelDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDados.setText("Dados Pessoais");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextCidade.setName(""); // NOI18N

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jTextNome.setName(""); // NOI18N

        jRadioSexoF.setText("F");
        jRadioSexoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSexoFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConfSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSenha)
                            .addComponent(jLabelLogin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(jPasswordSenha)))
                    .addComponent(jLabelAcesso)
                    .addComponent(jLabelDados)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNome))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabelDtNasc)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelCPF)
                                .addGap(3, 3, 3)
                                .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioSexoM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioSexoF))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabelRG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextRG, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Endereço)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelBairro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabelComple)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextComple))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRua)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDados)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioSexoM)
                    .addComponent(jRadioSexoF)
                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDtNasc)
                    .addComponent(jTextCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedDtNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCPF)
                    .addComponent(jLabelRG)
                    .addComponent(jTextRG, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Endereço)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEstado)
                    .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelComple)
                    .addComponent(jTextComple, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelAcesso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLogin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfSenha)
                    .addComponent(jPasswordConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioSexoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSexoMActionPerformed
        jRadioSexoF.setSelected(false);
    }//GEN-LAST:event_jRadioSexoMActionPerformed

    private void jButtonCadastrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCadastrarMousePressed
        Funcionario f = new Funcionario();
        MD5 m = new MD5();
        int erro=0,cpferro=0,senha=0;
        Component components[] = getContentPane().getComponents();
        //Para cada componente
        for (Component component : components) {
            //É campo de texto?
            if (component instanceof JTextField) {
                //Está preenchido?
                if ((JTextField) component != jTextComple && ((JTextField) component).getText().isEmpty() ){
                    erro=1;
                    break;
                }
            }
            //Verifica se é ComboBox
            if (component instanceof JComboBox) {
                //Se não está selecionado gera msg
                if (((JComboBox) component).getSelectedItem().toString().equals("SELECIONE")) {
                    erro=1;
                    break;
                }
            }
            if (component instanceof JRadioButton) {
                //Algum está selecionado?
                if (jRadioSexoF.isSelected()==false && jRadioSexoM.isSelected()==false) {
                    erro=1;
                    break;
                }
            }
        }
        if(erro==0 && ValidadorCPF.TestaCPF(jTextCPF.getText())==true){
            cpferro=0;
        }else{
            cpferro=1;
        }
        if(cpferro==0){
            if(!m.geraMD5(jPasswordSenha.getText()).equals(m.geraMD5(jPasswordConfSenha.getText()))){
                senha=1;
            }else{
                senha=0;
            }
        }
        if(erro==1){
            erro=0;
            JOptionPane.showMessageDialog(null,"Preencha todos os campos.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else if(erro==0 && cpferro==1){
            jTextCPF.setText("");
            jTextCPF.requestFocus();
            JOptionPane.showMessageDialog(null,"CPF inválido, por favor, verifique e digite novamente.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else if(erro==0 && senha==1){
            jLabelSenha.setForeground(Color.red);
            jLabelConfSenha.setForeground(Color.red);
            jPasswordSenha.setText("");
            jPasswordConfSenha.setText("");
            jPasswordSenha.requestFocus();
            JOptionPane.showMessageDialog(null,"As senhas não conferem, por favor, verifique e digite novamente.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else if(senha==0 && cpferro==0 && erro==0){
            jLabelSenha.setForeground(Color.black);
            jLabelConfSenha.setForeground(Color.black);
            f.setNome(jTextNome.getText());
            f.setSexo(jRadioSexoM.getText().charAt(0));
            try {
                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
                String data = jFormattedDtNasc.getText();
                Calendar c = Calendar.getInstance();
                c.setTime(formatoData.parse(data));
                f.setDtNasc(c);
            } catch (Exception e) {}
            f.setCPF(Long.parseLong(jTextCPF.getText()));
            f.setRG(Long.parseLong(jTextRG.getText()));
            f.setNumero(Integer.parseInt(jTextNumero.getText()));
            f.setRua(jTextRua.getText());
            f.setCep(jFormattedCEP.getText());
            f.setEstado(jComboEstado.getSelectedItem().toString());
            f.setCidade(jTextCidade.getText());
            f.setBairro(jTextBairro.getText());
            f.setComple(jTextComple.getText());
            f.setLogin(jTextLogin.getText());
            f.setSenha(m.geraMD5(jPasswordSenha.getText()));
            //inserir no banco de dados e depois lançar msg de sucesso na operação de inserting.
            FuncionarioDao fd = new FuncionarioDao();
            fd.cadastrar(f);
            JOptionPane.showMessageDialog(null,"Funcionário cadastrado com sucesso.","Sucesso",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCadastrarMousePressed

    private void jButtonLimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLimparMousePressed
        jTextNome.setText("");
        jRadioSexoF.setSelected(false);
        jRadioSexoM.setSelected(false);
        jFormattedDtNasc.setText("");
        jTextCPF.setText("");
        jTextRG.setText("");
        jTextRua.setText("");
        jTextNumero.setText("");
        jFormattedCEP.setText("");
        jComboEstado.setSelectedItem("SELECIONE");
        jTextCidade.setText("");
        jTextBairro.setText("");
        jTextComple.setText("");
        jTextLogin.setText("");
        jPasswordSenha.setText("");
        jPasswordConfSenha.setText("");
    }//GEN-LAST:event_jButtonLimparMousePressed

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jTextNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNumeroFocusLost
        try{
            if(!jTextNumero.getText().equals("")){
                Integer.parseInt(jTextNumero.getText());
                jLabelNumero.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelNumero.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo Número é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextNumero.setText("");
            jTextNumero.requestFocus();
        }
    }//GEN-LAST:event_jTextNumeroFocusLost

    private void jTextRGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextRGFocusLost
        try{
            if(!jTextRG.getText().equals("")){
                Long.parseLong(jTextRG.getText());
                jLabelRG.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelRG.setForeground(Color.red);
            JOptionPane.showMessageDialog(null,"O campo RG é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextRG.setText("");
            jTextRG.requestFocus();
        }
    }//GEN-LAST:event_jTextRGFocusLost

    private void jRadioSexoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSexoFActionPerformed
        jRadioSexoM.setSelected(false);
    }//GEN-LAST:event_jRadioSexoFActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Endereço;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JComboBox jComboEstado;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedDtNasc;
    private javax.swing.JLabel jLabelAcesso;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComple;
    private javax.swing.JLabel jLabelConfSenha;
    private javax.swing.JLabel jLabelDados;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JPasswordField jPasswordConfSenha;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JRadioButton jRadioSexoF;
    private javax.swing.JRadioButton jRadioSexoM;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCPF;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextComple;
    private javax.swing.JTextField jTextLogin;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTextRG;
    private javax.swing.JTextField jTextRua;
    // End of variables declaration//GEN-END:variables
}