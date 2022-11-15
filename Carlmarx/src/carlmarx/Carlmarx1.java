package carlmarx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carlmarx1 {
	@Test
	public void county() {
		System.out.println("Target");
	}
	@BeforeMethod
	 
	public void god() {
		System.out.println("godss");
	}
	@BeforeClass
	 
	public void lucy() {
		System.out.println("viper");
	}
	@BeforeTest
	 
	public void luffy() {
		System.out.println("onepiece");
	}
	@AfterTest
	 
	public void zoro() {
		System.out.println("zoro");
	}
	@AfterMethod
	 
	public void nami() {
		System.out.println("nami");
		
	}
	@AfterSuite
	 
	public void nakama() {
		System.out.println("nakama");
		
	}
	@Test(groups="smoke")
	 
	public void dragon() {
		System.out.println("dragon");
		
	}
}

