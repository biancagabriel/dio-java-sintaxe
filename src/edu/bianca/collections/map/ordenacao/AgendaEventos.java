package edu.bianca.collections.map.ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate,Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }
    public void adicionarEventos(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data,evento);
    }
    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }
    public void  obterProximoEvento(){
//       Set<LocalDate> dateSet = eventoMap.keySet(); puxa as keys
//       Collection<Evento> values = eventoMap.values(); puxa os values
//       entrySet: retorna um set de valor único com uma key/value com valor correspondente
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventoMap); //eventos na data crescente
        for(Map.Entry<LocalDate,Evento> entry : eventoMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("o próximo evento:  " + proximoEvento + "acontecerá na data " + proximaData);
            break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        // Adiciona eventos à agenda
        agendaEventos.adicionarEventos(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEventos(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEventos(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEventos(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEventos(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");

        // Exibe a agenda completa de eventos
        agendaEventos.exibirAgenda();

        // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();

    }
}
