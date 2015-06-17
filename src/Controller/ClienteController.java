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
    String sql = "INSERT INTO Cliente (rg, cpf, nome, telefone, email, bairro, complemento, cidade) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setInt(1, c.getCpf());
        statement.setInt (2, c.getRg());
        statement.setString(3, c.getNome());
        statement.setInt(4, c.getTelefone ());
        statement.setString(5, c.getEmail());
        statement.setString(6, c.getBairro());
        statement.setString(7, c.getComplemento());
        statement.setString (8, c.getCidade());
        
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
                
                int cpf = result.getInt("cpf");
                String nome = result.getString("nome");
                int telefone = result.getInt("telefone");
                String email = result.getString ("email");
                String bairro = result.getString("bairro");
                String complemento = result.getString("complemento");
                String cidade = result.getString("cidade");
                int rg = result.getInt ("rg");
                String output = "Cliente #%d: %s - %s - %s - %s - %s - %s - %s - %s";
                
                System.out.println(String.format(output, ++count, cpf, rg, nome, telefone, email, bairro, complemento, cidade));
 
                statement.close();
                conexao.close();
        }
    }
}
