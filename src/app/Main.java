package app;

import java.util.Scanner;
import model.Leao;
import model.Elefante;
import model.Animal;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do leão:");
        String nomeLeao = sc.nextLine();

        System.out.println("Digite a idade do leão:");
        int idadeLeao = sc.nextInt();
        sc.nextLine();

        Animal leao = new Leao(nomeLeao, idadeLeao);

        System.out.println("\nDigite o nome do elefante:");
        String nomeElefante = sc.nextLine();

        System.out.println("Digite a idade do elefante:");
        int idadeElefante = sc.nextInt();

        Animal elefante = new Elefante(nomeElefante, idadeElefante);

        int opcao = 0;

        while (opcao != 4) {

            System.out.println("\n===== ZOOLÓGICO =====");
            System.out.println("1 - Mostrar animais");
            System.out.println("2 - Alimentar animais");
            System.out.println("3 - Ouvir sons");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\n--- Leão ---");
                    leao.mostrarInformacoes();

                    System.out.println("\n--- Elefante ---");
                    elefante.mostrarInformacoes();
                    break;

                case 2:
                    leao.alimentar();
                    elefante.alimentar();
                    break;

                case 3:
                    leao.fazerSom();
                    elefante.fazerSom();
                    break;

                case 4:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        }

        sc.close();
    }
}