package atividadeMetodos;

import java.util.Scanner;

public class ExerciciosMetodos {
    /* Questão 1:
    public static void boasvindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    }

    static void main() { // chamando no main
        boasvindas();

    }
    */

    /* Questão 2:
    public static void saudar (String nome){
        System.out.println(" Olá, " + nome + " tudo bem ?");

    }

        static void main() {
            //saudar("Maria"); 1º nome
           // saudar ("Anna"); 2º nome
            //saudar("Luisa"); 3º nome
        }
    */

    /*Questão 3:
    public static int dobro(int numero) {
    return numero *2;

    }
    static void main() {// chamando no main para rodar o cod
        int resultado = dobro (8);
        System.out.println("Dobro: " + resultado);

    }
    */
/* Questão 4:

public static double calcularMedia (double nota1, double nota2){ // método
    return (nota1 + nota2) / 2;
}

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nota 1:");
        double nota1 = sc.nextDouble();
        System.out.println("Digite seu nota 2:");
        double nota2 = sc.nextDouble();

        double media = calcularMedia(nota1, nota2); // chamei o método no main
        System.out.printf("Media: %.2f%n", media);
    }
    */

    /* Questão 5:
    public static boolean ehMaiorDeIdade(int idade){
        return (idade >18);

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        int idade = sc.nextInt();

        if  (ehMaiorDeIdade(idade)) {
            System.out.println("Você é maior de idade");  // chamei o método

        } else  {
            System.out.println("Você é menor de idade :'(");
        }
    }
    */

    /* Questão 6:

    public static int somar (int a, int b){
        return a+b;
    }

    public static int somar (int c, int d, int e){
        return c+d+e;
    }

    public static double somar (double l , double m){
        return l+m;
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número :");
        int a = sc.nextInt();
        System.out.println("Digite o segundo  número :");
        int b = sc.nextInt();
        System.out.println("Soma dos dois inteiros "+ somar(a,b));

        System.out.println("Digite um número :");
        int c = sc.nextInt();
        System.out.println("Digite um segundo número :");
        int d = sc.nextInt();
        System.out.println("Digite o terceiro número :");
        int e = sc.nextInt();
        System.out.println( "Soma dos três inteiros : " + somar(c,d,e));

        System.out.println("Digite um o primeiro  número decimal ");
        double l = sc.nextDouble();
        System.out.println("Digite um segundo número decima :");
        double m = sc.nextDouble();
        System.out.println("Soma dos números decimais : " +somar(l, m));

    }
    */

    /* Questão 7:
    public static void saudacao() {
        System.out.println("Olá");

    }

public static String saudacao(String nome) {
    System.out.println("Olá, " + nome);
    return nome;
}

    static void main() {
        saudacao();
        saudacao("Beatriz");

    }
    */

}
