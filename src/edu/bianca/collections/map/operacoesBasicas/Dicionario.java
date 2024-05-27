package edu.bianca.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }else {
            System.out.println("sem palavras para remover");
        }
    }
    public void exibirPalavras(){
        if(!dicionarioMap.isEmpty()){
            System.out.println(dicionarioMap);
        }else {
            System.out.println("sem palavras para exibir");
        }
    }
    public String pesquisarPorPalavra(String palavra){
        String pesquisaPorPalavra = null;
        if(!dicionarioMap.isEmpty()){
            pesquisaPorPalavra = dicionarioMap.get(palavra);
        }
        return pesquisaPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("palavra 1", "significado 1");
        dicionario.adicionarPalavra("palavra 2", "significado 2");
        dicionario.adicionarPalavra("palavra 3", "significado 3");
        dicionario.adicionarPalavra("palavra 4", "significado 4");

        dicionario.exibirPalavras();

        System.out.println("a palavra é: " + dicionario.pesquisarPorPalavra("palavra 1"));
        dicionario.removerPalavra("palavra 2");
        dicionario.exibirPalavras();

    }

}
