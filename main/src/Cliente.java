public class Cliente extends Pessoa{
    private int ID;

    public Cliente(String cpf, String nome, int datadenacimento, int id){
        super(cpf, nome, datadenacimento);
        ID = id;
    }

    public int getID(){
        return ID;
    }
}



