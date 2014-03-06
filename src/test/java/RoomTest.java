/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Room;
import com.mycompany.universityresidence_immutable_domain_model.Residence.Student;
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
public class RoomTest {
    
    public RoomTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate(){// throws Exception{
        //Student stud = new Student.Builder("122037943").name("Dylan").surname("Coetzee").build();
        
        Room r = new Room.Builder(114).roomSize(2).roomColour("blue").matColour("Red").build();
        //Assert.assertEquals(114, r.getRoomNumber());
        //Assert.assertEquals(null, stud);
        Assert.assertEquals(2, r.getRoomSize());
        Assert.assertEquals("blue",r.getRoomColour());
        Assert.assertEquals("Red",r.getMatColour());
        
        Room r1 = new Room.Builder(114)
                .Room(r)
                .roomColour("red")
                .build();
        
        //Assert.assertEquals("red", getRoomColour());
    }
    
    @Test
    public void testCreation() throws Exception{
        //Student stud = new Student.Builder("122037943").name("Dylan").surname("Coetzee").build();
        
        Room r = new Room.Builder(114).roomSize(2).roomColour("blue").matColour("Red").build();
        //Assert.assertEquals(114, r.getRoomNumber());
        //Assert.assertEquals(stud, stud);
        Assert.assertEquals(2, r.getRoomSize());
        Assert.assertEquals("blue",r.getRoomColour());
        Assert.assertEquals("Red",r.getMatColour());
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
