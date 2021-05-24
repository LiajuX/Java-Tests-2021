public class CadastroAlunos {
  private int ID;
  private String nome;
  private String CPF;
  private String endereco;
  private String telefone;

  public void setID(int pID) {
    ID = pID;
  }

  public int getID() {
    return ID;
  }

  public void setNome(String pNome) {
    nome = pNome;
  }

  public String getNome() {
    return nome;
  }

  public void setCPF(String pCPF) {
    CPF = pCPF;
  }

  public String getCPF() {
    return CPF;
  }

  public void setEndereco(String pEndereco) {
    endereco = pEndereco;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setTelefone(String pTelefone) {
    telefone = pTelefone;
  }

  public String getTelefone() {
    return telefone;
  }
}
