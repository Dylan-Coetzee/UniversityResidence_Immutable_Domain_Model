/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Building;
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
public class BuildingTest {
    
    public BuildingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testUpdate() throws Exception{
        Building b = new Building.Builder(101).name("Catsville").NumberOfStories(6).Capacity(850).build();
        Assert.assertEquals(101, b.getBuildingID());
        Assert.assertEquals("Catsville", b.getName());
        Assert.assertEquals(6, b.getNumberOfStories());
        Assert.assertEquals(850,b.getCapacity());
        
        Building b1 = new Building.Builder(123)
                .Building(b)
                .NumberOfStories(1)
                .build();
        
        Assert.assertEquals(b1.getNumberOfStories(), 1);
    }
    
    @Test
    public void testCreation() throws Exception{
        Building b = new Building.Builder(101).name("Catsville").NumberOfStories(6).Capacity(850).build();
        Assert.assertEquals(101, b.getBuildingID());
        Assert.assertEquals("Catsville", b.getName());
        Assert.assertEquals(6, b.getNumberOfStories());
        Assert.assertEquals(850,b.getCapacity());
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
