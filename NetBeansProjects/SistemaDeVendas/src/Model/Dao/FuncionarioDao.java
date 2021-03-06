/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;

import Classes.ConnectionFactory;
import Model.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Esdras
 */
public class FuncionarioDao {
    private Connection connection;
    
    public FuncionarioDao() {
        this.connection = new ConnectionFactory().getConnection(); 
    }
    
    public void cadastrar(Funcionario funcionario) throws SQLException{
        String sqlPessoa = "INSERT INTO pessoa " +
                           "(numero,data_nascimento,sexo,nome,cep,bairro,cidade," +
                           "estado,complemento,cpf,rg,rua)" +
                           "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
        
        String sqlFuncionario = "INSERT INTO funcionario " +
                                "(cpf,admissao,demissao,login,senha,permissao)" +
                                "VALUES (?,?,?,?,?,?)";
        
        String sqlChecar = "SELECT * FROM pessoa WHERE cpf = ?";
        
        PreparedStatement statement = this.connection.prepareStatement(sqlChecar);
        statement.setString(1, Long.toString(funcionario.getCPF()));

        ResultSet resultadoChecar = statement.executeQuery();

        if(!resultadoChecar.isBeforeFirst()) {
            statement.clearParameters();
            statement = this.connection.prepareStatement(sqlPessoa);

            statement.setInt(1, funcionario.getNumero());
            statement.setDate(2, new Date(funcionario.getDtNasc().getTimeInMillis()));
            statement.setString(3, String.valueOf(funcionario.getSexo()));
            statement.setString(4, funcionario.getNome().toUpperCase());
            statement.setString(5, funcionario.getCep());
            statement.setString(6, funcionario.getBairro());
            statement.setString(7, funcionario.getCidade());
            statement.setString(8, funcionario.getEstado());
            statement.setString(9, funcionario.getComple());
            statement.setString(10, Long.toString(funcionario.getCPF()));
            statement.setLong(11, funcionario.getRG());
            statement.setString(12, funcionario.getRua());

            statement.execute();
        }
        statement.clearParameters();
        statement = this.connection.prepareStatement(sqlFuncionario);

        statement.setString(1, Long.toString(funcionario.getCPF()));
        statement.setDate(2, new Date(System.currentTimeMillis()));
        statement.setNull(3, java.sql.Types.DATE);
        statement.setString(4, funcionario.getLogin());
        statement.setString(5, funcionario.getSenha());
        statement.setString(6, funcionario.getPermissao());

        statement.execute();
        statement.close();
    }
    
    public List<Funcionario> consultar(long cpf) throws SQLException{
        String sql = "SELECT * FROM pessoa INNER JOIN funcionario " +
                     "ON pessoa.cpf = funcionario.cpf " +
                     "WHERE pessoa.cpf = ?";
        
        
        List<Funcionario> funcionarios = new ArrayList<>();
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, Long.toString(cpf));

        ResultSet resultado = statement.executeQuery();
        while(resultado.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setId(resultado.getInt("id_funcionario"));
            funcionario.setCPF(Long.parseLong(resultado.getString("cpf")));
            funcionario.setLogin(resultado.getString("login"));
            funcionario.setSenha(resultado.getString("senha"));
            funcionario.setPermissao(resultado.getString("permissao"));

            Calendar data1 = Calendar.getInstance();
            data1.setTime(resultado.getDate("admissao"));
            funcionario.setAdmissao(data1);

            try {
                Calendar data2 = Calendar.getInstance();
                data2.setTime(resultado.getDate("demissao"));
                funcionario.setDemissao(data2);
            } catch(NullPointerException e) {
                funcionario.setDemissao(null);
            }

            funcionario.setNumero(resultado.getInt("numero"));
            funcionario.setSexo(resultado.getString("sexo").charAt(0));
            funcionario.setNome(resultado.getString("nome"));
            funcionario.setCep(resultado.getString("cep"));
            funcionario.setBairro(resultado.getString("bairro"));
            funcionario.setCidade(resultado.getString("cidade"));
            funcionario.setEstado(resultado.getString("estado"));
            funcionario.setComple(resultado.getString("complemento"));
            funcionario.setRG(resultado.getLong("rg"));
            funcionario.setRua(resultado.getString("rua"));

            Calendar data3 = Calendar.getInstance();
            data3.setTime(resultado.getDate("data_nascimento"));
            funcionario.setDtNasc(data3);

            funcionarios.add(funcionario);
        }
        resultado.close();
        statement.close();

        return funcionarios;
    }
    
    public List<Funcionario> consultar(String nome) throws SQLException{
        String sql = "SELECT * FROM pessoa INNER JOIN funcionario " +
                     "ON pessoa.cpf = funcionario.cpf " +
                     "WHERE pessoa.nome LIKE ?";
        
        
        List<Funcionario> funcionarios = new ArrayList<>();
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, nome.toUpperCase() + "%");

        ResultSet resultado = statement.executeQuery();
        while(resultado.next()) {
            Funcionario funcionario = new Funcionario();
            funcionario.setNumero(resultado.getInt("numero"));
            funcionario.setSexo(resultado.getString("sexo").charAt(0));
            funcionario.setNome(resultado.getString("nome"));
            funcionario.setCep(resultado.getString("cep"));
            funcionario.setBairro(resultado.getString("bairro"));
            funcionario.setCidade(resultado.getString("cidade"));
            funcionario.setEstado(resultado.getString("estado"));
            funcionario.setComple(resultado.getString("complemento"));
            funcionario.setRG(resultado.getLong("rg"));
            funcionario.setRua(resultado.getString("rua"));
            funcionario.setCPF(Long.parseLong(resultado.getString("cpf")));

            Calendar data1 = Calendar.getInstance();
            data1.setTime(resultado.getDate("data_nascimento"));
            funcionario.setDtNasc(data1);

            funcionario.setId(resultado.getInt("id_funcionario"));
            funcionario.setLogin(resultado.getString("login"));
            funcionario.setSenha(resultado.getString("senha"));
            funcionario.setPermissao(resultado.getString("permissao"));

            Calendar data2 = Calendar.getInstance();
            data2.setTime(resultado.getDate("admissao"));
            funcionario.setAdmissao(data2);

            Calendar data3 = Calendar.getInstance();
            try{
                data3.setTime(resultado.getDate("demissao"));
                funcionario.setDemissao(data3);
            }catch(NullPointerException e){
                funcionario.setDemissao(null);
            }

            funcionarios.add(funcionario);
        }
        resultado.close();
        statement.close();

        return funcionarios;
    }
    
    public void atualizar(Funcionario funcionario) throws SQLException{
        String sqlPessoa = "UPDATE pessoa SET numero = ?,"+
                           "cep = ?, bairro = ?, cidade = ?," +
                           "estado = ?, complemento = ?, rua = ?" +
                           "WHERE cpf = ?";
        
        String sqlFuncionario = "UPDATE funcionario SET demissao = ?," +
                                "permissao = ? WHERE cpf = ?";
        
        
        PreparedStatement statement = this.connection.prepareStatement(sqlPessoa);
        statement.setInt(1, funcionario.getNumero());
        statement.setString(2, funcionario.getCep());
        statement.setString(3, funcionario.getBairro());
        statement.setString(4, funcionario.getCidade());
        statement.setString(5, funcionario.getEstado());
        statement.setString(6, funcionario.getComple());
        statement.setString(7, funcionario.getRua());
        statement.setString(8, Long.toString(funcionario.getCPF()));

        statement.execute();
        statement.clearParameters();

        statement = this.connection.prepareStatement(sqlFuncionario);

        if(funcionario.getDemissao()==null)
            statement.setNull(1, java.sql.Types.NULL);
        else
            statement.setDate(1, new Date(funcionario.getDemissao().getTimeInMillis()));

        statement.setString(2, funcionario.getPermissao());
        statement.setString(3, Long.toString(funcionario.getCPF()));

        statement.execute();
        statement.close();
    }
    
    public void remover(Long cpf) throws SQLException{
        String sql = "DELETE FROM funcionario WHERE cpf = ?";
        
        
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, Long.toString(cpf));

        statement.execute();
        statement.close();
    }
    
    public boolean verificarSenha(String login, String senha) throws SQLException{
        String sql = "SELECT senha FROM funcionario " +
                     "WHERE login = ? AND senha = ?";
        
        
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, senha);

        ResultSet resultado = statement.executeQuery();
        if(!resultado.isBeforeFirst()) {
            resultado.close();
            statement.close();
            return false;
        }
        resultado.close();
        statement.close();
        
        return true;
    }
    
    public void atualizar(String login, String senha, long cpf) throws SQLException{
        String sql = "UPDATE funcionario SET login = ?," +
                     "senha = ? WHERE cpf = ?";
        
        
        PreparedStatement statement = this.connection.prepareStatement(sql);
        statement.setString(1, login);
        statement.setString(2, senha);
        statement.setString(3, Long.toString(cpf));

        statement.execute();
        statement.close();
    }
}
