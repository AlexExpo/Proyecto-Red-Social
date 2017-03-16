
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

    /**
     * Constructor for objects of class EntradaUnionAGrupo
     */
    public EntradaUnionAGrupo(String autor, String nombreGrupo)
    {
        // initialise instance variables
        super(autor);
        grupo = nombreGrupo;
        System.out.println("El usuario: " + getUsuario() + " se ha unido al grupo " + grupo + ".");
    }
    
}



