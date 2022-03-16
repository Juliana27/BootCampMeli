package praticaIntegradora7;

import praticaintegradora6.Veiculo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        clientes.add(new Cliente(1, "Juliana", "Brito"));
        clientes.add(new Cliente(2, "Vitor", "Brito"));
        clientes.add(new Cliente(3, "Thiago", "Oliveira"));

        for (Cliente c: clientes) {
            System.out.println(c);
        }

        clientes.remove(1);
        for (Cliente c: clientes){
            System.out.println(c);
        }

        System.out.println("Digite o id do cliente: ");
        int opcao = sc.nextInt();

        Optional<Cliente> any = clientes.stream().filter(a -> a.getId() == opcao).findAny();
        if (any.isPresent()) {
            System.out.println(any.get());
        } else {
            System.out.println("Não existe esse id");
        }

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "arroz", 2, BigDecimal.valueOf(16)));
        produtos.add(new Produto(1, "feijão", 10, BigDecimal.valueOf(6.5)));
        produtos.add(new Produto(2, "macarrao", 3, BigDecimal.valueOf(2.50)));

        BigDecimal totalProdutos = BigDecimal.valueOf(0);
        for (Produto produto: produtos) {
            totalProdutos = (produto.getPreco().multiply(BigDecimal.valueOf(produto.getQuantidade())).add(totalProdutos));
        }

        Fatura fatura = new Fatura(clientes.get(1), produtos, totalProdutos);
        System.out.println(fatura);
    }
}
