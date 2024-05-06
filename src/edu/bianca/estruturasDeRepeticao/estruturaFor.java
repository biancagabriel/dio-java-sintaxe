package edu.bianca.estruturasDeRepeticao;

public class estruturaFor {
    public static void main(String[] args) {
//        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
//            System.out.println(carneirinhos + " - Carneirinho(s)");
//        }
//
//        System.out.println("joãozinho dormiu");

        //só com o bloco condicional dentro do for
//        int carneirinhos = 1;
//        for( ; carneirinhos <=20; ) {
//            System.out.println(carneirinhos + " - Carneirinho(s)");
//            carneirinhos ++; //incremento fora do for
//        }

        //for em array
//        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
//
//        for (int x=0; x<alunos.length; x++) {
//            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
//        }

        //forEach
//        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
//
//        //Forma abreviada
//        for (String aluno : alunos) {
//            System.out.println(alunos);
//        }

        //break e continue
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);

        }
    }
}