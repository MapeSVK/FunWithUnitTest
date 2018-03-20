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
public class ClassWithStateTest {
    
    public ClassWithStateTest() {
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
     * Test of getNumber method, of class ClassWithState.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        ClassWithState instance = null;
        int expResult = 0;
        int result = instance.getNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumber method, of class ClassWithState.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        int number = 0;
        ClassWithState instance = null;
        instance.setNumber(number);
        
    }

    /**
     * Test of getAnotherNumber method, of class ClassWithState.
     */
    @Test
    public void testGetAnotherNumber() {
        System.out.println("getAnotherNumber");
        ClassWithState instance = null;
        int expResult = 0;
        int result = instance.getAnotherNumber();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAnotherNumber method, of class ClassWithState.
     */
    @Test
    public void testSetAnotherNumber() {
        System.out.println("setAnotherNumber");
        int anotherNumber = 0;
        ClassWithState instance = null;
        instance.setAnotherNumber(anotherNumber);
        
    }

    /**
     * Test of getText method, of class ClassWithState.
     */
    @Test
    public void testGetText() {
        System.out.println("getText");
        ClassWithState instance = null;
        String expResult = "";
        String result = instance.getText();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setText method, of class ClassWithState.
     */
    @Test
    public void testSetText() {
        System.out.println("setText");
        String text = "";
        ClassWithState instance = null;
        instance.setText(text);
        
    }

    /**
     * Test of getDecimalNumber method, of class ClassWithState.
     */
    @Test
    public void testGetDecimalNumber() {
        System.out.println("getDecimalNumber");
        ClassWithState instance = null;
        double expResult = 0.0;
        double result = instance.getDecimalNumber();
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of setDecimalNumber method, of class ClassWithState.
     */
    @Test
    public void testSetDecimalNumber() {
        System.out.println("setDecimalNumber");
        double decimalNumber = 0.0;
        ClassWithState instance = null;
        instance.setDecimalNumber(decimalNumber);
        
    }
    
}
