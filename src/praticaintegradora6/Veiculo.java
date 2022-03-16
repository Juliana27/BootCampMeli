package praticaintegradora6;

import java.math.BigDecimal;

public class Veiculo {

    private String modelo;
    private String marca;
    private BigDecimal preco;

    public Veiculo(String modelo, String marca, BigDecimal preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "modelo = " + modelo +
                ", marca = " + marca +
                ", preco = " + preco;
    }
}
