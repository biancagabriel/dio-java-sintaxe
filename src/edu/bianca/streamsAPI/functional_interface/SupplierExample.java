package edu.bianca.streamsAPI.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Representa uma operação que não aceita nenhum argumento e retorna um resultato do tipo T.
é comumente usada para criar ou forncer novos objetos de um determinado tipo
* */
public class SupplierExample {
    public static void main(String[] args) {
        //usar com lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem vindo";

        //para obter uma lista com 5 saudações
        List<String> listaSaudacao = Stream.generate(saudacao)
                .limit(2)
                .toList();

        //imprimir saudacoes
        listaSaudacao.forEach(System.out::println);
    }
}
