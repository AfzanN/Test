package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mavenparametertest {
	
	@Test
	
	public void recievedata() {
		String URL = System.getProperty("url");
		System.out.println(URL); //RECIEVEING url FROM COMMAND PROMPT
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		
	}

}
