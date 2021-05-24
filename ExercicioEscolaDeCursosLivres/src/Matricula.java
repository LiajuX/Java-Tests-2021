import java.util.Scanner;
import java.util.Random;

public class Matricula {

  public static void main(String[] args) {
    CadastroAlunos aluno = new CadastroAlunos();

    CadastroCursos curso = new CadastroCursos();

    Scanner input = new Scanner(System.in);

    Random random = new Random();

    System.out.println("Cadastrando aluno...");
    aluno.setID(random.nextInt(9999) + 1111);

    System.out.println("Nome do aluno:");
    aluno.setNome(input.nextLine());

    System.out.println("CPF do aluno:");
    aluno.setCPF(input.nextLine());

    System.out.println("Endereço do aluno:");
    aluno.setEndereco(input.nextLine());

    System.out.println("Telefone do aluno:");
    aluno.setTelefone(input.nextLine());

    while (true) {
      System.out.println("\nCadastrando curso...");
      curso.setID(random.nextInt(999) + 111);

      input.nextLine();

      System.out.println("Nome do curso:");
      curso.setNome(input.nextLine());

      System.out.println("Descrição do curso:");
      curso.setDescricao(input.nextLine());

      System.out.println("Quantidade de vagas disponíveis:");
      curso.setQtdDeVagasDisponiveis(input.nextInt());

      input.nextLine();

      System.out.println("Período letivo:");
      curso.setPeriodoLetivo(input.nextLine());

      System.out.println("Data de ínicio das aulas:");
      curso.setDataDeInicio(input.nextLine());

      System.out.println("Data de fim das aulas:");
      curso.setDataDeFim(input.nextLine());

      if (curso.getQtdDeVagasDisponiveis() > 0) {
        System.out.println("\nBem-vindo a nossa escola! Aqui estão suas informações de matrícula:");
        System.out.println("Dados do aluno:");
        System.out.println("ID: " + aluno.getID());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("CPF: " + aluno.getCPF());
        System.out.println("Endereço: " + aluno.getEndereco());
        System.out.println("Telefone: " + aluno.getTelefone());

        System.out.println("\nDados do curso escolhido:");
        System.out.println("ID: " + curso.getID());
        System.out.println("Nome: " + curso.getNome());
        System.out.println("Descrição: " + curso.getDescricao());
        System.out.println("Número de vagas disponíveis: " + curso.getQtdDeVagasDisponiveis());
        System.out.println("Período letivo: " + curso.getPeriodoLetivo());
        System.out.println("Ínicio das aulas: " + curso.getDataDeInicio());
        System.out.println("Fim da aulas: " + curso.getDataDeFim());

        break;
      } else {
        System.out.println("Sentimos muito, o curso selecionado não possui vagas disponíveis.");
            System.out.println("Deseja escolher outro curso? Responda 'S' para sim ou 'N' para não.");
        if (input.next().charAt(0) != 'S') {
          break;
        }
      }
    }
  }
}