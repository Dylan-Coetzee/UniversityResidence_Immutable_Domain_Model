/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.universityresidence_immutable_domain_model.Residence.Block;
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
public class BlockTest {
    
    public BlockTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void testCUpdatereation() throws Exception{
        Block b = new Block.Builder("K").blockType("Female").NumberOfStories(3).Capacity(150).build();
        Assert.assertEquals("K", b.getBlockName());
        Assert.assertEquals("Female", b.getBlockType());
        Assert.assertEquals(3, b.getNumberOfStories());
        Assert.assertEquals(150, b.getCapacity());
        
        
        Block b1 = new Block.Builder("K")
                .Block(b)
                .NumberOfStories(5)
                .build();
        
        Assert.assertEquals(b1.getNumberOfStories(), 5);
    }
    
    @Test
    public void testCreation() throws Exception{
        Block b = new Block.Builder("K").blockType("Female").NumberOfStories(3).Capacity(150).build();
        Assert.assertEquals("K", b.getBlockName());
        Assert.assertEquals("Female", b.getBlockType());
        Assert.assertEquals(3, b.getNumberOfStories());
        Assert.assertEquals(150, b.getCapacity());
        
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
