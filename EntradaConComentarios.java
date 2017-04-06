import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class EntradaConComentarios extends Entrada
{
    // instance variables - replace the example below with your own
    
    private ArrayList<String> comentarios;

    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<String>();
    }
    
    public EntradaConComentarios(String autor, int cantidadMeGusta, LocalDateTime momentoPublicacion)
    {
        super(autor, cantidadMeGusta, momentoPublicacion);
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
    
    public String mostrarEnHtml()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.mostrarEnHtml();
        
        if (getComentarios().isEmpty()) {
            cadenaADevolver += "La entrada no tiene comentarios.\n" + "<br>";
        }
        else {
            cadenaADevolver += "Comentarios:\n" + "<br>";
            for (String comentario : getComentarios()) {
                cadenaADevolver += comentario + "\n" + "<br>";
            }
        }
        
        return cadenaADevolver + "<br>";
    }
    
}






