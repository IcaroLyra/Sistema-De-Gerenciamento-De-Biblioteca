public class Cliente extends Pessoa{
    private int id;

    public Cliente(String cpf, String nome, int dataDeNacimento, int id){
        super(cpf, nome, dataDeNacimento);
        this.id = id;
    }

    public int getID(){
        return id;
    }
}



