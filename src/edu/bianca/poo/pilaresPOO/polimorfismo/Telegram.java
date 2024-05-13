package edu.bianca.poo.pilaresPOO.polimorfismo;

public class Telegram extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo telegram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo telegram");
    }

    @Override
    public void salvarHistoricoMensagem() {

    }
}
