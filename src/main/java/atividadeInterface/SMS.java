package atividadeInterface;

public class SMS implements Notificacao{
    @Override
    public void enviar() {
        System.out.println("SMS enviado:  Sua compra foi aprovada!");
    }
}
