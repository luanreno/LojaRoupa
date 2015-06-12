/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Fornecedor;
import Model.Login;
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
public class LoginController {

public void inserirLogin(Login l) throws SQLException {
try {
    
    Util util= new Util();
    Connection conexao = util.conecta();  
    String sql = "INSERT INTO Fornecedor (senha, usuario) VALUES (?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, l.getSenha());
        statement.setString(2, l.getUsuario());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo login inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}

    public void selectLogin()throws SQLException {
    
            String sql = "SELECT * FROM login";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
                
                String senha = result.getString("senha");
                String usuario = result.getString("usuario");

                String output = "Compras #%d: %s - %s";
                
                System.out.println(String.format(output, ++count, senha, usuario));
 
                statement.close();
                conexao.close();
        }
    }
}
