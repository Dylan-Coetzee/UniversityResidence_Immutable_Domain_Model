/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Lounge;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author dylan
 */
public class LoungeTest {
    
    public LoungeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        Lounge l = new Lounge.Builder("456").numberOfCouches(6).numberOfTables(3).build();
        Assert.assertEquals("456", l.getLoungeID());
        Assert.assertEquals(6, l.getNumberOfCouches());
        Assert.assertEquals(3, l.getNumberOfTables());
        
        Lounge l1 = new Lounge.Builder("478")
                .Lounge(l)
                .numberOfCouches(10)
                .build();
        
        Assert.assertEquals(l1.getNumberOfCouches(), 10);
    }
    
    @Test
    public void testCreation() throws Exception{
        Lounge l = new Lounge.Builder("456").numberOfCouches(6).numberOfTables(3).build();
        Assert.assertEquals("456", l.getLoungeID());
        Assert.assertEquals(6, l.getNumberOfCouches());
        Assert.assertEquals(3, l.getNumberOfTables());
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
