package edu.bianca.collections.list.ordenacao;

import java.util.Comparator;

public class Numero implements Comparable<Numero>{
    private int numero;
    @Override
    public int compareTo(Numero n) {
        return Integer.compare(numero,n.getNumero());
    }

    public Numero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numero{" +
                "numero=" + numero +
                '}';
    }
}
class comparatorNumero implements Comparator<Numero>{

    @Override
    public int compare(Numero n1, Numero n2) {
        return Integer.compare(n1.getNumero(),n2.getNumero());
    }
}
