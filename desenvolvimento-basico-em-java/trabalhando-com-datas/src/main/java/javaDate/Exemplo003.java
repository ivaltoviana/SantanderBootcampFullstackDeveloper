package javaDate;

import java.util.Date;

/*
* Exemplo de utilização dos métodos after e before
* */

public class Exemplo003 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        // Comparando se a dataNoPassado é posterior a dataNoFuturo
        boolean isAfter = dataNoPassado.after(dataNoFuturo);

        /*
        System.out.println(dataNoPassado); // Tue Dec 12 21:26:47 GMT-03:00 2017
        System.out.println(dataNoFuturo); // Fri Feb 12 07:13:27 GMT-03:00 2021
        */

        System.out.println(isAfter); // false

        // Comparando se a dataNoPassado é anterior a dataNoFuturo
        boolean isBefore = dataNoPassado.before(dataNoFuturo);

        System.out.println(isBefore); // true

    }

}
