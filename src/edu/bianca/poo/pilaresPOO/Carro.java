package edu.bianca.poo.pilaresPOO;

public class Carro extends Veiculo {
    //extends = aspecto de herança

    public void ligar(){
        //encapsulamento
        conferirCambio();
        conferirCombustivel();
        System.out.println("carro ligado");
    }
    private void conferirCombustivel(){
        System.out.println("combustivel conferido");
    }
    private void conferirCambio(){
        System.out.println("conferindo cambio em P");
    }
}
