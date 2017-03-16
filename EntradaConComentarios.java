import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaConComentarios extends Entrada
{
    // instance variables - replace the example below with your own
    
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class Entrada
     */
    public EntradaConComentarios(String autor)
    {
        // initialise instance variables
        super(autor);
        comentarios = new ArrayList<String>();
    }
    
    public void addComentario(String texto)
    {
        comentarios.add(texto);
    }
    
    public ArrayList<String> getCometarios()
    {
        return comentarios;
    }
    
    public String toString()
    {
        return null;
    }
    
}






