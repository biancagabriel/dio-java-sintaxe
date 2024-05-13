package edu.bianca.poo.pilaresPOO.polimorfismo;

public class Msn extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo msn");
    }

    @Override
    public void receberMensagem() {
        System.out.println("recebendo mensagem pelo msn");
    }

    @Override
    public void salvarHistoricoMensagem() {

    }
}
