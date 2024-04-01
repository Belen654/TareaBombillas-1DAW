/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package tareabombillas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acm92
 */
public class BombillaIT {

    public BombillaIT() {
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
     * Test of getNombre method, of class Bombilla.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Bombilla instance = null;
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEncenderBomb method, of class Bombilla.
     */
    @Test
    public void testIsEncenderBomb() {
        System.out.println("isEncenderBomb");
        Bombilla instance = null;
        boolean expResult = false;
        boolean result = instance.isEncenderBomb();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Bombilla.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Bombilla instance = null;
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncenderBomb method, of class Bombilla.
     */
    @Test
    public void testSetEncenderBomb() {
        System.out.println("setEncenderBomb");
        boolean encenderBomb = false;
        Bombilla instance = null;
        instance.setEncenderBomb(encenderBomb);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEncenderBomb method, of class Bombilla.
     */
    @Test
    public void testSetEncenderBomb2() {
        System.out.println("setEncenderBomb");
        boolean encenderBomb = false;
        Bombilla instance = null;
        instance.setEncenderBomb(encenderBomb);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of pulsarInterruptor method, of class Bombilla.
     */
    @Test
    public void testPulsarInterruptorBelen() {
        System.out.println("pulsarInterruptor");
        Bombilla instance = null;
        boolean encenderBomb = true;
        instance.pulsarInterruptor(encenderBomb);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of estado method, of class Bombilla.
     */
    @Test
    public void testEstado() {
        System.out.println("estado");
        Bombilla instance = null;
        instance.estado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
