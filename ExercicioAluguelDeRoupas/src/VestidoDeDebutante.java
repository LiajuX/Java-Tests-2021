import java.util.Scanner;

public class VestidoDeDebutante extends VestidosFemininos {
  String tipoDeUso;

  public void cadastrarVestidoDeDebutante(Scanner input) {
    System.out.println("Tipo de uso:");
    tipoDeUso = input.nextLine();
  }
}
