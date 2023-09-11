package login;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class LoginTest {

	@org.testng.annotations.Test
	public void loginTest() {
		
		try {
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\xmedia\\eclipse-workspace\\plugin\\drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.co.in");
		
	
		driver.close();
	}
	
	
	public void paid() {
		
		
		// duration
		
		//individiual book payment
		
		
		
	}
	
}
