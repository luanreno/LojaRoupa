/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.Compras;
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
public class ComprasController {

public void inserirCompras(Compras c) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Compras (notafiscal, data, total, dinheiro, troco, detalhecompras, id_Compras) VALUES (?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, c.getNotafiscal());
        statement.setString(2, c.getData());
        statement.setString(3, c.getTotal ());
        statement.setString(4, c.getDinheiro());
        statement.setString(5, c.getTroco());
        statement.setString(6, c.getDetalhecompras());
        statement.setInt(6, c.getId());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Nova compra inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectCliente()throws SQLException {
    
            String sql = "SELECT * FROM compras";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String notafiscal = result.getString("notafiscal");
                String data = result.getString("data");
                String total = result.getString("total");
                String dinheiro = result.getString ("dinheiro");
                String troco = result.getString("troco");
                String detalhecompras = result.getString("detalhecompras");
                String output = "Compras #%d: %s - %s - %s - %s - %s - %s";
                
                System.out.println(String.format(output, ++count, notafiscal, data, total, dinheiro, troco, detalhecompras));
 
                statement.close();
                conexao.close();
        }
    }
}