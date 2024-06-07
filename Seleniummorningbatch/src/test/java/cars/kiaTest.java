package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class kiaTest {
	
	
	@Test (groups = "smoke")
	public void launch() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kia.com/in/home.html");
		
		Reporter.log("kia is launched", true);
		
	}

}


