package edu.bianca.poo.pilaresPOO.exInterface.estabelecimento;

import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.copiadora.Copiadora;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.impressora.Laserjet;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.digitalizadora.Digitalizadora;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.impressora.Deskjet;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.impressora.Impressora;
import edu.bianca.poo.pilaresPOO.exInterface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();


    }
}
