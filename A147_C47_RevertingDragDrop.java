package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A147_C47_RevertingDragDrop 
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://grotechminds.com/drag-and-drop/");
	driver.manage().window().maximize();
	
	WebElement drag=driver.findElement(By.xpath("//div[@id='container-6']"));
	WebElement drop=driver.findElement(By.xpath("//div[@id='div2']"));
	//WebElement revert=driver.findElement(By.xpath("//div[@id='container-6']"));
	
	Actions a1=new Actions(driver);
	a1.dragAndDrop(drag, drop).perform();
	
	Thread.sleep(5000);
	a1.dragAndDrop(drop, drag).perform();
	
	driver.close();
}
}
