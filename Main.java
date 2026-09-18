package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Carro> carros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n==== MENU PRINCIPAL ====");
            System.out.println("1 - Funções de carro");
            System.out.println("2 - Funções de pessoas");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    menuCarros(scan, carros);
                    break;
                case 2:
                    Principal.executar(scan);
                    break;
                case 0:
                    System.out.println("Encerrando...\n");
                    break;
                default:
                    System.out.println("Digite um número válido.\n");
            }
        } while (opcao != 0);
    }

    private static void menuCarros(Scanner scan, ArrayList<Carro> carros) {
        int opcao;

        do {
            System.out.println("\n==== FUNÇÕES DE CARRO ====");
            System.out.println("1 - Cadastre um carro");
            System.out.println("2 - Mostrar carros cadastrados");
            System.out.println("3 - Ligar o carro");
            System.out.println("4 - Desligar o carro");
            System.out.println("5 - Acelerar o carro");
            System.out.println("6 - Frear o carro");
            System.out.println("7 - Buzinar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a marca: ");
                    String marca = scan.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Digite a cor: ");
                    String cor = scan.nextLine();
                    System.out.print("Digite a placa: ");
                    String placa = scan.nextLine();
                    System.out.print("Digite o ano: ");
                    int ano = scan.nextInt();
                    scan.nextLine();

                    carros.add(new Carro(marca, modelo, cor, placa, ano));
                    System.out.println("============================\n");
                    System.out.println("Carro cadastrado!\n");
                    break;
                case 2:
                    mostrarCarros(carros);
                    break;
                case 3:
                    Carro carroParaLigar = selecionarCarro(scan, carros);
                    if (carroParaLigar != null) {
                        carroParaLigar.ligar();
                    } else {
                        System.out.println("Cadastre um carro primeiro.\n");
                    }
                    break;
                case 4:
                    Carro carroParaDesligar = selecionarCarro(scan, carros);
                    if (carroParaDesligar != null) {
                        carroParaDesligar.desligar();
                    } else {
                        System.out.println("Cadastre um carro primeiro.\n");
                    }
                    break;
                case 5:
                    Carro carroParaAcelerar = selecionarCarro(scan, carros);
                    if (carroParaAcelerar != null) {
                        carroParaAcelerar.acelerar();
                    } else {
                        System.out.println("Cadastre um carro primeiro.\n");
                    }
                    break;
                case 6:
                    Carro carroParaFrear = selecionarCarro(scan, carros);
                    if (carroParaFrear != null) {
                        carroParaFrear.frear();
                    } else {
                        System.out.println("Cadastre um carro primeiro.\n");
                    }
                    break;
                case 7:
                    Carro carroParaBuzinar = selecionarCarro(scan, carros);
                    if (carroParaBuzinar != null) {
                        carroParaBuzinar.buzinar();
                    } else {
                        System.out.println("Cadastre um carro primeiro.\n");
                    }
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
                default:
                    System.out.println("Digite um número válido.\n");
            }
        } while (opcao != 0);
    }

    private static void mostrarCarros(ArrayList<Carro> carros) {
        if (carros.isEmpty()) {
            System.out.println("\nNenhum carro cadastrado.\n");
            return;
        }

        System.out.println("\n==== CARROS CADASTRADOS ====");
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            System.out.println((i + 1) + " - " + carro.marca + " " + carro.modelo
                    + " | Cor: " + carro.cor
                    + " | Placa: " + carro.placa
                    + " | Ano: " + carro.ano
                    + " | " + (carro.taLigado ? "Ligado" : "Desligado"));
        }
        System.out.println();
    }

    private static Carro selecionarCarro(Scanner scan, ArrayList<Carro> carros) {
        if (carros.isEmpty()) {
            return null;
        }

        System.out.println("\nCarros cadastrados:");
        for (int i = 0; i < carros.size(); i++) {
            Carro carro = carros.get(i);
            System.out.println((i + 1) + " - " + carro.marca + " " + carro.modelo
                    + " | Placa: " + carro.placa);
        }

        System.out.print("Escolha o carro: ");
        int indice = scan.nextInt();
        scan.nextLine();

        if (indice < 1 || indice > carros.size()) {
            System.out.println("Carro inválido.\n");
            return null;
        }

        return carros.get(indice - 1);
    }
}
