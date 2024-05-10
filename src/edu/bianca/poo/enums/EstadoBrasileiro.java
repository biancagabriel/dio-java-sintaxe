package edu.bianca.poo.enums;

public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piauí"),
    MARANHAO ("MA","Maranhão"),
    CEARA("CE", "Ceará");

    private String nome;
    private String sigla;

    EstadoBrasileiro(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
