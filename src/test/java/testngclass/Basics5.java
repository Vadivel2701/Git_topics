package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Basics5 {
	
	
	@Test(priority = -1)
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(priority = 0)
	public void login() {
	System.out.println("login");
		
	}
	
	@Test(priority = 1)
	public void searchProduct() {
		System.out.println("searchroduct");
			
    }
	
	@Test(priority = 2)
	public void addToCart() {
		System.out.println("addToCart");
			
	}

}
