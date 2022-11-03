package edu.gustavo.exercicios.classe;

public class CarroNoUse {

    double price = 7.0;
    String cor = "Azul";
    String modelo = "Uno";
    double capacidadeTanque;

    public CarroNoUse() {

    }

    public CarroNoUse(String cor, String modelo, double capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

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


    public void botarGasolina(double litros){
        double valorTotal = price * litros;
        double novoTanque = capacidadeTanque + litros;

        setCapacidadeTanque(novoTanque);

        System.out.println("O valor é " + valorTotal);
    }

}
