package itcompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class infosysTest {
	
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.infosys.com/");
	}

}
