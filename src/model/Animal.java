package model;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public void alimentar() {
        System.out.println(nome + " foi alimentado.");
    }

    public void fazerSom() {
        System.out.println("O animal fez um som.");
    }

    public String getNome() {
        return nome;
    }

}