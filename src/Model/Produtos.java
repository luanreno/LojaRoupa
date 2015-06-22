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
    
      String Nome, codigoproduto, quantidademinima, dataChegada, precoCompra, precoVenda;
      int id, idFornecedor;

    public Produtos(String codigoproduto, String Nome, String quantidademinima, String dataChegada, String precoCompra, String precoVenda, int id, int idFornecedor) {
        this.Nome = Nome;
        this.quantidademinima = quantidademinima;
        this.dataChegada = dataChegada;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.codigoproduto = codigoproduto; 
        this.id = id;
        this.idFornecedor = idFornecedor;
    }

    public Produtos(String codigoproduto, String Nome, String quantidademinima, String dataChegada, String precoCompra, String precoVenda) {
        this.Nome = Nome;
        this.quantidademinima = quantidademinima;
        this.dataChegada = dataChegada;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.codigoproduto = codigoproduto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
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
