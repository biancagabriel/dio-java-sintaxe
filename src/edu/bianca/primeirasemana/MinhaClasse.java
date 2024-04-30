package edu.bianca.primeirasemana;

public class MinhaClasse {

    public static void main(String[] args) {
//        final String BR = "brasil"; //nunca pode ser mudada
//
//        //declaração de variavel
//        String nome = "Bianca";
//
//        //declaração método
//       // int somar(int numero1,int numero2)

        String primeiroNome = "Bianca";
        String segundoNome = "Gabriel";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
