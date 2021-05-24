import java.util.Scanner;

public class CadastroMotoboys {
  int id;
  String nome;
  String telefone;
  String endereco;

  public void cadastrarMotoboy(Scanner input) {
    System.out.println("Número de identificação do motoboy: ");
    id = input.nextInt();

    input.nextLine();

    System.out.println("Nome do motoboy: ");
    nome = input.nextLine();

    System.out.println("Telefone do motoboy: ");
    telefone = input.nextLine();

    System.out.println("Endereço do motoboy: ");
    endereco = input.nextLine();
  }
}
