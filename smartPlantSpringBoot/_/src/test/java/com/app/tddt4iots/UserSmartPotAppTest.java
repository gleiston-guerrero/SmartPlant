package com.app.tddt4iots;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.tddt4iots.service.*;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@SpringBootTest
class UserSmartPotAppTest{    
    UserSmartPotService instance;
    
    UserSmartPotAppTest(){ }
    
	 @Test 
	 public void turnOffThePumpTest1() { 
	 	Float moistureMaximunLimit = 1500; 
	 	Boolean expResult = true; 
	 	Boolean result = instance.turnOffThePump(moistureMaximunLimit); 
	 	 //assertEquals(expResult, result);
	 	 // TODO review the generated test code and remove the default call to fail.
	 	 if(expResult!=(result))
	 	 	 System.out.println("The test case is a prototype.");
	 	 else
	 	 	 System.out.println("The test case is a good prototype!"); 
	 	 } 
 
	 @Test 
	 public void turnOffThePumpTest2() { 
	 	Float moistureMaximunLimit = 300; 
	 	Boolean expResult = false; 
	 	Boolean result = instance.turnOffThePump(moistureMaximunLimit); 
	 	 //assertEquals(expResult, result);
	 	 // TODO review the generated test code and remove the default call to fail.
	 	 if(expResult!=(result))
	 	 	 System.out.println("The test case is a prototype.");
	 	 else
	 	 	 System.out.println("The test case is a good prototype!"); 
	 	 } 
 
	 @Test 
	 public void turnOffThePumpTest3() { 
	 	Float moistureMaximunLimit = 500; 
	 	Boolean expResult = true; 
	 	Boolean result = instance.turnOffThePump(moistureMaximunLimit); 
	 	 //assertEquals(expResult, result);
	 	 // TODO review the generated test code and remove the default call to fail.
	 	 if(expResult!=(result))
	 	 	 System.out.println("The test case is a prototype.");
	 	 else
	 	 	 System.out.println("The test case is a good prototype!"); 
	 	 } 
 
    
}
