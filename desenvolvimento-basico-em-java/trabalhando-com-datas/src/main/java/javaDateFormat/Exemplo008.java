package javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

/*
* Exemplo de formatação de data com DateFormat
* */

public class Exemplo008 {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr); // 30/08/2021 15:43

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr); // 30 de agosto de 2021 15:43

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        System.out.println(dateToStr); // 30 de agosto de 2021 15:43:46 GMT-03:00

    }

}
