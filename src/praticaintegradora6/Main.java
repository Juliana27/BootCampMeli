package praticaintegradora6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Veiculo("Ford", "Fiesta", BigDecimal.valueOf(1000)));
        veiculos.add(new Veiculo("Ford", "Focus", BigDecimal.valueOf(1200)));
        veiculos.add(new Veiculo("Ford", "Explorer", BigDecimal.valueOf(2500)));
        veiculos.add(new Veiculo("Fiat", "Uno", BigDecimal.valueOf(500)));
        veiculos.add(new Veiculo("Fiat", "Cronos", BigDecimal.valueOf(1000)));
        veiculos.add(new Veiculo("Fiat", "Torino", BigDecimal.valueOf(1250)));
        veiculos.add(new Veiculo("Chevrolet", "Aveo", BigDecimal.valueOf(1250)));
        veiculos.add(new Veiculo("Chevrolet", "Spin", BigDecimal.valueOf(2500)));
        veiculos.add(new Veiculo("Toyota", "Corola", BigDecimal.valueOf(1200)));
        veiculos.add(new Veiculo("Toyota", "Fortuner", BigDecimal.valueOf(3000)));
        veiculos.add(new Veiculo("Renault", "Logan", BigDecimal.valueOf(950)));

        Garagem garagem = new Garagem("X1", veiculos);

        System.out.println("--- ordenação por preço ---");
        veiculos.sort((a, b) -> a.getPreco().compareTo(b.getPreco()));
        veiculos.forEach(veiculo -> System.out.println(veiculo));

        System.out.println("--- ordenação por marca ---");
        veiculos.sort((a, b) -> a.getMarca().compareTo(b.getMarca()));
        veiculos.forEach(veiculo -> System.out.println(veiculo));

        System.out.println("--- ordenação preço menor que R$1000");
        veiculos.stream().filter(p -> p.getPreco().intValue() < 1000).forEach(System.out::println);
//        List<Veiculo> precoMenor1000 = veiculos.stream().filter(p -> p.getPreco().intValue() <= 1000).collect(Collectors.toList());

        System.out.println("--- ordenação preço maior ou igual que R$1000");
        veiculos.stream().filter(p -> p.getPreco().intValue() >= 1000).forEach(System.out::println);

        System.out.println("--- preço médio total dos veiculos ---");
        BigDecimal sum = (veiculos.stream().map(Veiculo::getPreco)
                .reduce(BigDecimal.ZERO, BigDecimal::add)).divide(BigDecimal.valueOf(veiculos.size()), 2, RoundingMode.HALF_UP);
        System.out.println(sum);
    }
}
