/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.CatsvilleResidence;
import org.junit.Assert;
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
public class CatsvilleResidenceTest {
    
    public CatsvilleResidenceTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdateCatsResidence() {
        CatsvilleResidence cr = new CatsvilleResidence.Builder("Emma's Residence").build();
        Assert.assertEquals("Emma's Residence", cr.getName());
        
        CatsvilleResidence cr1 = new CatsvilleResidence.Builder("Emma's and Zuma's Residence")
                .CatsvilleResidence(cr)
                .build();
    }
    
    @Test
    public void testCatsResidence() {
        CatsvilleResidence cr = new CatsvilleResidence.Builder("Emma's Residence").build();
        Assert.assertEquals("Emma's Residence", cr.getName());
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
