package edu.gustavo.exercicios.heranca;

public class Automovel {
    String cor;
    String modelo;
    String estado = "Parado";

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Automovel(){

    }

    public Automovel(String cor, String modelo){
        this.cor = cor;
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Aceleração acionada.");
        this.estado = "Andando";
    }

    public void freiar(){
        System.out.println("Freio acionado.");
        this.estado = "Parado";
    }

}
