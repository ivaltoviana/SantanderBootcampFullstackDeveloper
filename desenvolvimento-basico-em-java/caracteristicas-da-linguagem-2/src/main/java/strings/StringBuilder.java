package strings;

public class StringBuilder {

  public static void main(String[] args) {

    var nome = "Ivalto";

    final java.lang.StringBuilder builder = new java.lang.StringBuilder(nome);
    // "Costa" é adiconado à variável nome
    System.out.println(builder.append("Costa")); // IvaltoCosta

    // cria a string de tras para fente
    final java.lang.StringBuilder reverse = builder.reverse();

    System.out.println(reverse); // atsoCotlavI

    // inserindo caracteres em posições especificas da string
    final java.lang.StringBuilder insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert); // #atsoCotlavI#

  }
}