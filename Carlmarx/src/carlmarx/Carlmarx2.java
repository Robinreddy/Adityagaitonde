package carlmarx;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Carlmarx2 {
	@Test(groups="smoke")
	public void coddy() {
		System.out.println("coddy");
	}
	@BeforeTest
	 
	public void dummy() {
		System.out.println("dummy");
	}


}
