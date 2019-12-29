package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestBase.baseclass;

public class firstPage extends baseclass{

	public static WebElement element;
	
	public static WebDriver startTr()
	{
		driver.get("https://www.tripadvisor.in");
		return driver;
	}
	public static WebElement searchTxt()
	{
		element=driver.findElement(By.xpath("//*[@id='component_4']/div/div/form/input[1]"));
		return element;
	}
	
	public static WebElement clickBtn()
	{
		element=driver.findElement(By.xpath("//*[@id='component_4']/div/div/form/button[3]/span"));
		return element;
	}
	
	public static WebElement firstclick()
	{
		element=driver.findElement(By.xpath("//*[@id='BODY_BLOCK_JQUERY_REFLOW']/div[2]/div/div[2]/div/div/div/div/div[1]/div/div[1]/div/div[3]/div/div[1]/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div[1]/span"));
		return element;
	}
	
	
	public static WebElement writeReview()
	{
		element=driver.findElement(By.xpath("//*[@id='component_12']/div/div[2]/div/div[2]/div/div[1]/a"));
		return element;
	}
	
	public static WebElement rating()
	{
		element=driver.findElement(By.xpath("//*[@id='bubble_rating']"));
		return element;
	}
	
	public static WebElement fifthrating()
	{
		element=driver.findElement(By.xpath("//*[@class='ui_bubble_rating fl bubble_50']"));
		return element;
	}
	
	public static WebElement TitleReview()
	{
		element=driver.findElement(By.xpath("//*[@id='ReviewTitle']"));
		return element;
	}
	
	public static WebElement yourReview()
	{
		element=driver.findElement(By.xpath("//*[@id='ReviewText']"));
		return element;
	}
	
	public static WebElement lbl_hotelrating()
	{
		element=driver.findElement(By.xpath("//*[@id='DQ_RATINGS']/div[1]"));
		return element;
	}
	
	public static WebElement servicerating()
	{
		element=driver.findElement(By.xpath("//*[@id='qid12_bubbles']"));
		return element;
	}
	public static WebElement valuerating()
	{
		element=driver.findElement(By.xpath("//*[@id='qid13_bubbles']"));
		return element;
	}
	public static WebElement sleeprating()
	{
		element=driver.findElement(By.xpath("//*[@id='qid190_bubbles']"));
		return element;
	}
	
	
	
	public static WebElement fifthservicerating()
	{
		element=driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid12 bubble_50']"));
		return element;
	}
	public static WebElement fifthvaluerating()
	{
		element=driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid13 bubble_50']"));
		return element;
	}
	public static WebElement fifthsleeprating()
	{
		element=driver.findElement(By.xpath("//*[@class='answersBubbles ui_bubble_rating fl qid190 bubble_50']"));
		return element;
	}
	
	
	public static WebElement submitReview()
	{
		element=driver.findElement(By.xpath("//*[@id='qid190_bubbles']"));
		return element;
	}
}
