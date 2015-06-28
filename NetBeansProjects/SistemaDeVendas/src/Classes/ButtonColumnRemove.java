/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Controller.ControlProduto;
import View.Cad_Venda;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.AbstractCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author cesar.nascimento
 */
public class ButtonColumnRemove extends AbstractCellEditor  
        implements TableCellRenderer, TableCellEditor, ActionListener{  
        JTable table;  
        JButton renderButton;  
        JButton editButton;  
        String text;  
        Cad_Venda cd = JanelaUtil.JANELAS.get("Venda");
  
        public ButtonColumnRemove(JTable table, int column){  
            super();  
            this.table = table;  
            ImageIcon image = new ImageIcon(getClass().getResource("/images/cancel.png"));
            renderButton = new JButton(image);  
            
            
            editButton = new JButton(image);

            editButton.setFocusPainted( false ); 
            editButton.addActionListener( this );  
  
            TableColumnModel columnModel = table.getColumnModel();  
            columnModel.getColumn(column).setCellRenderer( this );  
            columnModel.getColumn(column).setCellEditor( this );  
        }  
  
        @Override
        public Component getTableCellRendererComponent(  
            JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){  
            
            //Aqui fica as ações de animação do botão
            if (hasFocus){  
                renderButton.setForeground(table.getForeground());  
                renderButton.setBackground(UIManager.getColor("Button.background"));  
            }  
            else if (isSelected){  
                renderButton.setForeground(table.getSelectionForeground());  
                 renderButton.setBackground(table.getSelectionBackground());
            }  
            else{  
                renderButton.setForeground(table.getForeground());  
                renderButton.setBackground(UIManager.getColor("Button.background"));  
            }  
  
            renderButton.setText( (value == null) ? "Remover" : value.toString() );  
            return renderButton;  
        }  
  
        @Override
        public Component getTableCellEditorComponent(  
            JTable table, Object value, boolean isSelected, int row, int column){  
            text = (value == null) ? "Remover" : value.toString();  
            editButton.setText( text );  
            return editButton;  
        }  
  
        @Override
        public Object getCellEditorValue(){  
            return text;  
        }  
  
        @Override
        public void actionPerformed(ActionEvent e){  
            fireEditingStopped();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            int row = table.getSelectedRow();
            float total = Float.parseFloat(cd.jLabelTotal.getText());
            float preco = (float) table.getValueAt(row, 2);
            float quantidade = (float) table.getValueAt(row, 3);
            ControlProduto cp = new ControlProduto();
            try {
                cp.adicionarProduto((int)table.getValueAt(row, 0), quantidade);
            } catch(SQLException er) {
                JOptionPane.showMessageDialog(null, er.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
            model.removeRow(row);
            cd.jLabelTotal.setText(Double.toString(total-(preco*quantidade)));
        }  
    }  
