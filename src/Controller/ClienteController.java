/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import View.Util;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author info206
 */
public class ClienteController {

public void inserirCliente(Cliente c) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Cliente (cpf, nome, telefone, email, bairro, complemento, cidade, numero, rua, datanascimento, id_Cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, c.getCpf());
        statement.setString(2, c.getNome());
        statement.setString(3, c.getTelefone ());
        statement.setString(4, c.getEmail());
        statement.setString(5, c.getBairro());
        statement.setString(6, c.getComplemento());
        statement.setString (7, c.getCidade());
        statement.setString (8, c.getNumero());
        statement.setString (9, c.getRua());
        statement.setString (10, c.getDatanascimento());
        statement.setInt(6, c.getId());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo cliente inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectCliente()throws SQLException {
    
            String sql = "SELECT * FROM cliente";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String cpf = result.getString("cpf");
                String nome = result.getString("nome");
                String telefone = result.getString("telefone");
                String email = result.getString ("email");
                String bairro = result.getString("bairro");
                String complemento = result.getString("complemento");
                String cidade = result.getString("cidade");
                String numero = result.getString("numero");
                String rua = result.getString("rua");
                String datanascimento = result.getString("datanascimento");
                String output = "Cliente #%d: %s - %s - %s - %s - %s - %s - %s - %s - %s - %s";
                
                System.out.println(String.format(output, ++count, cpf, nome, telefone, email, bairro, complemento, cidade, numero, rua, datanascimento));
 
                statement.close();
                conexao.close();
        }
    }
}
