package praticaIntegradora7;

import java.math.BigDecimal;
import java.util.List;

public class Fatura {

    private Cliente cliente;
    private List<Produto> itens;
    private BigDecimal totalCompra;

    public Fatura(Cliente cliente, List<Produto> itens, BigDecimal totalCompra) {
        this.cliente = cliente;
        this.itens = itens;
        this.totalCompra = totalCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public BigDecimal getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(BigDecimal totalCompra) {
        this.totalCompra = totalCompra;
    }
}
