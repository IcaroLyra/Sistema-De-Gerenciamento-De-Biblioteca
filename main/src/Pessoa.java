public class Pessoa {
  protected String Cpf;
  protected String Nome;
  protected int DataDeNacimento;

  public Pessoa(String cpf, String nome, int datadenacimento) {

    Cpf = cpf;
    Nome = nome;
    DataDeNacimento = datadenacimento;
  }

  public String getcpf(){
    return Cpf;
  }
  public void setcpf(String cpf){
    Cpf = cpf;
  }
  public String getnome(){
    return Nome;
  }
  public void setnome(String nome){
    Nome = nome;
  }

  public int getdatadenacimento(){
    return DataDeNacimento;
  }
  public void setdata(int data){
    DataDeNacimento = data;
  }

}
