import java.util.Scanner;

public class VestidoDeNoiva extends VestidosFemininos {
  boolean cauda;
  boolean veu;

  public void cadastrarVestidoDeNoiva(Scanner input) {
    System.out.println("Deseja um vestido com cauda? Responda 'S' para sim ou 'N' para não.");
    cauda = input.next().charAt(0) == 'S';

    System.out.println("Deseja um vestido com véu? Responda 'S' para sim ou 'N' para não.");
    veu = input.next().charAt(0) == 'S';
    input.nextLine();
  }
}
