import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaTexto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaTexto extends EntradaConComentarios
{
    // instance variables - replace the example below with your own
    
    private String mensaje;

    /**
     * Constructor for objects of class EntradaTexto
     */
    public EntradaTexto(String autor, String texto)
    {
        // initialise instance variables
        super(autor);
        mensaje = texto;
    }
    
    public String getMensaje()
    {
        return mensaje;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += mensaje + "\n";
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
    
    public void mostrarAutorYMensaje()
    {
        System.out.println("Usuario: " + getUsuario() + "." + "\n");
        System.out.println("Mensaje: " + mensaje + "." + "\n");
    }
    
}






