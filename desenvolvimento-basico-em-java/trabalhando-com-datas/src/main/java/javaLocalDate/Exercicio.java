package javaLocalDate;

import java.time.LocalDateTime;

/* Exercício
* Adicione 4 anos, 6 meses e 13 horas ao momento 15/05/20010 10:00:00
* */

public class Exercicio {
    public static void main(String[] args) {

        LocalDateTime minhaDataEHora = LocalDateTime.of(2010, 5, 15, 10,00,00);
        System.out.println(minhaDataEHora);

        minhaDataEHora = minhaDataEHora.plusYears(4);
        minhaDataEHora = minhaDataEHora.plusMonths(6);
        minhaDataEHora = minhaDataEHora.plusHours(13);
        System.out.println(minhaDataEHora);

    }
}
