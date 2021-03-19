package maven3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	String url = "https://www.google.com/";
	@BeforeClass
	public void before() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		System.out.println("aweffafe");
	}
	@Test
	public void test() {
		System.out.println("afeawf");
		      
	}
	@AfterClass
	public void after() {
		driver.close();
	}
}
