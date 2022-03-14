package praticaIntegradora4.exercicio2;

public class Pereciveis extends Produto{

    private int diasParaVencer;

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public Pereciveis(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public String toString() {
        return "Pereciveis - " +
                "diasParaVencer: " + diasParaVencer;
    }

    @Override
    public double calcular(int quantProdutos) {
        double total = super.calcular(quantProdutos);

        if (diasParaVencer == 1) {
            return total / 4;
        } else if (diasParaVencer == 2) {
            return total / 3;
        } else if (diasParaVencer == 3) {
            return total / 2;
        } else {
            return total;
        }
    }
}
