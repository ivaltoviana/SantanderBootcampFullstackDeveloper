package operadores;

public class Igualdade {

    public static void main(String[] args) {

        final var numero = 11;

        // operador de igualdade
        if (numero == 10) {
            System.out.println("O número é 10");
        } else {
            System.out.println("O número não é 10");
        }

        // operador de diferença
        if (numero != 10) {
            System.out.println("O número não é 10");
        } else {
            System.out.println("O número é 10");
        }

        final var letra = "B";

        // A é igual a B?
        if ("A".equals(letra)) {
            System.out.println("É a letra A");
        }

        // se letra não é igual a A
        if (!letra.equals("A")){
            System.out.println("Não é a letra A");
        }

    }

}
