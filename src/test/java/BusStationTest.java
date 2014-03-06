/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.BusWaitingStation;
import com.mycompany.universityresidence_immutable_domain_model.Residence.Student;
import java.util.ArrayList;
import java.util.List;
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
public class BusStationTest {
    
    public BusStationTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testUpdate() throws Exception{
        //Student stud = new Student.Builder("122037943").name("Dylan").surname("Coetzee").build();
        
        BusWaitingStation bs = new BusWaitingStation.Builder("785").Capacity(2).build();
        Assert.assertEquals("785", bs.getStationId());
        //Assert.assertEquals(new Student.Builder("122037943").name("Dylan").surname("Coetzee").build(), stud);
        Assert.assertEquals(2, bs.getCapacity());
        
        BusWaitingStation bs1 = new BusWaitingStation.Builder("123")
                            .Capacity(56)
                            .BusWaitingStation(bs)
                            .build();
        
        Assert.assertEquals(bs1.getCapacity(), 2);
    }
    
    @Test
    public void testCreation() throws Exception{
        //Student stud = new Student.Builder("122037943").name("Dylan").surname("Coetzee").build();
        
        BusWaitingStation bs = new BusWaitingStation.Builder("785").Capacity(2).build();
        Assert.assertEquals("785", bs.getStationId());
        //Assert.assertEquals(new Student.Builder("122037943").name("Dylan").surname("Coetzee").build(), stud);
        Assert.assertEquals(2, bs.getCapacity());
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
