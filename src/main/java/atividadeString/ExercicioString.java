package atividadeString;

import java.util.Scanner;

public class ExercicioString {
    static void main() {

        /* Questão 1:

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome completo: " );
        String nomeCompleto = input.nextLine();
        nomeCompleto.length();
        System.out.printf("Seu nome completo tem %d letras", nomeCompleto.length());
        */


        /* Questão 2:

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o seu nome completo: " );
        String nome = sc.nextLine();

        String nomeMaisculo = nome.toUpperCase(); // variavel nomeMaisculo recebe o nome com a função de ficar tudo maisculo
        String nomeMinusculo = nome.toLowerCase(); // variavel nomeMinusculo recebe o nome com a função de ficar tudo minusculo

        System.out.printf("Seu nome todo maiúsculo ficará : %s %n" +
                "e seu nome todo minúsculo ficará : %s %n" , nomeMaisculo , nomeMinusculo);
        */

        /* Questão 3:

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu nome ");
        String nome = sc.nextLine();
        char letrasDoNome = nome.charAt(0); // char é apenas um caractere

        System.out.printf("A primeira letra do seu nome é: %c",  letrasDoNome);

        */

        /* Questão 4:

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();

        System.out.println("Digite a palavra que você quer saber se contem na frase: ");
        String palavra = sc.nextLine();

        System.out.println("Contem a palavra? " + frase.contains(palavra)); // string principal (o que procura). A frase contem a palavra x...
        */

        /* Questão 5:

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:  ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu nome novamente:   ");
        String nomeNovamente = sc.nextLine();
        //nome.equalsIgnoreCase(nomeNovamente);

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(nomeNovamente));
        */


    }
}
