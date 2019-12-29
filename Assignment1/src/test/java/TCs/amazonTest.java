package TCs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.firstPage;
import TestBase.baseclass;

public class amazonTest extends baseclass{

	//firstPage firstpage;
	public static WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=baseclass.start();	
	}
	
	@Test
	public void a()
	{
		firstPage.startAm();
	    firstPage.searchTxt().sendKeys("iPhone XR (64GB) - Yellow");
	    firstPage.btnClick().click();
	    String a=firstPage.getPrice().getText();
	    System.out.println(a);
	    
	    firstPage.startFl();
	    firstPage.winClick().click();
	    firstPage.searchFl().click();
	    firstPage.searchFl().sendKeys("iPhone XR (64GB) - Yellow");
	    firstPage.btnFl().click();
	    String b=firstPage.getPriceFl().getText();
	    String s=b.substring(1);
	    System.out.println(s);
	    
	    if(a.length()==s.length())
	    {
	    	String s1[]=a.split(",");
	    	String s2[]=s.split(",");
	    	if(Integer.parseInt(s1[0])>Integer.parseInt(s2[0]))
	    	{
	    		System.out.println("Flipkart");
	    	}
	    	else
	    	{
	    		System.out.println("Amazon");
	    	}
	    }
	}
	
	@AfterTest
	public void end()
	{
		driver.quit();
	}
}
