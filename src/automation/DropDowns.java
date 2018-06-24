package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns 
{
public static void main(String[] args) throws Exception 
{
	//open chrome browser
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.get("https://www.mercurytravels.co.in/");
	
	//verifying dropdown is single-select or multi-select
	WebElement e=driver.findElement(By.name("nights"));
	Select s=new Select(e);
	if(s.isMultiple())
	{
		System.out.println("It is a multi-select dropdown");
	}
	else
	{
		System.out.println("It is a single-select dropdown");
	}
	
	//display items in dropdown 
	System.out.println("Items in this dropdown are:");
	for(int i=0; i<s.getOptions().size(); i++)
	{
		System.out.println(s.getOptions().get(i).getText());
	}
	
	//select item by its text
	s.selectByVisibleText("13Nights+14Days");
	Thread.sleep(5000);
	
	//select item by its Index
	s.selectByIndex(5);
	
	//operating another dropdown
	WebElement e1=driver.findElement(By.name("theme"));
	Select s1=new Select(e1);
	
	//select item by is value
	s1.selectByValue("17");
	

	}

}
