package javaLocalDate;

import java.time.LocalDate;

/*
* Exemplo de como manipular LocalDate
* */

public class Exemplo011 {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        LocalDate ontem = hoje.minusDays(1); // menos um dia

        System.out.println(hoje); // 2021-08-31

        System.out.println(ontem); // 2021-08-30
    }
}
