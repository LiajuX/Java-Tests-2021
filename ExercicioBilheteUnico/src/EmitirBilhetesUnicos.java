import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmitirBilhetesUnicos {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    ArrayList<BilheteUnico> bilhetesUnicos = new ArrayList<>();

    boolean continuar = true;
    int i = 0;

    do {
      i++;
      BilheteUnico bilheteUnico = new BilheteUnico();

      Random random = new Random();

      System.out.println("\nCadastrando " + i + "º Bilhete Único...");
      System.out.println("Insira o nome completo do usuário do transporte:");
      bilheteUnico.setNomeCompleto(input.nextLine());

      // Gerando um número aleatório de 9 dígitos
      bilheteUnico.setNumero(String.valueOf(random.nextInt(999999999) + 111111111));

      bilhetesUnicos.add(bilheteUnico);

      System.out.println("\nDeseja cadastrar outro bilhete? Responda com sim ou não.");
      if (!input.nextLine().equalsIgnoreCase("sim")) {
        continuar = false;
      }
    } while (continuar);

    System.out.println("\nBilhetes emitidos:");

    for (i = 0; i < bilhetesUnicos.size(); i++) {
      BilheteUnico bilheteUnico = bilhetesUnicos.get(i);

      System.out.println("\nDados do " + (i + 1) + "º Bilhete Único emitido:");
      System.out.println("Nome completo: " + bilheteUnico.getNomeCompleto());
      System.out.println("Número do cartão: " + bilheteUnico.getNumero());
    }
  }
}
