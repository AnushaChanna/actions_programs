package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A148_C47_DoubleClickOnGmail 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	
	WebElement doubleclick=driver.findElement(By.linkText("Gmail"));
	Actions a1=new Actions(driver);
	Thread.sleep(3000);
	a1.doubleClick(doubleclick).perform();
	Thread.sleep(4000);
	driver.close();
	
	
}
}
