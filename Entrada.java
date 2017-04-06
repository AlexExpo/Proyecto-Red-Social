import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    
    private int cantidadMeGusta;
    
    private LocalDateTime momentoPublicacion;

    public Entrada(String autor)
    {
        // initialise instance variables
        usuario = autor;
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now();
    }
    
    public Entrada(String autor, int cantidadMeGusta, LocalDateTime momentoPublicacion)
    {
        // initialise instance variables
        usuario = autor;
        this.cantidadMeGusta = cantidadMeGusta;
        this.momentoPublicacion = momentoPublicacion;
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public LocalDateTime getMomentoPublicacion()
    {
        return momentoPublicacion;
    }
    
    public String getUsuario()
    {
        return usuario;
    }
    
    public int getCantidadMeGusta()
    {
        return cantidadMeGusta;
    }
    
    abstract void mostrar();
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "Usuario: " + getUsuario() + "\n";
        cadenaADevolver += getCantidadMeGusta() + " me gusta:\n";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long minutosResiduales = minutosQueHanPasadoDesdeCreacion % 60;
        long horasQueHanPasadoDesdeCreacion = minutosQueHanPasadoDesdeCreacion / 60;
        long horasResiduales = horasQueHanPasadoDesdeCreacion % 60;
        long diasQueHanPasadoDesdeCreacion = horasQueHanPasadoDesdeCreacion / 24;
        
        cadenaADevolver += "Hace ";
        if (diasQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += diasQueHanPasadoDesdeCreacion + " dia(s) ";
        }
        else if (horasQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += horasQueHanPasadoDesdeCreacion + " hora(s) ";
        }
        else if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minuto(s) ";
        }
        else if (segundosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += segundosQueHanPasadoDesdeCreacion + " segundo(s).\n";
        }
        
        return cadenaADevolver + "\n";
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 3;
    }
    
    public String mostrarEnHtml()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += "<br>" + "Usuario: " + getUsuario() + "\n" + "<br>";
        cadenaADevolver += "<br>" + getCantidadMeGusta() + " me gusta:\n" + "<br>";
        
        long segundosQueHanPasadoDesdeCreacion = getMomentoPublicacion().until(LocalDateTime.now(), ChronoUnit.SECONDS);
        long segundosResiduales = segundosQueHanPasadoDesdeCreacion % 60;
        long minutosQueHanPasadoDesdeCreacion = segundosQueHanPasadoDesdeCreacion / 60;
        long minutosResiduales = minutosQueHanPasadoDesdeCreacion % 60;
        long horasQueHanPasadoDesdeCreacion = minutosQueHanPasadoDesdeCreacion / 60;
        long horasResiduales = horasQueHanPasadoDesdeCreacion % 60;
        long diasQueHanPasadoDesdeCreacion = horasQueHanPasadoDesdeCreacion / 24;
        
        cadenaADevolver += "<br>" + "Hace ";
        if (diasQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += diasQueHanPasadoDesdeCreacion + " dia(s) ";
        }
        else if (horasQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += horasQueHanPasadoDesdeCreacion + " hora(s) ";
        }
        else if (minutosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += minutosQueHanPasadoDesdeCreacion + " minuto(s) ";
        }
        else if (segundosQueHanPasadoDesdeCreacion > 0) {
            cadenaADevolver += segundosQueHanPasadoDesdeCreacion + " segundo(s).\n";
        }
        
        cadenaADevolver += "<br>";
        
        return cadenaADevolver + "\n" + "<br>";
    }
    
}






