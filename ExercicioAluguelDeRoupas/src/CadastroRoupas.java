import java.util.Scanner;
import java.util.Random;

public class CadastroRoupas {
  Random random = new Random();

  int ID = random.nextInt(999) + 111;
  char classificacao;
  int alugueisRealizados = 0;

  public void cadastrarRoupa(Scanner input) {
    System.out.println("Gostaria de alugar que tipo de roupa?");
    System.out.println("Responda 'T' para traje masculino e 'V' para vestido feminino.");
    classificacao = input.next().charAt(0);

    input.nextLine();

    alugueisRealizados++;
  }
}
