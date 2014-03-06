/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Kitchen;
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
public class KitchenTest {
    
    public KitchenTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testUpdate() throws Exception{
        Kitchen k = new Kitchen.Builder("K Block FarSide 1st Floor").stove("Defy").fridge("Defy").basin("Cobra").build();
        Assert.assertEquals("K Block FarSide 1st Floor", k.getKitchenId());
        Assert.assertEquals("Defy", k.getStove());
        Assert.assertEquals("Defy", k.getFridge());
        Assert.assertEquals("Cobra",k.getBasin());
        
        Kitchen k1 = new Kitchen.Builder("E Block FarSide 1st Floor")
                .Kitchen(k)
                .stove("LG")
                .build();
        
        Assert.assertEquals(k1.getStove(), "LG");
    }
    
    @Test
    public void testCreation() throws Exception{
        Kitchen k = new Kitchen.Builder("K Block FarSide 1st Floor").stove("Defy").fridge("Defy").basin("Cobra").build();
        Assert.assertEquals("K Block FarSide 1st Floor", k.getKitchenId());
        Assert.assertEquals("Defy", k.getStove());
        Assert.assertEquals("Defy", k.getFridge());
        Assert.assertEquals("Cobra",k.getBasin());
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
