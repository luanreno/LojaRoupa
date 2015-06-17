/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Login {
    String senha, usuario;
    int  idFuncionário;

    public Login(String senha, String usuario) {
        this.senha = senha;
        this.usuario = usuario;
    }

    public Login(int idFuncionário) {
        this.idFuncionário = idFuncionário;
    }

    public int getIdFuncionário() {
        return idFuncionário;
    }

    public void setIdFuncionário(int idFuncionário) {
        this.idFuncionário = idFuncionário;
    }

    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
