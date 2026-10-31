package atividadeInterface;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        /*Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();
        */

        /*Veiculo automovel = new Carro();
        Veiculo bike = new Bicicleta();

        bike.mover();
        automovel.mover();
        */

        /*Instrumento i1 = new Violao();
        Instrumento i2 = new Piano();

        i1.tocar();
        i2.tocar();
        */

        /*ArrayList<Notificacao> lista = new ArrayList<>();
        Notificacao n1 = new Email();
        Notificacao n2 = new SMS();
        n1.enviar();
        n2.enviar();


        for (Notificacao n : lista) {
           n.enviar();
           */

        ArrayList<Animal> lista = new ArrayList<>();
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        lista.add(a1);
        lista.add(a2);

        for (Animal a : lista ) {
            a.emitirSom();
        }



        }
        }






