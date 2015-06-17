/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Produtos {
    
      String nome, codigoproduto, quantidademinima, dataChegada, precoCompra, precoVenda;
      int id, idFornecedor;

    public Produtos(String codigoproduto, String nome, String quantidademinima, String dataChegada, String precoCompra, String precoVenda, int id, int idFornecedor) {
        this.nome = nome;
        this.quantidademinima = quantidademinima;
        this.dataChegada = dataChegada;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.codigoproduto = codigoproduto; 
        this.id = id;
        this.idFornecedor = idFornecedor;
    }

    public Produtos(String codigoproduto, String nome, String quantidademinima, String dataChegada, String precoCompra, String precoVenda) {
        this.nome = nome;
        this.quantidademinima = quantidademinima;
        this.dataChegada = dataChegada;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.codigoproduto = codigoproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getquantidademinima() {
        return quantidademinima;
    }

    public void setquantidademinima(String quantidademinima) {
        this.quantidademinima = quantidademinima;
    }
    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(String precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(String precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigoproduto() {
        return codigoproduto;
    }

    public void setCodigoproduto(String codigoproduto) {
        this.codigoproduto = codigoproduto;
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
}
