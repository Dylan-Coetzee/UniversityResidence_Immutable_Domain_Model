/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class AddressTest {
    
    public AddressTest() {
    }
    
    @Test
    public void testUpdate() throws Exception{
        
        Address a = new Address.Builder("6 Browning Road").city("Cape Town").province("Western Cape").zip(8000).build();
        Assert.assertEquals("6 Browning Road", a.getStreet());
        Assert.assertEquals("Cape Town", a.getCity());
        Assert.assertEquals("Western Cape", a.getProvince());
        Assert.assertEquals(8000,a.getZip());
        
        Address a1 = new Address.Builder("23 Jameson Street")
                .Address(a)
                .city("Cape Town")
                .build();
        
        Assert.assertEquals(a1.getCity(), "Cape Town");
        
    }

    @Test
    public void testCreation() throws Exception{
        Address a = new Address.Builder("6 Browning Road").city("Cape Town").province("Western Cape").zip(8000).build();
        Assert.assertEquals("6 Browning Road", a.getStreet());
        Assert.assertEquals("Cape Town", a.getCity());
        Assert.assertEquals("Western Cape", a.getProvince());
        Assert.assertEquals(8000,a.getZip());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

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
