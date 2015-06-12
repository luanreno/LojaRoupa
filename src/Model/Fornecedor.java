/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Fornecedor {
    String cnpj, nomeEmpresa, detalhesCompra;
    int id;

    public Fornecedor(String cnpj, String nomeEmpresa, String datalhesCompra, int id) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.detalhesCompra = detalhesCompra;
        this.id = id;
    }

    public Fornecedor(String cnpj, String nomeEmpresa, String datalhesCompra) {
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.detalhesCompra = detalhesCompra;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getDetalhesCompra() {
        return detalhesCompra;
    }

    public void setDetalhesCompra(String detalhesCompra) {
        this.detalhesCompra = detalhesCompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    }
    
