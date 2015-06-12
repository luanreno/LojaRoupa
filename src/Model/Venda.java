/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Venda {
     int id;
     String produto, data, total, dinheiro, troco;

    public Venda(int id, String produto, String data, String total, String dinheiro, String troco) {
        this.id = id;
        this.produto = produto;
        this.data = data;
        this.total = total;
        this.dinheiro = dinheiro;
        this.troco = troco;
    }

    public Venda(String produto, String data, String total, String dinheiro, String troco) {
        this.produto = produto;
        this.data = data;
        this.total = total;
        this.dinheiro = dinheiro;
        this.troco = troco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(String dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }
     
}
