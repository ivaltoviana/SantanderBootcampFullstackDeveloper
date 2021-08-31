package javaLocalDate;

import java.time.LocalTime;

/*
* Exemplo de como manipular LocalTime
* */

public class Exemplo013 {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        System.out.println(agora); // 16:54:53.279406700

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora); // 17:54:53.279406700

    }
}
