package atividadeHeranca;

public class Main1 {
    static void main() {
        Diretor chefaMaster = new Diretor();

        chefaMaster.nome = "Luiza";
        chefaMaster.baterPonto();
        chefaMaster.definirMetas();
        chefaMaster.aprovarFerias();

    }
}
