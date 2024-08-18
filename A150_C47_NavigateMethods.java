package actions_programs;

import org.openqa.selenium.chrome.ChromeDriver;

public class A150_C47_NavigateMethods
{
public static void main(String[] args) throws InterruptedException 
{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in");
	
}
	
	
	
	
}
