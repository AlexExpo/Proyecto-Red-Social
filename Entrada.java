import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada
{
    // instance variables - replace the example below with your own
    private String usuario;
    
    private int cantidadMeGusta;
    
    private LocalDateTime momentoPublicacion;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String autor)
    {
        // initialise instance variables
        usuario = autor;
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now();
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
    
    public String toString()
    {
        return null;
    }
    
}






