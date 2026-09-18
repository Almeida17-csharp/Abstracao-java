# Projeto de Abstração em Java

Projeto prático desenvolvido para treinar conceitos de Programação Orientada a Objetos (POO), feito em Java. O foco principal foi aplicar a Abstração e separar a estrutura do código usando o padrão MVC (Model e View).

## O que o código faz?
O programa roda direto no terminal e é dividido em dois menus interativos principais:

* **Menu de Carros:** Permite cadastrar veículos numa lista (`ArrayList`), além de interagir com o objeto ligando, desligando, acelerando e buzinando. Tem validações simples para não deixar ligar um carro que já está ligado.
* **Menu de Profissões:** Uma lista com 20 profissões diferentes (Professor, Médico, Engenheiro, etc.). Dá para escolher uma profissão no menu e o programa vai instanciar os objetos e executar os métodos específicos de cada uma (como `ensinar()` ou `projetar()`).

## Como foi feito
* **Linguagem:** Java puro
* **Conceitos:** Abstração, Classes, Construtores e Encapsulamento.
* **Organização:** Arquivos divididos em pacotes (`model` para a estrutura dos objetos e `view` para os menus e o `main`).
* Entrada de dados feita com `Scanner`.

## Como testar
É só baixar o código, abrir na sua IDE favorita, procurar o arquivo `Main.java` (dentro da pasta `view`) e rodar. Tudo funciona direto pelo console.