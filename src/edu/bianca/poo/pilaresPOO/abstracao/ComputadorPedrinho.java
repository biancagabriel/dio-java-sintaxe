package edu.bianca.poo.pilaresPOO.abstracao;

import edu.bianca.poo.pilaresPOO.heranca.FacebookMessenger;
import edu.bianca.poo.pilaresPOO.heranca.MSNMessenger;
import edu.bianca.poo.pilaresPOO.heranca.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        edu.bianca.poo.pilaresPOO.abstracao.MSNMessenger msn = new edu.bianca.poo.pilaresPOO.abstracao.MSNMessenger();
        System.out.println("msn");
        msn.enviarMensagem();
        msn.receberMensagem();


        edu.bianca.poo.pilaresPOO.abstracao.FacebookMessenger fbm = new edu.bianca.poo.pilaresPOO.abstracao.FacebookMessenger();
        System.out.println("facebook");
        fbm.enviarMensagem();
        fbm.receberMensagem();

        edu.bianca.poo.pilaresPOO.abstracao.Telegram tlg = new edu.bianca.poo.pilaresPOO.abstracao.Telegram();
        System.out.println("telegram");
        tlg.enviarMensagem();
        tlg.receberMensagem();
    }
}
