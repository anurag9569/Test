package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.baseclass;

public class firstPage extends baseclass{
	
	public static WebElement element;
	//public static WebDriver driver;
	
	public static WebDriver startAm()
	{
		driver.get("https://www.amazon.in");
		return driver;
	}
	
	public static WebElement searchTxt()
	{
		element=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		return element;
	}
	
	public static WebElement btnClick()
	{
		element=driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input"));
		return element;
	}
	public static WebElement getPrice()
	{
		element=driver.findElement(By.xpath("//*[@id='search']/div[1]/div[2]/div/span[4]/div[1]/div[1]/div/span/div/div/div[2]/div[2]/div/div[2]/div[1]/div/div[1]/div/div/a/span[1]/span[2]/span[2]"));
		return element;
	}
	
	public static WebDriver startFl()
	{
		driver.get("https://www.flipkart.com");
		return driver;
	}
	public static WebElement winClick()
	{
		element=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
		return element;
	}
	public static WebElement searchFl()
	{
		element=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		return element;
	}
	public static WebElement btnFl()
	{
		element=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/button"));
		return element;
	}
	public static WebElement getPriceFl()
	{
		element=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div/div/div[1]"));
		return element;
	}
}
