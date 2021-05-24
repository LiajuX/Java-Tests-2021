public class CadastroCursos {
  private int ID;
  private String nome;
  private String descricao;
  private int qtdDeVagasDisponiveis;
  private String periodoLetivo;
  private String dataDeInicio;
  private String dataDeFim;

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

  public void setDescricao(String pDescricao) {
    descricao = pDescricao;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setQtdDeVagasDisponiveis(int pQtdDeVagasDisponiveis) {
    qtdDeVagasDisponiveis = pQtdDeVagasDisponiveis;
  }

  public int getQtdDeVagasDisponiveis() {
    return qtdDeVagasDisponiveis;
  }

  public void setPeriodoLetivo(String pPeriodoLetivo) {
    periodoLetivo = pPeriodoLetivo;
  }

  public String getPeriodoLetivo() {
    return periodoLetivo;
  }

  public void setDataDeInicio(String pDataDeInicio) {
    dataDeInicio = pDataDeInicio;
  }

  public String getDataDeInicio() {
    return dataDeInicio;
  }

  public void setDataDeFim(String pDataDeFim) {
    dataDeFim = pDataDeFim;
  }

  public String getDataDeFim() {
    return dataDeFim;
  }
}
