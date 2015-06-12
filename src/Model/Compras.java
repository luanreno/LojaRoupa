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
    String notafiscal, data, total, dinheiro, troco, detalhecompras;
    int id; 

    public Compras(String notafiscal, String data, String total, String dinheiro, String troco, String detalhecompras, int id) {
        this.notafiscal = notafiscal;
        this.data = data;
        this.total = total;
        this.dinheiro = dinheiro;
        this.troco = troco;
        this.detalhecompras = detalhecompras;
        this.id = id;
    }

    public Compras(String notafiscal, String data, String total, String dinheiro, String troco, String detalhecompras) {
        this.notafiscal = notafiscal;
        this.data = data;
        this.total = total;
        this.dinheiro = dinheiro;
        this.troco = troco;
        this.detalhecompras = detalhecompras;
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

    public String getDetalhecompras() {
        return detalhecompras;
    }

    public void setDetalhecompras(String detalhecompras) {
        this.detalhecompras = detalhecompras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
