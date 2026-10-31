package atividadeHeranca;

public class Professora extends Pessoa{

    String disciplina; // atributo

    public void lancarNotas(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s \n",nome, nota, aluna);
    }

    @Override
    public void apresentar(){
        System.out.printf("Oi, eu sou %s e ensino %s \n", nome, disciplina);


    }
}
