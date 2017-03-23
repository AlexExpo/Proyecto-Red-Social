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
        
        cadenaADevolver += super.toString();
        cadenaADevolver += mensaje + "\n";
        
        return cadenaADevolver + "\n";
    }
    
    public void mostrarAutorYMensaje()
    {
        System.out.println("Usuario: " + getUsuario() + "." + "\n");
        System.out.println("Mensaje: " + mensaje + "." + "\n");
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 5;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("Mensaje: " + mensaje);
    }
    
}






