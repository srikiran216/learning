package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is {

	public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.edge.driver", "D:\\kiran\\SELENIUM\\MicrosoftWebDriver.exe");
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.google.co.in");
	Thread.sleep(10000);
	WebElement x=driver.findElement(By.name("q"));
	if(x.isDisplayed())
	{
		System.out.println("element is displayed");
	}
	else
	{
		System.out.println("element was not displayed");
	}
	if(x.isEnabled())
	{
		System.out.println("element is Enabled");
	}
	else
	{
		System.out.println("element was not Enabled");
	}
	if(x.isSelected())
	{
		System.out.println("element is focused");
	}
	else
	{
		System.out.println("element was not focused");
	}
	}
}
