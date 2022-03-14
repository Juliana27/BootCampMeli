package praticaIntegradora4.exercicio2;

public class NaoPereciveis extends Produto{

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public NaoPereciveis(String nome, double preco, String tipo) {
        super(nome, preco);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "NaoPereciveis - " +
                "tipo: " + tipo;
    }

    public NaoPereciveis(String nome, double preco) {
        super(nome, preco);
    }
}
