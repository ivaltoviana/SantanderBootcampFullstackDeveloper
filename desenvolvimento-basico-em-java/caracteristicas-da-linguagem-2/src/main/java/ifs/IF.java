package ifs;

public class IF {
    public static void main(String[] args) {

        final var condicao = false;

        if (condicao){
            // se condicao for true
            System.out.println("A condição é verdadeira");
        } else {
            // se condicao for false
            System.out.println("A condição é falsa");
        }

        // se o if for de uma única linha posso usar dessa forma, sem o uso de chaves
        if (condicao) {
            System.out.println("Uma única linha...");
        }

        // if ternário: if e else em uma única condição
        // ? -> true ou false
        // : -> else
        final var ternario = condicao ? "é verdadeira" : "é falsa";
        System.out.println(ternario);
    }
}
