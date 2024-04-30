package edu.bianca.anatomiaClasses;

import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        //adicionei o scanner no código
        Scanner entrada = new Scanner(System.in);
        int mediaFinal;

        System.out.println("digite a nota");
        mediaFinal = entrada.nextInt();

        if (mediaFinal < 6)
            System.out.println("REPROVADO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else {
            System.out.println("APROVADO");
        }
    }
}
