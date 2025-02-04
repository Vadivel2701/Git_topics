package testngclass;

import org.testng.annotations.Test;

public class Basics7 {
	
	//on basis of dependsOnMethods
	
	@Test(priority = 1)
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(dependsOnMethods = "register",priority = -1)
	public void login() {
	System.out.println("login");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("searchroduct");
		//throw new RuntimeException();
			
    }

}
