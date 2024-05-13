package edu.bianca.poo.pilaresPOO.exInterface.equipamentos.multifuncional;

import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.copiadora.Copiadora;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.digitalizadora.Digitalizadora;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("copiando via equipamento multifuncional");
    }


    public void digitalizar() {
        System.out.println("digitalizando via equipamento multifuncional");
    }


    public void imprimir() {
        System.out.println("imprimindo via equipamento multifuncional");
    }
}
