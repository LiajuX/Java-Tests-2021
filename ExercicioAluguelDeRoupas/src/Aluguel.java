import java.util.Scanner;

public class Aluguel {

  public static void main(String[] args) {
    CadastroClientes cliente = new CadastroClientes();

    Estoque estoque = new Estoque();

    TrajesMasculinos trajeMasculino = new TrajesMasculinos();

    VestidosFemininos vestidoFeminino = new VestidosFemininos();

    VestidoDeNoiva vestidoDeNoiva = new VestidoDeNoiva();

    VestidoDeMadrinha vestidoDeMadrinha = new VestidoDeMadrinha();

    VestidoDeDebutante vestidoDeDebutante = new VestidoDeDebutante();

    Scanner input = new Scanner(System.in);

    System.out.println("Cadastrando cliente...");
    cliente.cadastrarCliente(input);

    System.out.println("\nCadastrando roupa...");
    estoque.roupa.cadastrarRoupa(input);

    if (estoque.roupa.classificacao == 'T') {
      trajeMasculino.cadastrarTrajeMasculino(input);

    } else if (estoque.roupa.classificacao == 'V') {
      vestidoFeminino.cadastrarVestidoFeminino(input);

      if (vestidoFeminino.subclassificacao == 'N')
        vestidoDeNoiva.cadastrarVestidoDeNoiva(input);
      else if (vestidoFeminino.subclassificacao == 'M')
        vestidoDeMadrinha.cadastrarVestidoDeMadrinha(input);
      else if (vestidoFeminino.subclassificacao == 'D')
        vestidoDeDebutante.cadastrarVestidoDeDebutante(input);
      else
        System.out.println("Opção inválida");

    } else {
      System.out.println("Opção inválida");
    }

    System.out.println("\nAtualizando estoque...");
    estoque.atualizarEstoque(input);

    System.out.println("\nInformações do aluguel:");
    System.out.println("Dados do cliente:");
    System.out.println("ID: " + cliente.ID);
    System.out.println("Nome: " + cliente.nome);
    System.out.println("CPF: " + cliente.CPF);
    System.out.println("Endereço: " + cliente.endereco);
    System.out.println("Telefone: " + cliente.telefone);

    System.out.println("\nDados da roupa alugada:");
    System.out.println("ID: " + estoque.roupa.ID);

    if (estoque.roupa.classificacao == 'T') {
      System.out.println("Classificação: traje masculino");
      System.out.println("Traje para: " + trajeMasculino.paraQuem);
      System.out.println("Tipo de traje: " + trajeMasculino.tipoDeTraje);
      System.out.println("Comprimento da manga: " + trajeMasculino.comprimentoDaManga + "cm");
      System.out.println("Medida da cintura: " + trajeMasculino.medidaDaCintura + "cm");
      System.out.println("Comprimento da calça: " + trajeMasculino.comprimentoDaCalca + "cm");

    } else {
      System.out.println("Classificação: vestido feminino");
      System.out.println("Modelo: " + vestidoFeminino.modelo);
      System.out.println("Comprimento: " +
          vestidoFeminino.comprimento);
      System.out.println("Medida do busto: " +
          vestidoFeminino.medidaDoBusto + "cm");
      System.out.println("Medida da cintura: " +
          vestidoFeminino.medidaDaCintura + "cm");
      System.out.println("Medida do quadril: " +
          vestidoFeminino.medidaDoQuadril + "cm");

      if (vestidoFeminino.subclassificacao == 'N') {
        System.out.println("Subclassificação: vestido de noiva");
        if (vestidoDeNoiva.cauda)
          System.out.println("Vestido com cauda");
        else
          System.out.println("Vestido sem cauda");
        if (vestidoDeNoiva.veu)
          System.out.println("Vestido com véu");
        else
          System.out.println("Vestido sem véu");

      } else if (vestidoFeminino.subclassificacao == 'M') {
        System.out.println("Subclassificação: vestido de madrinha");
            System.out.println("Horário da festa: " + vestidoDeMadrinha.horarioDaFesta);

      } else if (vestidoFeminino.subclassificacao == 'D') {
        System.out.println("Subclassificação: vestido de debutante");
        System.out.println("Tipo de uso: " + vestidoDeDebutante.tipoDeUso);
      }
    }

    System.out.println("Aluguéis realizados: " + estoque.roupa.alugueisRealizados);
    System.out.println("Cor: " + estoque.cor);
    System.out.println("Quantidade disponível no estoque: " + estoque.quantidade);
  }
}