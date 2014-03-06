/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Car;
import com.mycompany.universityresidence_immutable_domain_model.Residence.Parking;
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
public class ParkingTest {
    
    public ParkingTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        Car car = new Car.Builder("123456").name("Ferrari").model("F12").build();
        
        Parking p = new Parking.Builder(114)
                .capacity(2)
                .build();
        Assert.assertEquals(114, p.getParkNumber());
        //Assert.assertEquals(car, car);
        Assert.assertEquals(2, p.getCapacity());
        
        Parking p1 = new Parking.Builder(115)
                .Parking(p)
                .capacity(6)
                .build();
    }
    
    @Test
    public void testCreation() throws Exception{
        Car car = new Car.Builder("123456").name("Ferrari").model("F12").build();
        
        Parking p = new Parking.Builder(114)
                .capacity(2)
                .build();
        Assert.assertEquals(114, p.getParkNumber());
        //Assert.assertEquals(car, car);
        Assert.assertEquals(2, p.getCapacity());
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
