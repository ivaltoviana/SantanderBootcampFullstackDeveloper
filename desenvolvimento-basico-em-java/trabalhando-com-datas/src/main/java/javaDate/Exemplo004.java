package javaDate;

import java.util.Date;

public class Exemplo004 {

    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        Date mesmaDataNoFuturo = new Date(1613124807691L);

        /*
        System.out.println(dataNoPassado); // Tue Dec 12 21:26:47 GMT-03:00 2017
        System.out.println(dataNoFuturo); // Fri Feb 12 07:13:27 GMT-03:00 2021
        System.out.println(mesmaDataNoFuturo); // Fri Feb 12 07:13:27 GMT-03:00 2021
        */

        // Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); // true

        // Comparando uma data com a outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); // comparando o passado com o futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); // comparamdo o futuro com o passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); // datas equivalentes

        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0

    }

}
