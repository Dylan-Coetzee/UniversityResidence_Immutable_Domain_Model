/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Car;
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
public class CarTest {
    
    public CarTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
     @Test
    public void testUpdate() throws Exception{
        Car c = new Car.Builder("147528").name("Volkwagen").model("Polo").build();
        Assert.assertEquals("147528", c.getCarId());
        Assert.assertEquals("Volkwagen", c.getName());
        Assert.assertEquals("Polo", c.getModel());
        
        Car c1 = new Car.Builder("CA789423")
                .Car(c)
                .name("Lamborghini")
                .build();
        
        Assert.assertEquals(c1.getName(), "Lamborghini");
    }
    
    @Test
    public void testCreation() throws Exception{
        Car c = new Car.Builder("147528").name("Volkwagen").model("Polo").build();
        Assert.assertEquals("147528", c.getCarId());
        Assert.assertEquals("Volkwagen", c.getName());
        Assert.assertEquals("Polo", c.getModel());
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
