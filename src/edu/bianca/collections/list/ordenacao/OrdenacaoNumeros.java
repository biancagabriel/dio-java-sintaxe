package edu.bianca.collections.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Numero> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(new Numero(numero));
    }
    public List<Numero> ordenarAscendente(){
        List<Numero> numeroAscendente = new ArrayList<>(numeroList);
        Collections.sort(numeroAscendente);
        return numeroAscendente;
    }
    public List<Numero>ordenarDescendente(){
        List<Numero> numeroAscendente = new ArrayList<>(numeroList);
        numeroAscendente.sort(Collections.reverseOrder());
        return numeroAscendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
        ordenacaoNumeros.ordenarDescendente();

    }
}
