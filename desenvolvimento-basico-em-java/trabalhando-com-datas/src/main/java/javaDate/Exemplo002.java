package javaDate;

import java.util.Date;

/*
* Exemplo de utilização do construtor com passagem de parâmetro em milisegundos
* */

public class Exemplo002 {

    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
    }

}
