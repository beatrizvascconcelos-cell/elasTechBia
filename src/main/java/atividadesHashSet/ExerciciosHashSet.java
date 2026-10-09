package atividadesHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ExerciciosHashSet {
    static void main() {

        /*Questão 1:

        HashSet<String> nomes = new HashSet<>();
        nomes.add("Pedro");
        nomes.add("Maria");
        nomes.add("Jose");
        nomes.add("Pedro");

        System.out.printf( "Os elementos são: %s e o tamanho é : %d", nomes , nomes.size());
        // obs: O nome repetido so considera 1
        */

        /* Questão 2:

       HashSet<String> cores = new HashSet<>();
       HashSet<String> maisCores = new HashSet<>();
       maisCores.add("azul");
       maisCores.add("verde");
       maisCores.add("amarelo");

       cores.addAll(maisCores); // adicionar as informações de mais cores em cores.

     if (cores.contains("verde")) {
        System.out.println("Verde já está no conjunto.");
       } else {
      System.out.println("Verde não está no conjunto.");
        }
      */

    /* Questão 3:

    ArrayList<String> lista = new ArrayList <String>(List.of("Ana", "Diana", "Carlos", "Diana"));
    HashSet <String> conjunto = new HashSet <>(lista);

        System.out.println(lista); // ArrayList com o nome repetido
        System.out.println(conjunto); // HashSet sem repetição , obs: Não preserva a ordem
        */

        /* Questão 4:

        HashSet<String> cpf = new HashSet<>();
        cpf.add("122.665.998-28");
        cpf.add("122.665.888-28");
        cpf.add("122.665.778-28");

        System.out.println(cpf);
        cpf.remove("122.665.998-28");
        System.out.printf("%s %d" , cpf, cpf.size()); // Imprime o conjunto atualizado com o tamanho
        */

/* Questão 5:

HashSet <String> frutas = new HashSet <>(List.of("manga", "banana", "uva"));

ArrayList<String> listaFrutas = new ArrayList<>(frutas); // de hash para arraylist para que  for percorra

for (int i = 0; i < listaFrutas.size(); i++) {
    System.out.println(i + " " + listaFrutas.get(i));

}
*/
/* Questão 6:
HashSet<String> hasvazio = new HashSet<>();
        System.out.println(hasvazio.isEmpty());

        hasvazio.add("a");
        System.out.println(hasvazio.isEmpty());
*/



    }
}
