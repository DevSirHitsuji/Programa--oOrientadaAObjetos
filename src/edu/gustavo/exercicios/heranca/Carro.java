package edu.gustavo.exercicios.heranca;

public class Carro extends Automovel {
    String janelas = "Janelas fechadas";

    public String getJanelas() {
        return janelas;
    }

    public Carro(){

    }

    public Carro(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void abrirJanelas(){
        this.janelas = "Janelas abertas";
    }

    public void fecharJanelas(){
        this.janelas = "Janelas fechadas";
    }
}
