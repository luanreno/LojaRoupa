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
    String cpf, nome, telefone, email, bairro, complemento, cidade, numero, rua, datanascimento;
    int id;

    public Cliente(String cpf, String nome, String telefone, String email, String bairro, String complemento, String cidade, String numero, String rua, String datanascimento, int id) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
        this.datanascimento = datanascimento;
        this.id = id;
    }
    
    public Cliente(String cpf, String nome, String telefone, String email, String bairro, String complemento, String cidade, String numero, String rua, String datanascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.numero = numero;
        this.rua = rua;
        this.datanascimento = datanascimento;      
        
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}