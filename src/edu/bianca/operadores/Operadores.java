package edu.bianca.operadores;

public class Operadores {
    public static void main(String[] args) {
        //operadores aritméticos
        /*String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);*/

        //operadores unários
//        int numero =5;
//        numero = -numero; //negando o valor
//
//        System.out.println(- numero); //não afetou a variavel
//        System.out.println(numero);
//        numero = + numero; //não converte pq é operador aritimetico
//        numero = numero * -1; //converte para número positivo
//        System.out.println(numero);

        //incremento e decremento
        /*int numero = 5;
        //numero = numero++;
        numero++;
        System.out.println(numero);
        //ordem de precedencia conta aqui
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);*/

        //ternário
//        int a, b;
//        a = 6;
//        b = 6;
//        String resultado = a == b ? "true" : "false";
//        System.out.println(resultado);

        //relacionais

//        String nome1 = "Bianca";
//        String nome2 = new String("Bianca") ; //da false pq são dois objetos na memória
//
//        System.out.println(nome1 == nome2);
//        System.out.println(nome1.equals(nome2)); //forma recomendada para objetos
//
//        int num1 = 1;
//        int num2 = 2;
//
//        boolean simNao = num1==num2;
//        System.out.println("número 1 é igual ao número 2: " +simNao);
//
//        simNao = num1 != num2;
//        System.out.println("número 1 é diferente ao número 2: " +simNao);
//
//        simNao = num1 > num2;
//        System.out.println("número 1 é maior ao número 2: " +simNao);
//
//        if(num1 == num2){
//            System.out.println("a condição é verdadeira");
//        }else {
//            System.out.println("a condição é falsa");
//        }

         //Lógicos
        boolean condicao1= true;
        boolean condicao2 = true;

        if(condicao1 &&  (7 >4)){
            System.out.println("as duas são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }
        System.out.println("fim");


    }
}
