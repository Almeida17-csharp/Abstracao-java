
public class Principal {

    public static void main(String[] args) {

        System.out.println("==== PROFESSOR ====");
        Professor professor1 = new Professor("Joao", "Matematica", 35, 10);
        Professor professor2 = new Professor("Maria", "Historia", 40, 15);
        System.out.println(professor1.nome);
        professor1.ensinar();
        System.out.println(professor2.nome);
        professor2.corrigir();

        System.out.println("==== ESTUDANTE ====");
        Estudante estudante1 = new Estudante("Carlos", 20, "DSM", 8.5);
        Estudante estudante2 = new Estudante("Ana", 19, "Direito", 9.0);
        System.out.println(estudante1.nome);
        estudante1.estudar();
        System.out.println(estudante2.nome);
        estudante2.fazerProva();

        System.out.println("==== MEDICO ====");
        Medico medico1 = new Medico("Pedro", "Cardiologia", 35, "CRM123");
        Medico medico2 = new Medico("Julia", "Pediatria", 30, "CRM456");
        System.out.println(medico1.nome);
        medico1.consultar();
        System.out.println(medico2.nome);
        medico2.diagnosticar();

        System.out.println("==== ENGENHEIRO ====");
        Engenheiro engenheiro1 = new Engenheiro("Lucas", "Civil", 28, 5);
        Engenheiro engenheiro2 = new Engenheiro("Laura", "Software", 30, 7);
        System.out.println(engenheiro1.nome);
        engenheiro1.projetar();
        System.out.println(engenheiro2.nome);
        engenheiro2.calcular();

        System.out.println("==== ATOR ====");
        Ator ator1 = new Ator("Rafael", 25, "Drama", 10);
        Ator ator2 = new Ator("Beatriz", 28, "Comedia", 8);
        System.out.println(ator1.nome);
        ator1.atuar();
        System.out.println(ator2.nome);
        ator2.ensaiar();

        System.out.println("==== CANTOR ====");
        Cantor cantor1 = new Cantor("Felipe", "Pop", 25, 3);
        Cantor cantor2 = new Cantor("Marina", "Rock", 30, 5);
        System.out.println(cantor1.nome);
        cantor1.cantar();
        System.out.println(cantor2.nome);
        cantor2.apresentar();

        System.out.println("==== POLICIAL ====");
        Policial policial1 = new Policial("Bruno", 32, "Civil", 8);
        Policial policial2 = new Policial("Camila", 29, "Militar", 6);
        System.out.println(policial1.nome);
        policial1.patrulhar();
        System.out.println(policial2.nome);
        policial2.investigar();

        System.out.println("==== BOMBEIRO ====");
        Bombeiro bombeiro1 = new Bombeiro("Andre", 35, 10, "Resgate");
        Bombeiro bombeiro2 = new Bombeiro("Paula", 30, 7, "Incendio");
        System.out.println(bombeiro1.nome);
        bombeiro1.resgatar();
        System.out.println(bombeiro2.nome);
        bombeiro2.apagarIncendio();

        System.out.println("==== MOTORISTA ====");
        Motorista motorista1 = new Motorista("Diego", 40, "B", 15);
        Motorista motorista2 = new Motorista("Sofia", 25, "D", 5);
        System.out.println(motorista1.nome);
        motorista1.dirigir();
        System.out.println(motorista2.nome);
        motorista2.frear();

        System.out.println("==== PILOTO ====");
        Piloto piloto1 = new Piloto("Gustavo", 38, 2000, "Comercial");
        Piloto piloto2 = new Piloto("Isabela", 32, 1500, "Militar");
        System.out.println(piloto1.nome);
        piloto1.decolar();
        System.out.println(piloto2.nome);
        piloto2.pousar();

        System.out.println("==== ADVOGADO ====");
        Advogado advogado1 = new Advogado("Henrique", "Civil", 35, 12);
        Advogado advogado2 = new Advogado("Clara", "Penal", 30, 8);
        System.out.println(advogado1.nome);
        advogado1.defender();
        System.out.println(advogado2.nome);
        advogado2.argumentar();

        System.out.println("==== JUIZ ====");
        Juiz juiz1 = new Juiz("Roberto", 50, "Criminal", 20);
        Juiz juiz2 = new Juiz("Helena", 45, "Civil", 15);
        System.out.println(juiz1.nome);
        juiz1.julgar();
        System.out.println(juiz2.nome);
        juiz2.sentenciar();

        System.out.println("==== ARQUITETO ====");
        Arquiteto arquiteto1 = new Arquiteto("Thiago", 30, "Residencial", 6);
        Arquiteto arquiteto2 = new Arquiteto("Amanda", 28, "Comercial", 5);
        System.out.println(arquiteto1.nome);
        arquiteto1.desenhar();
        System.out.println(arquiteto2.nome);
        arquiteto2.planejar();

        System.out.println("==== CIENTISTA ====");
        Cientista cientista1 = new Cientista("Eduardo", "Fisica", 40, 15);
        Cientista cientista2 = new Cientista("Bianca", "Quimica", 35, 10);
        System.out.println(cientista1.nome);
        cientista1.pesquisar();
        System.out.println(cientista2.nome);
        cientista2.experimentar();

        System.out.println("==== PINTOR ====");
        Pintor pintor1 = new Pintor("Antonio", "Oleo", 45, 20);
        Pintor pintor2 = new Pintor("Luiza", "Aquarela", 25, 5);
        System.out.println(pintor1.nome);
        pintor1.pintar();
        System.out.println(pintor2.nome);
        pintor2.criarArte();

        System.out.println("==== FOTOGRAFO ====");
        Fotografo fotografo1 = new Fotografo("Victor", "Retrato", 30, 8);
        Fotografo fotografo2 = new Fotografo("Natalia", "Natureza", 28, 6);
        System.out.println(fotografo1.nome);
        fotografo1.fotografar();
        System.out.println(fotografo2.nome);
        fotografo2.editar();

        System.out.println("==== JORNALISTA ====");
        Jornalista jornalista1 = new Jornalista("Daniel", "Politica", 35, 12);
        Jornalista jornalista2 = new Jornalista("Carolina", "Esportes", 29, 7);
        System.out.println(jornalista1.nome);
        jornalista1.investigar();
        System.out.println(jornalista2.nome);
        jornalista2.escrever();

        System.out.println("==== ATLETA ====");
        Atleta atleta1 = new Atleta("Matheus", "Futebol", 22, 10);
        Atleta atleta2 = new Atleta("Julia", "Natacao", 20, 8);
        System.out.println(atleta1.nome);
        atleta1.treinar();
        System.out.println(atleta2.nome);
        atleta2.competir();

        System.out.println("==== POLITICO ====");
        Politico politico1 = new Politico("Fernando", "Vereador", 45, "Partido A");
        Politico politico2 = new Politico("Renata", "Deputada", 40, "Partido B");
        System.out.println(politico1.nome);
        politico1.proporLei();
        System.out.println(politico2.nome);
        politico2.debater();

        System.out.println("==== PROGRAMADOR ====");
        Programador programador1 = new Programador("Marcelo", "Java", 20, 2);
        Programador programador2 = new Programador("Gabriel", "Python", 22, 3);
        System.out.println(programador1.nome);
        programador1.programar();
        System.out.println(programador2.nome);
        programador2.testar();
    }
}

class Professor {
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

class Estudante {
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

class Medico {
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

class Engenheiro {
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

class Ator {
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

class Cantor {
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

class Policial {
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

class Bombeiro {
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

class Motorista {
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

class Piloto {
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

class Advogado {
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

class Juiz {
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

class Arquiteto {
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

class Cientista {
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

class Pintor {
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

class Fotografo {
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

class Jornalista {
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

class Atleta {
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

class Politico {
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

class Programador {
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