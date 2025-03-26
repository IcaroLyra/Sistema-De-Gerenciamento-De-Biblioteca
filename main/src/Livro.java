public class Livro {
  private int ISBN;
  private String Titulo;
  private Autor Autor;
  private String Categoria;

  public Livro(int isbn, String titulo, Autor autor, String categoria){
    ISBN = isbn;
    Titulo = titulo;
    Autor = autor;
    Categoria = categoria;
  }

  public int getISBN(){
    return ISBN;
  }
  public void setISBN(int isbn){
    ISBN = isbn;
  }
  public String getTitulo(){
    return Titulo;
  }
  public void setTitulo(String titulo){
    Titulo = titulo;
  }
  public Autor getAutor(){
    return Autor;
  }
  public void setAutor(Autor autor){
    Autor = autor;
  }
  public String getCategoria(){
    return Categoria;
  }
  public void setCategoria(String categoria){
    Categoria = categoria;
  }
}
