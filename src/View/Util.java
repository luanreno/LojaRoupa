/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author info206
 */
public class Util {

    public static Connection conecta() throws SQLException {
    Connection conexao= null;
    String url = "jdbc:mysql://192.200.63.121:3306/LojaRoupas"; //Nome da base de dados
    String user = "root"; //nome do usuario do Mysql
    String password = "123456"; // senha do Mysql
    try{
        conexao = DriverManager.getConnection(url, user, password);
    }   catch(SQLException sqlex){
        System.out.println ("Erro na conexão "+ sqlex);
    }
    return conexao;
    }  
    
    public static void criaTabela(String nomeTabela, String atributos) throws SQLException {
    Statement statement = null; 
    Connection conexao = null;
    try {
    conexao=conecta();
        statement = conexao.createStatement();
    String createTableSQL = "CREATE TABLE "+nomeTabela+"("+atributos+");";
    System.out.println(createTableSQL);
        statement.execute(createTableSQL); //executa o comando criação
    System.out.println("Tabela \"nomeTabela\"foi criado com sucesso!");
    } catch (SQLException e) {
    System.out.println(e.getMessage());
    } finally { //sempre fecha o statement a conexao com o banco 
    if (statement!= null) {
    }        
    if (conexao!= null){
        conexao.close();
                }
       }
}   
    public static void criaBanco(String banco) throws SQLException{
    String sql="CREATE DATABASE "+banco;
    Connection conexao= conecta();
    Statement stmt= conexao.createStatement();
    stmt.execute(sql);
    }    
    
    public static void rodaScript(String Script) throws SQLException{
        Connection conexao= conecta();
    Statement stmt= conexao.createStatement();
    stmt.execute(Script);
    
    }
}

