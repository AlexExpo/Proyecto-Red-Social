import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaMuro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaFoto extends Entrada
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
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += titulo + "\n";
        cadenaADevolver += urlImagen + "\n";
        cadenaADevolver += getCantidadMeGusta() + " me gusta";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        
        cadenaADevolver += "Hace ";
        if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minutos ";
        }
        
        cadenaADevolver += segundosQueHanPasadoDesdeCreacion + " segundos.\n";
        
        if (getCometarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.";
        }
        else {
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getCometarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }
        
        return cadenaADevolver;
    }
    
}





