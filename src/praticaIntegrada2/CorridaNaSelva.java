package praticaIntegrada2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CorridaNaSelva {

    private static void ApresentaMenuPrincipal() {
        System.out.println("-- MENU Corrida na Selva --");
        System.out.println("1 - Nova inscrição");
        System.out.println("2 - Consultar valores dos circuitos");
        System.out.println("3 - Consultar lista de participantes por circuito");
        System.out.println("4 - Sair");
        System.out.println("Digite a opção desejada: ");
    }

    private static void apresentaTabelaDeCircuitos(Circuito circuito1, Circuito circuito2, Circuito circuito3) {
        System.out.println("-- Valores dos circuitos --");
        System.out.println(circuito1.getNome() + " - menores de 18 anos R$" + circuito1.getValorCrianca());
        System.out.println(circuito1.getNome() + " - maiores de 18 anos R$" + circuito1.getValorAdulto());
        System.out.println(circuito2.getNome() + " - menores de 18 anos R$" + circuito2.getValorCrianca());
        System.out.println(circuito2.getNome() + " - maiores de 18 anos R$" + circuito2.getValorAdulto());
        System.out.println(circuito3.getNome() + " - maiores de 18 anos R$" + circuito3.getValorAdulto());
    }

    private static int menuListaParticipantes(Scanner sc) {
        int opcao;
        System.out.println("-- Lista de participantes por circuito --");
        System.out.println("1 - Circuito pequeno");
        System.out.println("2 - Circuito médio");
        System.out.println("3 - Circuito avançado");
        System.out.println("Digite a opção desejada: ");
        opcao = sc.nextInt();
        return opcao;
    }

    public static void main(String[] args) {

        Circuito circuito1 = new Circuito();
        Circuito circuito2 = new Circuito();
        Circuito circuito3 = new Circuito();

        circuito1.setNome("Circuito pequeno");
        circuito1.setKm(2);
        circuito1.setValorAdulto(1500);
        circuito1.setValorCrianca(1300);
        List<Participante> lista1 =  new ArrayList<>();

        circuito2.setNome("Circuito médio");
        circuito2.setKm(5);
        circuito2.setValorAdulto(2300);
        circuito2.setValorCrianca(2000);
        List<Participante> lista2 =  new ArrayList<>();

        circuito3.setNome("Circuito avançado");
        circuito3.setKm(10);
        circuito3.setValorAdulto(2800);
        List<Participante> lista3 =  new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        int index = 1;

        while (opcao != 5) {

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
                        lista1.add(participante);
                        circuito1.setListaDeParticipantes(lista1);
                    } else if (tipoCircuito == 1 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito1.getValorAdulto());
                        participante.setCircuito(circuito1);
                        lista1.add(participante);
                        circuito1.setListaDeParticipantes(lista1);
                    } else if (tipoCircuito == 2 && participante.getIdade() < 18) {
                        System.out.println("Valor a ser pago R$" + circuito2.getValorCrianca());
                        participante.setCircuito(circuito2);
                        lista2.add(participante);
                        circuito2.setListaDeParticipantes(lista2);
                    } else if (tipoCircuito == 2 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito2.getValorAdulto());
                        participante.setCircuito(circuito2);
                        lista2.add(participante);
                        circuito2.setListaDeParticipantes(lista2);
                    } else if (tipoCircuito == 3 && participante.getIdade() >= 18) {
                        System.out.println("Valor a ser pago R$" + circuito3.getValorAdulto());
                        participante.setCircuito(circuito3);
                        lista3.add(participante);
                        circuito3.setListaDeParticipantes(lista3);
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
                    opcao = menuListaParticipantes(sc);
                    String cancela = "";
                    switch (opcao) {
                        case 1:
                            for (int i = 0; i < circuito1.getListaDeParticipantes().size(); i++) {
                                System.out.println("Nome: " + circuito1.getListaDeParticipantes().get(i).getNome());
                                System.out.println("Nº de inscrição: " + circuito1.getListaDeParticipantes().get(i).getInscricao());
                                System.out.println("----x----");
                            }
                            System.out.println("Deseja cancelar uma inscrição? S/N");
                            cancela = sc.next();
                            if (cancela.equalsIgnoreCase("s")) {
                                System.out.println("Digite o número de inscrição que deseja cancelar: ");
                                opcao = sc.nextInt();
                                for (int i = 0; i < circuito1.getListaDeParticipantes().size(); i++) {
                                    if (circuito1.getListaDeParticipantes().get(i).getInscricao() == opcao) {
                                        circuito1.getListaDeParticipantes().remove(i);
                                    }
                                }
                            }
                            break;
                        case 2:
                            for (int i = 0; i < circuito2.getListaDeParticipantes().size(); i++) {
                                System.out.println("Nome: " + circuito2.getListaDeParticipantes().get(i).getNome());
                                System.out.println("Nº de inscrição: " + circuito2.getListaDeParticipantes().get(i).getInscricao());
                                System.out.println("----x----");
                            }
                            System.out.println("Deseja cancelar uma inscrição? S/N");
                            cancela = sc.next();
                            if (cancela.equalsIgnoreCase("s")) {
                                System.out.println("Digite o número de inscrição que deseja cancelar: ");
                                opcao = sc.nextInt();
                                for (int i = 0; i < circuito2.getListaDeParticipantes().size(); i++) {
                                    if (circuito2.getListaDeParticipantes().get(i).getInscricao() == opcao) {
                                        circuito2.getListaDeParticipantes().remove(i);
                                    }
                                }
                            }
                            break;
                        case 3:
                            for (int i = 0; i < circuito3.getListaDeParticipantes().size(); i++) {
                                System.out.println("Nome: " + circuito3.getListaDeParticipantes().get(i).getNome());
                                System.out.println("Nº de inscrição: " + circuito3.getListaDeParticipantes().get(i).getInscricao());
                                System.out.println("----x----");
                            }
                            System.out.println("Deseja cancelar uma inscrição? S/N");
                            cancela = sc.next();
                            if (cancela.equalsIgnoreCase("s")) {
                                System.out.println("Digite o número de inscrição que deseja cancelar: ");
                                opcao = sc.nextInt();
                                for (int i = 0; i < circuito3.getListaDeParticipantes().size(); i++) {
                                    if (circuito3.getListaDeParticipantes().get(i).getInscricao() == opcao) {
                                        circuito3.getListaDeParticipantes().remove(i);
                                    }
                                }
                            }
                            break;
                        default:
                            System.out.println("Esse circuito não existe");
                            break;
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não existe");
                    break;

            }
        }

    }
}
