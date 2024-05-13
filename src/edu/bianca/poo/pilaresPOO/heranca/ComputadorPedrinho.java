package edu.bianca.poo.pilaresPOO.heranca;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        System.out.println("msn");
        msn.enviarMensagem();
        msn.receberMensagem();


        FacebookMessenger fbm = new FacebookMessenger();
        System.out.println("facebook");
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        System.out.println("telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
