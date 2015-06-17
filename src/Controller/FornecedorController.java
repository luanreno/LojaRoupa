/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Compras;
import Model.Fornecedor;
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
public class FornecedorController {

public void inserirFornecedor(Fornecedor f) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Fornecedor (cnpj, nomeEmpresa, detalhesCompra, idFornecedor) VALUES (?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, f.getCnpj());
        statement.setString(2, f.getNomeEmpresa());
        statement.setString(3, f.getDetalhesCompra());
        statement.setInt(4, f.getId());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo Fornecedor inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectFornecedor()throws SQLException {
    
            String sql = "SELECT * FROM fornecedor";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String cnpj = result.getString("cnpj");
                String nomeEmpresa = result.getString("nomeEmpresa");
                String detalhesCompra = result.getString("detalhesCompra");

                String output = "Compras #%d: %s - %s - %s";
                
                System.out.println(String.format(output, ++count, cnpj, nomeEmpresa, detalhesCompra));
 
                statement.close();
                conexao.close();
        }
    }
}