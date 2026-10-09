package atividadesArrayDeque;

import java.util.ArrayDeque;
import java.util.List;

public class ExerciciosArrayDeque {
    static void main() {


        /* Questão 1:

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.addLast("Joana");
        fila.addLast("Maria");
        fila.addLast("Pedro");
        System.out.printf("%s a fila tem %d pessoas", fila, fila.size());
        */
        /* Questão 2:

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.addLast("Joana");
        fila.addLast("Maria");
        fila.addLast("Pedro");
        ArrayDeque<String> fila2 = new ArrayDeque<>();
        fila2.addLast("mariana");
        fila2.addLast("pedrinho");

        fila.addAll(fila2); // Assim junta as duas filas
        System.out.printf("O próximo é: %s\n", fila.peek()); // o peek olha o próximo da fila diferente do poll que remove
        System.out.println(fila); // imprime a fila completa
        */

        /* Questão 3:

        ArrayDeque<String> fila = new ArrayDeque<>(List.of("Joana", "Maria", "Pedro", "mariana", "pedrinho"));
        System.out.printf("Foi atendida: %s\n", fila.poll()); //poll remove o primeiro
        System.out.printf("A fila atual é: %s" ,fila);
        */


        /* Questão 4:

        ArrayDeque<String> fila = new ArrayDeque<>(List.of("Joana", "Maria", "Pedro"));
        while(!fila.isEmpty()){
            String atendido = fila.poll();
            System.out.printf("Foi atendido: %s\n", atendido);
        }
        System.out.println("Fila vazia!");
        */

        /* Questão 5:

        ArrayDeque<String> fila = new ArrayDeque<>(List.of("Joana", "Maria", "Pedro"));

        if (fila.contains("Zoe")) {
            System.out.println("Zoe está na fila");

        } else if (fila.contains("Bia")) {
            System.out.println("Bia está na fila");

        }else {
            System.out.println("Nem Zoe nem Bia estão na fila.");
        }
        */
    }
}
