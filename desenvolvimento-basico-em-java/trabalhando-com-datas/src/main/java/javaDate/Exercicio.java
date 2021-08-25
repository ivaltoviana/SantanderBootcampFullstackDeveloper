package javaDate;

import java.util.Date;

/*
* - Descubra o timeInMillis do dia que você nasceu;
* - Converta em um objeto Date;
* - Verifique se ele é anterior ou posterior a 15 de maio de 2010.
*
* Site usado para descobrir o timeInMillis:
*   - https://currentmillis.com/
* */

public class Exercicio {
    public static void main(String[] args) {

        Date dataNascimento = new Date(876711600000L);
        Date dataComparacao = new Date(1273460400000L);

        System.out.println(dataNascimento); // Mon Oct 13 00:00:00 GMT-03:00 1997
        System.out.println(dataComparacao); // Mon May 10 00:00:00 GMT-03:00 2010

        if (dataNascimento.after(dataComparacao)) {
            System.out.println("É posterior!");
        } else {
            System.out.println("É anterior!");
        }

    }
}
