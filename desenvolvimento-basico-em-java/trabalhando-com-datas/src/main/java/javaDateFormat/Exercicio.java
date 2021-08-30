package javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/* Exercício:
 *  - Converta a Data atual no formato DD/MM/YYYY HH:MM:SS:MMM
 * */

public class Exercicio {
    public static void main(String[] args) {

        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"+ " " + "HH:mm:ss:SSS");

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);

    }


}
