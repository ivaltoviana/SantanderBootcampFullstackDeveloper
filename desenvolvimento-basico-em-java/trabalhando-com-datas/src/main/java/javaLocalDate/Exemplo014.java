package javaLocalDate;

import java.time.LocalDateTime;

/*
* Exemplo de como manipular LocalDateTime
* */

public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora); // 2021-08-31T17:08:41.193807100

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(12);
        System.out.println(futuro); // 2021-09-02T18:08:53.193807100

    }

}
