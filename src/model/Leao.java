package model;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println(getNome() + " rugiu: Rooooar!");
    }

}