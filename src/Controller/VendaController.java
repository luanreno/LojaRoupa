/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produtos;
import Model.Venda;
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

public class VendaController {

public void inserirVenda(Venda v) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Venda (data, total, dinheiro, troco) VALUES (?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, v.getData());
        statement.setString(2, v.getTotal());
        statement.setString(3, v.getDinheiro());
        statement.setString(4, v.getTroco());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Nova venda inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectVenda()throws SQLException {
    
            String sql = "SELECT * FROM venda";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String data = result.getString("data");
                String total = result.getString("total");
                String dinheiro = result.getString("dinheiro");
                String troco = result.getString("troco");

                String output = "Compras #%d: %s - %s - %s - %s - %s - %s - ";
                
                System.out.println(String.format(output, ++count, data, total, dinheiro, troco));
 
                statement.close();
                conexao.close();
        }
    }
}