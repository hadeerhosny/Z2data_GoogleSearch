package Tests;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class TestBase {
	
	protected RemoteWebDriver driver;
	
	
	@BeforeSuite
	public void intitiateTestCases() {
		
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/ncr");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	@AfterSuite
	public void finalizeTest() {
		driver.quit();
		
	}

}