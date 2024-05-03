package edu.bianca.estruturasCondicionais;

public class SwitchCase {
    public static void main(String[] args) {
        //com if
        String sigla = "M";

        if(sigla == "P")
            System.out.println("PEQUENO");
        else if(sigla == "M")
            System.out.println("MÉDIO");
        else if(sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");

        //com switch
        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }

        //outro exemplo
        /*sistema de plano telefônico onde:

        O sistema terá 03 planos: BASIC, MIDIA , TURBO;

        BASIC: 100 minutos de ligação;

        MÍDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;

        TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.*/

        String plano = "B"; // M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}

