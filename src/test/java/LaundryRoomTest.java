/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.LaundryRoom;
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
public class LaundryRoomTest {
    
    public LaundryRoomTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        LaundryRoom l = new LaundryRoom.Builder("58").numberOfMachines(8).numberOfDryers(7).numberOfToilets(2).build();
        Assert.assertEquals("58", l.getBuildingID());
        Assert.assertEquals(8, l.getNumberOfMachines());
        Assert.assertEquals(7, l.getNumberOfDryers());
        Assert.assertEquals(2, l.getNumberOfToilets());
        
        LaundryRoom l1 = new LaundryRoom.Builder("60")
                .LaundryRoom(l)
                .numberOfMachines(10)
                .build();
        
        Assert.assertEquals(l1.getNumberOfMachines(), 10);
    }
    
    @Test
    public void testCreation() throws Exception{
        LaundryRoom l = new LaundryRoom.Builder("58").numberOfMachines(8).numberOfDryers(7).numberOfToilets(2).build();
        Assert.assertEquals("58", l.getBuildingID());
        Assert.assertEquals(8, l.getNumberOfMachines());
        Assert.assertEquals(7, l.getNumberOfDryers());
        Assert.assertEquals(2, l.getNumberOfToilets());
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
