package atividadeLambda.Lambda1;

public class Main {
    static void main() {


        /*Saudacao sau = ()-> System.out.println("Oii");
        sau.executar();
        */

        /*Impressora impri = (texto) -> System.out.println(texto.toUpperCase());

        Impressora impri1 = (texto) -> System.out.println(texto.toLowerCase());

        impri.imprimir("Bom diaa");
        impri1.imprimir("Bom diaa");*/


        Calculo soma =(a,b) -> (a+b);
        Calculo multipl = (a,b) -> (a*b);
        Calculo maiorQ = (a,b) -> Math.max(a,b);

        System.out.println(soma.calcular(3,5));
        System.out.println(multipl.calcular(3,5));
        System.out.println( maiorQ.calcular(3,5));


    }
}
