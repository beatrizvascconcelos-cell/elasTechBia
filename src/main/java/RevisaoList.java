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

//🔥 Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
    int numero = 50;
    boolean divisivel = (numero % 3 == 0 ) && (numero % 5 == 0);
        System.out.println(divisivel);

    }
}
