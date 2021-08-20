package operadores;

public class Logicos {

    public static void main(String[] args) {

        final var numero = 2;
        final var letra = "A";

        // Sort Circuit
        // se numero for menor que 5 e(&&) letra igual a "A"
        if (numero < 5 && letra.equals("A")) {
            System.out.println("Atendeu a condição");
        }

        // se numero for menor que 5 ou(||) letra igual a "A"
        if (numero < 5 || letra.equals("A")) {
            System.out.println("Atendeu a outra condição");
        }

        /*
            se o resultado de 10 - 5 for maior que 1
            e o resultado de 5 - 3 for maior que 1
         */
        if ((10 - 5) > 1 && (5 - 3) > 1) {
            System.out.println("Lógica maluca");
        }


        //Non Sort Circuit
        if (verifica(8) & verifica("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Não OK");
        }

    }

    private static boolean verifica(String letra) {
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero) {
        System.out.println("Verificando numero...");
        return numero > 10;
    }
}
