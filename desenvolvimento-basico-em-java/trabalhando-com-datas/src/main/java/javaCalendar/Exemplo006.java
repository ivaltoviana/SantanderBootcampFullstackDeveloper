package javaCalendar;

import java.util.Calendar;

/*
* Exemplo de utilização da classe Calendar
* */

public class Exemplo006 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());
        // A data corrente é: Sat Aug 28 16:15:26 GMT-03:00 2021

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atrás: Fri Aug 13 16:15:26 GMT-03:00 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Mon Dec 13 16:15:26 GMT-03:00 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Wed Dec 13 16:15:26 GMT-03:00 2023

        agora.add(Calendar.YEAR, +2); // 2021 + 4 = 2025
        System.out.println("4 anos depos: " + agora.getTime());
        // 4 anos depois: Mon Dec 13 16:15:26 GMT-03:00 2021

    }
}
