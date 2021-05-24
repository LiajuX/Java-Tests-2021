import java.util.Scanner;

public class TesteProjeto {

  public static void main(String[] args) {

    Pizza pedido = new Pizza();

    Scanner input = new Scanner(System.in);

    System.out.println("Cadastrando cliente...");
    pedido.cliente.cadastrarCliente(input);

    System.out.println("\nCadastrando pizza...");
    pedido.pedirPizza(input);

    System.out.println("\nCadastrando motoboy...");
    pedido.motoboy.cadastrarMotoboy(input);

    System.out.println("\nDetalhes do pedido");
    System.out.println("Dados do cliente: ");
    System.out.println("Número de identificação: " + pedido.cliente.id);
    System.out.println("Nome: " + pedido.cliente.nome);
    System.out.println("Telefone: " + pedido.cliente.telefone);
    System.out.println("Endereço: " + pedido.cliente.endereco);

    System.out.println("\nDados da pizza pedida: ");
    System.out.println("Número de identificação: " + pedido.id);
    System.out.println("Nome: " + pedido.nome);
    System.out.println("Tamanho: " + pedido.tamanho);
    System.out.println("Ingredientes: " + pedido.ingredientes);

    System.out.println("\nDados do motoboy que entregará o pedido: ");
    System.out.println("Número de identificação: " + pedido.motoboy.id);
    System.out.println("Nome: " + pedido.motoboy.nome);
    System.out.println("Telefone: " + pedido.motoboy.telefone);
    System.out.println("Endereço: " + pedido.motoboy.endereco);
  }
}