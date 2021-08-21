package whiles;

public class While {

    public static void main(String[] args) {

        var x = 0;

        // While (enquanto) - testa a condição antes

        // Enquanto x for menor que 1
        while (x < 1) {
            System.out.println("Dentro do while...");
            x++;
        }

        /* LOOP
        var b = 2;

        while (b > 1) {
            System.out.println("Dentro do while...");
            b++;
        }
        */

        var y = 0;

        // do-while (faça-enquanto) - testa a condição depois
        do {
            System.out.println("Dentro do do/while");
        } while (y++ < 1);


    }

}
