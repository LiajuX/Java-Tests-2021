import java.util.Scanner;

public class CadastrarEquinos {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Quantos equinos você gostaria de cadastrar?");
    int quantitade = input.nextInt();

    Equino[] equinos = new Equino[quantitade];

    input.nextLine();

    for (int i = 0; i < equinos.length; i++) {
      Equino equino = new Equino();

      System.out.println("\nInforme o nome do " + (i + 1) + "º equino:");
      equino.setNome(input.nextLine());

      System.out.println("Informe a raça deste equino:");
      equino.setRaca(input.nextLine());

      equinos[i] = equino;
    }

    int i = 0;

    System.out.println("\nEquinos cadastrados no haras:");

    for (Equino equino : equinos) {
      if (i < equinos.length) {
        i++;
      }

      System.out.println(i + "º equino: " + equino.getNome() + " " + equino.getRaca());
    }
  }
}
