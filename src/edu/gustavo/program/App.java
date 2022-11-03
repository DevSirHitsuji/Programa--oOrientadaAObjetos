package edu.gustavo.program;

import edu.gustavo.exercicios.associacao.*;

public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Gustavo");
        cliente.setSobrenome("Silva");
        cliente.setIdade(20);
        
        System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + cliente.getEndereco());
    }
}
