package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ieedge 
{

	public static void main(String[] args) throws Exception
	{
    System.setProperty("webdriver.edge.driver", "D:\\kiran\\SELENIUM\\MicrosoftWebDriver.exe");
	EdgeDriver driver=new EdgeDriver();
	
    driver.get("http://newtours.demoaut.com/");
	Thread.sleep(5000);
	driver.findElement(By.linkText("REGISTER")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("firstName")).sendKeys("VIJJU");
	driver.findElement(By.name("lastName")).sendKeys("JONNAGANTI");
	driver.findElement(By.name("phone")).sendKeys("6844548851");
	driver.findElement(By.name("userName")).sendKeys("vijju4u@gmail.com");
	driver.findElement(By.name("address1")).sendKeys("kovvada punta, d/n 6-58-9");
	driver.findElement(By.name("address2")).sendKeys("BHIMAVARAM MANDALAM");
	driver.findElement(By.name("city")).sendKeys("BHIMAVARAM");
	driver.findElement(By.name("state")).sendKeys("ANDHRA PRADESH");
	driver.findElement(By.name("postalCode")).sendKeys("534201");
	driver.findElement(By.name("email")).sendKeys("vijju4u");
	driver.findElement(By.name("password")).sendKeys("kirakira23");
	driver.findElement(By.name("confirmPassword")).sendKeys("kirakira23");
	Thread.sleep(5000);
	WebElement e =driver.findElement(By.name("country"));
	Select s=new Select(e);
	s.selectByVisibleText("INDIA");
	driver.findElement(By.name("register")).click();
	}

}
