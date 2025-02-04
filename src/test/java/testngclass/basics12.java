package testngclass;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class basics12 {
	
	
	//group concept
	
	
	@Test(groups = {"sanity"})
	public void register() {
	System.out.println("register");
		
	}
	
	@Test(groups = {"sanity"})
	public void login() {
	System.out.println("login");
		
	}
	
	@Test(groups = {"smoke"})
	public void searchProduct() {
		System.out.println("searchroduct");
			
    }
	
	@Test(groups = {"reg"})
	public void addToCart() {
		System.out.println("addToCart");
			
	}

}
