package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class vvcarTest {
	
	@Test (groups = "system")
	public void launch() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ford.com/");
		
		Reporter.log("ford is launched", true);
		
	}

}
