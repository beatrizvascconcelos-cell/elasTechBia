package atividadeHeranca;

public class Main {
    static void main() {
       /* Aluna a1 = new Aluna();
        a1.nome = "Laura";
        a1.idade = 20;
        a1.curso = "ADS";

        a1.apresentar();
        a1.estudar();
        */

Aluna alun = new Aluna();
Professora prof = new Professora();

alun.nome = "Milena";
alun.idade = 28;
alun.curso = "ADS";

prof.nome = "Luisa";
prof.idade = 40;
prof.disciplina = "TI";

alun.estudar();
prof.lancarNotas(alun.nome, 8);

alun.apresentar();
prof.apresentar();



    }
}
