package automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;

public class CrossBrowser
{
public static void main(String[] args) throws InterruptedException
{
	System.out.println("Enter the Browser name");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	String browser=scan.nextLine();
	WebDriver driver= null;
	if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "D:\\kiran\\SELENIUM\\gecodriver.exe");
	driver=new FirefoxDriver();
	}
	else if(browser.equals("edge"))
	{
		System.setProperty("webdriver.edge.driver", "D:\\kiran\\SELENIUM\\MicrosoftWebDriver.exe");
	    driver=new EdgeDriver();
	}
	else if(browser.equals("opera"))
	{
		System.setProperty("webdriver.opera.driver", "D:\\kiran\\SELENIUM\\RequiredSoftwares\\operadriver_win64\\operadriver.exe");
        OperaOptions options = new OperaOptions();
		options.setBinary("C:\\Program Files\\Opera\\launcher.exe");        
		driver = new OperaDriver(options);
	}
	else if(browser.equals("ie"))
	{
	System.setProperty("webdriver.ie.driver", "D:\\kiran\\SELENIUM\\IEDriverServer.exe");
	driver=new InternetExplorerDriver();
	}
	else
	{
		System.out.println("Entered browser name is worrng or not available");
		System.exit(0);//Stop Execution
	}
	driver.get("http://newtours.demoaut.com/");
	Thread.sleep(5000);
	driver.findElement(By.linkText("REGISTER")).click();
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
