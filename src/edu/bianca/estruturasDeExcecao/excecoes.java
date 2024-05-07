package edu.bianca.estruturasDeExcecao;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class excecoes {
    public static void main(String[] args) {
//        //criando o objeto scanner
//        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
//
//        try{
//            System.out.println("Digite seu nome");
//        String nome = scanner.next();
//
//        System.out.println("Digite seu sobrenome");
//        String sobrenome = scanner.next();
//
//        System.out.println("Digite sua idade");
//        int idade = scanner.nextInt();
//
//        System.out.println("Digite sua altura");
//        double altura = scanner.nextDouble();
//
//
//        //imprimindo os dados obtidos pelo usuario
//
//            System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase()); //deixando o nome em maiusculo
//            System.out.println("Tenho " + idade + " anos ");
//            System.out.println("Minha altura é " + altura + "cm ");
//        }catch (InputMismatchException e){
//            System.out.println("os campos idade e altura precisam ser numéricos");
//        }

        //exceções customizadas
        Number valor = Double.valueOf("a1.75");

        try {
            valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }



    }
}
