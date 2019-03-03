/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 1895277
 */
public class CategoryTest {
    
    public CategoryTest() {
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
      @Test
    public void createIdTest()
    {
        System.out.println("Test id for createId method in Category Class");         
        
        Date date = new Date();
        String name = "Veg";
        String expectedResult = "19-Mar-O-VG";
        String realResult = ubereats.Category.createId(date, name);
        assertEquals(expectedResult, realResult);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
