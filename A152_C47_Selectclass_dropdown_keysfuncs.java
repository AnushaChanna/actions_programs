package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A152_C47_Selectclass_dropdown_keysfuncs 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		s1.selectByValue("search-alias=stripbooks");
		
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("power");
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ARROW_DOWN);
		search.sendKeys(Keys.ENTER);
}
}
