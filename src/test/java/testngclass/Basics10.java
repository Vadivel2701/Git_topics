package testngclass;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class Basics10 {
	
	//alwaysrun
	//enabled
	//description
	
	
	@Test(enabled = false)
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(description = "this is use to login")
	public void login() {
	System.out.println("login");
	
		
	}
	
	@Test(dependsOnMethods ="testngclass.Basics10.login",alwaysRun = true)
	public void searchProduct() {
		System.out.println("searchroduct");
			
    }
	
//	
//	@Test(enabled = false,alwaysRun = true)
//	public void login1() {
//	System.out.println("login");
//		
//	}
//	
	


}
