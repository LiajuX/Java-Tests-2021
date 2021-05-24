import java.util.Scanner;

public class Pizza {
  int id;
  String nome;
  String tamanho;
  String ingredientes;

  CadastroClientes cliente = new CadastroClientes();
  CadastroMotoboys motoboy = new CadastroMotoboys();

  public void pedirPizza(Scanner input) {
    System.out.println("Número de identificação da pizza: ");
    id = input.nextInt();

    input.nextLine();

    System.out.println("Nome da pizza: ");
    nome = input.nextLine();

    System.out.println("Tamanho da pizza: ");
    tamanho = input.nextLine();

    System.out.println("Ingredientes da pizza: ");
    ingredientes = input.nextLine();
  }
}
