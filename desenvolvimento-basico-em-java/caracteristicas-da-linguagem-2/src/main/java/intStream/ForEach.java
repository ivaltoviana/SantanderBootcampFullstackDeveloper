package intStream;

import java.util.stream.IntStream;

public class ForEach {

    public static void main(String[] args) {

        /*
        * Exercício com IntStream
        * Stream API é um recurso implementado no Java 8
        * tem o objetivo de facilitar a manipulação de conjuntos de elementos
        * */

        // of - retorna um fluxo ordenado sequencial cujos elementos são os valores especificados.
        // Percorre o array passado e imprime ele na tela
        IntStream.of(1, 2, 3, 4, 5).forEach(n -> {
            System.out.println(n);
        });

        System.out.println("\n");

        // range - retorna um IntStream ordenado sequencialmente
        // Passando o range dos números de 0 - 3 e os imprime na tela
        IntStream.range(0, 3).forEach(n -> {
            System.out.println("Número = " + n);
        });

    }
}
