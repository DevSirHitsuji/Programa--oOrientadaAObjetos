package edu.gustavo.exercicios.heranca;

public class Moto extends Automovel {
    public Moto(){

    }

    public Moto(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void mandarGrau(){
        System.out.println("Mandando o grau");
    }
}
