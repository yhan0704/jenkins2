package maven3;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeClass
	public void before() throws InterruptedException {

		System.out.println("aweffafe");
		System.out.println("aweffaf2222e");
		System.out.println("aweffaf2222e");
		System.out.println("aweffaf2222e");
		System.out.println("aweffaf2222e");
		System.out.println("aweffaf2222e");
		System.out.println("aweffaf2222e");
		
	}
	@Test
	public void test() {
		System.out.println("afeawf");
		      
	}
	@AfterClass
	public void after() {
		System.out.println("afeawf");
	}
}
