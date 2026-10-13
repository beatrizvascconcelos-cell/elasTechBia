package petshop;

public class Pet {
    String nome;
    String especie;
    double peso;
    String porte;

    String definirPorte() { // Método criado para calcular o porte do animal e so usar o método na classe Petshop
        if (peso < 10) {
            return "Pequeno";
        } else if (peso >= 10 && peso < 25) {
            return "Médio";

        } else {
            return   "Grande";
        }
    }
}






