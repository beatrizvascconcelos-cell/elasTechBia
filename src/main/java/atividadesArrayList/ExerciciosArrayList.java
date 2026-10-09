package atividadesArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosArrayList {
    static void main() {
       /* Questão 1:

        ArrayList<String> listaDeNomes  = new ArrayList<String>(); // Lista vazia
        listaDeNomes.add("Pedro");// .add para ir adicionando elementos
        listaDeNomes. add("Carla");
        listaDeNomes.add("Joana");

        System.out.println(listaDeNomes);
        */


/* Questão 2:

ArrayList<String> frutas = new ArrayList<>(List.of("Banana", "uva", "morango", "goiaba"));

        System.out.printf("A primeira fruta é: %s\nA última fruta é: %s\nA lista tem um total de: %d frutas" ,
         frutas.get(1),frutas.get(3), frutas.size());
        */
/* Questão 3:

ArrayList<String> nomes = new ArrayList<>(List.of("Pedro", "Jorge", "Lucas", "Davi"));
        System.out.println(nomes);

        nomes.set(2,"Thiago"); // set para trocar o elemento da posição 2 por outro.
        System.out.println(nomes);
        */

/* Questão 4:

ArrayList<String> cidades = new ArrayList<>(List.of("João Pessoa", "Natal", "Salvador", "Fortaleza"));
cidades.remove(1);

        System.out.printf("Sobram: %d cidades\nQue são: %s", cidades.size(), cidades); // removendo uma
        */

        /* Questão 5:

        ArrayList<String> nomes = new ArrayList<>(List.of("Pedro", "Jorge", "Lucas", "Davi", "Maria", "Diana"));

        for (int i = 0; i < nomes.size();  i++) { // vai rodar o i ate que seja menor que o tamanho da lista
            System.out.println(i + ": " + nomes.get(i)); // imprime o i e a posição que ele está
        }
        */
        /* Questão 6:

        ArrayList<String> nomes = new ArrayList<>(List.of("Pedro", "Jorge", "Lucas", "Davi", "Maria"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome que procura: ");
        String nome = sc.nextLine();

        int posicao = nomes.indexOf(nome);

        if (posicao == -1) {
            System.out.println(nome + " não está na lista.");
        } else {
            System.out.println(nome + " está na lista, na posição " + posicao);
        }
        */

    }
}
