package atividadeHeranca;

public class Main2 {
    static void main() {
        Gerente g1 = new Gerente();
        g1.nome = "Orácio";
        g1.baterPonto();
        g1.aprovarFerias();
        g1.exportar();
        g1.notificar();
    }
}


