package operadores;

public class Incremento {

    public static void main(String[] args) {
        var numero = 1;
        // numero = numero + 1;

        /*
            ++numero (++ à esquerda) - primeiro vai fazer incrementar e depois avaliar a condição
            numero++ (++ à direita) - primeiro vai fazer a avaliação e depois o incremento
        */
        System.out.println(++numero);

        var variavel = 10;

        // decremento
        System.out.println(variavel--); // 10
        System.out.println(variavel); // 9

        System.out.println(variavel++); // 9
        System.out.println(variavel); // 10
    }

}
