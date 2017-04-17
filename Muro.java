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
import java.net.*;
import java.util.Scanner;
import java.time.LocalDateTime;
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
            String cmd = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome " + "Archivo.html";
            Runtime.getRuntime().exec(cmd); 
        } 
        catch (IOException ioe) 
        {
            System.out.println (ioe);
        }
    }
    
    public void mostrarMuroEnNavegador(String nombreUsuario)
    {
        entradasDelMuro.clear();
        Path rutaArchivo = Paths.get("Archivo.html");
        try {
            URL enlace = new URL("https://script.google.com/macros/s/AKfycbzHc3p1twTfyF7o0_cxSwnxSsyOemuHnSu406ly9DZIf5Ck2BA/exec?user=" + nombreUsuario);
            Scanner enlaceEscaneado = new Scanner(enlace.openStream());
             while(enlaceEscaneado.hasNextLine()){
                String lineaActual = enlaceEscaneado.nextLine();
                String[] listaElementos = lineaActual.split(";");
                String entrada = listaElementos[0];
                if(entrada.equals("EntradaTexto")){ 
                    String autor = listaElementos[1];
                    int cantidadMeGusta = Integer.parseInt(listaElementos[2]);
                    String fechaInicial = listaElementos[3];
                    LocalDateTime momentoPublicacion = LocalDateTime.parse(convertirAFechaCorrecta(fechaInicial));
                    String mensaje = listaElementos[4];
                    EntradaTexto entradaTexto = new EntradaTexto(autor, cantidadMeGusta, momentoPublicacion, mensaje);
                    String[] comentarios = listaElementos[5].split("%");
                    for (int contador = 0; comentarios.length > contador; contador++) {
                        entradaTexto.addComentario(comentarios[contador]);
                    }
                    entradasDelMuro.add(entradaTexto);
                }
                else if (entrada.equals("EntradaFoto")){ 
                    String autor = listaElementos[1];
                    int cantidadMeGusta = Integer.parseInt(listaElementos[2]);
                    String fechaInicial = listaElementos[3];
                    LocalDateTime momentoPublicacion = LocalDateTime.parse(convertirAFechaCorrecta(fechaInicial));
                    String url = listaElementos[4];
                    String titulo = listaElementos[5];
                    EntradaFoto entradaFoto = new EntradaFoto(autor, cantidadMeGusta, momentoPublicacion, url, titulo);
                    String[] comentarios = listaElementos[6].split("%");
                    for (int contador = 0; comentarios.length > contador; contador++) {
                        entradaFoto.addComentario(comentarios[contador]);
                    }
                    entradasDelMuro.add(entradaFoto);
                }
                else if (entrada.equals("EntradaUnionAGrupo")){ 
                    String autor = listaElementos[1];
                    int cantidadMeGusta = Integer.parseInt(listaElementos[2]);
                    String fechaInicial = listaElementos[3];
                    LocalDateTime momentoPublicacion = LocalDateTime.parse(convertirAFechaCorrecta(fechaInicial));
                    String nombreGrupo = listaElementos[4];
                    EntradaUnionAGrupo entradaUnionAGrupo = new EntradaUnionAGrupo(autor, cantidadMeGusta, momentoPublicacion, nombreGrupo);
                    entradasDelMuro.add(entradaUnionAGrupo);
                }
            }
            mostrarMuroEnNavegador();
        }
        catch (IOException excepcion) {
            // Mostramos por pantalla la excepción que se ha producido
            System.out.println(excepcion.toString());
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
    
    public String convertirAFechaCorrecta(String fecha)
    {
        String[] elementosFecha = fecha.split("-");
        String[] elementosPrimeraParte = elementosFecha[0].split("/");
        String[] elementosSegundaParte = elementosFecha[1].split(":");
        String caracterPrimeraParte1 = "";
        String caracterPrimeraParte2 = "-";
        String caracterSegundaParte = "";
        if (elementosPrimeraParte[0].length() == 1) {
            caracterPrimeraParte1 = "0";
        }
        if (elementosPrimeraParte[1].length() == 1) {
            caracterPrimeraParte2 = "-0";
        }
        if (elementosSegundaParte[0].length() == 1) {
            caracterSegundaParte = "0";
        }
        String elementoFechaPrimeraParte = elementosPrimeraParte[2] + caracterPrimeraParte2 + elementosPrimeraParte[1] + "-" + caracterPrimeraParte1 + elementosPrimeraParte[0]; 
        String fechaConvertida = elementoFechaPrimeraParte + "T" + caracterSegundaParte + elementosFecha[1] + ":00";
        return fechaConvertida;
    }
    
}






