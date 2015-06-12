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
    String sql = "INSERT INTO Produtos (nome, quantidademinima, descricaoProduto, dataChegada, precoCompra, precoVenda) VALUES (?, ?, ?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, p.getNome());
        statement.setString(2, p.getquantidademinima());
        statement.setString(3, p.getDescricaoProduto());
        statement.setString(4, p.getDataChegada());
        statement.setString(5, p.getPrecoCompra());
        statement.setString(6, p.getPrecoVenda());
        
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
                String descricaoProduto = result.getString("descricaoproduto");
                String dataChegada = result.getString("datachegada");
                String precoCompra = result.getString("precocompra");
                String precoVenda = result.getString("venda");

                String output = "Compras #%d: %s - %s - %s - %s - %s - %s - ";
                
                System.out.println(String.format(output, ++count, nome, quantidademinima, descricaoProduto, dataChegada, precoCompra, precoVenda ));
 
                statement.close();
                conexao.close();
        }
    }
}
