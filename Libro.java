
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
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    /**
     * método getter para autor
     */
    public String getAutor(){
        return autor;
    }
    
    /**
     * método getter para título
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Método getter para número de páginas
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * Método para mostrar el autor por terminal
     */
    public void imprimeAutor(){
        System.out.println("Autor del libro: " + autor);
    }
    
    /**
     * Método para mostrar el título por terminal
     */
    public void imprimeTitulo(){
        System.out.println("Título del libro: " + titulo);
    }
    
    /**
     * Método getter para todos los datos del libro
     */
    public String getDetalles(){
        String detallesLibro;
        detallesLibro = ("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
        return detallesLibro;
    }
    
    /**
     * Método que muestra todos los datos del libro en el terminal
     */
    public void imprimeDetalles(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
    }
}
