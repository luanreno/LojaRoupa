/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
    String sql = "INSERT INTO Login(senha, usuario, idFuncionário) VALUES (?, ?, ?)";
    PreparedStatement statement= conexao.prepareStatement(sql);
    
        statement.setString(1, l.getSenha());
        statement.setString(2, l.getUsuario());
        statement.setInt(3, l.getIdFuncionário());
        
    int rowsInserted = statement.executeUpdate(); 
    if (rowsInserted > 0){
    System.out.println ("Novo Login inserido com sucesso");
}
        statement.close();
        conexao.close();
        } catch (SQLException e){
    
    System.out.println(e.getMessage());
    }
}
    public int autentica(String senha, String usuario)throws SQLException {
      int  ok= -1;
    
            String sql = "SELECT * FROM Login WHERE usuario like '"+usuario+"' AND senha like '"+senha+"'";
            Util util= new Util();
            Connection conexao = util.conecta();

            Statement statement = conexao.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            int count = 0;
            while (result.next()){
           ok= 1;
 
               
        }
             statement.close();
                conexao.close();
                return  ok;
           
    }
}
