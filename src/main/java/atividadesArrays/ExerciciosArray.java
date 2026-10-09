package atividadesArrays;

import java.util.Scanner;

public class ExerciciosArray {
    static void main() {

        /* Questão 1:

        String [] nomes = {"Bianca" , "Jéssica" , "Laura" , "Joana" , "Rebeca"};
        System.out.printf(" O primeiro nome é: %s %n O Terceiro nome é: %s %n e o último nome é: %s %n", nomes[0], nomes[2], nomes[4]); //Estruturação em uma linha so
        */

        /* Questão 2:

        int [] notas = {8, 6, 10, 7, 9};
        for(int i = 0; i < notas.length; i++) {
        System.out.println( "Nota " + (i +1) + " : " + notas[i]); // O i+1 é porque começa com 0 ai para começar com o 1 contando da primeira nota soma o i mais o 1 que irá do primeiro a 5

        }
        */

        /* Questão 3:

        int [] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        for (int i = 0 ; i < notas.length ; i++) { // começa no 0 e continua ate que i seja menor do que o tamanho do array
            soma += notas[i]; // pega o valor da volta e adiciona 1 em cada volta
        }

        double media = (soma /notas.length);
        System.out.printf("A soma é: %d %n ", soma  );
        System.out.printf("A média é: %.2f %n" , media);
        */

        /* Questão 4:

        Scanner sc = new Scanner (System.in);
        int [] numeros = new int[5]; //cria 5 gavetas

        for (int i =0; i <5 ; i++) {
            System.out.println("Informe um número");
            numeros[i] = sc.nextInt(); // guarda cada numero da posição i
        }
        for (int i = 4; i >=0 ; i-- ) { // para mostrar de trás para frente
        System.out.println(numeros[i]);
        }
        */

    }
}
