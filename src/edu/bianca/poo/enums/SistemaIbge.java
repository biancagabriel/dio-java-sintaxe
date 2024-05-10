package edu.bianca.poo.enums;

public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getNomeMaiusculo() + " - " +  e.getSigla());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
    }
}
