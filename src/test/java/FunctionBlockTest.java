/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.FunctionBlock;
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
public class FunctionBlockTest {
    
    public FunctionBlockTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testUpdate() throws Exception{
        FunctionBlock f = new FunctionBlock.Builder("2").name("K-Function Block").Capacity(50).build();
        Assert.assertEquals("2", f.getBuildingID());
        Assert.assertEquals("K-Function Block", f.getName());
        Assert.assertEquals(50, f.getCapacity());
        
        FunctionBlock f1 = new FunctionBlock.Builder("4")
                .FunctionBlock(f)
                .name("J-Function Block")
                .build();
        
        Assert.assertEquals(f1.getName(), "J-Function Block");
    }
    
    @Test
    public void testCreation() throws Exception{
        FunctionBlock f = new FunctionBlock.Builder("2").name("K-Function Block").Capacity(50).build();
        Assert.assertEquals("2", f.getBuildingID());
        Assert.assertEquals("K-Function Block", f.getName());
        Assert.assertEquals(50, f.getCapacity());
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
