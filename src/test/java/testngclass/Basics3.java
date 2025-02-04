package testngclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics3 {
	
	
	

	@BeforeTest
	public void  browser() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void  browser_close() {
		System.out.println("after test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("beforemethod");
	}
	
	
@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}

@BeforeClass
public void before_class() {
	
	System.out.println("before_class");
	
}
	
@AfterClass
public void after_class() {
	
	System.out.println("after_class");
	
}
	
@Test
public void testing() {
	
	
	System.out.println("test");
}

@BeforeSuite
public void beforesuite() {
	
	
	System.out.println("beforesuite");
}

	@AfterSuite
public void aftersuite() {
	
	
	System.out.println("aftersuite");
}
	
	
	

}
