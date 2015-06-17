/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Fornecedor;
import Model.Login;
import Model.Produtos;
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
public class ProdutosController {

public void inserirProdutos(Produtos p) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Produtos (nome, quantidademinima, dataChegada, precoCompra, precoVenda, idFornecedor) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, p.getNome());
        statement.setString(2, p.getquantidademinima());
        statement.setString(3, p.getDataChegada());
        statement.setString(4, p.getPrecoCompra());
        statement.setString(5, p.getPrecoVenda());
        statement.setInt(6, p.getIdFornecedor());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo produto inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectProduto()throws SQLException {
    
            String sql = "SELECT * FROM produtos";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String nome = result.getString("nome");
                String quantidademinima = result.getString("quantidademinima");
                String dataChegada = result.getString("dataChegada");
                String precoCompra = result.getString("precoCompra");
                String precoVenda = result.getString("precoVenda");

                String output = "Produto #%d: %s - %s - %s - %s - %s - %s";
                
                System.out.println(String.format(output, ++count, nome, quantidademinima, dataChegada, precoCompra, precoVenda ));
 
                statement.close();
                conexao.close();
        }
    }
}
