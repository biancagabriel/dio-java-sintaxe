package edu.bianca.poo.pilaresPOO.polimorfismo;

public class Facebook extends ServicoMensagem{
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("enviando mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("enviando mensagem pelo facebook");
    }

    @Override
    public void salvarHistoricoMensagem() {

    }
}
