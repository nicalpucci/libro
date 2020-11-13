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
     * M�todo getter para ver si es libro de texto
     */
    public boolean getEsLibroDeTexto(){
        return esLibroDeTexto;
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
     * M�todo getter para n�mero de p�ginas
     */
    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    
    /**
     * M�todo getter para n�mero de referencia
     */
    public String getNumeroReferencia(){
        return numeroReferencia;
    }
    
    /**
     * M�todo getter para mostrar las veces que se presta
     */
    public int getVecesPrestado(){
        return vecesPrestado;        
    }
    
    /**
     * M�todo para contar las veces que se presta
     */
    public void prestar(){
        vecesPrestado++;
    }
    
    /**
     * M�todo setter para n�mero de referencia
     */
    public void setNumeroReferencia(String numeroDeReferencia){
        if (numeroDeReferencia.length() >= 3) {
            numeroReferencia = numeroDeReferencia;
        }
        else{
            System.out.println("ERROR: debe tener 3 caracteres m�nimo");
        }            
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
    
    /**
     * M�todo getter para todos los datos del libro
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
            texto = "S�";
        }
        else{
            texto = "No";
        }
        detallesLibro = ("N�mero de referencia: "+ numeroReferencia + ", T�tulo: "
        + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + "Veces Prestado: " + vecesPrestado
        + ", �Es libro de texto? " + texto);
        return detallesLibro;
    }
    
    /**
     * M�todo que muestra todos los datos del libro en el terminal
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
            texto = "S�";
        }
        else{
            texto = "No";
        }
        System.out.println("N�mero de referencia: "+ numeroReferencia + ", T�tulo: " 
        + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + "Veces Prestado: " + vecesPrestado
        + ", �Es libro de texto? " + texto);
    }
}
