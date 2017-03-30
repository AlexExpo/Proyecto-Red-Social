import java.util.ArrayList;
import java.io.File;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
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
    
    public void mostrarMuroEnNavegador()
    {
        Path rutaArchivo = Paths.get("Archivo.html");
        // Abrimos el archivo, escribimos en él y lo cerramos. Si se produce una
        try {
            File archivoPlantilla = new File("PlantillaRedSolcial.htm");
            FileReader archivoPlantillaLeido = new FileReader (archivoPlantilla);
            BufferedReader archivoPlantillaGuardado = new BufferedReader(archivoPlantillaLeido);
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            String textoHtml = "";
            while((textoHtml = archivoPlantillaGuardado.readLine()) != null){
               archivo.write(textoHtml);
            }
            archivo.write(mostrarEnHtml());
            archivo.write("</body> </html>");
            archivo.close();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
        }
        try 
        {
            String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome " + "Archivo.html" ;
            Runtime.getRuntime().exec(cmd); 
        } 
        catch (IOException ioe) 
        {
            System.out.println (ioe);
        }
    }
    
    public String mostrarEnHtml()
    {
        String cadenaADevolver = "";
        
        for (Entrada entradaActual : entradasDelMuro) {
            cadenaADevolver += "<p>" + entradaActual.mostrarEnHtml() + "</p>" + "\n";
            cadenaADevolver += "<hr align=left noshade=noshade size=4 width=100% />";
        }
        
        return cadenaADevolver;
    }
    
}






