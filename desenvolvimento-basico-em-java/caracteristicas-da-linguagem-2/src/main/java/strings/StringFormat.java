package strings;

public class StringFormat {

  public static void main(String[] args) {

    var nome = "Ivalto";
    var sobreNome = "Viana";
    final var nomeCompleto = nome + " " + sobreNome;

    System.out.println(nome);
    System.out.println("Nome do cliente: " + nome);
    System.out.println("Nome completo do cliente: " + nomeCompleto);
    final var mensagem = String.format("O cliente %s possui sobrenome %s ", nome, sobreNome);
    System.out.println(mensagem);

    System.out.println(String.format("Numero %.2f ", 1.2375d)); // 1,24 (arredondado)
  }

}