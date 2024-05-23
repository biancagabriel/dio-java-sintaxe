package edu.bianca.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Bianca", 123456);
        agendaContatos.adicionarContato("Bianca", 44444);
        agendaContatos.adicionarContato("Bianca gabriel", 11111);
        agendaContatos.adicionarContato("Bianca dio", 789789);
        agendaContatos.adicionarContato("Maria silva", 11111);

        agendaContatos.exibirContato();


        System.out.println(agendaContatos.pesquisarPorNome("Bianca"));

        System.out.println("Contato Atualizado:" + agendaContatos.atualizarNumeroContato("maria silva", 55555));
   }
}
