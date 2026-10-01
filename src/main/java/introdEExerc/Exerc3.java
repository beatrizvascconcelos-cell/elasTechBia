package introdEExerc;

public class Exerc3 {
    static void main() {

        // TEMA: ESTRUTURA DE DECISÃO

        /*Questão 1:

        int idade = 0;

        if (idade < 13) {
            System.out.println("É criança");

        } else if (idade >= 13 && idade <= 17) {
            System.out.println("É adolescente ");

        } else if (idade >= 18 && idade <= 59) {
            System.out.println("É adulto ");

        } else {
            System.out.println(" É idoso ");
        }
        */


        /*Questão 2:

        double saldoConta = 500;
        double compra = 320;
        double saldoRestante = (saldoConta - compra);


        if (saldoConta >= compra) {
            System.out.println(" Compra aprovada. Seu saldo restante é: R$ " + saldoRestante);
        } else {
            double falta = compra - saldoConta;
            System.out.println("Falta: R$ " + falta);

        }
        */


        /*Questão 3:

        int pedido = 6;
        switch (pedido) {

            case 1:
                System.out.println("Você escolheu Café ");
                break;

            case 2:
                System.out.println("Você escolheu Cappuccino");
                break;

            case 3:
                System.out.println("Você escolheu Chocolate quente");
                break;

            case 4:
                System.out.println("Você escolheu Chá");
                break;

        }
        if (pedido < 1 || pedido > 4) {
            System.out.println(" Opção inválida ");

        }
        */

        //Questão 4:

     /*int idade = 17;
    boolean temAutorizacao = true ;
        if (idade>=18 || temAutorizacao == true) {
            System.out.println(" Pode entrar na festa !");
        } else {
            System.out.println(" Não tem autorização ");
        }
*/
        /*int idade = 17;
        boolean temAutorizacao = true ;
        if (idade >= 18 && temAutorizacao == true) {
            System.out.println("Pode entrar na festa !");

        } else {
            System.out.println("Sinto muito querido, precisa ter idade e autorização :)");
        }
*/

        /*Desafio:

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 8.5;
        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.printf("Aprovada, maravilhosa!! Sua média foi : %.2f",  media);
        } else if (media >=5 && media <= 6.9) {
            System.out.printf("Recuperação, precisa estudar mais, sua média foi: %.2f" , media);
        } else if (media < 5) {
            System.out.printf("Reprovada, sua média foi: %.2f" , media);
        }
        */


    }
}