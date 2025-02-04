package testngclass;

import org.testng.annotations.Test;

public class Basics6 {
	//dependsOnMethods
	
	@Test
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
	System.out.println("login");
		
	}
	
	@Test(dependsOnMethods = "login")
	public void searchProduct() {
		System.out.println("searchroduct");
		//throw new RuntimeException();
			
    }
	
	@Test(dependsOnMethods = "searchProduct")
	public void addToCart() {
		System.out.println("addToCart");
			
	}

}
