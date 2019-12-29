package TCs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.firstPage;
import TestBase.baseclass;

public class TripAdvisorTest extends baseclass{

public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=baseclass.start();	
	}
	
	@Test
	public void b() throws InterruptedException
	{
		firstPage.startTr();
		firstPage.searchTxt().sendKeys("Club Mahindra");
		firstPage.clickBtn().click();
		firstPage.firstclick().click();
		Thread.sleep(1000);
		
		JavascriptExecutor je=(JavascriptExecutor)driver;
		je.executeScript("window.scrollBy(0,3000)","");
		
		firstPage.writeReview().click();
		
		
		firstPage.TitleReview().sendKeys("Good");
		firstPage.yourReview().sendKeys("Aws : would like to visit again");
		
		Actions a=new Actions(driver);
		a.moveToElement(firstPage.rating()).perform();
		Thread.sleep(1000);
		firstPage.fifthrating().click();
		if(firstPage.lbl_hotelrating().isDisplayed())
		{
			Actions b=new Actions(driver);
			b.moveToElement(firstPage.servicerating()).perform();
			firstPage.fifthservicerating().click();
			
			Actions c=new Actions(driver);
			c.moveToElement(firstPage.valuerating()).perform();
			firstPage.fifthvaluerating().click();
			
			Actions d=new Actions(driver);
			d.moveToElement(firstPage.sleeprating()).perform();
			firstPage.fifthsleeprating().click();
		}
		
		firstPage.submitReview().click();
		
	}
	
	
	
	@AfterTest
	public void end()
	{
		driver.quit();
	}
}
