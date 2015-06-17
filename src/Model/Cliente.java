/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Cliente {
    String nome, email, bairro, complemento, cidade;
    int id, telefone, rg, cpf;

    public Cliente(int rg, int cpf, String nome, int telefone, String email, String bairro, String complemento, String cidade,int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.id = id;
        this.rg = rg;
    }
    
    public Cliente(int rg, int cpf, String nome, int telefone, String email, String bairro, String complemento, String cidade) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.rg = rg;
        
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf() {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }
    
}