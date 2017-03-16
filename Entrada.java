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
    
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(String usuario)
    {
        // initialise instance variables
        this.usuario = usuario;
        cantidadMeGusta = 0;
        momentoPublicacion = LocalDateTime.now();
        comentarios = new ArrayList<String>();
    }
    
    public void meGusta()
    {
        cantidadMeGusta++;
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
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
    
    public ArrayList<String> getCometarios()
    {
        return comentarios;
    }
    
        public void toStringg()
    {
        
    }
    
}






