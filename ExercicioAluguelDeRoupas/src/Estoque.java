import java.util.Scanner;

public class Estoque {
  String cor;
  int quantidade;

  CadastroRoupas roupa = new CadastroRoupas();

  public void atualizarEstoque(Scanner input) {
    System.out.println("Cor da roupa:");
    cor = input.nextLine();

    input.nextLine();

    System.out.println("Quantidade disponível no estoque:");
    quantidade = input.nextInt();

    input.nextLine();
  }
}