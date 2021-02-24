/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel02_2021;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xp
 */
public class EjerciciosNivel02_2021Test {
    
    public EjerciciosNivel02_2021Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of esEscaleraDePalabras method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testEsEscaleraDePalabras() {
        System.out.println("esEscaleraDePalabras");
        char[][] listaPalabras = null;
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        boolean expResult = false;
        boolean result = instance.esEscaleraDePalabras(listaPalabras);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of costeErroresADN method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testCosteErroresADN() {
        System.out.println("costeErroresADN");
        String uno = "";
        String dos = "";
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        int expResult = 0;
        int result = instance.costeErroresADN(uno, dos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findDuplicate method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testFindDuplicate() {
        System.out.println("findDuplicate");
        int[] listaNumeros = null;
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        int expResult = 0;
        int result = instance.findDuplicate(listaNumeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of quitaAcentosV2 method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testQuitaAcentosV2() {
        System.out.println("quitaAcentosV2");
        String cadena = "";
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        String expResult = "";
        String result = instance.quitaAcentosV2(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of strStr method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testStrStr() {
        System.out.println("strStr");
        EjerciciosNivel02_2021 instance = new EjerciciosNivel02_2021();
        
        assertEquals(-1, instance.strStr("Mumn", "mun"));
        
    }

    /**
     * Test of main method, of class EjerciciosNivel02_2021.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjerciciosNivel02_2021.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
