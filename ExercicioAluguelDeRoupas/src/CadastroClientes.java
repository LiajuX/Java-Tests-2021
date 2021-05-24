import java.util.Scanner;
import java.util.Random;

public class CadastroClientes {
  Random random = new Random();

  int ID = random.nextInt(9999) + 1111;
  String nome;
  String CPF;
  String endereco;
  String telefone;

  public void cadastrarCliente(Scanner input) {
    System.out.println("Nome do cliente:");
    nome = input.nextLine();

    System.out.println("CPF do cliente:");
    CPF = input.nextLine();

    System.out.println("Endereço do cliente:");
    endereco = input.nextLine();

    System.out.println("Telefone do cliente:");
    telefone = input.nextLine();
  }
}
