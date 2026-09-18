package br.edu.fatecpg.abstracao.view;

import br.edu.fatecpg.abstracao.model.Pessoas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        executar(new Scanner(System.in));
    }

    public static void executar(Scanner scan) {
        Pessoas.Professor professor1 = new Pessoas.Professor("Joao", "Matematica", 35, 10);
        Pessoas.Professor professor2 = new Pessoas.Professor("Maria", "Historia", 40, 15);
        Pessoas.Estudante estudante1 = new Pessoas.Estudante("Carlos", 20, "DSM", 8.5);
        Pessoas.Estudante estudante2 = new Pessoas.Estudante("Ana", 19, "ADS", 9.0);
        Pessoas.Medico medico1 = new Pessoas.Medico("Pedro", "Cardiologia", 35, "CRM123");
        Pessoas.Medico medico2 = new Pessoas.Medico("Julia", "Pediatria", 30, "CRM456");
        Pessoas.Engenheiro engenheiro1 = new Pessoas.Engenheiro("Lucas", "Civil", 28, 5);
        Pessoas.Engenheiro engenheiro2 = new Pessoas.Engenheiro("Laura", "Software", 30, 7);
        Pessoas.Ator ator1 = new Pessoas.Ator("Rafael", 25, "Drama", 10);
        Pessoas.Ator ator2 = new Pessoas.Ator("Beatriz", 28, "Comedia", 8);
        Pessoas.Cantor cantor1 = new Pessoas.Cantor("Felipe", "Pop", 25, 3);
        Pessoas.Cantor cantor2 = new Pessoas.Cantor("Marina", "Rock", 30, 5);
        Pessoas.Policial policial1 = new Pessoas.Policial("Bruno", 32, "Civil", 8);
        Pessoas.Policial policial2 = new Pessoas.Policial("Camila", 29, "Militar", 6);
        Pessoas.Bombeiro bombeiro1 = new Pessoas.Bombeiro("Andre", 35, 10, "Resgate");
        Pessoas.Bombeiro bombeiro2 = new Pessoas.Bombeiro("Paula", 30, 7, "Incendio");
        Pessoas.Motorista motorista1 = new Pessoas.Motorista("Diego", 40, "B", 15);
        Pessoas.Motorista motorista2 = new Pessoas.Motorista("Sofia", 25, "D", 5);
        Pessoas.Piloto piloto1 = new Pessoas.Piloto("Gustavo", 38, 2000, "Comercial");
        Pessoas.Piloto piloto2 = new Pessoas.Piloto("Isabela", 32, 1500, "Militar");
        Pessoas.Advogado advogado1 = new Pessoas.Advogado("Henrique", "Civil", 35, 12);
        Pessoas.Advogado advogado2 = new Pessoas.Advogado("Clara", "Penal", 30, 8);
        Pessoas.Juiz juiz1 = new Pessoas.Juiz("Roberto", 50, "Criminal", 20);
        Pessoas.Juiz juiz2 = new Pessoas.Juiz("Helena", 45, "Civil", 15);
        Pessoas.Arquiteto arquiteto1 = new Pessoas.Arquiteto("Thiago", 30, "Residencial", 6);
        Pessoas.Arquiteto arquiteto2 = new Pessoas.Arquiteto("Amanda", 28, "Comercial", 5);
        Pessoas.Cientista cientista1 = new Pessoas.Cientista("Eduardo", "Fisica", 40, 15);
        Pessoas.Cientista cientista2 = new Pessoas.Cientista("Bianca", "Quimica", 35, 10);
        Pessoas.Pintor pintor1 = new Pessoas.Pintor("Antonio", "Oleo", 45, 20);
        Pessoas.Pintor pintor2 = new Pessoas.Pintor("Luiza", "Aquarela", 25, 5);
        Pessoas.Fotografo fotografo1 = new Pessoas.Fotografo("Victor", "Retrato", 30, 8);
        Pessoas.Fotografo fotografo2 = new Pessoas.Fotografo("Natalia", "Natureza", 28, 6);
        Pessoas.Jornalista jornalista1 = new Pessoas.Jornalista("Daniel", "Politica", 35, 12);
        Pessoas.Jornalista jornalista2 = new Pessoas.Jornalista("Carolina", "Esportes", 29, 7);
        Pessoas.Atleta atleta1 = new Pessoas.Atleta("Matheus", "Futebol", 22, 10);
        Pessoas.Atleta atleta2 = new Pessoas.Atleta("Julia", "Natacao", 20, 8);
        Pessoas.Politico politico1 = new Pessoas.Politico("Fernando", "Vereador", 45, "Partido A");
        Pessoas.Politico politico2 = new Pessoas.Politico("Renata", "Deputada", 40, "Partido B");
        Pessoas.Programador programador1 = new Pessoas.Programador("Marcelo", "Java", 20, 2);
        Pessoas.Programador programador2 = new Pessoas.Programador("Gabriel", "Python", 22, 3);
        int opcao;

        do {
            listarPessoas(professor1, professor2, estudante1, estudante2, medico1, medico2,
                    engenheiro1, engenheiro2, ator1, ator2, cantor1, cantor2, policial1, policial2,
                    bombeiro1, bombeiro2, motorista1, motorista2, piloto1, piloto2, advogado1,
                    advogado2, juiz1, juiz2, arquiteto1, arquiteto2, cientista1, cientista2,
                    pintor1, pintor2, fotografo1, fotografo2, jornalista1, jornalista2, atleta1,
                    atleta2, politico1, politico2, programador1, programador2);
            System.out.println("0 - Voltar ao menu principal");
            System.out.print("Escolha uma profissão: ");
            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    mostrar("Professor", professor1.nome, professor2.nome);
                    professor1.ensinar();
                    professor2.corrigir();
                    break;
                case 2:
                    mostrar("Estudante", estudante1.nome, estudante2.nome);
                    estudante1.estudar();
                    estudante2.fazerProva();
                    break;
                case 3:
                    mostrar("Medico", medico1.nome, medico2.nome);
                    medico1.consultar();
                    medico2.diagnosticar();
                    break;
                case 4:
                    mostrar("Engenheiro", engenheiro1.nome, engenheiro2.nome);
                    engenheiro1.projetar();
                    engenheiro2.calcular();
                    break;
                case 5:
                    mostrar("Ator", ator1.nome, ator2.nome);
                    ator1.atuar();
                    ator2.ensaiar();
                    break;
                case 6:
                    mostrar("Cantor", cantor1.nome, cantor2.nome);
                    cantor1.cantar();
                    cantor2.apresentar();
                    break;
                case 7:
                    mostrar("Policial", policial1.nome, policial2.nome);
                    policial1.patrulhar();
                    policial2.investigar();
                    break;
                case 8:
                    mostrar("Bombeiro", bombeiro1.nome, bombeiro2.nome);
                    bombeiro1.resgatar();
                    bombeiro2.apagarIncendio();
                    break;
                case 9:
                    mostrar("Motorista", motorista1.nome, motorista2.nome);
                    motorista1.dirigir();
                    motorista2.frear();
                    break;
                case 10:
                    mostrar("Piloto", piloto1.nome, piloto2.nome);
                    piloto1.decolar();
                    piloto2.pousar();
                    break;
                case 11:
                    mostrar("Advogado", advogado1.nome, advogado2.nome);
                    advogado1.defender();
                    advogado2.argumentar();
                    break;
                case 12:
                    mostrar("Juiz", juiz1.nome, juiz2.nome);
                    juiz1.julgar();
                    juiz2.sentenciar();
                    break;
                case 13:
                    mostrar("Arquiteto", arquiteto1.nome, arquiteto2.nome);
                    arquiteto1.desenhar();
                    arquiteto2.planejar();
                    break;
                case 14:
                    mostrar("Cientista", cientista1.nome, cientista2.nome);
                    cientista1.pesquisar();
                    cientista2.experimentar();
                    break;
                case 15:
                    mostrar("Pintor", pintor1.nome, pintor2.nome);
                    pintor1.pintar();
                    pintor2.criarArte();
                    break;
                case 16:
                    mostrar("Fotografo", fotografo1.nome, fotografo2.nome);
                    fotografo1.fotografar();
                    fotografo2.editar();
                    break;
                case 17:
                    mostrar("Jornalista", jornalista1.nome, jornalista2.nome);
                    jornalista1.investigar();
                    jornalista2.escrever();
                    break;
                case 18:
                    mostrar("Atleta", atleta1.nome, atleta2.nome);
                    atleta1.treinar();
                    atleta2.competir();
                    break;
                case 19:
                    mostrar("Politico", politico1.nome, politico2.nome);
                    politico1.proporLei();
                    politico2.debater();
                    break;
                case 20:
                    mostrar("Programador", programador1.nome, programador2.nome);
                    programador1.programar();
                    programador2.testar();
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...\n");
                    break;
                default:
                    System.out.println("Digite um número válido.\n");
            }
        } while (opcao != 0);
    }

    private static void listarPessoas(Pessoas.Professor professor1, Pessoas.Professor professor2,
                                      Pessoas.Estudante estudante1, Pessoas.Estudante estudante2,
                                      Pessoas.Medico medico1, Pessoas.Medico medico2,
                                      Pessoas.Engenheiro engenheiro1, Pessoas.Engenheiro engenheiro2,
                                      Pessoas.Ator ator1, Pessoas.Ator ator2,
                                      Pessoas.Cantor cantor1, Pessoas.Cantor cantor2,
                                      Pessoas.Policial policial1, Pessoas.Policial policial2,
                                      Pessoas.Bombeiro bombeiro1, Pessoas.Bombeiro bombeiro2,
                                      Pessoas.Motorista motorista1, Pessoas.Motorista motorista2,
                                      Pessoas.Piloto piloto1, Pessoas.Piloto piloto2,
                                      Pessoas.Advogado advogado1, Pessoas.Advogado advogado2,
                                      Pessoas.Juiz juiz1, Pessoas.Juiz juiz2,
                                      Pessoas.Arquiteto arquiteto1, Pessoas.Arquiteto arquiteto2,
                                      Pessoas.Cientista cientista1, Pessoas.Cientista cientista2,
                                      Pessoas.Pintor pintor1, Pessoas.Pintor pintor2,
                                      Pessoas.Fotografo fotografo1, Pessoas.Fotografo fotografo2,
                                      Pessoas.Jornalista jornalista1, Pessoas.Jornalista jornalista2,
                                      Pessoas.Atleta atleta1, Pessoas.Atleta atleta2,
                                      Pessoas.Politico politico1, Pessoas.Politico politico2,
                                      Pessoas.Programador programador1, Pessoas.Programador programador2) {
        System.out.println("\n==== PESSOAS, PROFISSÕES E FUNÇÕES ====");
        System.out.println("1 - Professor: " + professor1.nome + " e " + professor2.nome + " | ensinar, corrigir");
        System.out.println("2 - Estudante: " + estudante1.nome + " e " + estudante2.nome + " | estudar, fazer prova");
        System.out.println("3 - Medico: " + medico1.nome + " e " + medico2.nome + " | consultar, diagnosticar");
        System.out.println("4 - Engenheiro: " + engenheiro1.nome + " e " + engenheiro2.nome + " | projetar, calcular");
        System.out.println("5 - Ator: " + ator1.nome + " e " + ator2.nome + " | atuar, ensaiar");
        System.out.println("6 - Cantor: " + cantor1.nome + " e " + cantor2.nome + " | cantar, apresentar");
        System.out.println("7 - Policial: " + policial1.nome + " e " + policial2.nome + " | patrulhar, investigar");
        System.out.println("8 - Bombeiro: " + bombeiro1.nome + " e " + bombeiro2.nome + " | resgatar, apagar incendio");
        System.out.println("9 - Motorista: " + motorista1.nome + " e " + motorista2.nome + " | dirigir, frear");
        System.out.println("10 - Piloto: " + piloto1.nome + " e " + piloto2.nome + " | decolar, pousar");
        System.out.println("11 - Advogado: " + advogado1.nome + " e " + advogado2.nome + " | defender, argumentar");
        System.out.println("12 - Juiz: " + juiz1.nome + " e " + juiz2.nome + " | julgar, sentenciar");
        System.out.println("13 - Arquiteto: " + arquiteto1.nome + " e " + arquiteto2.nome + " | desenhar, planejar");
        System.out.println("14 - Cientista: " + cientista1.nome + " e " + cientista2.nome + " | pesquisar, experimentar");
        System.out.println("15 - Pintor: " + pintor1.nome + " e " + pintor2.nome + " | pintar, criar arte");
        System.out.println("16 - Fotografo: " + fotografo1.nome + " e " + fotografo2.nome + " | fotografar, editar");
        System.out.println("17 - Jornalista: " + jornalista1.nome + " e " + jornalista2.nome + " | investigar, escrever");
        System.out.println("18 - Atleta: " + atleta1.nome + " e " + atleta2.nome + " | treinar, competir");
        System.out.println("19 - Politico: " + politico1.nome + " e " + politico2.nome + " | propor lei, debater");
        System.out.println("20 - Programador: " + programador1.nome + " e " + programador2.nome + " | programar, testar");
    }

    private static void mostrar(String profissao, String nome1, String nome2) {
        System.out.println("\n==== " + profissao.toUpperCase() + " ====");
        System.out.println("Pessoa 1: " + nome1);
        System.out.println("Pessoa 2: " + nome2);
        System.out.println();
    }
}
