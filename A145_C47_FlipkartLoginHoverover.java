package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A145_C47_FlipkartLoginHoverover 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement login=driver.findElement(By.xpath("//span[.='Login']"));
		Actions A1=new Actions(driver);
		A1.moveToElement(login).perform();
		
		WebElement myprofile=driver.findElement(By.xpath("//li[@class='AT0fUR']"));
		myprofile.click();
		
	}
}
