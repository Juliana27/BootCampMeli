package praticaIntegradora7;

import java.math.BigDecimal;

public class Produto {

    private int codigo;
    private String nome;
    private int quantidade;
    private BigDecimal preco;

    public Produto(int codigo, String nome, int quantidade, BigDecimal preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto - " +
                "codigo: " + codigo +
                ", nome: " + nome +
                ", quantidade: " + quantidade +
                ", preco: " + preco;
    }
}