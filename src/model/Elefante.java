package model;

public class Elefante extends Animal {

    public Elefante(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " fez: Prrrrruuu!");
    }

}