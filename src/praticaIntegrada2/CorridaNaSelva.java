package praticaIntegrada2;

import java.util.Scanner;

public class CorridaNaSelva {

    public static void main(String[] args) {

        Circuito circuito1 = new Circuito();
        Circuito circuito2 = new Circuito();
        Circuito circuito3 = new Circuito();

        circuito1.setNome("Circuito pequeno");
        circuito1.setKm(2);
        circuito1.setValorAdulto(1500);
        circuito1.setValorCrianca(1300);

        circuito2.setNome("Circuito médio");
        circuito2.setKm(5);
        circuito2.setValorAdulto(2300);
        circuito2.setValorCrianca(2000);

        circuito3.setNome("Circuito avançado");
        circuito3.setKm(10);
        circuito3.setValorAdulto(2800);

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int index = 1;

        while (opcao != 3) {

            ApresentaMenuPrincipal();
            opcao = sc.nextInt();
            int tipoCircuito;

            switch (opcao) {
                case 1:
                    Participante participante = new Participante();
                    System.out.println("Nome: ");
                    participante.setNome(sc.next());
                    System.out.println("Sobrenome: ");
                    participante.setSobrenome(sc.next());
                    System.out.println("RG: ");
                    participante.setRg(sc.next());
                    System.out.println("Idade: ");
                    participante.setIdade(sc.nextInt());
                    System.out.println("Celular: ");
                    participante.setCelular(sc.next());
                    System.out.println("Número de emergência: ");
                    participante.setNumEmergencia(sc.next());
                    System.out.println("Grupo sanguineo: ");
                    participante.setGrupoSanguineo(sc.next());
                    System.out.println("Escolha o circuito");
                    System.out.println("1 - Circuito pequeno");
                    System.out.println("2 - Circuito médio");
                    System.out.println("3 - Circuito avançado");
                    tipoCircuito = sc.nextInt();

                    if (tipoCircuito == 3 && participante.getIdade() < 18) {
                        System.out.println("Menores de 18 anos não podem fazer inscrição para o circuito avançado");
                        break;
                    } else if (tipoCircuito == 1 && participante.getIdade() < 18) {
                        System.out.println("Valor a ser pago R$" + circuito1.getValorCrianca());
                        participante.setCircuito(circuito1);
                    } else if (tipoCircuito == 1 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito1.getValorAdulto());
                        participante.setCircuito(circuito1);
                    } else if (tipoCircuito == 2 && participante.getIdade() < 18) {
                        System.out.println("Valor a ser pago R$" + circuito2.getValorCrianca());
                        participante.setCircuito(circuito2);
                    } else if (tipoCircuito == 2 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito2.getValorAdulto());
                        participante.setCircuito(circuito2);
                    } else if (tipoCircuito == 3 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito3.getValorAdulto());
                        participante.setCircuito(circuito3);
                    } else {
                        System.out.println("Esse circuito não existe");
                        break;
                    }
                    participante.setInscricao(index);
                    System.out.println("Inscrição realizada! nº" + participante.getInscricao());
                    index++;
                    break;
                case 2:
                    apresentaTabelaDeCircuitos(circuito1, circuito2, circuito3);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não existe");
                    break;

            }
        }

    }

    private static void ApresentaMenuPrincipal() {
        System.out.println("-- MENU Corrida na Selva --");
        System.out.println("1 - Nova inscrição");
        System.out.println("2 - Consultar valores dos circuitos");
        System.out.println("3 - Sair");
        System.out.println("Digite a opção desejada: ");
    }

    private static void apresentaTabelaDeCircuitos(Circuito circuito1, Circuito circuito2, Circuito circuito3) {
        System.out.println("-- Valores dos circuitos --");
        System.out.println(circuito1.getNome() + " - menores de 18 anos R$" + circuito1.getValorCrianca());
        System.out.println(circuito1.getNome() + " - maiores de 18 anos R$" + circuito1.getValorAdulto());
        System.out.println(circuito2.getNome() + " - menores de 18 anos R$" + circuito2.getValorCrianca());
        System.out.println(circuito2.getNome() + " - maiores de 18 anos R$" + circuito2.getValorAdulto());
        System.out.println(circuito3.getNome() + " - maiores de 18 anos R$" + circuito3.getValorAdulto());
//                    System.out.println("aperte Enter para continuar...");
//                    sc.next();
    }
}
