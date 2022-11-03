package edu.gustavo.exercicios.associacao;

public class Cliente {
    Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }
    
    String nome;
    String sobrenome;
    int idade;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
