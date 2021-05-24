import java.util.Scanner;

public class CadastroClientes {
  int id;
  String nome;
  String telefone;
  String endereco;

  public void cadastrarCliente(Scanner input) {
    System.out.println("Número de identificação do cliente: ");
    id = input.nextInt();

    input.nextLine();

    System.out.println("Nome do cliente: ");
    nome = input.nextLine();

    System.out.println("Telefone do cliente");
    telefone = input.nextLine();

    System.out.println("Endereço do cliente: ");
    endereco = input.nextLine();
  }
}