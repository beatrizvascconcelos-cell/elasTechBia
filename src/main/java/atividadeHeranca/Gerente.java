package atividadeHeranca;

public class Gerente extends Funcionario implements Notificavel, Exportavel{

    public void aprovarFerias(){
        System.out.println(nome + " Aprova ferias do comercial");

    }

    @Override
    public void notificar(){
        System.out.println(nome + " recebe notificação");
    }

    @Override
    public void exportar(){
        System.out.println(nome + " recebe exportação ");
    }
}
