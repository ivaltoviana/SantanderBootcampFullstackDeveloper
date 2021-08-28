package javaCalendar;

import java.util.Calendar;

/*
* Algumas conversões de datas
* */

public class Exemplo007 {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        // sáb ago 28 16:41:07 GMT-03:00 2021

        System.out.printf("%tF\n", agora);
        // 2021-08-28

        System.out.printf("%tD\n", agora);
        // 08/28/21

        System.out.printf("%tr\n", agora);
        // 04:41:07 PM

        System.out.printf("%tT\n", agora);
        // 16:41:07
    }
}
