package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A144_C47_AmazonHoverover_TextMessXpath 
{
	public static void main(String[] args)
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement accountsandlist=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
	Actions A1=new Actions(driver);
	A1.moveToElement(accountsandlist).perform();
	WebElement clcikonsignin=driver.findElement(By.xpath("//span[.='Sign in']"));
	clcikonsignin.click();	
	}
}
