/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Funcionário;
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
public class FuncionárioController {

public void inserirFuncionário(Funcionário f) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Funcionário (nome, endereco, telefone, email, cpf, rg, idFuncionário) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, f.getNome());
        statement.setString(2, f.getEndereco());
        statement.setString(3, f.getTelefone ());
        statement.setString (4, f.getEmail ());
        statement.setString(5, f.getCpf());
        statement.setInt (6, f.getRg());
        statement.setInt(7, f.getId());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo funcionário inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectCliente()throws SQLException {
    
            String sql = "SELECT * FROM Funcionário";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String nome = result.getString("nome");
                String endereco = result.getString("endereco");
                String telefone = result.getString("telefone");
                String email = result.getString ("email");
                String cpf = result.getString ("cpf");
                int rg = result.getInt("rg");
                String output = "Cliente #%d: %s - %s - %s - %s - %s - %d";
                
                System.out.println(String.format(output, ++count, nome, endereco, telefone, email, cpf, rg));
 
                statement.close();
                conexao.close();
        }
    }
}