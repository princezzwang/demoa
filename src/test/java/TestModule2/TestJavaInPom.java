package TestModule2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;

public class TestJavaInPom {
private WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass(){
		Browsers browser = new Browsers(BrowsersType.firefox);
		driver = browser.driver;
	}

	@Test
	public void start(){		
		
		driver.get("http://www.baidu.com");

		
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
}
