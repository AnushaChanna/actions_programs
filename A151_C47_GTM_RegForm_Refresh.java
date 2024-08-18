package actions_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class A151_C47_GTM_RegForm_Refresh 
{
public static void main(String[] args) throws InterruptedException 
{
  ChromeDriver driver=new ChromeDriver();
  driver.get("https://grotechminds.com/registeration-form/");
  driver.manage().window().maximize();
  
  WebElement firstname = driver.findElement(By.id("firstName"));
  firstname.sendKeys("Anusha");
  WebElement lastname = driver.findElement(By.id("lastName"));
  lastname.sendKeys("Anusha");
  WebElement email = driver.findElement(By.id("email"));
  email.sendKeys("Anusha@gmail.com");
  WebElement Mblnum = driver.findElement(By.id("phone"));
  Mblnum.sendKeys("9876543210");
 
  WebElement gender = driver.findElement(By.id("gender"));
  gender.sendKeys(Keys.ARROW_DOWN);
  gender.sendKeys(Keys.ARROW_DOWN);
  gender.sendKeys(Keys.ENTER);
  
  WebElement place = driver.findElement(By.id("state"));
 /* place.sendKeys(Keys.ARROW_DOWN);
  place.sendKeys(Keys.ARROW_DOWN);
  place.sendKeys(Keys.ENTER);*/
  Select s1=new Select(place);
  s1.selectByValue("andhraPradesh");
  
  WebElement aadharnum = driver.findElement(By.id("aadhaar"));
  aadharnum.sendKeys("098263428162");
  WebElement pannum = driver.findElement(By.id("pan"));
  pannum.sendKeys("ASN123PN");
  WebElement checkbox = driver.findElement(By.id("terms"));
  checkbox.click();
  
  Thread.sleep(3000);
  driver.navigate().refresh();
  
  //driver.close();
  
  
}
}
