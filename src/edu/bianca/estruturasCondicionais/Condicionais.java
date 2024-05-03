package edu.bianca.estruturasCondicionais;

public class Condicionais {
    public static void main(String[] args) {
        //condicional simples

        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;

        System.out.println(saldo);

        //condicional composta
//        int nota = 6;
//
//        if(nota >= 7)
//            System.out.println("Aprovado");
//
//        else
//            System.out.println("Reprovado");

        //condicional encadeada
//        int nota = 7 ;
//
//        if (nota >= 7)
//            System.out.println("Aprovado");
//        else if (nota >= 5 && nota < 7)
//            System.out.println("Recuperação");
//        else
//            System.out.println("Reprovado");

        //condição ternária

        int nota = 4;
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}

