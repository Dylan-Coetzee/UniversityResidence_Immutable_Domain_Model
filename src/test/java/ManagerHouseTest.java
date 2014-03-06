/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.ManagersHouse;
import com.mycompany.universityresidence_immutable_domain_model.Residence.ResidenceManager;
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
public class ManagerHouseTest {
    
    public ManagerHouseTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testUpdate() throws Exception{
        
        List<ResidenceManager> resMan = new ArrayList();
        
        ManagersHouse p = new ManagersHouse.Builder(resMan).build();
        Assert.assertEquals(p.getManagers(), resMan);
        
        ManagersHouse p1 = new ManagersHouse.Builder(resMan)
                .ManagersHouse(p)
                .build();
        
        
        
    }
    
    @Test
    public void testCreation() throws Exception{
        
        List<ResidenceManager> resMan = new ArrayList();
        
        ManagersHouse p = new ManagersHouse.Builder(resMan).build();
        Assert.assertEquals(p.getManagers(), resMan);
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
