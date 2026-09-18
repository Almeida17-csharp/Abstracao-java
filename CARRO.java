package br.edu.fatecpg.abstracao.model;

public class Carro {

    public String marca;
    public String modelo;
    public String cor;
    public String placa;
    public int ano;
    public boolean taLigado;

    public Carro(String mrc, String mdl, String cor, String plc, int ano){
        this.marca = mrc;
        this.modelo = mdl;
        this.cor = cor;
        this.placa = plc;
        this.ano = ano;
    }
    public void ligar(){
        if(taLigado) {
            System.out.println("Desligue o carro e depois ligue-o novamente\n");
            System.out.println(taLigado);
        }else {
            taLigado = true;
            System.out.println("Carro: " + this.marca + ", " + this.modelo + ". Ligado!\n");

        }
    }
    public void desligar(){
        if(taLigado) {
            taLigado = false;
            System.out.println("Desligando o carro: " + this.marca + ", " + this.modelo + ". Desligado!\n");

        }else {
            System.out.println("Carro: " + this.marca + ", " + this.modelo + ". Está desligado! Ligue-o para desligar\n");
            System.out.println(taLigado);
        }
    }
    public void buzinar(){
        System.out.println("Modelo: " + this.modelo + " | Bi Bi Bi");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }
}