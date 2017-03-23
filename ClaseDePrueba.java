

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ClaseDePrueba.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDePrueba
{
    /**
     * Default constructor for test class ClaseDePrueba
     */
    public ClaseDePrueba()
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

    @Test
    public void Interactuar()
    {
        Muro muro1 = new Muro();
        EntradaTexto entradaT1 = new EntradaTexto("Alex", "Me gusta programar");
        EntradaTexto entradaT2 = new EntradaTexto("Maria", "Hola a todos");
        EntradaFoto entradaF1 = new EntradaFoto("Alex", "http:/sdfgsdgs", "Gatitos");
        EntradaFoto entradaF2 = new EntradaFoto("Maria", "http:/sdfgsdgs", "Gatitos");
        EntradaUnionAGrupo entradaU1 = new EntradaUnionAGrupo("Alex", "Programacion");
        EntradaUnionAGrupo entradaU2 = new EntradaUnionAGrupo("Maria", "Programacion");
    }
}

