package edu.bianca.collections.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavraSet.add(new Palavra(palavra));
    }
    public void removerPalavra(String palavra){
        Palavra palavraParaRemover = null;
        for (Palavra p : palavraSet){
            if (p.getPalavra() == palavra){
                palavraParaRemover = p;
                break;
            }else {
                System.out.println("não tem palavras para remover");
            }
        }
        palavraSet.remove(palavraParaRemover);
    }
    public boolean verificarPalavra(String palavra){
        return palavraSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("abacaxi");
        conjuntoPalavrasUnicas.adicionarPalavra("uva");
        conjuntoPalavrasUnicas.adicionarPalavra("uva");
        conjuntoPalavrasUnicas.adicionarPalavra("maçã");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        //conjuntoPalavrasUnicas.verificarPalavra("uva");
        conjuntoPalavrasUnicas.removerPalavra("uva");

    }


}
