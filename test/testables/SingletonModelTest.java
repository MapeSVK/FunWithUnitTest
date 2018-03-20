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
public class SingletonModelTest {
    
    public SingletonModelTest() {
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
     * Test of getInstance method, of class SingletonModel.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        SingletonModel expResult = null;
        SingletonModel result = SingletonModel.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNaughtyWord method, of class SingletonModel.
     */
    @Test
    public void testAddNaughtyWord() {
        System.out.println("addNaughtyWord");
        String naughtyWord = "";
        SingletonModel instance = null;
        instance.addNaughtyWord(naughtyWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addManyNaughtyWords method, of class SingletonModel.
     */
    @Test
    public void testAddManyNaughtyWords() {
        System.out.println("addManyNaughtyWords");
        String[] manyNaughtyWords = null;
        SingletonModel instance = null;
        instance.addManyNaughtyWords(manyNaughtyWords);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addOneOrTwoNaughtyWords method, of class SingletonModel.
     */
    @Test
    public void testAddOneOrTwoNaughtyWords() {
        System.out.println("addOneOrTwoNaughtyWords");
        String aNaughtyWord = "";
        String bNaughtyWord = "";
        SingletonModel instance = null;
        instance.addOneOrTwoNaughtyWords(aNaughtyWord, bNaughtyWord);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfNaughtyWords method, of class SingletonModel.
     */
    @Test
    public void testGetNumberOfNaughtyWords() {
        System.out.println("getNumberOfNaughtyWords");
        SingletonModel instance = null;
        int expResult = 0;
        int result = instance.getNumberOfNaughtyWords();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeFirstNaughtyWord method, of class SingletonModel.
     */
    @Test
    public void testRemoveFirstNaughtyWord() {
        System.out.println("removeFirstNaughtyWord");
        SingletonModel instance = null;
        instance.removeFirstNaughtyWord();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstNaughtyWord method, of class SingletonModel.
     */
    @Test
    public void testGetFirstNaughtyWord() {
        System.out.println("getFirstNaughtyWord");
        SingletonModel instance = null;
        String expResult = "";
        String result = instance.getFirstNaughtyWord();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isListOfNaughtyWordsEmpty method, of class SingletonModel.
     */
    @Test
    public void testIsListOfNaughtyWordsEmpty() {
        System.out.println("isListOfNaughtyWordsEmpty");
        SingletonModel instance = null;
        boolean expResult = false;
        boolean result = instance.isListOfNaughtyWordsEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
