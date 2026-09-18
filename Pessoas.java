package br.edu.fatecpg.abstracao.model;

public class Pessoas {
    public static class Professor {
        public String nome, disciplina;
        public int idade, experiencia;

        public Professor(String nome, String disciplina, int idade, int experiencia) {
            this.nome = nome;
            this.disciplina = disciplina;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void ensinar() { System.out.println("Ensinando."); }
        public void corrigir() { System.out.println("Corrigindo provas."); }
    }

    public static class Estudante {
        public String nome, curso;
        public int idade;
        public double nota;

        public Estudante(String nome, int idade, String curso, double nota) {
            this.nome = nome;
            this.idade = idade;
            this.curso = curso;
            this.nota = nota;
        }

        public void estudar() { System.out.println("Estudando."); }
        public void fazerProva() { System.out.println("Fazendo prova."); }
    }

    public static class Medico {
        public String nome, especialidade, crm;
        public int idade;

        public Medico(String nome, String especialidade, int idade, String crm) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.idade = idade;
            this.crm = crm;
        }

        public void consultar() { System.out.println("Realizando consulta."); }
        public void diagnosticar() { System.out.println("Realizando diagnostico."); }
    }

    public static class Engenheiro {
        public String nome, area;
        public int idade, experiencia;

        public Engenheiro(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void projetar() { System.out.println("Criando projeto."); }
        public void calcular() { System.out.println("Realizando calculos."); }
    }

    public static class Ator {
        public String nome, genero;
        public int idade, experiencia;

        public Ator(String nome, int idade, String genero, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.genero = genero;
            this.experiencia = experiencia;
        }

        public void atuar() { System.out.println("Atuando."); }
        public void ensaiar() { System.out.println("Ensaiando."); }
    }

    public static class Cantor {
        public String nome, estilo;
        public int idade, albuns;

        public Cantor(String nome, String estilo, int idade, int albuns) {
            this.nome = nome;
            this.estilo = estilo;
            this.idade = idade;
            this.albuns = albuns;
        }

        public void cantar() { System.out.println("Cantando."); }
        public void apresentar() { System.out.println("Realizando apresentacao."); }
    }

    public static class Policial {
        public String nome, tipo;
        public int idade, experiencia;

        public Policial(String nome, int idade, String tipo, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.tipo = tipo;
            this.experiencia = experiencia;
        }

        public void patrulhar() { System.out.println("Patrulhando."); }
        public void investigar() { System.out.println("Investigando."); }
    }

    public static class Bombeiro {
        public String nome, especialidade;
        public int idade, experiencia;

        public Bombeiro(String nome, int idade, int experiencia, String especialidade) {
            this.nome = nome;
            this.idade = idade;
            this.experiencia = experiencia;
            this.especialidade = especialidade;
        }

        public void resgatar() { System.out.println("Realizando resgate."); }
        public void apagarIncendio() { System.out.println("Apagando incendio."); }
    }

    public static class Motorista {
        public String nome, categoriaCNH;
        public int idade, experiencia;

        public Motorista(String nome, int idade, String categoriaCNH, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.categoriaCNH = categoriaCNH;
            this.experiencia = experiencia;
        }

        public void dirigir() { System.out.println("Dirigindo."); }
        public void frear() { System.out.println("Freando."); }
    }

    public static class Piloto {
        public String nome, tipo;
        public int idade, horasVoo;

        public Piloto(String nome, int idade, int horasVoo, String tipo) {
            this.nome = nome;
            this.idade = idade;
            this.horasVoo = horasVoo;
            this.tipo = tipo;
        }

        public void decolar() { System.out.println("Decolando."); }
        public void pousar() { System.out.println("Pousando."); }
    }

    public static class Advogado {
        public String nome, area;
        public int idade, experiencia;

        public Advogado(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void defender() { System.out.println("Defendendo cliente."); }
        public void argumentar() { System.out.println("Apresentando argumentos."); }
    }

    public static class Juiz {
        public String nome, area;
        public int idade, experiencia;

        public Juiz(String nome, int idade, String area, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.area = area;
            this.experiencia = experiencia;
        }

        public void julgar() { System.out.println("Julgando processo."); }
        public void sentenciar() { System.out.println("Proferindo sentenca."); }
    }

    public static class Arquiteto {
        public String nome, especialidade;
        public int idade, experiencia;

        public Arquiteto(String nome, int idade, String especialidade, int experiencia) {
            this.nome = nome;
            this.idade = idade;
            this.especialidade = especialidade;
            this.experiencia = experiencia;
        }

        public void desenhar() { System.out.println("Desenhando projeto."); }
        public void planejar() { System.out.println("Planejando construcao."); }
    }

    public static class Cientista {
        public String nome, area;
        public int idade, experiencia;

        public Cientista(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void pesquisar() { System.out.println("Realizando pesquisa."); }
        public void experimentar() { System.out.println("Realizando experimento."); }
    }

    public static class Pintor {
        public String nome, tecnica;
        public int idade, experiencia;

        public Pintor(String nome, String tecnica, int idade, int experiencia) {
            this.nome = nome;
            this.tecnica = tecnica;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void pintar() { System.out.println("Pintando."); }
        public void criarArte() { System.out.println("Criando obra de arte."); }
    }

    public static class Fotografo {
        public String nome, especialidade;
        public int idade, experiencia;

        public Fotografo(String nome, String especialidade, int idade, int experiencia) {
            this.nome = nome;
            this.especialidade = especialidade;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void fotografar() { System.out.println("Tirando fotografia."); }
        public void editar() { System.out.println("Editando fotografia."); }
    }

    public static class Jornalista {
        public String nome, area;
        public int idade, experiencia;

        public Jornalista(String nome, String area, int idade, int experiencia) {
            this.nome = nome;
            this.area = area;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void investigar() { System.out.println("Investigando noticia."); }
        public void escrever() { System.out.println("Escrevendo reportagem."); }
    }

    public static class Atleta {
        public String nome, esporte;
        public int idade, experiencia;

        public Atleta(String nome, String esporte, int idade, int experiencia) {
            this.nome = nome;
            this.esporte = esporte;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void treinar() { System.out.println("Realizando treinamento."); }
        public void competir() { System.out.println("Participando de competicao."); }
    }

    public static class Politico {
        public String nome, cargo, partido;
        public int idade;

        public Politico(String nome, String cargo, int idade, String partido) {
            this.nome = nome;
            this.cargo = cargo;
            this.idade = idade;
            this.partido = partido;
        }

        public void proporLei() { System.out.println("Propondo lei."); }
        public void debater() { System.out.println("Participando de debate."); }
    }

    public static class Programador {
        public String nome, linguagem;
        public int idade, experiencia;

        public Programador(String nome, String linguagem, int idade, int experiencia) {
            this.nome = nome;
            this.linguagem = linguagem;
            this.idade = idade;
            this.experiencia = experiencia;
        }

        public void programar() { System.out.println("Escrevendo codigo."); }
        public void testar() { System.out.println("Testando programa."); }
    }
}
