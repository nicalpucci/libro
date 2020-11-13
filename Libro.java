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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean libroTexto){
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = libroTexto;
    }
    
    /**
     * Método getter para ver si es libro de texto
     */
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
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
     * Método getter para número de referencia
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * Método getter para mostrar las veces que se presta
     */
    public int getVecesPrestado(){
        return vecesPrestado;        
    }
    
    /**
     * Método para contar las veces que se presta
     */
    public void prestar(){
        vecesPrestado++;
    }
    
    /**
     * Método setter para número de referencia
     */
    public void setNumeroReferencia(String numeroDeReferencia){
        if (numeroDeReferencia.length() >= 3) {
            numeroReferencia = numeroDeReferencia;
        }
        else{
            System.out.println("ERROR: debe tener 3 caracteres mínimo");
        }            
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
        String texto;
        if(numeroReferencia != ""){
            numeroReferencia =  numeroReferencia;          
        }
        else{
            numeroReferencia = "ZZZ";
        }
        if(esLibroDeTexto == true){
            texto = "Sí";
        }
        else{
            texto = "No";
        }
        detallesLibro = ("Número de referencia: "+ numeroReferencia + ", Título: "
        + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "Veces Prestado: " + vecesPrestado
        + ", ¿Es libro de texto? " + texto);
        return detallesLibro;
    }
    
    /**
     * Método que muestra todos los datos del libro en el terminal
     */
    public void imprimeDetalles(){
        String texto;
        if(numeroReferencia != ""){
            numeroReferencia = numeroReferencia;
        }
        else{
            numeroReferencia = "ZZZ";
        }
        if(esLibroDeTexto == true){
            texto = "Sí";
        }
        else{
            texto = "No";
        }
        System.out.println("Número de referencia: "+ numeroReferencia + ", Título: " 
        + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + "Veces Prestado: " + vecesPrestado
        + ", ¿Es libro de texto? " + texto);
    }
}
