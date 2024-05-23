package edu.bianca.collections.set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome,codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem: " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");

        conjuntoConvidado.adicionarConvidado("convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("convidado 2", 1235);
        conjuntoConvidado.adicionarConvidado("convidado 3", 1235);
        conjuntoConvidado.adicionarConvidado("convidado 4", 1236);

        conjuntoConvidado.exibirConvidados();

        System.out.println("Existem: " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem: " + conjuntoConvidado.contarConvidados() + " dentro de set convidados");
        conjuntoConvidado.exibirConvidados();



    }
}
