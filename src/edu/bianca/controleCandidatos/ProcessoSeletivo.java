package edu.bianca.controleCandidatos;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;

        do{
            atendeu= atender();
            continuarTentando = !atendeu;
            if(continuarTentando) {
                tentativasRealizadas++;
            } else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        }while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("imprimindo a lista de candidatos informando o índice do elemento:");
        for(int indice =0; indice<candidatos.length; indice++){
            System.out.println("o candidato de número: " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("forma com ForEach");

        for(String candidato : candidatos){
            System.out.println("o candidato selecionado foi: " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("o candidato " + candidato + " solicitou esse valor de salario: R$" +salarioPretendido);

            if(salarioBase >= salarioPretendido){
                System.out.println("o candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++; //incremento
            }
            candidatoAtual++;
        }
    }
    static void analisarCandidato(double expextativaSalario){
        double salarioBase = 2000.0;
        if(salarioBase > expextativaSalario){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase == expextativaSalario) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
