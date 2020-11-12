
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.0
 */
public class Libro {

    private String autor;
    private String titulo;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro)
    {
        autor = autorLibro;
        titulo = tituloLibro;
    }
    
    /**
     * m�todo getter para autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * m�todo getter para t�tulo
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * M�todo para mostrar el autor por terminal
     */
    public void imprimeAutor(){
        System.out.println("Autor del libro: " + autor);
    }
    
    /**
     * M�todo para mostrar el t�tulo por terminal
     */
    public void imprimeTitulo(){
        System.out.println("T�tulo del libro: " + titulo);
    }
}
