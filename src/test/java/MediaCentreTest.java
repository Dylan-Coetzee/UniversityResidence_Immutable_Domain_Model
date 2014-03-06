/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.MediaCentre;
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
public class MediaCentreTest {
    
    public MediaCentreTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testUpdate() throws Exception{
        MediaCentre m = new MediaCentre.Builder(89).numberOfPcs(80).numberOfKeyboards(80).build();
        Assert.assertEquals(89, m.getBuildingId());
        Assert.assertEquals(80, m.getNumberOfPcs());
        Assert.assertEquals(80, m.getNumberOfKeyboards());
        
        MediaCentre m1 = new MediaCentre.Builder(90)
                .MediaCentre(m)
                .numberOfPcs(82)
                .build();
    }
    
    @Test
    public void testCreation() throws Exception{
        MediaCentre m = new MediaCentre.Builder(89).numberOfPcs(80).numberOfKeyboards(80).build();
        Assert.assertEquals(89, m.getBuildingId());
        Assert.assertEquals(80, m.getNumberOfPcs());
        Assert.assertEquals(80, m.getNumberOfKeyboards());
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
