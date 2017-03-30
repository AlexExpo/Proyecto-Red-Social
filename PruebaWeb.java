

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PruebaWeb.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PruebaWeb
{
    private Muro muro1;
    private EntradaTexto entradaT1;
    private EntradaTexto entradaT2;
    private EntradaFoto entradaF1;
    private EntradaUnionAGrupo entradaU1;

    /**
     * Default constructor for test class PruebaWeb
     */
    public PruebaWeb()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        muro1 = new Muro();
        entradaT1 = new EntradaTexto("Alex", "Estoy en una red social");
        entradaT2 = new EntradaTexto("Alex", "Esto es una entrada texto");
        entradaF1 = new EntradaFoto("Alex", "usuario.png", "imagen de usuario");
        entradaU1 = new EntradaUnionAGrupo("Alex", "Grupo de programacion");
        muro1.addEntrada(entradaT1);
        muro1.addEntrada(entradaF1);
        muro1.addEntrada(entradaU1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
