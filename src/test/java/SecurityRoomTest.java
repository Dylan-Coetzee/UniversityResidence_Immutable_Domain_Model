/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Security;
import com.mycompany.universityresidence_immutable_domain_model.Residence.SecurityRoom;
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
public class SecurityRoomTest {
    
    public SecurityRoomTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        List<Security> sec = new ArrayList();
        
        Security s = new Security.Builder("122037943").name("Jabu").surname("Nkosi").build();
        sec.add(s);
        
        SecurityRoom sr = new SecurityRoom
                .Builder(sec)
                .Build();
        //Assert.assertEquals(s, s);
        
        SecurityRoom sr1 = new SecurityRoom.Builder(sec)
                .SecurityRoom(sr)
                .Build();
    }
    
    @Test
    public void testCreation() throws Exception{
        //Security s = new Security.Builder("122037943").name("Jabu").surname("Nkosi").build();
        
        //SecurityRoom sr = new SecurityRoom.Builder(s).Build();
        //Assert.assertEquals(s, s);
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
