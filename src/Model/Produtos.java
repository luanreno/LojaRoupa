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
    
      String nome, codigoproduto, quantidademinima, descricaoProduto, dataChegada, precoCompra, precoVenda;
      int id;

    public Produtos(String codigoproduto, String nome, String quantidademinima, String descricaoProduto, String dataChegada, String precoCompra, String precoVenda, int id) {
        this.nome = nome;
        this.quantidademinima = quantidademinima;
        this.descricaoProduto = descricaoProduto;
        this.dataChegada = dataChegada;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.codigoproduto = codigoproduto; 
        this.id = id;
    }

    public Produtos(String codigoproduto, String nome, String quantidademinima, String descricaoProduto, String dataChegada, String precoCompra, String precoVenda) {
        this.nome = nome;
        this.quantidademinima = quantidademinima;
        this.descricaoProduto = descricaoProduto;
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

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
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
    
}
