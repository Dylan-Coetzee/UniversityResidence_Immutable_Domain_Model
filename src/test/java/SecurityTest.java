/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Security;
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
public class SecurityTest {
    
    public SecurityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        Security s = new Security.Builder("369258147").name("Nkosi").surname("Mandala").build();
        Assert.assertEquals("369258147", s.getSecurityId());
        //Assert.assertEquals("Nkosi", s.getName());
        Assert.assertEquals("Mandala", s.getSurname());
        
        Security s1 = new Security.Builder("369258477")
                .Security(s)
                .name("Master")
                .build();
        //Assert.assertEquals("Master", s.getName());
    }
    
    @Test
    public void testCreation() throws Exception{
        Security s = new Security.Builder("369258147").name("Nkosi").surname("Mandala").build();
        Assert.assertEquals("369258147", s.getSecurityId());
        //Assert.assertEquals("Nkosi", s.getName());
        Assert.assertEquals("Mandala", s.getSurname());
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
