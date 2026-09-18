package br.edu.fatecpg.abstracao.model;

public class Pessoas {
    static class Professor {
        String nome, disciplina;
        int idade, experiencia;

        Professor(String nome, String disciplina, int idade, int experiencia) {
            this.nome = nome;
            this.disciplina = disciplina;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void ensinar() { System.out.println("Ensinando."); }
        void corrigir() { System.out.println("Corrigindo provas."); }
    }

    static class Estudante {
        String nome, curso;
        int idade;
        double nota;

        Estudante(String nome, int idade, String curso, double nota) {
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
            this.nota = nota;
        }

        void estudar() { System.out.println("Estudando."); }
        void fazerProva() { System.out.println("Fazendo prova."); }
    }

    static class Medico {
        String nome, especialidade, crm;
        int idade;

        Medico(String nome, String especialidade, int idade, String crm) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.idade = idade;
            this.crm = crm;
        }

        void consultar() { System.out.println("Realizando consulta."); }
        void diagnosticar() { System.out.println("Realizando diagnostico."); }
    }

    static class Engenheiro {
        String nome, area;
        int idade, experiencia;

        Engenheiro(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void projetar() { System.out.println("Criando projeto."); }
        void calcular() { System.out.println("Realizando calculos."); }
    }

    static class Ator {
        String nome, genero;
        int idade, experiencia;

        Ator(String nome, int idade, String genero, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.genero = genero;
            this.experiencia = experiencia;
        }

        void atuar() { System.out.println("Atuando."); }
        void ensaiar() { System.out.println("Ensaiando."); }
    }

    static class Cantor {
        String nome, estilo;
        int idade, albuns;

        Cantor(String nome, String estilo, int idade, int albuns) {
            this.nome = nome;
            this.estilo = estilo;
            this.idade = idade;
            this.albuns = albuns;
        }

        void cantar() { System.out.println("Cantando."); }
        void apresentar() { System.out.println("Realizando apresentacao."); }
    }

    static class Policial {
        String nome, tipo;
        int idade, experiencia;

        Policial(String nome, int idade, String tipo, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.tipo = tipo;
            this.experiencia = experiencia;
        }

        void patrulhar() { System.out.println("Patrulhando."); }
        void investigar() { System.out.println("Investigando."); }
    }

    static class Bombeiro {
        String nome, especialidade;
        int idade, experiencia;

        Bombeiro(String nome, int idade, int experiencia, String especialidade) {
            this.nome = nome;
            this.idade = idade;
            this.experiencia = experiencia;
            this.especialidade = especialidade;
        }

        void resgatar() { System.out.println("Realizando resgate."); }
        void apagarIncendio() { System.out.println("Apagando incendio."); }
    }

    static class Motorista {
        String nome, categoriaCNH;
        int idade, experiencia;

        Motorista(String nome, int idade, String categoriaCNH, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.categoriaCNH = categoriaCNH;
            this.experiencia = experiencia;
        }

        void dirigir() { System.out.println("Dirigindo."); }
        void frear() { System.out.println("Freando."); }
    }

    static class Piloto {
        String nome, tipo;
        int idade, horasVoo;

        Piloto(String nome, int idade, int horasVoo, String tipo) {
            this.nome = nome;
            this.idade = idade;
            this.horasVoo = horasVoo;
            this.tipo = tipo;
        }

        void decolar() { System.out.println("Decolando."); }
        void pousar() { System.out.println("Pousando."); }
    }

    static class Advogado {
        String nome, area;
        int idade, experiencia;

        Advogado(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void defender() { System.out.println("Defendendo cliente."); }
        void argumentar() { System.out.println("Apresentando argumentos."); }
    }

    static class Juiz {
        String nome, area;
        int idade, experiencia;

        Juiz(String nome, int idade, String area, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.area = area;
            this.experiencia = experiencia;
        }

        void julgar() { System.out.println("Julgando processo."); }
        void sentenciar() { System.out.println("Proferindo sentenca."); }
    }

    static class Arquiteto {
        String nome, especialidade;
        int idade, experiencia;

        Arquiteto(String nome, int idade, String especialidade, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.especialidade = especialidade;
            this.experiencia = experiencia;
        }

        void desenhar() { System.out.println("Desenhando projeto."); }
        void planejar() { System.out.println("Planejando construcao."); }
    }

    static class Cientista {
        String nome, area;
        int idade, experiencia;

        Cientista(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void pesquisar() { System.out.println("Realizando pesquisa."); }
        void experimentar() { System.out.println("Realizando experimento."); }
    }

    static class Pintor {
        String nome, tecnica;
        int idade, experiencia;

        Pintor(String nome, String tecnica, int idade, int experiencia) {
            this.nome = nome;
            this.tecnica = tecnica;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void pintar() { System.out.println("Pintando."); }
        void criarArte() { System.out.println("Criando obra de arte."); }
    }

    static class Fotografo {
        String nome, especialidade;
        int idade, experiencia;

        Fotografo(String nome, String especialidade, int idade, int experiencia) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void fotografar() { System.out.println("Tirando fotografia."); }
        void editar() { System.out.println("Editando fotografia."); }
    }

    static class Jornalista {
        String nome, area;
        int idade, experiencia;

        Jornalista(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void investigar() { System.out.println("Investigando noticia."); }
        void escrever() { System.out.println("Escrevendo reportagem."); }
    }

    static class Atleta {
        String nome, esporte;
        int idade, experiencia;

        Atleta(String nome, String esporte, int idade, int experiencia) {
            this.nome = nome;
            this.esporte = esporte;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void treinar() { System.out.println("Realizando treinamento."); }
        void competir() { System.out.println("Participando de competicao."); }
    }

    static class Politico {
        String nome, cargo, partido;
        int idade;

        Politico(String nome, String cargo, int idade, String partido) {
            this.nome = nome;
            this.cargo = cargo;
            this.idade = idade;
            this.partido = partido;
        }

        void proporLei() { System.out.println("Propondo lei."); }
        void debater() { System.out.println("Participando de debate."); }
    }

    static class Programador {
        String nome, linguagem;
        int idade, experiencia;

        Programador(String nome, String linguagem, int idade, int experiencia) {
            this.nome = nome;
            this.linguagem = linguagem;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        void programar() { System.out.println("Escrevendo codigo."); }
        void testar() { System.out.println("Testando programa."); }
    }
}
