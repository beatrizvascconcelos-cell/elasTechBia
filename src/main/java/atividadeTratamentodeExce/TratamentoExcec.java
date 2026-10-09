package atividadeTratamentodeExce;

public class TratamentoExcec {
    static void main() {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);

        } catch (ArithmeticException ae) { // Coloca o nome do erro e o apelido que é a inicial do erro em minusculo
            System.out.println("Não dá pra dividir por zero!");

        } finally {
            System.out.println("Isso sempre roda.");
        }

        System.out.println("O programa continua.");
    }


}
