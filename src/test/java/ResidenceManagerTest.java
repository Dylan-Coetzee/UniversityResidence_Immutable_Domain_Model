/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.ResidenceManager;
import junit.framework.Assert;
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
public class ResidenceManagerTest {
    
    public ResidenceManagerTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void resTestUpdate() {
        ResidenceManager r = new ResidenceManager.Builder("Emma").build();
        Assert.assertEquals("Emma", r.getName());
        
        ResidenceManager r1 = new ResidenceManager.Builder("Emma + Zumma")
                .ResidenceManager(r)
                .build();
        
        Assert.assertEquals("Emma", r.getName());
    }
    
    @Test
    public void resTest() {
        ResidenceManager r = new ResidenceManager.Builder("Emma").build();
        Assert.assertEquals("Emma", r.getName());
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
