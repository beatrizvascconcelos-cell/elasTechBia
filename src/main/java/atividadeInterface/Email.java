package atividadeInterface;

public class Email implements Notificacao{
    @Override
    public void enviar(){
        System.out.println("Email enviado:  Sua compra foi aprovada!");
    }
}
