package edu.bianca.poo.pilaresPOO.polimorfismo;

public class Computador {
    public static void main(String[] args) {
        ServicoMensagem smi = null;

		/*
		    NÃO SE SABE QUAL APP
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
        String appEscolhido="tlg";

        if(appEscolhido.equals("msn"))
            smi = new Msn();
        else if(appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
