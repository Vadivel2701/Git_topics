package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Basics4 {

//priority - attribute
	//@test - annotation
	
	@Test(priority = 11)
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(priority = 2)
	public void login() {
	System.out.println("login");
		
	}
	
	@Test(priority = 3)
	public void searchProduct() {
		System.out.println("searchroduct");
			
    }
	
	@Test(priority = 4)
	public void addToCart() {
		System.out.println("addToCart");
			
	}
	
	
}
