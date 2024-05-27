package edu.bianca.collections.map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("bianca", 11111);
        agendaContatos.adicionarContato("mãe", 2222);
        agendaContatos.adicionarContato("leia", 3333);
        agendaContatos.adicionarContato("bianca", 4444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("leia");
        agendaContatos.exibirContatos();
        System.out.println("o número é: " + agendaContatos.pesquisarPorNome("bianca"));

    }
}
