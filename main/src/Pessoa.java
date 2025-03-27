public class Pessoa {
  protected String cpf;
  protected String nome;
  protected int dataDeNacimento;

  public Pessoa(String cpf, String nome, int dataDeNacimento) {

    this.cpf = cpf;
    this.nome = nome;
    this.dataDeNacimento = dataDeNacimento;

  }

  public String getcpf() {
    return cpf;
  }

  public void setcpf(String cpf) {
    this.cpf = cpf;
  }

  public String getnome() {
    return nome;
  }

  public void setnome(String nome) {
    this.nome = nome;
  }

  public int getdatadenacimento() {
    return dataDeNacimento;
  }

  public void setdata(int data) {
    this.dataDeNacimento = data;
  }

}
