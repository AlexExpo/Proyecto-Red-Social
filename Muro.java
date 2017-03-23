import java.util.ArrayList;
import java.lang.*;
/**
 * Write a description of class Muro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Muro
{
    // instance variables - replace the example below with your own
    
    private ArrayList<Entrada> entradasDelMuro;

    /**
     * Constructor for objects of class Muro
     */
    public Muro()
    {
        // initialise instance variables
        entradasDelMuro = new ArrayList<>();
    }
    
    public void addEntrada(Entrada entrada)
    {
        entradasDelMuro.add(entrada);
    }
    
    public String toString()
    {
        String cadenaADevolver = "";
        
        for (Entrada entradaActual : entradasDelMuro) {
            cadenaADevolver += entradaActual + "\n";
        }
        
        return cadenaADevolver;
    }
    
    public void mostrar()
    {
        System.out.println(this);
    }
    
    public void verCantidadDatosPorEntrada()
    {
        if (entradasDelMuro.size() != 0) {
            for (Entrada entradaActual : entradasDelMuro) {
                System.out.println(entradaActual.getCantidadDeDatosAsociadosALaEntrada());
            }
        }
    }
    
    public void mostrarDatosExclusivosEntradasFiltradas(String tipoEntradaAFiltrar, String autorAFiltrar)
    {
        if (tipoEntradaAFiltrar == null && autorAFiltrar != null) {
            for (Entrada entradaActual : entradasDelMuro) {
                String textoDeEntrada = (String) entradaActual.toString();
                if (textoDeEntrada.contains(autorAFiltrar)) {
                    if (entradaActual instanceof EntradaTexto) {
                        EntradaTexto entradaTexto = (EntradaTexto) entradaActual;
                        entradaTexto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaFoto) {
                        EntradaFoto entradaFoto = (EntradaFoto) entradaActual;
                        entradaFoto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaUnionAGrupo) {
                        EntradaUnionAGrupo entradaUnionAGrupo = (EntradaUnionAGrupo) entradaActual;
                        entradaUnionAGrupo.mostrarDatosExclusivos();
                    }
                }
            }
        }
        
        if (tipoEntradaAFiltrar != null && autorAFiltrar == null) {
            for (Entrada entradaActual : entradasDelMuro) {
                if (entradaActual.getClass().getSimpleName().equals(tipoEntradaAFiltrar)) {
                    if (entradaActual instanceof EntradaTexto) {
                        EntradaTexto entradaTexto = (EntradaTexto) entradaActual;
                        entradaTexto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaFoto) {
                        EntradaFoto entradaFoto = (EntradaFoto) entradaActual;
                        entradaFoto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaUnionAGrupo) {
                        EntradaUnionAGrupo entradaUnionAGrupo = (EntradaUnionAGrupo) entradaActual;
                        entradaUnionAGrupo.mostrarDatosExclusivos();
                    }
                }
            }
        }
        
        if (tipoEntradaAFiltrar != null && autorAFiltrar != null) {
            for (Entrada entradaActual : entradasDelMuro) {
                String textoDeEntrada = (String) entradaActual.toString();
                if (textoDeEntrada.contains(autorAFiltrar) && entradaActual.getClass().getSimpleName().equals(tipoEntradaAFiltrar)) {
                    if (entradaActual instanceof EntradaTexto) {
                        EntradaTexto entradaTexto = (EntradaTexto) entradaActual;
                        entradaTexto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaFoto) {
                        EntradaFoto entradaFoto = (EntradaFoto) entradaActual;
                        entradaFoto.mostrarDatosExclusivos();
                    }
                    if (entradaActual instanceof EntradaUnionAGrupo) {
                        EntradaUnionAGrupo entradaUnionAGrupo = (EntradaUnionAGrupo) entradaActual;
                        entradaUnionAGrupo.mostrarDatosExclusivos();
                    }
                }
            }
        }
    }
    
}






