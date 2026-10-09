import java.util.Scanner;

public class RevisaoList {
    static void main() {

        /* Variaveis
        String nome = "Beatriz";
        int idade = 27;
        double altura = 1.63;
        boolean jaProgramou = false;
        System.out.printf("Meu nome é %s \n tenho: %d anos \n tenho: %.2f de altura \n e não programo %b \n", nome, idade, altura, jaProgramou);
        */

        /*String cidade = "João Pessoa";
        System.out.println("Eu moro em " + cidade);
        */

        /*String primeiroNome = "Beatriz";
        String sobrenome= "Vasconcelos";
        System.out.println("Meu nome é : " + primeiroNome + " " + sobrenome );
        */

        /*double preco = 29.90;
        System.out.printf("O objeto custa %.2f",  preco);
        */

        /*boolean temCarteira = true;
        System.out.printf("Tem carteira: %b ", temCarteira);
        */

/*🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
        int a = 10;
        int b = 20;
        int temporaria = a;
        a=b;
        b=temporaria;
        System.out.printf("O valor de A é: %d \nO valor de B é: %d ", a, b);
        */

/*🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
    int numero = 50;
    boolean divisivel = (numero % 3 == 0 ) && (numero % 5 == 0);
        System.out.println(divisivel);
        */


   /* 🔥 Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.

String produto1 = "Caderno";
double preco1 = 15.60;

String produto2 = "livro";
double preco2 = 37.83;

String produto3 = "mochila";
double preco3 = 78.99;

double total = (preco1 + preco2 + preco3);

        System.out.printf("Produto: %s  Valor: R$ %.2f \n",  produto1, preco1);
        System.out.printf("Produto: %s  Valor: R$ %.2f \n",  produto2, preco2);
        System.out.printf("Produto: %s  Valor: R$ %.2f \n",  produto3, preco3);

        System.out.printf("Total: R$ %.2f",total);
        */

        /*🔥 Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto). Depois imprima tudo numa ficha.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = sc.nextInt();

        System.out.println("Informe o seu nome: ");
        String nome = sc.next();

        System.out.println("Informe a sua cidade: ");
        String cidade = sc.next();

        System.out.printf("Idade: %d\nNome: %s\nCidade: %s\n", idade, nome, cidade);
        */

/*🔥 Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro lado do trinagulo: ");
        double lado1 = sc.nextDouble();

        System.out.println("Informe o segundo lado do trinagulo: ");
        double lado2 = sc.nextDouble();

        System.out.println("Informe o terceiro lado do trinagulo: ");
        double lado3 = sc.nextDouble();

        if (lado1 ==lado2 && lado1 ==lado3 && lado2 ==lado3) {
            System.out.println("Triângulo Equilátero, todos iguais ");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 ==lado3) {
            System.out.println("Triângulo Isósceles , dois lados iguais");
            
        }else {
            System.out.println("Triânguo escaleno: Todos os lados diferentes");
        }
        */
/*🔥 Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura: Digite a altura: 5 * ** *** **** *****

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de altura: ");
        int altura = sc.nextInt();

        for (int i = 1 ; i <= altura; i++) {
            //quantidade de *
            for (int j = 1 ; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        */

    }
}
