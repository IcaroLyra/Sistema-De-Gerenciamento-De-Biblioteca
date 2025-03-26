import java.util.ArrayList;

public class Autor extends Pessoa {
    private ArrayList<Livro> Livros = new ArrayList<>();
    
    public Autor(String cpf, String nome, int datadenacimento, ArrayList<Livro> livros){
        super(cpf,nome,datadenacimento);
        Livros = livros;
    }

    public ArrayList<Livro> getLivros(){
        return Livros;
    }
    public void setLivros(ArrayList<Livro> livros){
        Livros = livros; 
    }
}
