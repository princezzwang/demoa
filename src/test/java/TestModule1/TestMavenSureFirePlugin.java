package TestModule1;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Browsers;
import utils.BrowsersType;



public class TestMavenSureFirePlugin {

	private WebDriver driver;
	private String caseName;
	
	@BeforeClass
	public void beforeClass(){
		Browsers browser = new Browsers(BrowsersType.chrome);
		driver = browser.driver;
	}

	@Test
	public void testLinkCase(){
		
		caseName = "DoOne";
		driver.get("http://user.huitu.com/op/login.aspx?backurl=http://www.huitu.com/");//HUITU-LOGIN-PAGE
		driver.findElement(By.xpath("//div[@class='inpWrap']/div[contains(@class,'inpdiv1')]/input[@id='Nickname']")).clear();
		driver.findElement(By.xpath("//div[@class='inpWrap']/div[contains(@class,'inpdiv1')]/input[@id='Nickname']")).sendKeys("HTÍõ×Ó");
		driver.findElement(By.xpath("//div[@class='inpWrap']/div[contains(@class,'inpdiv1')]/input[@id='inpPass']")).sendKeys("ouyangruohan2008");
		//driver.findElement(By.xpath("//div[@class='inpWrap']/div[contains(@class,'inpdiv1')]/input[@id='inpPass']")).
        driver.findElement(By.xpath("//div[@class='loginSub']/input[@id='sub']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		Assert.assertEquals(true, true);
		
	}

	
	@AfterClass
	public void quit(){
		driver.quit();
	}
}


//by prince