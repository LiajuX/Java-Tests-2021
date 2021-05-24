import java.util.Scanner;

public class VestidoDeMadrinha extends VestidosFemininos {
  String horarioDaFesta;

  public void cadastrarVestidoDeMadrinha(Scanner input) {
    System.out.println("Horário da festa:");
    horarioDaFesta = input.nextLine();
  }
}