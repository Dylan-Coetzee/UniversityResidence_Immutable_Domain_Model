/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Toilet;
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
public class ToiletTest {
    
    public ToiletTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        Toilet t = new Toilet.Builder("45").numberOfShowers(4).numberOfToilets(2).numberOfBaths(1).toiletColour("Red").build();
        Assert.assertEquals("45", t.getToiletId());
        Assert.assertEquals(4, t.getNumberOfShowers());
        Assert.assertEquals(1,t.getNumberOfBaths());
        //Assert.assertEquals(t.getToiletColour(),"Red");
        
        Toilet t1 = new Toilet.Builder("55")
                .Toilet(t)
                .numberOfBaths(2)
                .build();
                
    }
    
    @Test
    public void testCreation() throws Exception{
        Toilet t = new Toilet.Builder("45").numberOfShowers(4).numberOfToilets(2).numberOfBaths(1).toiletColour("Red").build();
        Assert.assertEquals("45", t.getToiletId());
        Assert.assertEquals(4, t.getNumberOfShowers());
        Assert.assertEquals(1,t.getNumberOfBaths());
        //Assert.assertEquals("Red",t.getToiletColour());
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
