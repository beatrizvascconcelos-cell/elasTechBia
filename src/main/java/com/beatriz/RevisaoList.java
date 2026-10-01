package com.beatriz;

import java.util.Scanner;

public class RevisaoList {
    static void main() {


        /*Questão 1:
        Scanner sc = new Scanner(System.in);
        String lanche;
        double valor;


        System.out.println(" Qual lanche você vai querer? ");
        lanche = sc.nextLine();
        System.out.println( " Qual valor do seu lanche? ");
        valor = sc.nextDouble();

        if (valor >30.00) {
            valor -= 5.00;
        }

        System.out.printf(" Seu lanche " + lanche + " custa R$ %.2f",  valor );
        */



        /* Questão 2:

        for (int i = 1; i < 15; i++) {
              if (i % 2 ==0){
                  System.out.printf(i + " é par \n");

              } else if ((i % 2 !=0 )) {
                  System.out.printf(i + " é impar \n");
              }


              }
          */



        /*Questão 3
        int escolha;

        do {
            System.out.printf("Escolha uma opção:\n " +
                    "1 - Vê camisas\n" +
                    "2 - Vê calças \n" +
                    "3 - Sair \n");
            Scanner sc = new Scanner(System.in);
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    escolha = 1;
                    System.out.println(" Você optou por ver camisas");
                    break;

                case 2:
                    escolha = 2;
                    System.out.println("Você optou por ver calças ");
                    break;

                case 3:
                    escolha = 3;
                    System.out.println("Sair");
                    break;

                default:
                    System.out.println(" Opção inválida");
                    break;
            }
        } while (escolha != 3);
        */






    /* Questão 4 A:

    Pet cachorro = new Pet();
    cachorro.nome = "Melzinha ";
    cachorro.peso = 25;
    cachorro.raca = " PitBull ";

        System.out.println("Aqui estão os dados do seu pet: \n" + "Nome: " + cachorro.nome + " Peso: " + cachorro.peso + " Raça: " + cachorro.raca );

     */
        /* Questão 4 B:


Pet gato = new Pet();
gato.nome = "Pingo";
gato .peso = 10;
gato.raca = "Persa";
        System.out.println("Aqui estão os dados do seu pet: \n" + "Nome: " + gato.nome + " Peso: " + gato.peso + " Raça: " + gato.raca );

*/

        /*Questão 5:

        for (int i = 0; i <3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Informe o nome da mercadoria: ");
            Produto mercadoria = new Produto();
            mercadoria.nome = sc.nextLine();
            System.out.println("Informe o valor da mercadoria");
            mercadoria.preco = sc.nextDouble();

            if (mercadoria.preco >100) {
            System.out.printf("Produto caro! Preço : R$ %.2f \n" , mercadoria.preco );
            } else if (mercadoria.preco <= 100) {
                System.out.printf(" Produto com o preço acessível Preço : R$ %.2f \n" , mercadoria.preco );
            }



   }
        */



        /*Questão 6:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o ano de seu nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.nextLine(); // o next inter não lê o "enter" que a pessoa responde, por isso pula direto para a prox linha sem deixar que responda


        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();

        System.out.printf(" Seu usuário é: " + nome + anoNascimento );
        */



        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {
            System.out.println("Escolha uma opção: " +
                "1 \n" +
                "2");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluna estudante = new Aluna();
                    System.out.println( "Informe a primeira nota: ");
                    estudante.nota1 = sc.nextDouble();

                    System.out.println( "Informe a segunda nota: ");
                    estudante.nota2 = sc.nextDouble();

                    estudante.media = (estudante.nota1 + estudante.nota2)/2;
                    estudante.passou = estudante.media >= 6;

                    System.out.println( "Sua média é: "+ estudante.media);
                    sc.nextLine();
                    System.out.println( "Informe seu nome: ");
                    estudante.nome = sc.nextLine();

                    if (estudante.media >=6) {
                        System.out.printf(
                                "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f,%n" +
                                        "e sua média foi %.1f. Aluna aprovada: %b%n",
                                estudante.nome, estudante.nota1, estudante.nota2, estudante.media, estudante.passou
                        );
                    }
                    break;

                case 2:
                    System.out.println("Até breve!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;

            }
        }





    }

    }















