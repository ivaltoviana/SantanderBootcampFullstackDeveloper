package strings;

public class Strings {

  public static void main(String[] args) {

    var nome = "Ivalto";
    var sobreNome = "Viana";
    final var nomeCompleto = nome + " " + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente: " + nome);
    System.out.println("Nome completo do cliente : " + nomeCompleto);

    var string = new String(" Minha  String ");


    // mostra o caracter que está na posição 5
    System.out.println("Char na posição: " + string.charAt(5)); // a

    // mostra o tamanho da string
    System.out.println("Quantidade = " + string.length()); // 15

    // Trim: tira os caracteres em branco (espaços) nas extremidades da string
    System.out.println("Sem Trim [" + string + "]"); //[ Minha String ]
    System.out.println("Com Trim [" + string.trim() + "]"); // [Minha String]

    // toLowerCase(): deixa tudo em minúsculo
    // toUpperCase(): deixa tudo em MAIÚSCULO
    System.out.println("Lower " + string.toLowerCase());
    System.out.println("Upper " + string.toUpperCase());

    // contains(): verifica se existe a letra "M" e "X" dentro da string
    System.out.println("Contém M? " + string.contains("M")); // true
    System.out.println("Contém X? " + string.contains("X")); // false

    // permite trocar carcteres da string
    System.out.println("Replace " + string.replace("n", "$")); // Mi$ha Stri$g

    // compara se a string "Equals? " é igual a " Minha String "
    System.out.println("Equals? " + string.equals(" Minha String ")); // false

    // compara ignorando o Case-Sensitive, se está maiúsculo ou minúsculo
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" minha sTrinG ")); // false

    // pega um valor começando na posição 1 e terminando na posição 6
    System.out.println("Substring(1,6) = " + string.substring(1, 6)); // Minha

    System.out.println("\n");

    // EXERCICIOS:
      System.out.println("A B C D E F G".toCharArray()); // A B C D E F G
      System.out.println("Aula de Java".split(" "));
      System.out.println("Aula".concat(" de Java"));
      System.out.println("Aula" + string.concat(" de Java"));
      System.out.println("1234 asda qw".replaceAll("[0-9]", "#"));

  }
}