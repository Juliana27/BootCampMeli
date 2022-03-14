package praticaIntegradora4.exercicio2;

import java.util.ArrayList;

public class Distribuidora {

    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList<>();

        NaoPereciveis macarrao = new NaoPereciveis("macarrao", 2.30);
        NaoPereciveis arroz = new NaoPereciveis("arroz", 16.15);
        NaoPereciveis feijao = new NaoPereciveis("feijao", 6.10);
        Pereciveis requeijao = new Pereciveis("requeijao", 5.40, 3);
        Pereciveis danone = new Pereciveis("danone", 2.00, 1);

        produtos.add(macarrao);
        produtos.add(arroz);
        produtos.add(feijao);
        produtos.add(requeijao);
        produtos.add(danone);

        double valorTotal = (macarrao.calcular(5) + arroz.calcular(5) + feijao.calcular(5)
                + requeijao.calcular(5) + danone.calcular(5));

        System.out.println(valorTotal);
    }
}
