import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends EntradaConComentarios
{
    // instance variables - replace the example below with your own
    
    private String urlImagen;
    
    private String titulo;

    /**
     * Constructor for objects of class EntradaMuro
     */
    public EntradaFoto(String autor, String url, String titulo)
    {
        // initialise instance variables
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }
    
    public String getUrlImagen()
    {
        return urlImagen;
    }
    
    public String getTituloImagen()
    {
        return titulo;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += titulo + "\n";
        cadenaADevolver += urlImagen + "\n";
        
        return cadenaADevolver + "\n";
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 6;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("Titulo: " + titulo);
        System.out.println("Url de la imagen: " + urlImagen);
    }
    
}





