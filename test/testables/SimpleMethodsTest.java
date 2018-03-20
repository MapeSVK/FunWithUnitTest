/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testables;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mape
 */
public class SimpleMethodsTest {
    
    public SimpleMethodsTest() {
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
     * Test of isABiggerThanB method, of class SimpleMethods.
     */
    @Test
    public void testIsABiggerThanB() {
        System.out.println("isABiggerThanB");
        int a = 0;
        int b = 0;
        SimpleMethods instance = new SimpleMethods();
        boolean expResult = false;
        boolean result = instance.isABiggerThanB(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCharInString method, of class SimpleMethods.
     */
    @Test
    public void testIsCharInString() {
        System.out.println("isCharInString");
        char c = ' ';
        String text = "";
        SimpleMethods instance = new SimpleMethods();
        boolean expResult = false;
        boolean result = instance.isCharInString(c, text);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of division method, of class SimpleMethods.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double a = 0.0;
        double b = 0.0;
        SimpleMethods instance = new SimpleMethods();
        double expResult = 0.0;
        double result = instance.division(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of occurncesOfXInArr method, of class SimpleMethods.
     */
    @Test
    public void testOccurncesOfXInArr() {
        System.out.println("occurncesOfXInArr");
        int x = 0;
        int[] arr = null;
        SimpleMethods instance = new SimpleMethods();
        int expResult = 0;
        int result = instance.occurncesOfXInArr(x, arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasDoubles method, of class SimpleMethods.
     */
    @Test
    public void testHasDoubles() {
        System.out.println("hasDoubles");
        Object[] arr = null;
        SimpleMethods instance = new SimpleMethods();
        boolean expResult = false;
        boolean result = instance.hasDoubles(arr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
