package operadores;

public class Relacionais {

    public static void main(String[] args) {

        final var numero = 6;

        // se numero for maior que 20
        if (numero > 20) {
            System.out.println("O número é maior que 20");
        } else if (numero >= 10){ // se numero for maior ou igual a 10
            System.out.println("O número é maior ou igual a 10");
        } else if (numero <= 5) { // se numero for menor ou igual a 10
            System.out.println("O número é menor ou igual a 10");
        } else { // se nenhuma das condições anteriores forem verdadeiras
            System.out.println("Nenhuma das anteriores");
        }

    }

}
