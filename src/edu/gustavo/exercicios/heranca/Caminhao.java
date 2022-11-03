package edu.gustavo.exercicios.heranca;

public class Caminhao extends Carro {
    String bau = "Baú fechado";

    public String getBau() {
        return bau;
    }

    public Caminhao(){

    }

    public Caminhao(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void abrirBau(){
        this.bau = "Baú aberto";
    }

    public void fecharBau(){
        this.bau = "Baú fechado";
    }
}
