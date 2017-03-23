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
    
    public ArrayList<String> getComentarios()
    {
        return comentarios;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.\n";
        }
        else {
            cadenaADevolver += "Comentarios:\n";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n";
            }
        }
        
        return cadenaADevolver;
    }
    
}






