/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.ControlFuncionario;
import Model.Funcionario;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author Silent
 */
public class Edit_Func extends javax.swing.JFrame {
    int alterou = 0;
    String rua;
    int numero;
    String cep;
    String estado;
    String cidade;
    String bairro;
    String comple;
    /**
     * Creates new form Cad_Func
     */
    public Edit_Func() {
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

        jLabelDados = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jRadioSexoF = new javax.swing.JRadioButton();
        jRadioSexoM = new javax.swing.JRadioButton();
        jLabelSexo = new javax.swing.JLabel();
        jLabelDtNasc = new javax.swing.JLabel();
        jTextCPF = new javax.swing.JTextField();
        jFormattedDtNasc = new javax.swing.JFormattedTextField();
        jLabelCPF = new javax.swing.JLabel();
        jLabelRG = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelRua = new javax.swing.JLabel();
        jTextRua = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jComboEstado = new javax.swing.JComboBox();
        Endereço = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jLabelBairro = new javax.swing.JLabel();
        jTextBairro = new javax.swing.JTextField();
        jLabelComple = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextComple = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextRG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCheckAdmin = new javax.swing.JCheckBox();
        jCheckFunc = new javax.swing.JCheckBox();
        jButtonDemitir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelDemisao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Funcionário");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelDados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDados.setText("Dados Pessoais");

        jLabelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNome.setText("Nome:");

        jTextNome.setName(""); // NOI18N

        jRadioSexoF.setText("F");

        jRadioSexoM.setText("M");

        jLabelSexo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSexo.setText("Sexo:");

        jLabelDtNasc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDtNasc.setText("Nascimento: ");

        jTextCPF.setName(""); // NOI18N

        try {
            jFormattedDtNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelCPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCPF.setText("CPF:");

        jLabelRG.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRG.setText("RG:");

        jLabelEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelEstado.setText("Estado");

        jLabelRua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelRua.setText("Rua:");

        jTextRua.setName(""); // NOI18N
        jTextRua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextRuaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextRuaFocusLost(evt);
            }
        });

        jTextNumero.setName(""); // NOI18N
        jTextNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextNumeroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNumeroFocusLost(evt);
            }
        });

        jLabelNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumero.setText("Numero:");

        jLabelCEP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCEP.setText("CEP:");

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedCEPFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedCEPFocusLost(evt);
            }
        });

        jComboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SELECIONE", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));
        jComboEstado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboEstadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jComboEstadoFocusLost(evt);
            }
        });

        Endereço.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Endereço.setText("Endereço");

        jLabelCidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCidade.setText("Cidade:");

        jTextCidade.setName(""); // NOI18N
        jTextCidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextCidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCidadeFocusLost(evt);
            }
        });

        jLabelBairro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBairro.setText("Bairro:");

        jTextBairro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextBairroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextBairroFocusLost(evt);
            }
        });

        jLabelComple.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelComple.setText("Complemento:");

        jTextComple.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextCompleFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextCompleFocusLost(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/script_edit.png"))); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonSalvarMousePressed(evt);
            }
        });

        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Permissões");

        jCheckAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckAdmin.setText("Administrador");
        jCheckAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckAdminActionPerformed(evt);
            }
        });

        jCheckFunc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckFunc.setText("Vendedor");
        jCheckFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckFuncActionPerformed(evt);
            }
        });

        jButtonDemitir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_delete.png"))); // NOI18N
        jButtonDemitir.setText("Demitir");
        jButtonDemitir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonDemitirMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Data da Demissão");

        jLabelDemisao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addGap(15, 15, 15)
                        .addComponent(jButtonDemitir)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckFunc)))
                        .addGap(172, 172, 172)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabelDemisao, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(112, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDemisao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckAdmin)
                        .addComponent(jCheckFunc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDemitir))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMousePressed
        Funcionario f = new Funcionario();
        int erro=0;
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
            if (component instanceof JCheckBox) {
                //Algum está selecionado?
                if (jCheckAdmin.isSelected()==false && jCheckFunc.isSelected()==false) {
                    erro=1;
                    break;
                } 
            }
        }
        if(erro==1){
            JOptionPane.showMessageDialog(this,"Preencha todos os campos.","Alerta",JOptionPane.WARNING_MESSAGE);
        }else if(erro==0 && alterou==0){
            if(JOptionPane.showConfirmDialog(this, "Você não alterou nenhum dado,confirma essa operação?",
                    "Alerta",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE)==0){
                dispose();
            }else{
                alterou=0;
            }
        }else if(erro==0 && alterou==1){
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
            if(jCheckAdmin.isSelected())
                f.setPermissao("Administrador");
            else
                f.setPermissao("Vendedor");
            if(!jLabelDemisao.getText().equals("")){
                try{
                Calendar c = Calendar.getInstance();
                DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                Date date = (java.util.Date)formatter.parse(jLabelDemisao.getText()); 
                c.setTime(date);
                f.setDemissao(c);
                }catch(ParseException e){
                    throw new RuntimeException(e);
                }
            }
            //inserir no banco de dados e depois lançar msg de sucesso na operação de inserting.
            try {
                ControlFuncionario cf = new ControlFuncionario();
                cf.atualizarFuncionario(f);
                JOptionPane.showMessageDialog(this,"Dados alterados com sucesso.","Sucesso",JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSalvarMousePressed

    private void jTextNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNumeroFocusLost
        if(Integer.parseInt(jTextNumero.getText())==numero)
            alterou=0;
        try{
            if(!jTextNumero.getText().equals("")){
                Integer.parseInt(jTextNumero.getText());
                jLabelNumero.setForeground(Color.black);
            }
        }catch(NumberFormatException e){
            jLabelNumero.setForeground(Color.red);
            JOptionPane.showMessageDialog(this,"O campo Número é numérico,digite corretamente" ,"Alerta", JOptionPane.WARNING_MESSAGE);
            jTextNumero.setText("");
            jTextNumero.requestFocus();
        }
    }//GEN-LAST:event_jTextNumeroFocusLost

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jTextNome.setEnabled(false);
        jTextCPF.setEnabled(false);
        jRadioSexoF.setEnabled(false);
        jRadioSexoM.setEnabled(false);
        jFormattedDtNasc.setEnabled(false);
        jTextRG.setEnabled(false);
        if(!jLabelDemisao.getText().equals("")){
            jButtonDemitir.setText("Readimitir");
        }
    }//GEN-LAST:event_formWindowOpened

    private void jTextRuaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextRuaFocusGained
        alterou = 1;
        rua = jTextRG.getText();
    }//GEN-LAST:event_jTextRuaFocusGained

    private void jTextRuaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextRuaFocusLost
        if(jTextRua.getText().equals(rua))
            alterou = 0;
    }//GEN-LAST:event_jTextRuaFocusLost

    private void jTextNumeroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNumeroFocusGained
        alterou = 1;
        numero = Integer.parseInt(jTextNumero.getText());
    }//GEN-LAST:event_jTextNumeroFocusGained

    private void jFormattedCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedCEPFocusGained
        alterou=1;
        cep = jFormattedCEP.getText();
    }//GEN-LAST:event_jFormattedCEPFocusGained

    private void jFormattedCEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedCEPFocusLost
        if(jFormattedCEP.getText().endsWith(cep))
            alterou=0;
    }//GEN-LAST:event_jFormattedCEPFocusLost

    private void jComboEstadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboEstadoFocusGained
        alterou=1;
        estado = jComboEstado.getSelectedItem().toString();
    }//GEN-LAST:event_jComboEstadoFocusGained

    private void jComboEstadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboEstadoFocusLost
        if(jComboEstado.getSelectedItem().toString().equals(estado))
            alterou=0;
    }//GEN-LAST:event_jComboEstadoFocusLost

    private void jTextCidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCidadeFocusGained
        alterou=1;
        cidade = jTextCidade.getText();
    }//GEN-LAST:event_jTextCidadeFocusGained

    private void jTextCidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCidadeFocusLost
        if(jTextCidade.getText().equals(cidade))
            alterou=0;
    }//GEN-LAST:event_jTextCidadeFocusLost

    private void jTextBairroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBairroFocusGained
        alterou=1;
        bairro = jTextBairro.getText();
    }//GEN-LAST:event_jTextBairroFocusGained

    private void jTextBairroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextBairroFocusLost
        if(jTextBairro.getText().equals(bairro))
            alterou=0;
    }//GEN-LAST:event_jTextBairroFocusLost

    private void jTextCompleFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCompleFocusGained
        alterou=1;
        comple = jTextComple.getText();
    }//GEN-LAST:event_jTextCompleFocusGained

    private void jTextCompleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextCompleFocusLost
        if(jTextComple.getText().equals(comple))
            alterou=0;
    }//GEN-LAST:event_jTextCompleFocusLost
	
    private void jCheckAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckAdminActionPerformed
        jCheckFunc.setSelected(false);
    }//GEN-LAST:event_jCheckAdminActionPerformed

    private void jCheckFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckFuncActionPerformed
        jCheckAdmin.setSelected(false);
    }//GEN-LAST:event_jCheckFuncActionPerformed

    private void jButtonDemitirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDemitirMousePressed
        if(jButtonDemitir.getText().equals("Demitir")){
            Calendar c = Calendar.getInstance();
            c.setTime(c.getTime());
            SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
            jLabelDemisao.setText(s.format(c.getTime()));
            jButtonDemitir.setText("Readimitir");
        }else{
            jLabelDemisao.setText("");
            jButtonDemitir.setText("Demitir");
        }
    }//GEN-LAST:event_jButtonDemitirMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Endereço;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDemitir;
    private javax.swing.JButton jButtonSalvar;
    public javax.swing.JCheckBox jCheckAdmin;
    public javax.swing.JCheckBox jCheckFunc;
    public javax.swing.JComboBox jComboEstado;
    public javax.swing.JFormattedTextField jFormattedCEP;
    public javax.swing.JFormattedTextField jFormattedDtNasc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelComple;
    private javax.swing.JLabel jLabelDados;
    public javax.swing.JLabel jLabelDemisao;
    private javax.swing.JLabel jLabelDtNasc;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRG;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelSexo;
    public javax.swing.JRadioButton jRadioSexoF;
    public javax.swing.JRadioButton jRadioSexoM;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTextField jTextBairro;
    public javax.swing.JTextField jTextCPF;
    public javax.swing.JTextField jTextCidade;
    public javax.swing.JTextField jTextComple;
    public javax.swing.JTextField jTextNome;
    public javax.swing.JTextField jTextNumero;
    public javax.swing.JTextField jTextRG;
    public javax.swing.JTextField jTextRua;
    // End of variables declaration//GEN-END:variables
}