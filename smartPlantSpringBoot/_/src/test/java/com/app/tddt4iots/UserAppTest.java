package com.app.tddt4iots;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.tddt4iots.service.*;
import com.app.tddt4iots.entities.*;
import java.util.*;
import java.lang.*;
import java.io.*;

@SpringBootTest
class UserAppTest{    
    UserService instance;
    
    UserAppTest(){ }
    
	 @Test 
	 public void registerTest1() { 
	 	User expResult = new User (); 
	 	User result = instance.register(); 
	 	 //assertEquals(expResult, result);
	 	 // TODO review the generated test code and remove the default call to fail.
	 	 if(expResult!=(result))
	 	 	 System.out.println("The test case is a prototype.");
	 	 else
	 	 	 System.out.println("The test case is a good prototype!"); 
	 	 } 
 
    
}
