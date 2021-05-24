import java.util.Scanner;

public class VestidosFemininos extends CadastroRoupas {
  char subclassificacao;
  String modelo;
  String comprimento;
  float medidaDoBusto;
  float medidaDaCintura;
  float medidaDoQuadril;

  public void cadastrarVestidoFeminino(Scanner input) {
    System.out.println("Qual a classificação do seu vestido?");
    System.out.println("Responda 'N' para noiva, 'M' para madrinha ou 'D' para debutante.");
    subclassificacao = input.next().charAt(0);

    input.nextLine();

    System.out.println("Modelo do vestido:");
    modelo = input.nextLine();

    System.out.println("Comprimento do vestido:");
    comprimento = input.nextLine();

    input.nextLine();

    System.out.println("Medida do busto em cm:");
    medidaDoBusto = input.nextFloat();

    System.out.println("Medida da cintura em cm:");
    medidaDaCintura = input.nextFloat();

    System.out.println("Medida do quadril em cm:");
    medidaDoQuadril = input.nextFloat();

    input.nextLine();
  }
}
