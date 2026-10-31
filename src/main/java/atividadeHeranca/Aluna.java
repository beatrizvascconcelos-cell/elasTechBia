package atividadeHeranca;

public class Aluna extends Pessoa{

String curso;
public void estudar(){
    System.out.println(nome + " está estudando " + curso);
}
@Override
public void apresentar(){
    System.out.printf("Oi, eu sou %s, e tenho %d anos \n", nome, idade);

}
}
