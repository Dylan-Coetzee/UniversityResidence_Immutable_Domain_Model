/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class StudentTest {
    
    public StudentTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testUpdate() throws Exception{
        Student s = new Student.Builder("147258369").name("Mason").surname("Defy").build();
        Assert.assertEquals("147258369", s.getStudentNumber());
        //Assert.assertEquals("Mason", s.getName());
        Assert.assertEquals("Defy", s.getSurname());
        
        Student s1 = new Student.Builder("147258369")
                .Student(s)
                .name("Master")
                .build();
    }
    
    @Test
    public void testCreation() throws Exception{
        Student s = new Student.Builder("147258369").name("Mason").surname("Defy").build();
        Assert.assertEquals("147258369", s.getStudentNumber());
        //Assert.assertEquals("Mason", s.getName());
        Assert.assertEquals("Defy", s.getSurname());
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
