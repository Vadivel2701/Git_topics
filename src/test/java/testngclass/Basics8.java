package testngclass;

import org.testng.annotations.Test;

public class Basics8 {
	
	//invocation count
	//invocationTimeOut only depends on invocation count
	
	@Test(invocationCount = 2)
	public void register() {
		
	System.out.println("register");
		
	}
	
	@Test(invocationCount = 3)
	public void login() {
		
	System.out.println("login");
		
	}
	
	@Test(invocationCount = 3,invocationTimeOut = 1000)
	public void searchProduct() {
		
		System.out.println("searchroduct");
    }
	
	@Test
	public void addToCart() {
		
		System.out.println("addToCart");
			
	}
	
	
	
	
	

}
