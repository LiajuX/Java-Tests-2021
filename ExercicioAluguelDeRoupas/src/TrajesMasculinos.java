import java.util.Scanner;

public class TrajesMasculinos extends CadastroRoupas {
  String paraQuem;
  String tipoDeTraje;
  float comprimentoDaManga;
  float medidaDaCintura;
  float comprimentoDaCalca;

  public void cadastrarTrajeMasculino(Scanner input) {
    System.out.println("Para quem é o traje:");
    paraQuem = input.nextLine();

    System.out.println("Tipo de traje:");
    tipoDeTraje = input.nextLine();

    System.out.println("Comprimento da manga em cm:");
    comprimentoDaManga = input.nextFloat();

    System.out.println("Medida da cintura em cm:");
    medidaDaCintura = input.nextFloat();

    System.out.println("Comprimento da calça em cm:");
    comprimentoDaCalca = input.nextFloat();

    input.nextLine();
  }
}