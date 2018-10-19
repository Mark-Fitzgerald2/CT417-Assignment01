/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.fitzgeraldmark.ct417assignment1;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author I342039
 */
public class studentRegTest {
    
    public studentRegTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
     public void StudentReg_Test() {
        Course ece = new Course("Electronic and Computer Engineering (ECE)", DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")), DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        assertEquals(ece.getName(), "Electronic and Computer Engineering (ECE)");
        assertEquals(ece.getStartDate(),DateTime.parse("10/09/2018", DateTimeFormat.forPattern("dd/MM/yyyy")));
        assertEquals(ece.getEndDate(),DateTime.parse("10/05/2019", DateTimeFormat.forPattern("dd/MM/yyyy")));
        
        Module softEng = new Module("Software Engineering III", "CT417");
        assertEquals(softEng.getName(), "Software Engineering III");
        assertEquals(softEng.getId(), "CT417");
     }
}
