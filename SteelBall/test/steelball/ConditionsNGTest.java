/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package steelball;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author RC_Student_lab
 */
public class ConditionsNGTest {

    public String registeredUsername;
    
  
    /**
     * Test of checkUserName method, of class Conditions.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "Jona_than";
        Conditions instance = new Conditions();
        boolean expResult = true;
        boolean result = instance.checkUserName(username);
        assertEquals(result, expResult);
  
    }

    /**
     * Test of checkPasswordComplexity method, of class Conditions.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "MrpoopybuttHole69*";
        Conditions instance = new Conditions();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(result, expResult);
    }

    /**
     * Test of checkCellPhoneNumber method, of class Conditions.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String phone = "+27606282575";
        Conditions instance = new Conditions();
        boolean expResult = true;
        boolean result = instance.checkCellPhoneNumber(phone);
        assertEquals(result, expResult);
    }

    /**
     * Test of registerUser method, of class Conditions.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "Jona_than";
        String password = "Mrpoopybutthole#69";
        String phone = "+27606282575";
        Conditions instance = new Conditions();
        String expResult = "User has been registered successfully.";
        String result = instance.registerUser(username, password, phone);
        assertEquals(result, expResult);
    }

    /**
     * Test of loginUser method, of class Conditions.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String username = "Jona_than";
        String password = "Mrpooybutthole#69";
        Conditions instance = new Conditions();
        boolean expResult = true;
        boolean result = instance.loginUser(username, password);
        assertEquals(result, expResult);
    }

    /**
     * Test of returnLoginStatus method, of class Conditions.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        boolean loginResult = false;
        Conditions instance = new Conditions();
        String expResult = "Welcome " + this.registeredUsername + ", it is great to see you again!!";
        String result = instance.returnLoginStatus(loginResult);
        assertEquals(result, expResult);
    }
    
}
