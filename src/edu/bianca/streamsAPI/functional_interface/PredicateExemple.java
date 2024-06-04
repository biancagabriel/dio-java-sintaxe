package edu.bianca.streamsAPI.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 Representa uma função que aceita o argumento do tipo T e retorna um boolean, é usada para filtrar os elementos do stream
 com base em alguma condçião
 */

public class PredicateExemple {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "c", "go");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() >5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
