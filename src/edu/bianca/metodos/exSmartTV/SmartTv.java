package edu.bianca.metodos.exSmartTV;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar (){
        ligada = true;
    }
    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("aumentando volume para: ");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("diminuindo volume para: ");
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
