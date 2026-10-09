package atividadeTratamentodeExce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciciosTratamentoDeExcecoes {
    static void main() {


        /* Questão 1:

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.println("Informe o segundo número: ");
        int n2 = sc.nextInt();

        try {
            System.out.println("A divisão é: "+ (n1 / n2));

        }catch(ArithmeticException ae) {
            System.out.println("Não é possível dividir por 0");
        }
        */

        /* Questão 2:

        double[] notas = {10, 7.5, 8, 6.5, 9
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a posição da nota que deseja vê : ");
        int posicao = sc.nextInt();

       // System.out.println(notas[posicao]); para vê a posição que a pessoa digitou dentro do array

        try {
            System.out.println(notas[posicao]); // se der erro aqui mostre o catch

        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("O array so vai de 0 a 4 ");
        }
        */

    /* Questão 3:

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a sua idade : ");


    try {
        int idade = scan.nextInt();
        System.out.println("Você tem " +idade+ " anos");

    }catch (InputMismatchException ime){
        System.out.println("Você digitou um texto ao invés de um número ");
    }
    */

    /* Questão 4:
    String nome = null;

        try {
            System.out.println(nome.length());
        }catch (NullPointerException npe) {
            System.out.println( "O nome não foi preenchido.");
        }
        */
    /* Questão 5:

    Scanner sc = new Scanner(System.in);

    try {
        System.out.println("Informe o número : ");
        int  numero =  sc.nextInt();
        int resto  = 100 %  numero; // resto da divisão de 100 por "numero"
        System.out.println("O resto da divisão é: " + resto);

    }catch (ArithmeticException ae) {
        System.out.println("Número 0 é inválido ");

    }
    }
    */

    /* Questão 6:
    String [] nomes = {"Anna", "Laura", "Jessica"};

    try {
        System.out.println(nomes[5]); // o array so vai ate 3
    }catch (ArrayIndexOutOfBoundsException aie) {
        System.out.println("Essa posição não existe.");
    }

        System.out.println("O programa continua funcionando.");
    */
    }
}
