import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
/**
 * Write a description of class EntradaUnionAGrupo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EntradaUnionAGrupo extends Entrada
{
    // instance variables - replace the example below with your own
    private String grupo;

    public EntradaUnionAGrupo(String autor, String nombreGrupo)
    {
        super(autor);
        grupo = nombreGrupo;
    }
    
    public EntradaUnionAGrupo(String autor, int cantidadMeGusta, LocalDateTime momentoPublicacion, String nombreGrupo)
    {
        super(autor, cantidadMeGusta, momentoPublicacion);
        grupo = nombreGrupo;
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.toString();
        cadenaADevolver += "Se ha unido al grupo " + grupo + ".\n";
        
        return cadenaADevolver + "\n";
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public int getCantidadDeDatosAsociadosALaEntrada()
    {
        return 4;
    }
    
    public void mostrarDatosExclusivos()
    {
        System.out.println("Grupo: " + grupo);
    }
    
    public String mostrarEnHtml()
    {
        String cadenaADevolver = "";
        
        cadenaADevolver += super.mostrarEnHtml();
        cadenaADevolver += "Se ha unido al grupo " + grupo + ".\n" + "<br>";
        
        return cadenaADevolver + "\n" + "<br>";
    }
    
}



