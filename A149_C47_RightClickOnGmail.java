package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A149_C47_RightClickOnGmail
{
public static void main(String[] args) 
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement rightclick=driver.findElement(By.linkText("Gmail"));
	Actions a1=new Actions(driver);
	a1.contextClick(rightclick).perform();
	
}
}
