/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author info206
 */
public class Compras {
    String notafiscal, data, total, troco, detalhescompra;
    int id; 
    float dinheiro; 

    public Compras(String notafiscal, String data, String total, String troco, String detalhescompra, int id) {
        this.notafiscal = notafiscal;
        this.data = data;
        this.total = total;
        this.troco = troco;
        this.detalhescompra = detalhescompra;
        this.id = id;
    }

    public Compras(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Compras(String notafiscal, String data, String total, String troco, String detalhescompra, float dinheiro) {
        this.notafiscal = notafiscal;
        this.data = data;
        this.total = total;
        this.dinheiro = dinheiro;
        this.troco = troco;
        this.detalhescompra = detalhescompra;
        this.dinheiro = dinheiro;
    
  
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
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

    public String getTroco() {
        return troco;
    }

    public void setTroco(String troco) {
        this.troco = troco;
    }

    public String getDetalhescompra() {
        return detalhescompra;
    }

    public void setDetalhescompra(String detalhescompra) {
        this.detalhescompra = detalhescompra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }
    
    
}
